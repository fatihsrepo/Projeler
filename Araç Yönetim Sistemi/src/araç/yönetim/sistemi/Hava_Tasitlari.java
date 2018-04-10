
package araç.yönetim.sistemi;


public interface Hava_Tasitlari extends Arac {

    @Override
    public void setMarka(String marka);
    
    @Override
    public String getMarka();
    
    public void setTekerlek_Sayisi(int Tekerlek_Sayisi);
    
    public int getTekerlek_Sayisi();
    
    @Override
    public void setHiz(int Hiz);
    
    @Override
    public int getHiz();
    
    @Override
    public void setYolcu_Sayisi(int Yolcu_Sayisi);
    
    @Override
    public int getYolcu_Sayisi();  
   
    @Override
    public void setFiyat(int fiyat);
    
    @Override
    public int getFiyat();  
    
    @Override
    public void setUretim_yili(int uretim_yili);
    
    @Override
    public int getUretim_yili();    
 
    @Override
    public void setRenk(String Renk);
    
    @Override
    public String getRenk(); 
    
    public void setYakit_Turu(String Yakit_Turu);
    
    public String getYakit_Turu();
    
}
