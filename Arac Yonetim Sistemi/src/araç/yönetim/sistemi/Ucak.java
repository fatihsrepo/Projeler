
package araç.yönetim.sistemi;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ucak implements Hava_Tasitlari {
     int Hiz;
     int Yolcu_Sayisi;
     int Tekerlek_Sayisi;
     String Yakit_Turu;
     int fiyat;
     int uretim_yili;
    String Renk;
     String Marka;
     String ID;
     String durum;
    
    //parametresiz yapılandırıcı
    public Ucak(){
        
        try {
            Seri_no_ver s= new Seri_no_ver();
            String i=s.Seri_no_ver("ucak");
            ID="UCAK_"+i;
        } catch (IOException ex) {
            Logger.getLogger(otomobil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
    //parametreli yapılandırıcı
    public Ucak(int Tekerlek_Sayisi){
        this.Tekerlek_Sayisi=Tekerlek_Sayisi;
    }    

    
    @Override
    public void setHiz(int Hiz){
        this.Hiz=Hiz;

        if(Hiz == 0){
            durum= "yerde (park)";
        }
        if(Hiz>=1 && Hiz <=250){
            durum= "Yerde (Hrkt)";
        }
        if(Hiz>250)
            durum= "Havada";
            
    }
    
    @Override
    public int getHiz(){
        return Hiz;
    }   
    
    
    @Override
    public void setTekerlek_Sayisi(int Tekerlek_Sayisi){
        this.Tekerlek_Sayisi=Tekerlek_Sayisi;
    }
    
    @Override
    public int getTekerlek_Sayisi(){
        return Tekerlek_Sayisi;
    }    
   
    
    @Override
    public void setYolcu_Sayisi(int Yolcu_Sayisi){
            this.Yolcu_Sayisi=Yolcu_Sayisi;
    }
    
    @Override
    public int getYolcu_Sayisi(){
        return Yolcu_Sayisi;
    }     
    
    @Override
    public void setYakit_Turu(String Yakit_Turu){
        this.Yakit_Turu=Yakit_Turu;
    }
    
    @Override
    public String getYakit_Turu(){
        return Yakit_Turu;
    }     
    
    @Override
    public void setMarka(String Marka){
        this.Marka=Marka;
    }
    
    @Override
    public String getMarka(){
        return Marka;
    }
    
    @Override
    public void setFiyat(int fiyat){
        this.fiyat=fiyat;
    }
    
    @Override
    public int getFiyat(){
        return fiyat;
    }  
    
    @Override
    public void setUretim_yili(int uretim_yili){
        this.uretim_yili=uretim_yili;
    }
    
    @Override
    public int getUretim_yili(){
        return uretim_yili;
    }      
 
    @Override
    public void setRenk(String Renk){
        this.Renk=Renk;
    }
    
    @Override
    public String getRenk(){
        return Renk;
    }    
 

}
