
package araç.yönetim.sistemi;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Ucan_Gemi extends Deniz_Tasitlari implements Hava_Tasitlari  {

     int Hiz;
     int Yolcu_Sayisi;
     int Tekerlek_Sayisi;
     String Yakit_Turu;
     String ID;
    String durum;
    
    
    //parametresiz yapılandırıcı
    public Ucan_Gemi(){
        
        try {
            Seri_no_ver s= new Seri_no_ver();
            String i=s.Seri_no_ver("ucangemi");
            ID="UCANGEMİ_"+i;
        } catch (IOException ex) {
            Logger.getLogger(otomobil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    
    //parametreli yapılandırıcı
    public Ucan_Gemi(int Tekerlek_Sayisi){
        this.Tekerlek_Sayisi=Tekerlek_Sayisi;
    }    

 
 
    
    @Override
    public void setHiz(int Hiz){
        this.Hiz=Hiz;
        
        if(Hiz == 0){
            durum= "yerde (park)";
        }
        if(Hiz>=1 && Hiz<=250){
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



}
