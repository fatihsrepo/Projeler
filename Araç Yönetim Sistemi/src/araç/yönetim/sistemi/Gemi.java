
package araç.yönetim.sistemi;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Gemi extends Deniz_Tasitlari {
 
    int Hiz=0;
     int Yolcu_Sayisi;
     String Yakit_Turu;
     String ID;
     String durum;
    
    //parametresiz yapılandırıcı
    public Gemi(){
        
        try {
            Seri_no_ver s= new Seri_no_ver();
            String i=s.Seri_no_ver("gemi");
            ID="GEMİ_"+i;
        } catch (IOException ex) {
            Logger.getLogger(otomobil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   //parametreli yapılandırıcı 
   public Gemi(int Yolcu_Sayisi){
        this.Yolcu_Sayisi=Yolcu_Sayisi;
    }    

   
    @Override
    public void setHiz(int Hiz){
        this.Hiz=Hiz;
    
        if(Hiz >0){
            durum = "Hrkt Halinde";
        }
        else
            durum = "park";         
    }
    
    @Override
    public int getHiz(){
        return Hiz;
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
