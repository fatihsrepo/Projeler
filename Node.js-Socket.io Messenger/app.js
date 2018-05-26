var express = require('express'),
    app = express(),
    server = require('http').createServer(app),
    io = require('socket.io').listen(server),
    
    kaydin_ipsi = [],
    kayitlar = [],
    i = 0,
    targetuser;
    
    users = {},
    ips = {};

server.listen(3000);

app.get('/', function(req, res){
    res.sendFile(__dirname + '/index.html');

});    




io.sockets.on('connection', function(socket){

    socket.on('giris', function(data, callback){

        var clientIp = socket.request.connection.remoteAddress;

        for(t=0; t<kayitlar.length; t++){
            if(data == kayitlar[t]){
                if(clientIp == kaydin_ipsi[t] && !(clientIp in ips) ){
                    callback(true);
                    socket.nickname = data;
                    socket.clientIp = clientIp;
                    ips[socket.clientIp] = socket;
                    users[socket.nickname] = socket;
                    io.sockets.emit('usernames', Object.keys(users));
                    io.sockets.emit('ips', Object.keys(ips));
                    console.log(clientIp);
                }
            }
        }
        
        if( t == kayitlar.length){
            callback(false);
        }

    
    });

    socket.on('yeni kayit', function(data, callback){
        
        var clientIp = socket.request.connection.remoteAddress;
        var yeni_kayit = data;
        
        for(t=0; t<kayitlar.length; t++){
            if(yeni_kayit == kayitlar[t]){
                callback(false);
                break;
            }
        }
       
        if( t == kayitlar.length){
            callback(true);
            kayitlar[i] = yeni_kayit; 
            kaydin_ipsi[i] = clientIp;
            i++;
        } 
    });


    socket.on('send targetuser', function(data, callback){
        targetuser = data;
        if(targetuser in users){
            console.log(targetuser);
        }
    });


    socket.on('mesaj gönder', function(data, callback){
        var msg = data;
        if(targetuser in users){
            users[targetuser].emit('yeni mesaj', {msg: msg, nick: socket.nickname, targetnick: targetuser});
            users[socket.nickname].emit('yeni mesaj', {msg: msg, nick: socket.nickname, targetnick: targetuser});
        }else{
            callback('Hata. Lütfen geçerli bir kullanıcı girin');

        }
    });




    socket.on('disconnect', function(data){
        if(!socket.nickname) return;
        delete users[socket.nickname];
        delete ips[socket.clientIp];
        //sildikten sonra online nickleri ve ipleri emit ile tekrar gönderiyoruz
        io.sockets.emit('usernames', Object.keys(users));
        io.sockets.emit('ips', Object.keys(ips));

        //çıkış yapıldığına dair uyarı gönderiyoruz.
        io.sockets.emit('offlineuyari', socket.nickname);

    });

});