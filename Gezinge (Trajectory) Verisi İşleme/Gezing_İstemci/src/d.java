


import com.teamdev.jxbrowser.chromium.Browser;
import com.teamdev.jxbrowser.chromium.swing.BrowserView;
import java.awt.BorderLayout;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Fatih
 */
public class d extends javax.swing.JFrame {

    /**
     * Creates new form d
     */
    public d() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(54, 33, 89));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(122, 72, 221));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonlar/if_button-cross_blue_68681.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 60, 60));

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 0, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("İSTEMCİ");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 120, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fatih\\Desktop\\Projeler\\Gezinge (Trajectory) Verisi İşleme\\Gezing_İstemci\\src\\ikonlar\\client.png")); // NOI18N
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 60, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 70));

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(153, 153, 153));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(255, 255, 255));
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 400, 130));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Ham Veri");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 60, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonlar/browse icon.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 40, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gönder");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Çiz");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(347, 80, 20, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonlar/send.png"))); // NOI18N
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikonlar/ciz.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 100, 30, 30));
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 380, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            selectedFile = fileChooser.getSelectedFile();
            jTextArea1.append("Seçilen dosya: " + selectedFile.getName());
        }        
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
    try {
        Islem();
    } catch (IOException ex) {
        Logger.getLogger(d.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(d.class.getName()).log(Level.SEVERE, null, ex);
     }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        try {
            JavaScriptDuzenle();
            Ciz();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(d.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(d.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jLabel9MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(d.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new d().setVisible(true);
            }
        });
    }

    
static Socket socket = null;
static PrintWriter out = null;
static BufferedReader in = null;
static int ham_veri_sayisi;    
static File selectedFile;
static String Ham_Veri;
static StringBuilder sb2=new StringBuilder();
static StringBuilder sb3=new StringBuilder();
static String Indırgenmis_Veri;
static String iceride_kalan_noktalar;

static void Ham_Veri_Oku() throws FileNotFoundException, IOException
{
    StringBuilder sb=new StringBuilder();
    BufferedReader br = new BufferedReader(new FileReader(selectedFile.getAbsolutePath()));
    String line;
    ham_veri_sayisi=0; 
    while((line = br.readLine()) != null)
    {
        sb.append(line);
        ham_veri_sayisi++;    
    }
    br.close();     

    Ham_Veri=sb.toString();

}    
    
    
void Islem()throws IOException, ClassNotFoundException
{
       


    try {
	socket = new Socket("localhost", 5555);
                                                
	out = new PrintWriter(socket.getOutputStream(), true);
	in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
	
    } catch (UnknownHostException e) {
	System.err.println("Sunucu bulunamadı");
	jTextArea1.append("\n"+"Sunucu bulunamadı");
        System.exit(1);
    } catch (IOException e) {
	System.err.println("I/O exception:" + e.getMessage());
	System.exit(1);
    }
		
    System.out.println("Sunucuya baglanildi.");
    jTextArea1.append("\n"+"Sunucuya baglanildi.");
    jTextArea1.update(jTextArea1.getGraphics());
 
  
    ObjectInputStream input=new ObjectInputStream(socket.getInputStream()); 
    ObjectOutputStream output=new ObjectOutputStream(socket.getOutputStream());
    output.flush();    
    
    Ham_Veri_Oku();
    System.out.println("Ham veri okundu.");
        
    output.writeObject(Ham_Veri);
    output.writeObject(ham_veri_sayisi);
    System.out.println("Ham veri gönderildi.");  
    jTextArea1.append("\n"+"Ham Veri Gönderildi.");
    jTextArea1.update(jTextArea1.getGraphics());
    
    
    //İndirgenen verinin lat kısmı geliyor
    String u=input.readObject().toString();
    int uzunluk=Integer.parseInt(u);
    
    for(int i=0;i<uzunluk;i++){
        String fpoints=input.readObject().toString();
        //System.out.print(fpoints+" ");
        sb2.append(fpoints+" ");
    }
    
    System.out.println(""); 
    
    //İndirgenen verinin long kısmı geliyor
    for(int i=0;i<uzunluk;i++){
        String fpoints_y=input.readObject().toString();
        //System.out.print(fpoints_y+" ");
        sb3.append(fpoints_y+" ");
    }    
    
    
    
    jTextArea1.append("\n"+"İndirgenmiş veri geldi.");
    System.out.println("indirgenmis veri geldi.");
    jTextArea1.update(jTextArea1.getGraphics());
    
    
    
    //Sorgu alanı boş değilse sorgu alanına girilen veriler sunucuya gönderiliyor. Boşsa 0 gönderiliyor
    if(!jTextField1.getText().equals("")){
        double min_lat,min_long,max_lat,max_long;
        String[] parcalar=jTextField1.getText().split(",");
        min_lat=Double.parseDouble(parcalar[0]);
        min_long=Double.parseDouble(parcalar[1]);
        max_lat=Double.parseDouble(parcalar[2]);
        max_long=Double.parseDouble(parcalar[3]);
        output.writeObject(min_lat);
        output.writeObject(min_long);
        output.writeObject(max_lat);
        output.writeObject(max_long);     
    }
    else{
        double min_lat=0,min_long=0,max_lat=0,max_long=0;
        output.writeObject(min_lat);
        output.writeObject(min_long);
        output.writeObject(max_lat);
        output.writeObject(max_long);
    }
     
    System.out.println("Sorgu sınırları gönderildi.");
    
    


    //Sunucu tarafından gönderilen iceride kalan noktalar geliyor
    
    iceride_kalan_noktalar=input.readObject().toString();
    //System.out.println(iceride_kalan_noktalar);
    jTextArea1.append("\n"+"Sorgu alanı içinde kalan noktalar geldi.");
    System.out.println("Sorgu alanı içinde kalan noktalar geldi.");
    jTextArea1.update(jTextArea1.getGraphics());
    
    
    //İndirgeme oranı geliyor
    String oranString=input.readObject().toString();
    double oran=Double.parseDouble(oranString);
    System.out.println("İndirgeme oranı= "+oran+"%");
    jTextArea1.append("\n"+"İndirgeme oranı= "+oran+"%");
    jTextArea1.update(jTextArea1.getGraphics());
    
    

    
       
}


void JavaScriptDuzenle() throws FileNotFoundException, UnsupportedEncodingException{
    
    PrintWriter writer = new PrintWriter("m.html", "UTF-8");    
    
    StringBuilder js=new StringBuilder();
    StringBuilder flightpath=new StringBuilder();
    
    
    String[] parcalar=Ham_Veri.split(",");
    for(int i=0;i<parcalar.length;i=i+2){
        
        if(i == parcalar.length-2){
            flightpath.append("{lat: "+Double.parseDouble(parcalar[i])+", lng: "+Double.parseDouble(parcalar[i+1])+"}");
        }
        else{
            flightpath.append("{lat: "+Double.parseDouble(parcalar[i])+", lng: "+Double.parseDouble(parcalar[i+1])+"},");
            flightpath.append(System.getProperty("line.separator"));
        }
    }
    
    
    StringBuilder flightpath1=new StringBuilder();
    String[] parcalar1=sb2.toString().split(" ");
    String[] parcalar2=sb3.toString().split(" ");
    
    for(int i=0;i<parcalar2.length;i++){
        
        if(i == parcalar2.length-1){
            flightpath1.append("{lat: "+Double.parseDouble(parcalar1[i])+", lng: "+Double.parseDouble(parcalar2[i])+"}");
        }
        else{
            flightpath1.append("{lat: "+Double.parseDouble(parcalar1[i])+", lng: "+Double.parseDouble(parcalar2[i])+"},");
            flightpath1.append(System.getProperty("line.separator"));
        }
    }

    int m=0;
    String[] parcalar3=null;
    double[] iceride_kalanlar=new double[100];
    if(!iceride_kalan_noktalar.isEmpty()){
        parcalar3=iceride_kalan_noktalar.split(" ");
        for(int i=0;i<parcalar3.length;i++){
        
           iceride_kalanlar[i]=Double.parseDouble(parcalar3[i]);
          
        }
    }    
  
 
    

//JavaScript
    writer.println("<!DOCTYPE html>");
    writer.println("<html>");
    writer.println("<head>");
    writer.println("   <meta name=\"viewport\" content=\"initial-scale=1.0, user-scalable=no\"/>");
    writer.println("   <style type=\"text/css\">");
    writer.println("       html { height: 100% }");
    writer.println("       body { height: 100%; margin: 0; padding: 0 }");
    writer.println("       #map-canvas { height: 100% }");
    writer.println("   </style>");
    writer.println("   <script type=\"text/javascript\""+"\n");
    writer.println("           src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyAZE-aEZyycRlBLCkbE_"
            + "vzErE63MgVRrQc&sensor=false\"></script>");
    writer.println("   <script type=\"text/javascript\">");
    writer.println("     var map;");
    writer.println("     function initialize() {");
    writer.println("       var mapOptions = {");
    writer.println("         center: new google.maps.LatLng(48.209331, 16.381302),");
    writer.println("         zoom: 4");
    writer.println("       };");
    writer.println("       map = new google.maps.Map(document.getElementById(\"map-canvas\"), mapOptions);");

    writer.println("var image = 'https://developers.google.com/maps/documentation/javascript/examples/full/images/beachflag.png';");
    
    if(!iceride_kalan_noktalar.isEmpty()){
        for(int i=0;i<parcalar3.length;i=i+2){
            writer.println("var beachMarker"+i+"= new google.maps.Marker({");
            writer.println("position: {lat: "+ iceride_kalanlar[i] +", lng: " + iceride_kalanlar[i+1] + "},");
            writer.println("map: map,");
            writer.println("icon: image");
            writer.println("});");
        }    
    }
    
    
    
    
    writer.println("        var flightPlanCoordinates = [");
    writer.println(flightpath.toString());
    writer.println("        ];");
    writer.println("        var flightPath = new google.maps.Polyline({");
    writer.println("          path: flightPlanCoordinates,");
    writer.println("          geodesic: true,");
    writer.println("          strokeColor: '#ce22ae',");
    writer.println("          strokeOpacity: 1.0,");
    writer.println("          strokeWeight: 7");
    writer.println("        });");
    writer.println("        flightPath.setMap(map);");
    
    writer.println("        var flightPlanCoordinates1 = [");
    writer.println(flightpath1.toString());
    writer.println("        ];");
    writer.println("        var flightPath1 = new google.maps.Polyline({");
    writer.println("          path: flightPlanCoordinates1,");
    writer.println("          geodesic: true,");
    writer.println("          strokeColor: '#31dd51',");
    writer.println("          strokeOpacity: 1.0,");
    writer.println("          strokeWeight: 4");
    writer.println("        });");
    writer.println("        flightPath1.setMap(map);");    
    
  
    writer.println("}");
    writer.println("     google.maps.event.addDomListener(window, 'load', initialize);");


    writer.println(" </script>");
    writer.println("</head>");
    writer.println("<body>");
    writer.println("<div id=\"map-canvas\"></div>");
    writer.println("</body>");
    writer.println("</html>");

   
    writer.close();

}

void Ciz(){
       
    
       final Browser browser = new Browser();
       BrowserView browserView = new BrowserView(browser);

       JFrame frame = new JFrame("map.html");
       frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       frame.add(browserView, BorderLayout.CENTER);
       frame.setSize(900, 600);
       frame.setResizable(false);
       frame.setLocationRelativeTo(null);
       frame.setVisible(true);

       browser.loadURL("C:\\Users\\Fatih\\Documents\\NetBeansProjects\\d\\m.html");
       
}    
    
    
   
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
