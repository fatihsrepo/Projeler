package com.Fatih_Mert.Arama_Motoru;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;

import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.ui.AbsoluteLayout;

import com.vaadin.ui.Button;
import com.vaadin.ui.TextArea;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;


/**
 * This UI is the application entry point. A UI may either represent a browser window 
 * (or tab) or some part of a html page where a Vaadin application is embedded.
 * <p>
 * The UI is initialized using {@link #init(VaadinRequest)}. This method is intended to be 
 * overridden to add component to the user interface and initialize non-component functionality.
 */
@Theme("mytheme")
public class MyUI extends UI {

	
	
    @Override
    protected void init(VaadinRequest vaadinRequest) {

        
    	AbsoluteLayout layout = new AbsoluteLayout();
    	layout.setWidth("1300px");
    	layout.setHeight("1300px");

    	
        
 //Sayfadaki bileşenleri tek tek ayarlıyoruz   	
        textarea1.setRows(27);
        textarea1.setWidth("600");
    	layout.addComponent(textarea1, "left: 20px; top: 200px");
    	
        textarea2.setRows(27);
        textarea2.setWidth("600");
    	layout.addComponent(textarea2, "left: 670px; top: 200px");
    
        textarea3.setRows(27);
        textarea3.setWidth("600");
    	layout.addComponent(textarea3, "left: 670px; top: 200px");
    	textarea3.setVisible(false);	
        

    	
    	layout.addComponent(button2, "left: 1200px; top: 160px");
    	

    	
    	textfield1.setWidth("750");
    	layout.addComponent(textfield1, "left: 20px; top: 50px;");
    	
    	textfield2.setWidth("400");
    	layout.addComponent(textfield2, "left: 820px; top: 50px;");

    	layout.addComponent(button4, "left: 20px; top: 100px");
    	
    	layout.addComponent(button5, "left: 220px; top: 100px");
    	

        
    	textarea4.setRows(15);
        textarea4.setWidth("1250");
    	layout.addComponent(textarea4, "left: 20px; top: 880px");
    	


    	
 // Buton 4'e basınca olacaklar   	
    	
    button4.addClickListener( e -> {
    	
    	// Sıfırlanması gereken değişkenleri sıfırlıyoruz
    	birinci_linkin_tum_kelimeler_icin_skoru=1;
    	ikinci_linkin_tum_kelimeler_icin_skoru=1;
    	ucuncu_linkin_tum_kelimeler_icin_skoru=1;
    	
    	//Text alanlarını yazıma hazır hale getirmek için boşaltıyoruz, kullanıcıdan kelime ve url'leri alıyoruz
    	String [] Kelimeler = textfield2.getValue().split(",");
        textarea1.setValue("");
        textarea2.setValue("");
        textarea3.setValue("");
        textarea4.setValue("");
        String string=textfield1.getValue();
        String [] urller=string.split(",");
        int a=urller.length;
        int [] skorlar=new int [a];
        
      
      // Kullanıcı 3 url ve 3 kelime girdiyse
      if(Kelimeler.length==3 && urller.length==3){  
        Agac_Yapisi_1(urller[0],Kelimeler[0]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
        Agac_Yapisi_1(urller[0],Kelimeler[1]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
        Agac_Yapisi_1(urller[0],Kelimeler[2]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
        
        Agac_Yapisi_2(urller[1],Kelimeler[0]);if(skor!=0){ ikinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
        Agac_Yapisi_2(urller[1],Kelimeler[1]);if(skor!=0){ ikinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
        Agac_Yapisi_2(urller[1],Kelimeler[2]);if(skor!=0){ ikinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
        
        Agac_Yapisi_3(urller[2],Kelimeler[0]);if(skor!=0){ ucuncu_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
        Agac_Yapisi_3(urller[2],Kelimeler[1]);if(skor!=0){ ucuncu_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
        Agac_Yapisi_3(urller[2],Kelimeler[2]);if(skor!=0){ ucuncu_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
        
        textarea4.setValue(textarea4.getValue()+"\n Birinci linkin tüm keilmeler için skoru= "
        +birinci_linkin_tum_kelimeler_icin_skoru);
        
        textarea4.setValue(textarea4.getValue()+"\n İkinci linkin tüm keilmeler için skoru= "
        +ikinci_linkin_tum_kelimeler_icin_skoru);   
        
        textarea4.setValue(textarea4.getValue()+"\n Üçüncü linkin tüm keilmeler için skoru= "
        +ucuncu_linkin_tum_kelimeler_icin_skoru);
      
      
      //Linklerin skorlarını rahat sıralamak için bir diziya atıyoruz
        skorlar[0]=birinci_linkin_tum_kelimeler_icin_skoru;
        skorlar[1]=ikinci_linkin_tum_kelimeler_icin_skoru;
        skorlar[2]=ucuncu_linkin_tum_kelimeler_icin_skoru;
        
      
      //Skorlar dizisini küçükten büyüğe sıralıyoruz ve ona göre urller dizisini de aynı anda sıralıyoruz
        String temp; int temp2;

        for (int i = 0; i < skorlar.length-1; i++) {

            for (int j = 0; j < skorlar.length-i-1 ; j++) { 

                if(skorlar[j] > skorlar[j+1]){ 

                    temp = urller[j];

                    urller[j] = urller[j+1];

                    urller[j+1] = temp;
                    
                    temp2 = skorlar[j];

                    skorlar[j] = skorlar[j+1];

                    skorlar[j+1] = temp2;

                }}}
    	
      //Url'leri ve skorlarını büyükten küçüğe doğru yazdırıyoruz
    	for (int i=(urller.length-1);i>=0;i--){
    		textarea4.setValue(textarea4.getValue()+"\n\n "+"-"+urller[i]+"  skor= "+skorlar[i]);
    		
    	}
        
      
      
      
      }
      
      
   // Kullanıcı 3 url ve 2 kelime girdiyse
      if(Kelimeler.length==2 && urller.length==3){  
          Agac_Yapisi_1(urller[0],Kelimeler[0]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          Agac_Yapisi_1(urller[0],Kelimeler[1]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          
          Agac_Yapisi_2(urller[1],Kelimeler[0]);if(skor!=0){ ikinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          Agac_Yapisi_2(urller[1],Kelimeler[1]);if(skor!=0){ ikinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          
          Agac_Yapisi_3(urller[2],Kelimeler[0]);if(skor!=0){ ucuncu_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          Agac_Yapisi_3(urller[2],Kelimeler[1]);if(skor!=0){ ucuncu_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          
          textarea4.setValue(textarea4.getValue()+"\n Birinci linkin tüm kelimeler için skoru= "
        	        +birinci_linkin_tum_kelimeler_icin_skoru);
        	        
        	        textarea4.setValue(textarea4.getValue()+"\n İkinci linkin tüm kelimeler için skoru= "
        	        +ikinci_linkin_tum_kelimeler_icin_skoru);   
        	        
        	        textarea4.setValue(textarea4.getValue()+"\n Üçüncü linkin tüm kelimeler için skoru= "
        	        +ucuncu_linkin_tum_kelimeler_icin_skoru);
      
      
         //Linklerin skorlarını rahat sıralamak için bir diziya atıyoruz	        
         skorlar[0]=birinci_linkin_tum_kelimeler_icin_skoru;
         skorlar[1]=ikinci_linkin_tum_kelimeler_icin_skoru;
         skorlar[2]=ucuncu_linkin_tum_kelimeler_icin_skoru;
      
      
         
         //Skorlar dizisini küçükten büyüğe sıralıyoruz ve ona göre urller dizisini de aynı anda sıralıyoruz
         String temp; int temp2;

         for (int i = 0; i < skorlar.length-1; i++) {

             for (int j = 0; j < skorlar.length-i-1 ; j++) { 

                 if(skorlar[j] > skorlar[j+1]){ 

                     temp = urller[j];

                     urller[j] = urller[j+1];

                     urller[j+1] = temp;
                     
                     temp2 = skorlar[j];

                     skorlar[j] = skorlar[j+1];

                     skorlar[j+1] = temp2;

                 }}}
     	
     	
         //Url'leri ve skorlarını büyükten küçüğe doğru yazdırıyoruz
         for (int i=(urller.length-1);i>=0;i--){
     		textarea4.setValue(textarea4.getValue()+"\n\n "+"-"+urller[i]+"  skor= "+skorlar[i]);
     		
     	} 
      
      
      
      }
      
      
   // Kullanıcı 3 url ve 1 kelime girdiyse
      if(Kelimeler.length==1 && urller.length==3){  
          Agac_Yapisi_1(urller[0],Kelimeler[0]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          Agac_Yapisi_2(urller[1],Kelimeler[0]);if(skor!=0){ ikinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          Agac_Yapisi_3(urller[2],Kelimeler[0]);if(skor!=0){ ucuncu_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          
          textarea4.setValue(textarea4.getValue()+"\n Birinci linkin tüm kelimeler için skoru= "
        	        +birinci_linkin_tum_kelimeler_icin_skoru);
        	        
        	        textarea4.setValue(textarea4.getValue()+"\n İkinci linkin tüm kelimeler için skoru= "
        	        +ikinci_linkin_tum_kelimeler_icin_skoru);   
        	        
        	        textarea4.setValue(textarea4.getValue()+"\n Üçüncü linkin tüm kelimeler için skoru= "
        	        +ucuncu_linkin_tum_kelimeler_icin_skoru);
      
        
        	        
        	      //Linklerin skorlarını rahat sıralamak için bir diziya atıyoruz
        	        skorlar[0]=birinci_linkin_tum_kelimeler_icin_skoru;
        	        skorlar[1]=ikinci_linkin_tum_kelimeler_icin_skoru;
        	        skorlar[2]=ucuncu_linkin_tum_kelimeler_icin_skoru;      
      
        
        
        //Skorlar dizisini küçükten büyüğe sıralıyoruz ve ona göre urller dizisini de aynı anda sıralıyoruz	        
        String temp; int temp2;

        for (int i = 0; i < skorlar.length-1; i++) {

            for (int j = 0; j < skorlar.length-i-1 ; j++) { 

                if(skorlar[j] > skorlar[j+1]){ 

                    temp = urller[j];

                    urller[j] = urller[j+1];

                    urller[j+1] = temp;
                    
                    temp2 = skorlar[j];

                    skorlar[j] = skorlar[j+1];

                    skorlar[j+1] = temp2;

                }}}
    	
      //Url'leri ve skorlarını büyükten küçüğe doğru yazdırıyoruz
    	for (int i=(urller.length-1);i>=0;i--){
    		textarea4.setValue(textarea4.getValue()+"\n\n "+"-"+urller[i]+"  skor= "+skorlar[i]);
    		
    	}
      
      
      }
      
      
   // Kullanıcı 2 url ve 3 kelime girdiyse
      if(Kelimeler.length==3 && urller.length==2){  
          Agac_Yapisi_1(urller[0],Kelimeler[0]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          Agac_Yapisi_1(urller[0],Kelimeler[1]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          Agac_Yapisi_1(urller[0],Kelimeler[2]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          
          Agac_Yapisi_2(urller[1],Kelimeler[0]);if(skor!=0){ ikinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          Agac_Yapisi_2(urller[1],Kelimeler[1]);if(skor!=0){ ikinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          Agac_Yapisi_2(urller[1],Kelimeler[2]);if(skor!=0){ ikinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          
          textarea4.setValue(textarea4.getValue()+"\n Birinci linkin tüm kelimeler için skoru= "
        	        +birinci_linkin_tum_kelimeler_icin_skoru);
        	        
        	        textarea4.setValue(textarea4.getValue()+"\n İkinci linkin tüm kelimeler için skoru= "
        	        +ikinci_linkin_tum_kelimeler_icin_skoru);
      
       
        //Linklerin skorlarını rahat sıralamak için bir diziya atıyoruz
        skorlar[0]=birinci_linkin_tum_kelimeler_icin_skoru;
        skorlar[1]=ikinci_linkin_tum_kelimeler_icin_skoru;
      
      
      //Url'leri ve skorlarını büyükten küçüğe doğru yazdırıyoruz
        if(skorlar[0]>skorlar[1]){
      	  textarea4.setValue(textarea4.getValue()+"\n\n"+urller[0]+"\n"+urller[1]);
        }
        else
      	  textarea4.setValue(textarea4.getValue()+"\n\n"+urller[1]+"\n"+urller[0]);
        
        
      
      
      }
      
      
   // Kullanıcı 2 url ve 2 kelime girdiyse
      if(Kelimeler.length==2 && urller.length==2){  
          Agac_Yapisi_1(urller[0],Kelimeler[0]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          Agac_Yapisi_1(urller[0],Kelimeler[1]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          
          Agac_Yapisi_2(urller[1],Kelimeler[0]);if(skor!=0){ ikinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          Agac_Yapisi_2(urller[1],Kelimeler[1]);if(skor!=0){ ikinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          
          textarea4.setValue(textarea4.getValue()+"\n Birinci linkin tüm kelimeler için skoru= "
        	        +birinci_linkin_tum_kelimeler_icin_skoru);
        	        
        	        textarea4.setValue(textarea4.getValue()+"\n İkinci linkin tüm kelimeler için skoru= "
        	        +ikinci_linkin_tum_kelimeler_icin_skoru);
      
      
        //Linklerin skorlarını rahat sıralamak için bir diziya atıyoruz	        
        skorlar[0]=birinci_linkin_tum_kelimeler_icin_skoru;
        skorlar[1]=ikinci_linkin_tum_kelimeler_icin_skoru;
      
        //Url'leri ve skorlarını büyükten küçüğe doğru yazdırıyoruz
        if(skorlar[0]>skorlar[1]){
      	  textarea4.setValue(textarea4.getValue()+"\n\n"+urller[0]+"\n"+urller[1]);
        }
        else
      	  textarea4.setValue(textarea4.getValue()+"\n\n"+urller[1]+"\n"+urller[0]);
        
        
      
      
      }
      
   // Kullanıcı 2 url ve 1 kelime girdiyse
      if(Kelimeler.length==1 && urller.length==2){  
          Agac_Yapisi_1(urller[0],Kelimeler[0]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();

          Agac_Yapisi_2(urller[1],Kelimeler[0]);if(skor!=0){ ikinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
      
          textarea4.setValue(textarea4.getValue()+"\n Birinci linkin tüm kelimeler için skoru= "
        	        +birinci_linkin_tum_kelimeler_icin_skoru);
        	        
        	        textarea4.setValue(textarea4.getValue()+"\n İkinci linkin tüm kelimeler için skoru= "
        	        +ikinci_linkin_tum_kelimeler_icin_skoru);  
      
      
       //Linklerin skorlarını rahat sıralamak için bir diziya atıyoruz       	        
      skorlar[0]=birinci_linkin_tum_kelimeler_icin_skoru;
      skorlar[1]=ikinci_linkin_tum_kelimeler_icin_skoru;
      
      
    //Url'leri ve skorlarını büyükten küçüğe doğru yazdırıyoruz
      if(skorlar[0]>skorlar[1]){
    	  textarea4.setValue(textarea4.getValue()+"\n\n"+urller[0]+"\n"+urller[1]);
      }
      else
    	  textarea4.setValue(textarea4.getValue()+"\n\n"+urller[1]+"\n"+urller[0]);
      
      }
      
      
   // Kullanıcı 1 url ve 3 kelime girdiyse
      if(Kelimeler.length==3 && urller.length==1){  
          Agac_Yapisi_1(urller[0],Kelimeler[0]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          Agac_Yapisi_1(urller[0],Kelimeler[1]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          Agac_Yapisi_1(urller[0],Kelimeler[2]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          
          textarea4.setValue(textarea4.getValue()+"\n Birinci linkin tüm kelimeler için skoru= "
      	        +birinci_linkin_tum_kelimeler_icin_skoru);    
      
      
      }
      
      
   // Kullanıcı 1 url ve 2 kelime girdiyse
      if(Kelimeler.length==2 && urller.length==1){  
          Agac_Yapisi_1(urller[0],Kelimeler[0]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          Agac_Yapisi_1(urller[0],Kelimeler[1]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          
          textarea4.setValue(textarea4.getValue()+"\n Birinci linkin tüm kelimeler için skoru= "
      	        +birinci_linkin_tum_kelimeler_icin_skoru);
          
      }
      
      
   // Kullanıcı 1 url ve 1 kelime girdiyse
      if(Kelimeler.length==1 && urller.length==1){  
          Agac_Yapisi_1(urller[0],Kelimeler[0]);if(skor!=0){ birinci_linkin_tum_kelimeler_icin_skoru*=skor;} degisken_sifirla();
          
          textarea4.setValue(textarea4.getValue()+"\n Birinci linkin tüm kelimeler için skoru= "
      	        +birinci_linkin_tum_kelimeler_icin_skoru);
      
      }

        
      
    
    });
        
 
    
    
   
    
    //Buton 5'e tıklıyoruz
    button5.addClickListener( e -> {
        
    	//Başlangıç değişken ayarlamalarını ve text alanı ayarlamalarını yapıyoruz. Kullanıcıdan url ve kelimeleri alıyoruz.
    	ana_url_skor=1;
    	String [] Kelimeler = textfield2.getValue().split(",");
        textarea1.setValue("");
        textarea2.setValue("");
        textarea3.setValue("");
        textarea4.setValue("");
        String string=textfield1.getValue();
        String [] urller=string.split(",");
        
    	
    	int[] skorlar=new int[urller.length];
    	int a=Kelimeler.length;
    	int b=urller.length;
    	
    	
    	
         
          
          //Kaç url ve kaç kelime varsa çapraz bir şekilde hesaplıyoruz
        	for(int i=0;i<b;i++){
        	  for (int j=0;j<a;j++){
        		try {
				 Anahtar_kelime_saydırma(Kelimeler[j],urller[i]);
			     textarea4.setValue(textarea4.getValue()+"\n"+urller[i]+"   URL'SİNDEKİ "
				    + Kelimeler[j]+" KELİMESİ SAYISI= "+sayac);
        		
			    //Skor hesaplarken sayacın 0 olması sorun teşkil ettiği için sayacı 1 yapıyoruz 
			    if(sayac==0){
			    	sayac=1;
			    }
        		ana_url_skor*=sayac;
        		
        		} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
        		}
        	 
        	  //url skorlarını skorlar dizisine atıyoruz
        	  skorlar[i]=ana_url_skor;
        	  ana_url_skor=1;
        	
        	}
          
            
        	//Skorları küçükten büyüğe doğru sıralıyoruz bunu yaparken url'leri de aynı şekilde sıralıyoruz
            String temp; int temp2;

            for (int i = 0; i < skorlar.length-1; i++) {

                for (int j = 0; j < skorlar.length-i-1 ; j++) { 

                    if(skorlar[j] > skorlar[j+1]){ 

                        temp = urller[j];

                        urller[j] = urller[j+1];

                        urller[j+1] = temp;
                        
                        temp2 = skorlar[j];

                        skorlar[j] = skorlar[j+1];

                        skorlar[j+1] = temp2;

                    }}}
        	
        	//Url'leri ve skorlarını büyükten küçüğe doğru yazdırıyoruz.
            for (int i=(urller.length-1);i>=0;i--){
        		textarea4.setValue(textarea4.getValue()+"\n\n "+"-"+urller[i]+"  skor= "+skorlar[i]);
        		
        	}

        


    });
    
    
    

    
    button2.addClickListener( e -> {
    	
    	if(b==true){
    	    textarea3.setVisible(b);
    	    textarea2.setVisible(!b);
    	    b=false;
    	}
    	else if(b==false){
    	    textarea3.setVisible(b);
    	    textarea2.setVisible(!b);
    	    b=true;
    	}
    
    
    });
        
        
        

        
        setContent(layout);
    }

    
    
    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = MyUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }







    
    
    
    
    
    
    
    
    // Sayfada kullanacağımız bileşenleri tanımlıyoruz
    TextArea textarea1 = new TextArea("AĞAÇ YAPISI 1");
    TextArea textarea2 = new TextArea("AĞAÇ YAPISI 2");
    TextArea textarea3 = new TextArea("AĞAÇ YAPISI 3");
    Button button2 = new Button("<-/->");
    TextField textfield1 = new TextField("URL'LER");
    TextField textfield2 = new TextField("KELİMELER");
    Button button4 = new Button("ALT URL'LER İLE ARA");
    Button button5 = new Button("ANA URL'LERİ ARA");  
    TextArea textarea4 = new TextArea("SONUÇLAR");








    // Global değişkenleri tanımlıyoruz
    String[] alt_seviye_linkler = new String[5000];
    String[] ikinci_seviye_linkler = new String[5000];
    String[] gecici_linkler = new String[5000];
    static int gecici_link_sayac=0;
    static int link_sayac=0;
    static int sayac=0;
    static int toplam=0;
    static int ikinci_seviye_toplam;
    static int ucuncu_seviye_toplam;
    String[] tum_ucuncu_Seviye_linkler = new String[50000];
    static int tum_ucuncu_Seviye_linkler_Sayac=0;
    static int genel_toplam=0;
    static int birinci_seviye_toplam=0;
    static int birinci_linkin_tum_kelimeler_icin_skoru=1;
    static int ikinci_linkin_tum_kelimeler_icin_skoru=1;
    static int ucuncu_linkin_tum_kelimeler_icin_skoru=1;
    static int skor=0;
    static int ana_url_skor=1;
    static boolean b=true;
    
    
    static void degisken_sifirla(){

        toplam=0;
        ikinci_seviye_toplam=0;
        ucuncu_seviye_toplam=0;
        tum_ucuncu_Seviye_linkler_Sayac=0;
        genel_toplam=0;
        birinci_seviye_toplam=0;
        skor=0;
    }
    
    
    
    
    static void Anahtar_kelime_saydırma (String aranacak_Kelime, String URL) throws IOException{
    sayac=0;
    

    
   
    StringBuilder stringolustur = new StringBuilder();
    
   //Jsoup ile Url'ye bağlanıyoruz 5 saniyede bağlanmazsa timeout oluyor.
    //403 hatası vermesin diye useragent fonksiyonu kullanıyoruz.
   Document doc = Jsoup.connect(URL).timeout(5*1000).userAgent("Mozilla").ignoreContentType(true).get();
   //Body kısmındaki elementleri tek tek çekiyoruz
   Elements elements = doc.select("body"); 
   for (Element e : elements)
   {
        //body kısmındaki elemenlerin text kısmını tek tek çekip string oluştur stringbilderimize ekliyoruz
        stringolustur.append(e.text());
        
   
   }
    
    //Stringbuilderimiz tamamlanınca onu string'e atıyoruz. Böylece html dosyasının body kısmını 
    //etiketsiz text olarak almış olduk.
    String sayfa = stringolustur.toString();
    
    
  
    
    
    //Arama sırasında büyük küçük harf sorunu olmasın diye, tüm sayfayı ve aranacak kelimeyi  küçük harf yapıyoruz. 
    //Karakter karakter inceleyebilmek için sayfamızı vekelimemizi parçalayıp diziye atıyoruz.
    aranacak_Kelime=aranacak_Kelime.toLowerCase();
    int aranacak_Kelime_uzunluk = aranacak_Kelime.length();
    String[] aranacak_Kelime_array = aranacak_Kelime.split("");
    int j=0,gecici_sayac=0,gecici_i;
    int url_icerigi_uzunluk = sayfa.length();
    sayfa=sayfa.toLowerCase();
    String[] url_karakterler = sayfa.split("");
    
   
   //Bu döngüde aradığımız kelime sayfada var mı diye kelimeyi sayfada kaydırma yöntemiyle arıyoruz. 
   for(int i=0;i<(url_icerigi_uzunluk-aranacak_Kelime_uzunluk);i++){
        j=0;
        gecici_sayac=0;
        gecici_i=i;
        
        //aranacak kelimenin önceki karakteri
        char c1=' ';
        if(i-1>0){
          c1=sayfa.charAt(i-1);
        }
       
      char c2=sayfa.charAt(aranacak_Kelime_uzunluk+i); ////aranacak kelimenin sonraki karakteri
       
      //Aranacak kelimenin bir önceki ve bir sonraki karakteri harf ise o kelimeyi almıyoruz.
      if (!Character.isAlphabetic(c1) && !Character.isAlphabetic(c2) ){   
        do {
            if(url_karakterler[i].equals(aranacak_Kelime_array[j])){
               gecici_sayac++; 
            }
            j++;
            i++;
        
        } while (j < aranacak_Kelime_uzunluk);
        i=gecici_i;
    
      }
      
      else{
    	  
    	  continue;
      }
        
      //Do_while aradığımız kelimenin uzunluğu kadar dönmüşse aradığımız kelimeden 1 tane bulmuşuzdur.
      if(gecici_sayac==aranacak_Kelime_uzunluk){
            sayac++;
       }
      else{
            ;
       }
    
    }
    
    //System.out.println(sayac);
    
    
    
    
}
    
    
    
    
    void Agac_Yapisi_Icın_Linkleri_cek(String URL){
        

    gecici_link_sayac=0;
    link_sayac=0;
          
        
        try
        {
           int k =0; toplam=0;
           
           //403 hatası vermesin diye useragent fonksiyonu kullanıyoruz.
           Document document = Jsoup.connect(URL).timeout(5*1000).userAgent("Mozilla").ignoreContentType(true).get();
      
           //Sayfa icerisindeki tum linkleri getiriyoruz
           Elements links = document.select("a[href]");
      
           //Linkleri stringe atıyoruz.
           for(Element link: links)
           {
            int i=0;
            String a=link.attr("abs:href");

            
            //Site içine yönlendiren tüm linkleri buluyoruz, site dışına çıkanları eliyoruz.
            if(a.length()>=15 && a.substring(0, 14).equalsIgnoreCase(URL.substring(0, 14))){
                gecici_linkler[k]=a;  k++;
                gecici_link_sayac++;
            }
            }

        
          //aynı linkleri eliyoruz 
          for (int n = 0 ; n < gecici_link_sayac ; n++)
          {
            int flag = 0;

                for (int m = 0 ; m < n ; m++)
                {
                    if (gecici_linkler[n].equals(gecici_linkler[m]))
                    {
                        flag = 1;
                        break;
                    }
                }

                //bazı dosya tiplerini engelliyoruz
                if (flag == 0  && !gecici_linkler[n].endsWith(".img") && !gecici_linkler[n].endsWith(".xls")
                        && !gecici_linkler[n].endsWith(".png") && !gecici_linkler[n].endsWith(".doc")
                        && !gecici_linkler[n].endsWith(".pdf") && !gecici_linkler[n].endsWith(".PDF")
                        && !gecici_linkler[n].endsWith(".jpg") && !gecici_linkler[n].endsWith(".PNG")
                        && !gecici_linkler[n].endsWith(".İMG") && !gecici_linkler[n].endsWith(".DOC")
                        && !gecici_linkler[n].endsWith(".JPG") && !gecici_linkler[n].endsWith(".xlsx")
                        && !gecici_linkler[n].endsWith(".rar") && !gecici_linkler[n].endsWith(".docx")
                        && !gecici_linkler[n].endsWith(".gif") && !gecici_linkler[n].endsWith(".zip")
                        && !gecici_linkler[n].endsWith(".RAR"))
            {
                alt_seviye_linkler[link_sayac]=gecici_linkler[n]; link_sayac++;
                
            }
          }
        

        
        }
           catch (IOException e)
        {
           e.printStackTrace();
        }

    }
    
    
    //Agac Yapisi 1 2 3 tamamen aynıdır. Sadece sonuçları yazdırdıkları textarea farklıdır.
    void Agac_Yapisi_1(String URL,String Kelime){
        
    	skor=0; int u=0;
        boolean ust_seviyedekilerle_eslesiyor_mu;
        
        //Önce Ana URL'deki linkleri arıyoruz.
        Agac_Yapisi_Icın_Linkleri_cek(URL); 
        try {
			//Ana URL için kelime araması yapıyoruz
        	Anahtar_kelime_saydırma (Kelime, URL);
	        //Sonucu ağaç yapısına yazıyoruz
	        textarea1.setValue(textarea1.getValue()+ "\n" +"1- "+URL+"   -> "+ sayac +"\n"+"\n");
	        //Anahtar kelime saydırma fonksiyonundan gelen sayac degiskeni birinci derinlik toplamı oluyor.
	        birinci_seviye_toplam=sayac;	
        
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



        
        //Ana URL'den gelen bir alt seviye linklere ikinci seviye linkler diyoruz.
        //İkinci seviye linklerde de tek tek linkleri arayınca oradan gelen alt seviye linkler, ucucu seviye linkler olacak.
        ikinci_seviye_linkler = alt_seviye_linkler;
        
        int a = link_sayac;
        //döngü 2. seviye link sayısı kadar dönecek. Buradaki link sayac ikinci seviye link sayısı oluyor.
        for(int i=0;i<a;i++){
          
          try {
			//İkinci derinlikteki link için istediğimiz kelimeyi aratıyoruz.
        	Anahtar_kelime_saydırma (Kelime, ikinci_seviye_linkler[i]);
	        //Sonucu ağaç yapısına yazdırıyoruz
        	textarea1.setValue(textarea1.getValue()+ "\n"+"\n"+"     1."+ (u+1)+ "-   "
	                  +ikinci_seviye_linkler[i]+"   -> "+sayac+"\n");
	                  
        	//ikinci derinlikteki her bir link için kelime araması yaptığımızda fonksiyondan sayac değiskeni geliyor.
        	//o sayac degiskenlerinin hepsinin toplamı ikinci seviye toplam olur. Burada hem şu ana kadarki genel toplamı
        	//hem de ikinci seviye toplamı hesaplıyoruz.
        	genel_toplam+=sayac;		u++;
          
        	//son linke kadar tüm sayac'lar toplandıysa genel_toplam=ikinci seviye toplam oluyor.
	        if(i==(a-1)){
	        ikinci_seviye_toplam=genel_toplam;
	        }       
          
          } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

          

          //2. derinlikteki bir linkin alt linklerini aratıyoruz. Yani 3. derinlikteki linkleri elde ediyoruz.
          Agac_Yapisi_Icın_Linkleri_cek(ikinci_seviye_linkler[i]);
          
          int b=0;
          
          //Döngü üçüncü derinlikteki link sayısı kadar dönüyor. 
          for(int y=0;y<link_sayac;y++){

            ust_seviyedekilerle_eslesiyor_mu=false;
            
            //3. derinlikteki linkimiz, 2. derinlikteki bir linkle aynı mı diye bakıyoruz.
            for(int t=0;t<a;t++){
              if(alt_seviye_linkler[y].equals(ikinci_seviye_linkler[t])){
                  ust_seviyedekilerle_eslesiyor_mu=true;
                  break;
              }
            }
            
            
            int flag = 0;

            //Bu anda bulduğumuz link önceden bulduğumuz herhangi bir derinlikteki herhangi bir linkle aynı mı diye bakıyoruz.
            for(int m=0;m<tum_ucuncu_Seviye_linkler_Sayac;m++){
                if (alt_seviye_linkler[y].equals(tum_ucuncu_Seviye_linkler[m]))
                {
                    flag = 1;
                    break;
                }
            }
            
            
            
            
            //3. derinlikteki linkimiz 2. derinlikteki her hangi bir linkle aynı değilse ekrana yazdırıyoruz.
            if(flag==0 && ust_seviyedekilerle_eslesiyor_mu==false){

            	try {
					
            		Anahtar_kelime_saydırma (Kelime, alt_seviye_linkler[y]);
	            	textarea1.setValue(textarea1.getValue()+ "\n"+"         1."+ u+"."
	                        +(b+1) +"-   "+ alt_seviye_linkler[y]+"   -> "+sayac);
	                 	genel_toplam+=sayac;
	                 	b++;
            	
            	} 
            	catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

            }
          
          
          
            //tüm linkleri bu diziye atıyoruz
            tum_ucuncu_Seviye_linkler[tum_ucuncu_Seviye_linkler_Sayac]=alt_seviye_linkler[y];
            tum_ucuncu_Seviye_linkler_Sayac++;
          
          
          
          }
        }
        //Buradaki genel toplam sadece 2.derinlik + 3. derinlik
        ucuncu_seviye_toplam=genel_toplam-ikinci_seviye_toplam;
        //Genel toplamı birinci seviye toplamla da toplayarak gerçek genel toplam yapıyoruz.
        genel_toplam+=birinci_seviye_toplam;
        
        textarea1.setValue(textarea1.getValue()+"\n\n\n\n\n birinci derinlik toplami= "+birinci_seviye_toplam);
        textarea1.setValue(textarea1.getValue()+"\n ikinici derinlik toplami= "+ikinci_seviye_toplam);
        textarea1.setValue(textarea1.getValue()+"\n ucuncu derinlik toplami= "+ucuncu_seviye_toplam);
        textarea1.setValue(textarea1.getValue()+"\n genel toplam= "+genel_toplam);
        
        //Alt url'li aramanın skor formülünü belirliyoruz. Aradığımız kelime 1. derinlikte bulunursa en değerli oluyor.
        //Bu yüzden birinci derinlikte bulduğumuz kelime sayısını 3 ile çarpıyoruz. 2. derinlikte bulduğumuz kelime sayısını
        //2 ile çarpıyoruz. 3 derinliktekini ise 1 ile çarpıyoruz. Sonra bu çarpımları toplayarak o ana URL'ye ait skoru elde 
        //ediyoruz.
        skor=3*(birinci_seviye_toplam)+2*(ikinci_seviye_toplam)+ucuncu_seviye_toplam;
        textarea1.setValue(textarea1.getValue()+"\n skor= "+skor+"\n\n\n\n\n");
        
    
    }
    

    
    void Agac_Yapisi_2(String URL,String Kelime){
        
    	skor=0; int u=0;
        boolean ust_seviyedekilerle_eslesiyor_mu;
        
        Agac_Yapisi_Icın_Linkleri_cek(URL); 
        try {
			Anahtar_kelime_saydırma (Kelime, URL);
	        textarea2.setValue(textarea2.getValue()+ "\n" +"1- "+URL+"   -> "+ sayac +"\n"+"\n");
	        
	        birinci_seviye_toplam=sayac;	
        
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}



        
        
        ikinci_seviye_linkler = alt_seviye_linkler;
        int a = link_sayac;
        
        for(int i=0;i<a;i++){
          
          try {
			Anahtar_kelime_saydırma (Kelime, ikinci_seviye_linkler[i]);
	          textarea2.setValue(textarea2.getValue()+ "\n"+"\n"+"     1."+ (u+1)+ "-   "
	                  +ikinci_seviye_linkler[i]+"   -> "+sayac+"\n");   u++;
	                  genel_toplam+=sayac;		

	         if(i==(a-1)){
	         ikinci_seviye_toplam=genel_toplam;
	         }	                  
          
          
          } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

          

          
          Agac_Yapisi_Icın_Linkleri_cek(ikinci_seviye_linkler[i]);
          
          int b=0;
          
          for(int y=0;y<link_sayac;y++){

            ust_seviyedekilerle_eslesiyor_mu=false;
            
            //3. derinlikteki linkimiz, 2. derinlikteki bir linkle aynı mı diye bakıyoruz.
            for(int t=0;t<a;t++){
              if(alt_seviye_linkler[y].equals(ikinci_seviye_linkler[t])){
                  ust_seviyedekilerle_eslesiyor_mu=true;
                  break;
              }
            }
            
            
            int flag = 0;

            
            for(int m=0;m<tum_ucuncu_Seviye_linkler_Sayac;m++){
                if (alt_seviye_linkler[y].equals(tum_ucuncu_Seviye_linkler[m]))
                {
                    flag = 1;
                    break;
                }
            }
            
            
            
            
            //3. derinlikteki linkimiz 2. derinlikteki her hangi bir linkle aynı değilse ekrana yazıdırıyoruz.
            if(flag==0 && ust_seviyedekilerle_eslesiyor_mu==false){
            	
            	try {
					Anahtar_kelime_saydırma (Kelime, alt_seviye_linkler[y]);
	            	textarea2.setValue(textarea2.getValue()+ "\n"+"         1."+ u +"."
	                        +(b+1) +"-   "+ alt_seviye_linkler[y]+"   -> "+sayac);
	                 	genel_toplam+=sayac;
	                 	b++;				
            	} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

            }
          
          
          
            //tüm linkleri bu diziye atıyoruz
            tum_ucuncu_Seviye_linkler[tum_ucuncu_Seviye_linkler_Sayac]=alt_seviye_linkler[y];
            tum_ucuncu_Seviye_linkler_Sayac++;
          
          
          
          }
        }
    
        //Buradaki genel toplam sadece 2.derinlik + 3. derinlik
        ucuncu_seviye_toplam=genel_toplam-ikinci_seviye_toplam;
        
        genel_toplam+=birinci_seviye_toplam;
        
        textarea2.setValue(textarea2.getValue()+"\n\n\n\n\n birinci derinlik toplami= "+birinci_seviye_toplam);
        textarea2.setValue(textarea2.getValue()+"\n ikinici derinlik toplami= "+ikinci_seviye_toplam);
        textarea2.setValue(textarea2.getValue()+"\n ucuncu derinlik toplami= "+ucuncu_seviye_toplam);
        textarea2.setValue(textarea2.getValue()+"\n genel toplam= "+genel_toplam);
    
        skor=3*(birinci_seviye_toplam)+2*(ikinci_seviye_toplam)+ucuncu_seviye_toplam;
        textarea2.setValue(textarea2.getValue()+"\n skor= "+skor+"\n\n\n\n\n");
    }
    
    
    
    void Agac_Yapisi_3(String URL,String Kelime){
        
    	skor=0; int u=0;
        boolean ust_seviyedekilerle_eslesiyor_mu;
        
        Agac_Yapisi_Icın_Linkleri_cek(URL); 
        try {
			Anahtar_kelime_saydırma (Kelime, URL);
	        textarea3.setValue(textarea3.getValue()+ "\n" +"1- "+URL+"   -> "+ sayac +"\n"+"\n");
	        
	        birinci_seviye_toplam=sayac;
        } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


        

        
        
        ikinci_seviye_linkler = alt_seviye_linkler;
        int a = link_sayac;
        
        for(int i=0;i<a;i++){
          
          try {
			Anahtar_kelime_saydırma (Kelime, ikinci_seviye_linkler[i]);
	          textarea3.setValue(textarea3.getValue()+ "\n"+"\n"+"     1."+ (u+1)+ "-   "
	                  +ikinci_seviye_linkler[i]+"   -> "+sayac+"\n"); u++;
	                  genel_toplam+=sayac;
	       if(i==(a-1)){
	       ikinci_seviye_toplam=genel_toplam;
	       }        
          
          } catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

          

          
          Agac_Yapisi_Icın_Linkleri_cek(ikinci_seviye_linkler[i]);
          
          int b=0;
          
          for(int y=0;y<link_sayac;y++){

            ust_seviyedekilerle_eslesiyor_mu=false;
            
            //3. derinlikteki linkimiz, 2. derinlikteki bir linkle aynı mı diye bakıyoruz.
            for(int t=0;t<a;t++){
              if(alt_seviye_linkler[y].equals(ikinci_seviye_linkler[t])){
                  ust_seviyedekilerle_eslesiyor_mu=true;
                  break;
              }
            }
            
            
            int flag = 0;

            
            for(int m=0;m<tum_ucuncu_Seviye_linkler_Sayac;m++){
                if (alt_seviye_linkler[y].equals(tum_ucuncu_Seviye_linkler[m]))
                {
                    flag = 1;
                    break;
                }
            }
            
            
            
            
            //3. derinlikteki linkimiz 2. derinlikteki her hangi bir linkle aynı değilse ekrana yazıdırıyoruz.
            if(flag==0 && ust_seviyedekilerle_eslesiyor_mu==false){
            	
            	try {
					Anahtar_kelime_saydırma (Kelime, alt_seviye_linkler[y]);
	            	textarea3.setValue(textarea3.getValue()+ "\n"+"         1."+ u+"."
	                        +(b+1) +"-   "+ alt_seviye_linkler[y]+"   -> "+sayac);
	                 	genel_toplam+=sayac;
	                 	b++;
            	} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

            }
          
          
          
            //tüm linkleri bu diziye atıyoruz
            tum_ucuncu_Seviye_linkler[tum_ucuncu_Seviye_linkler_Sayac]=alt_seviye_linkler[y];
            tum_ucuncu_Seviye_linkler_Sayac++;
          
          
          
          }
        }
        

        //Buradaki genel toplam sadece 2.derinlik + 3. derinlik
        ucuncu_seviye_toplam=genel_toplam-ikinci_seviye_toplam;
        
        genel_toplam+=birinci_seviye_toplam;
        
        textarea3.setValue(textarea3.getValue()+"\n\n\n\n\n birinci derinlik toplami= "+birinci_seviye_toplam);
        textarea3.setValue(textarea3.getValue()+"\n ikinici derinlik toplami= "+ikinci_seviye_toplam);
        textarea3.setValue(textarea3.getValue()+"\n ucuncu derinlik toplami= "+ucuncu_seviye_toplam);
        textarea3.setValue(textarea3.getValue()+"\n genel toplam= "+genel_toplam);
    
        skor=3*(birinci_seviye_toplam)+2*(ikinci_seviye_toplam)+ucuncu_seviye_toplam;
        textarea3.setValue(textarea3.getValue()+"\n skor= "+skor+"\n\n\n\n\n");
    
    }

    
    
    
    

}
