
package araç.yönetim.sistemi;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Kayit_Islemleri {
    
     String marka; 
     String Renk;
     int uretim_yili; 
     String Yakit_Turu;
     int hiz;
     int Yolcu_Sayisi;
     int Tekerlek_Sayisi;
     int fiyat;
    String hizlanma_icin_hiz="";

    
    
    
    public void kayit_ekle(String arac_turu) throws IOException{
        
        StringBuilder yeni_kayit=new StringBuilder();
        
        //eklenecek kayıt otomobilse
        if(arac_turu.equals("otomobil")){
            
            otomobil o=new otomobil();
        
            o.setMarka(marka);
            o.setUretim_yili(uretim_yili);
            o.setYakit_Turu(Yakit_Turu);
            o.setHiz(hiz);
            o.setYolcu_Sayisi(Yolcu_Sayisi);
            o.setTekerlek_Sayisi(Tekerlek_Sayisi);
            o.setRenk(Renk);
            o.setFiyat(fiyat);
            
        
            yeni_kayit.append(o.ID + "/" + o.getMarka() + "/" + o.getUretim_yili() + "/" + o.getYakit_Turu() + "/" + o.getHiz() 
                    + "/" + o.getYolcu_Sayisi() + "/" + o.getTekerlek_Sayisi() + "/" + o.getRenk() + "/" + o.getFiyat()+"/"+ o.durum);    
        }
        
        //bisikletse
        if(arac_turu.equals("bisiklet")){    
            bisiklet b=new bisiklet();
        
            b.setMarka(marka);
            b.setUretim_yili(uretim_yili);
            b.setHiz(hiz);
            b.setYolcu_Sayisi(Yolcu_Sayisi);
            b.setTekerlek_Sayisi(Tekerlek_Sayisi);
            b.setRenk(Renk);
            b.setFiyat(fiyat);
        
            yeni_kayit.append(b.ID + "/" + b.getMarka() + "/" + b.getUretim_yili() + "/" + "-" + "/" + b.getHiz() 
                    + "/" + b.getYolcu_Sayisi() + "/" + b.getTekerlek_Sayisi() + "/" + b.getRenk() + "/" + b.getFiyat()+"/"+ b.durum);        
        
        }
        
        
        
        //gemiyse
        if(arac_turu.equals("gemi")){    
            Gemi g=new Gemi();
        
            g.setMarka(marka);
            g.setUretim_yili(uretim_yili);
            g.setYakit_Turu(Yakit_Turu);
            g.setHiz(hiz);
            g.setYolcu_Sayisi(Yolcu_Sayisi);
            g.setRenk(Renk);
            g.setFiyat(fiyat);
        
            yeni_kayit.append(g.ID + "/" + g.getMarka() + "/" + g.getUretim_yili() + "/" + g.getYakit_Turu() + "/" + g.getHiz() 
                    + "/" + g.getYolcu_Sayisi() + "/" + "-" + "/" + g.getRenk() + "/" + g.getFiyat()+"/"+ g.durum);        
        
        }        
        
        
        
        //ucaksa
        if(arac_turu.equals("ucak")){
            
            Ucak u=new Ucak();
        
            u.setMarka(marka);
            u.setUretim_yili(uretim_yili);
            u.setYakit_Turu(Yakit_Turu);
            u.setHiz(hiz);
            u.setYolcu_Sayisi(Yolcu_Sayisi);
            u.setTekerlek_Sayisi(Tekerlek_Sayisi);
            u.setRenk(Renk);
            u.setFiyat(fiyat);
        
            yeni_kayit.append(u.ID + "/" + u.getMarka() + "/" + u.getUretim_yili() + "/" + u.getYakit_Turu() + "/" + u.getHiz() 
                    + "/" + u.getYolcu_Sayisi() + "/" + u.getTekerlek_Sayisi() + "/" + u.getRenk() + "/" + u.getFiyat()+"/"+ u.durum);    
        }    
        
        



        //ucan gemiyse
        if(arac_turu.equals("ucan_gemi")){
            
            Ucan_Gemi ug=new Ucan_Gemi();
        
            ug.setMarka(marka);
            ug.setUretim_yili(uretim_yili);
            ug.setYakit_Turu(Yakit_Turu);
            ug.setHiz(hiz);
            ug.setYolcu_Sayisi(Yolcu_Sayisi);
            ug.setTekerlek_Sayisi(Tekerlek_Sayisi);
            ug.setRenk(Renk);
            ug.setFiyat(fiyat);
        
            yeni_kayit.append(ug.ID + "/" + ug.getMarka() + "/" + ug.getUretim_yili() + "/" + ug.getYakit_Turu() + "/" + ug.getHiz() 
                    + "/" + ug.getYolcu_Sayisi() + "/" + ug.getTekerlek_Sayisi() + "/" + ug.getRenk() + "/" + ug.getFiyat()+"/"+ ug.durum);    
        }        
        
        


        //yeni kaydı dosyaya ekliyoruz
        try(FileWriter fw = new FileWriter("AracKayit.txt", true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter out = new PrintWriter(bw))
        {
            out.println(yeni_kayit);
        } catch (IOException e) {
        }
        
    }
    
    
    
    
    public void kayit_guncelle(String ID, int degisecek_kisim, String yeni_veri){
        
        
        try(BufferedReader br = new BufferedReader(new FileReader("AracKayit.txt"))) {
            
            StringBuilder oncesi=new StringBuilder();
            StringBuilder sonrasi=new StringBuilder();
            String degisecek_kayit="";
            String degistirilmis_kayit="";
            
            
            //Değiştirilecek kayıttan önceki kısmı ve değiştirilecek kısmı ayrı ayrı alıyoruz
            String line = br.readLine();

            while (line != null) {
                
                String[] parcalar=line.split("/");
                System.out.println(parcalar[0]+"  "+ ID + parcalar[0].equals(ID) );
                
                
                if(parcalar[0].equals(ID)==true){
                    System.out.println("b");
                    degisecek_kayit=line;
                    break;
                }                
                
                if(parcalar[0].equals(ID)==false){
                    System.out.println("a");
                    oncesi.append(line);
                    oncesi.append((System.getProperty("line.separator")));
                }
                

                    
                line = br.readLine();
            }
        
            
            
            //Degiştirilecek kayıttan sonraki kısmı alıyoruz
            String line1 = br.readLine();

            while (line1 != null) {
                
                String[] parcalar=line1.split("/");
                
                if(!parcalar[0].equals(ID)){
                    sonrasi.append((System.getProperty("line.separator")));
                    sonrasi.append(line1);
                }
                
                else if(!parcalar[0].equals(""))
                    break;
                    
                 line1 = br.readLine();
            } 
            
          
            
            //Degisecek kısmı yeni_veri ile değiştiriyoruz
            String[] parcalar = degisecek_kayit.split("/");
            
            for(int i=0; i<parcalar.length; i++){
                if(i != degisecek_kisim){
                    degistirilmis_kayit += parcalar[i]+"/";
                }
                else if(i == degisecek_kisim){
                    degistirilmis_kayit += yeni_veri+"/";
                }
            }
                
            //Hızlanma-Yavaşlama fonksiyonu için şu anki hızı bir değişkende tutuyorum
            hizlanma_icin_hiz=parcalar[4];
            
            
            
            System.out.println(oncesi.toString());
            System.out.println(degistirilmis_kayit);
            System.out.println(sonrasi.toString());
            
            br.close();
            //yeniden kayit dosyasi olsuturmak icin eskisini siliyoruz
            Path filepath = Paths.get("AracKayit.txt");
            Files.delete(filepath);
            
            try(FileWriter fw = new FileWriter("AracKayit.txt", true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter out = new PrintWriter(bw))
            {
                out.print(oncesi.toString());
                //out.print(System.getProperty("line.separator"));
                out.print(degistirilmis_kayit);
                //out.print(System.getProperty("line.separator"));
                out.println(sonrasi.toString());
                
            } catch (IOException e) {
            }            
            
        
        
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Arayuz.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Arayuz.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
    
    
    
}
