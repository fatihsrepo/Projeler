package araç.yönetim.sistemi;

public abstract class Kara_Tasitlari implements Arac {
    
     int fiyat;
     int uretim_yili;
     String Renk;
     String Marka;
    
    
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

