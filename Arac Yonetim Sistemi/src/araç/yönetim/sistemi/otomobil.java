
package araç.yönetim.sistemi;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class otomobil extends Kara_Tasitlari {
    
     int Hiz;
     int Yolcu_Sayisi;
     int Tekerlek_Sayisi;
     String Yakit_Turu;
     String ID; 
     String durum;
    
    
    //parametresiz yapılandırıcı
    public otomobil(){
        
        try {
            Seri_no_ver s= new Seri_no_ver();
            String i=s.Seri_no_ver("otomobil");
            ID="OTOMOBİL_"+i;
        } catch (IOException ex) {
            Logger.getLogger(otomobil.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
    //parametreli yapılandırıcı
    public otomobil(int Tekerlek_Sayisi){
        this.Tekerlek_Sayisi=Tekerlek_Sayisi;
    }

   
    
    
   
    @Override
    public void setHiz(int Hiz){
        this.Hiz=Hiz;
        if(Hiz>0){
            durum = "Hrkt Halinde";
        }
        else
            durum = "park";        
    }
    
    @Override
    public int getHiz(){
        return Hiz;
    }   
    
    
    public void setTekerlek_Sayisi(int Tekerlek_Sayisi){
        this.Tekerlek_Sayisi=Tekerlek_Sayisi;
    }
    
    public int getTekerlek_Sayisi(){
        return Tekerlek_Sayisi;
    }    
   
    
    @Override
    public void setYolcu_Sayisi(int Yolcu_Sayisi){
        if(Yolcu_Sayisi<8)
            this.Yolcu_Sayisi=Yolcu_Sayisi;
        else
            System.out.println("yolcu sayisi 8'den küçük olmali");
    }
    
    @Override
    public int getYolcu_Sayisi(){
        return Yolcu_Sayisi;
    }     
    
    public void setYakit_Turu(String Yakit_Turu){
        this.Yakit_Turu=Yakit_Turu;
    }
    
    public String getYakit_Turu(){
        return Yakit_Turu;
    }
   
    
   
    
}
