package araç.yönetim.sistemi;


public interface Arac {
    
    public void setMarka(String marka);
    
    public String getMarka();
    
    public void setHiz(int Hiz);
    
    public int getHiz();
    
    public void setYolcu_Sayisi(int Yolcu_Sayisi);
    
    public int getYolcu_Sayisi();  
   
    public void setFiyat(int fiyat);
    
    public int getFiyat();  
    
    public void setUretim_yili(int uretim_yili);
    
    public int getUretim_yili();    
 
    public void setRenk(String Renk);
    
    public String getRenk();
    
}
