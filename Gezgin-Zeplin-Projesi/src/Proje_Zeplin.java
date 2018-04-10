
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;



/**
 *
 * @author Fatih
 */
public class Proje_Zeplin extends javax.swing.JFrame {

   
    public Proje_Zeplin() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zeplin");
        setPreferredSize(new java.awt.Dimension(1579, 826));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(1579, 170));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Kaynak");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Hedef");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("Yolcu Sayısı");

        jButton1.setText("Git");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Problem 1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Problem 2");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("Güzergah");

        jTextField4.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Mesafe");

        jTextField5.setEditable(false);

        jTextArea1.setEditable(false);
        jTextArea1.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Cambria", 1, 14)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField7.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel3)))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(174, 174, 174)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(246, 246, 246)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 924, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jButton2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(242, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
    long startTime = System.currentTimeMillis();        
    
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField7.setText("");
    
    String kaynak_sehir=jTextField1.getText();
    String hedef_sehir=jTextField2.getText();

    

    try 
    {    
        kaynak_indis = sehirden_indis_Bul(kaynak_sehir);
        hedef_indis = sehirden_indis_Bul(hedef_sehir);
        yolcu_sayisi = Integer.parseInt(jTextField3.getText());
        
    } catch (IOException ex) 
    {
        Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
    }
        
         
    try 
    {    
        
        Islem();
        
        if(sb!=null)
        {
        String[] parcalar=sb.toString().split(" ");
        for(int i=parcalar.length-1;i>=0;i--)
        {
            String sehir = indisten_sehir_ismi_Bul(Integer.parseInt(parcalar[i]));
            jTextField4.setText(jTextField4.getText()+ " > "+ sehir);
        }
        
        jTextField5.setText(km+" km");
       }
       else
        jTextField4.setText("yol bulunamadı...");
    
    } catch (IOException ex) 
    {
        Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
    }
        
    Arayuze_Grafik_Ciz();    
    
    try {
         Hareket_detaylarini_dosyaya_yazdir();
    } catch (UnsupportedEncodingException ex) {
        Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
    } catch (IOException ex) {
        Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
     }    
    
    
    
    //işimiz bitince tekrar kullanabilmek için string builderin ve graf grafiği çizimi için olan dizinin içini boşaltıyoruz
    sb.setLength(0);
    haritada_graf_goster=new int[999];   
    tum_mesafeler=new double[999][999];
    asil_mesafeler=new double[999][999];
    
    long endTime = System.currentTimeMillis();
    long duration = (endTime - startTime)/1000;
    
    jTextField7.setText(Integer.toString((int)duration)+" sn");
    
    }//GEN-LAST:event_jButton1ActionPerformed


    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    
    long startTime = System.currentTimeMillis();    
        
    String[] sonuclar=new String[46];    
    int karlar[]=new int[46];    
        

    jTextArea1.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField7.setText(""); 
    
    String kaynak_sehir=jTextField1.getText();
    String hedef_sehir=jTextField2.getText();
    int sabit_ucret=100;
    
    try {
        kaynak_indis = sehirden_indis_Bul(kaynak_sehir);
        hedef_indis = sehirden_indis_Bul(hedef_sehir);
    } catch (IOException ex) {
            Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
    }
     
    int m=0;
    for(int i=5;i<51;i++)
    {
        StringBuilder sonuc=new StringBuilder("");
        sonuc.append(i+ " yolcu ile ");
        yolcu_sayisi=i;
        try {
            Islem();
        } catch (IOException ex) {
            Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] parcalar=sb.toString().split(" ");
        for(int t=parcalar.length-1;t>=0;t--)
        {
            String sehir;
            try {
                sehir = indisten_sehir_ismi_Bul(Integer.parseInt(parcalar[t]));
                sonuc.append( " > "+ sehir);
            } catch (IOException ex) {
                Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    sonuc.append("   "+ km +" km");        
    
    
   double kar=(yolcu_sayisi*sabit_ucret)- (km*10);
   sonuc.append("  kar= "+ kar +"  TL");
   karlar[i-5]=(int)kar; 
   
   sonuclar[i-5]=sonuc.toString();
    
    
    sb.setLength(0);
    haritada_graf_goster=new int[999];   
    tum_mesafeler=new double[999][999];
    asil_mesafeler=new double[999][999];
    
    }
    
    int gecici; String tmp;
    for (int f = 0; f < 46; f++) {
        for (int g = 0; g < 46; g++) 
        {
            if (karlar[f] < karlar[g]) 
            {
                gecici = karlar[g]; tmp=sonuclar[g];
                karlar[g] = karlar[f]; sonuclar[g] = sonuclar[f];
                karlar[f] = gecici; sonuclar[f] = tmp;
            }
        }

    }
    
    for(int f=45;f>=0;f--)
    {
        jTextArea1.append(sonuclar[f]+"\n");
    }
    
    
    
    String[] parcalar=sonuclar[45].split(" ");
    yolcu_sayisi=Integer.parseInt(parcalar[0]);
    
    try {
        Islem();
    
        String[] parcalar1=sb.toString().split(" ");
        for(int i=parcalar1.length-1;i>=0;i--)
        {
            String sehir = indisten_sehir_ismi_Bul(Integer.parseInt(parcalar1[i]));
            jTextField4.setText(jTextField4.getText()+ " > "+ sehir);
        }
        jTextField5.setText(km+" km");
    } catch (IOException ex) {
        Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    Arayuze_Grafik_Ciz(); 
    

    sb.setLength(0);
    haritada_graf_goster=new int[999];   
    tum_mesafeler=new double[999][999];
    asil_mesafeler=new double[999][999];
    
    long endTime = System.currentTimeMillis();
    long duration = (endTime - startTime)/1000;
    
    jTextField7.setText(Integer.toString((int)duration)+" sn");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     
    long startTime = System.currentTimeMillis();    
        
    String[] sonuclar=new String[5];
    double[] ucretler=new double[5];
    int m=0;
        
    jTextArea1.setText("");
    jTextField4.setText("");
    jTextField5.setText("");
    jTextField7.setText("");
     
    String kaynak_sehir=jTextField1.getText();
    String hedef_sehir=jTextField2.getText();        
        
    try {
        kaynak_indis = sehirden_indis_Bul(kaynak_sehir);
        hedef_indis = sehirden_indis_Bul(hedef_sehir);
    } catch (IOException ex) {
        Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    
    for(int i=10;i<51;i=i+10)
    {
        StringBuilder sonuc=new StringBuilder("");
        sonuc.append(i+ " yolcu ile ");
        yolcu_sayisi=i;
        try {
            Islem();
        } catch (IOException ex) {
            Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
        }
        String[] parcalar=sb.toString().split(" ");
        for(int t=parcalar.length-1;t>=0;t--)
        {
            String sehir;
            try {
                sehir = indisten_sehir_ismi_Bul(Integer.parseInt(parcalar[t]));
                sonuc.append( " > "+ sehir);
            } catch (IOException ex) {
                Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
            }
           
        }
    sonuc.append("   "+ km +" km\n");
    
    double alinmasi_gereken_ucret= ((km*10)*1.5)/yolcu_sayisi;
    sonuc.append("Kisi basi alınması gereken ucret= "+ (int)alinmasi_gereken_ucret  +" TL\n\n");
    ucretler[m]=alinmasi_gereken_ucret; 
    sonuclar[m]=sonuc.toString();
    m++;
    
    
    sb.setLength(0);
    haritada_graf_goster=new int[999];   
    tum_mesafeler=new double[999][999];
    asil_mesafeler=new double[999][999];
    }    
        
        
    double gecici; String tmp;
    for (int f = 0; f < 5; f++) {
        for (int g = 0; g < 5; g++) 
        {
            if (ucretler[f] < ucretler[g]) 
            {
                gecici = ucretler[g]; tmp=sonuclar[g];
                ucretler[g] = ucretler[f]; sonuclar[g] = sonuclar[f];
                ucretler[f] = gecici; sonuclar[f] = tmp;
            }
        }
    }    
        
    for(int f=0;f<5;f++)
    {
        jTextArea1.append(sonuclar[f]);
    }        
    

    String[] parcalar=sonuclar[0].split(" ");
    yolcu_sayisi=Integer.parseInt(parcalar[0]);
    
    try {
        Islem();
    
        String[] parcalar1=sb.toString().split(" ");
        for(int i=parcalar1.length-1;i>=0;i--)
        {
            String sehir = indisten_sehir_ismi_Bul(Integer.parseInt(parcalar1[i]));
            jTextField4.setText(jTextField4.getText()+ " > "+ sehir);
        }
        jTextField5.setText(km+" km");
    } catch (IOException ex) {
        Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    Arayuze_Grafik_Ciz(); 
    

    sb.setLength(0);
    haritada_graf_goster=new int[999];   
    tum_mesafeler=new double[999][999];
    asil_mesafeler=new double[999][999];


    long endTime = System.currentTimeMillis();
    long duration = (endTime - startTime)/1000;
    
    jTextField7.setText(Integer.toString((int)duration)+" sn");
    
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
 
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Proje_Zeplin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proje_Zeplin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proje_Zeplin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proje_Zeplin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Proje_Zeplin().setVisible(true);
            }
        });
    }

    
static int[] haritada_graf_goster=new int[999];    
static StringBuilder sb = new StringBuilder();
static double mesafe;
static double asil_mesafe;
static int Dugum1_X;
static int Dugum1_Y;
static int Dugum2_X;
static int Dugum2_Y;    
static int kaynak_indis;
static int hedef_indis;
static int yolcu_sayisi;    
static double km;
static int yolcu_sayisi_ile_aci=0;
static double egim =0;
static int[] rakimlar = new int[81];
static double[][] tum_mesafeler=new double[999][999];
static double[][] asil_mesafeler=new double[999][999];

public static class Kose implements Comparable<Kose>
{
    public final String isim;
    public Kenar[] cevresindekiler;
    public double minMesafe = Double.POSITIVE_INFINITY;
    public Kose onceki;
    public Kose(String argName) { isim = argName; }
    public String toString() { return isim; }
    public int compareTo(Kose other)
    {
        return Double.compare(minMesafe, other.minMesafe);
    }

}


public static class Kenar
{
    public final Kose hedef;
    public final double maliyet;
    public Kenar(Kose argTarget, double argWeight)
    { hedef = argTarget; maliyet = argWeight; }
}


public static void YolHesapla(Kose kaynak)
{
    kaynak.minMesafe = 0.;
    PriorityQueue<Kose> koseKuyrugu = new PriorityQueue<Kose>();
    koseKuyrugu.add(kaynak);

    while (!koseKuyrugu.isEmpty()) {
        Kose u = koseKuyrugu.poll();

            for (Kenar k : u.cevresindekiler)
            {
                Kose v = k.hedef;
                double maliyet = k.maliyet;
                double Uyamesafe = u.minMesafe + maliyet;
        if (Uyamesafe < v.minMesafe) {
            koseKuyrugu.remove(v);

            v.minMesafe = Uyamesafe ;
            v.onceki = u;
            koseKuyrugu.add(v);
        }
            }
        }
}

public static List<Kose> enKisaGuzergah(Kose target)
{
        List<Kose> guzergah = new ArrayList<Kose>();
        for (Kose vertex = target; vertex != null; vertex = vertex.onceki)
        {
            guzergah.add(vertex);
            sb.append(vertex.toString()+" ");
        }
        
        Collections.reverse(guzergah);
        return guzergah;
}

    
    
public static void Islem() throws FileNotFoundException, IOException
{

       Kose Dugum[]=new Kose[81]; 
       for(int i=0; i<81; i++)
       {
           Dugum[i]= new Kose(Integer.toString(i));
           
       } 
        
       
       BufferedReader br = new BufferedReader(new FileReader("komsuluk.txt")); 
       String line = br.readLine();int n=0;
       
       while (line != null) 
       {
        String[] parcalar=line.split(",");
        int m=0;
        int j = Integer.parseInt(parcalar[0])-1;
        Dugum[j].cevresindekiler = new Kenar[parcalar.length-1];
        
        for(int i=1;i<parcalar.length;i++)
        {
            int k = Integer.parseInt(parcalar[i])-1;
            
            mesafe=mesafeBul(Integer.parseInt(parcalar[0]),Integer.parseInt(parcalar[i]));
            yolcu_sayisi_ile_aci = yolcu_sayisi_ile_aci_bul(yolcu_sayisi);
            if(kenarVarmi((j+1),(k+1))==1 ){
                haritada_graf_goster[n]=j+1; n++; haritada_graf_goster[n]=k+1; n++;
                tum_mesafeler[j+1][k+1]=mesafe; asil_mesafeler[j+1][k+1]=asil_mesafe;
                Dugum[j].cevresindekiler[m]=new Kenar(Dugum[k], asil_mesafe);
                m++;
                System.out.println(j+1+"  "+(k+1)+"  mesafe= "+ asil_mesafe+" "+yolcu_sayisi_ile_aci+" > "+egim);
            }
            else
            {
                Dugum[j].cevresindekiler[m]=new Kenar(Dugum[k], Double.POSITIVE_INFINITY);
                m++;   
                System.out.println(j+1+"  "+(k+1)+"  mesafe= "+ "sonsuz "+"  "+yolcu_sayisi_ile_aci+" < "+egim);             
            }
        }
        
        line = br.readLine();
       } 
      
        
       YolHesapla(Dugum[kaynak_indis]);
       enKisaGuzergah(Dugum[hedef_indis]);
        
       //güzergahı tersten verir
       System.out.println(sb.toString());
       //mesafeyi km değişkeninde tutmak için
       km=Dugum[hedef_indis].minMesafe;
}

    
public static double mesafeBul(int kaynak_plaka, int hedef_plaka) throws FileNotFoundException, IOException
{
     double kaynak_lat=0, kaynak_long=0, hedef_lat=0, hedef_long=0;
     
     BufferedReader br = new BufferedReader(new FileReader("lat long.txt")); 
     String line = br.readLine(); 
      
     while (line != null) {
         String parcalar[]=line.split(",");
         
         if( Integer.parseInt(parcalar[2]) == kaynak_plaka ){
             kaynak_lat= Double.parseDouble(parcalar[0]);
             kaynak_long= Double.parseDouble(parcalar[1]);
         }
         
         if( Integer.parseInt(parcalar[2]) == hedef_plaka ){
             hedef_lat= Double.parseDouble(parcalar[0]);
             hedef_long= Double.parseDouble(parcalar[1]);
         }        
         
     line = br.readLine();    
     }
        
    double dünya_yaricapi = 6371; //dünyanın yarıçapı, metre
    double Lat = Math.toRadians(hedef_lat-kaynak_lat);
    double Lng = Math.toRadians(hedef_long-kaynak_long);
    double a = Math.sin(Lat/2) * Math.sin(Lat/2) +
               Math.cos(Math.toRadians(kaynak_lat)) * Math.cos(Math.toRadians(hedef_lat)) *
               Math.sin(Lng/2) * Math.sin(Lng/2);
    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
    double dist = (float) (dünya_yaricapi * c);

    return  dist;
}
    

public static int konumBul_X(int plaka) throws FileNotFoundException, IOException
{
        
    BufferedReader br = new BufferedReader(new FileReader("konum.txt")); 
    String line = br.readLine();
            
    while (line != null) 
    {
        String[] parcalar = line.split(" ");
        if ( Integer.parseInt(parcalar[0]) == plaka)
            {
                return Integer.parseInt(parcalar[1]);
            }
        line = br.readLine();
    }

return 0;
}


public static int konumBul_Y(int plaka) throws FileNotFoundException, IOException
{
        
    BufferedReader br = new BufferedReader(new FileReader("konum.txt")); 
    String line = br.readLine();
    while (line != null) 
    {
        String[] parcalar = line.split(" ");
        if (Integer.parseInt(parcalar[0]) == plaka)
        {
            return Integer.parseInt(parcalar[2]);
        }

    line = br.readLine();
    }
        
return 0;
}


public static int sehirden_indis_Bul(String Sehir) throws FileNotFoundException, IOException
{
    String[] Sehirler=new String[81]; 
    BufferedReader br = new BufferedReader(new FileReader("sehir.txt")); 
    String line = br.readLine();
    int m=0;
    while (line != null) 
    {
        String[] parcalar = line.split(" ");
        Sehirler[m]=parcalar[1];
        m++;
        line = br.readLine();
    }    
    
    for(int i=0;i<81;i++)
        {
            if(Sehirler[i].equals(Sehir))
            {
                return i;
            }
        }
    return 0;
}

public static String indisten_sehir_ismi_Bul(int indis) throws FileNotFoundException, IOException
{
    int[] İndisler=new int[81]; 
    String[] Sehirler=new String[81];
    BufferedReader br = new BufferedReader(new FileReader("sehir.txt")); 
    String line = br.readLine();
    int m=0;
    while (line != null) 
    {
        String[] parcalar = line.split(" ");
        İndisler[m]=Integer.parseInt(parcalar[0])-1;
        Sehirler[m]=parcalar[1];
        m++;
        line = br.readLine();
    }    
    
    for(int i=0;i<81;i++)
        {
            if(İndisler[i] == indis)
            {
                return Sehirler[i];
            }
        }
    return "";
}


public static int yolcu_sayisi_ile_aci_bul(int y_sayisi){
   
    
    yolcu_sayisi_ile_aci = 80-y_sayisi;
        
        
        
return yolcu_sayisi_ile_aci;
}


public static int kenarVarmi(int kaynak_plaka, int hedef_plaka) throws FileNotFoundException, IOException
{
      
     double kaynak_rakim=0,hedef_rakim=0;
     double ucgenin_a_kenari=0;

    BufferedReader br = new BufferedReader(new FileReader("lat long.txt")); 
    String line = br.readLine();  
    int m=0;
      
     while (line != null) {
         
         String parcalar[]=line.split(",");
         
         if( Integer.parseInt(parcalar[2]) == kaynak_plaka ){

             kaynak_rakim=Integer.parseInt(parcalar[3]);
         }

         if( Integer.parseInt(parcalar[2]) == hedef_plaka ){

             hedef_rakim=Integer.parseInt(parcalar[3]);
         }         
     
        rakimlar[m]=Integer.parseInt(parcalar[3]); m++;
        line = br.readLine();
     }
        
     
     if( (kaynak_plaka-1) == kaynak_indis || (hedef_plaka-1) == hedef_indis)
     {
        if((kaynak_plaka-1) == kaynak_indis && (hedef_plaka-1) == hedef_indis)
        {
            if(hedef_rakim>kaynak_rakim)
            {
                ucgenin_a_kenari = hedef_rakim - kaynak_rakim;
            }
     
            if(kaynak_rakim>hedef_rakim)
            {
                ucgenin_a_kenari = kaynak_rakim - hedef_rakim;
            }          
        }
         
         
        else
        {  
            if(hedef_rakim>kaynak_rakim)
            {
                ucgenin_a_kenari = hedef_rakim - kaynak_rakim + 50;
            }
     
            if(kaynak_rakim>hedef_rakim)
            {
                ucgenin_a_kenari = kaynak_rakim - hedef_rakim + 50;
            }
        } 
     }
     
     else
     {
        
        if(hedef_rakim>kaynak_rakim)
        {
            ucgenin_a_kenari = hedef_rakim - kaynak_rakim;
        }
     
        if(kaynak_rakim>hedef_rakim)
        {
            ucgenin_a_kenari = kaynak_rakim - hedef_rakim;
        }         
     }
     

     
     double ucgenin_b_kenari = mesafe;
     
     double d=Math.toRadians(ucgenin_a_kenari);
     double f=Math.toRadians(ucgenin_b_kenari);
     egim = Math.toDegrees(Math.atan(d/f));
     
     asil_mesafe = Math.sqrt((ucgenin_b_kenari*ucgenin_b_kenari)+((ucgenin_a_kenari/1000)*(ucgenin_a_kenari/1000)));
     
     
     if(egim <= yolcu_sayisi_ile_aci){
         return 1;
     }
     
     
        return 0;
}


public void Arayuze_Grafik_Ciz()
{
    Graphics g = this.getGraphics();
    Graphics2D g2 = (Graphics2D) g;
    g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,RenderingHints.VALUE_ANTIALIAS_ON);
    
    try 
    {
      BufferedImage image = ImageIO.read(new File("illerharita.jpg"));
      g2.drawImage(image, 0, 0, null);
    } catch (IOException ex) {
      Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    g2.setStroke(new BasicStroke(2));
   
 
    for(int i=0;i<haritada_graf_goster.length;i=i+2){
      if(haritada_graf_goster[i]<=81 && haritada_graf_goster[i] >=1){  
        try {
            int a=konumBul_X(haritada_graf_goster[i]);
            int b=konumBul_Y(haritada_graf_goster[i]);
            int c=konumBul_X(haritada_graf_goster[i+1]);
            int d=konumBul_Y(haritada_graf_goster[i+1]);
            g2.setColor(Color.red);
            g2.drawLine(a+6,b+3,c+6,d+3);
            g2.setColor(Color.magenta);
            g2.fillOval(a, b, 12, 12);
            g2.fillOval(c, d, 12, 12);
            
        } catch (IOException ex) {
            Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
        }
      }  
    
      else
          break;
      
    }

    g2.setColor(Color.blue);
    g2.setStroke(new BasicStroke(5));
    
    
    
    String[] yol=sb.toString().split(" ");
        
    for(int i=yol.length-1;i>0;i--)
    {
        try {
            Dugum1_X = konumBul_X(Integer.parseInt(yol[i])+1);//indis olduğu icin +1 ekleyip plakaya ceviriyoruz
            Dugum1_Y = konumBul_Y(Integer.parseInt(yol[i])+1);
            Dugum2_X = konumBul_X(Integer.parseInt(yol[i-1])+1);
            Dugum2_Y = konumBul_Y(Integer.parseInt(yol[i-1])+1);
            g2.drawLine(Dugum1_X+6, Dugum1_Y+3,Dugum2_X+6, Dugum2_Y+3);
            } catch (IOException ex) 
            {
              Logger.getLogger(Proje_Zeplin.class.getName()).log(Level.SEVERE, null, ex);
            }
         
    }
       
}
    

public void Hareket_detaylarini_dosyaya_yazdir() throws FileNotFoundException, UnsupportedEncodingException, IOException
{
    PrintWriter writer = new PrintWriter("Hareket_Detay.txt", "UTF-8");


    
    String[] yol=sb.toString().split(" ");
    int m=1;
    
    writer.println("Yolcu Sayisi= "+yolcu_sayisi+" Baslangic sehri= " 
            +indisten_sehir_ismi_Bul(kaynak_indis));
    writer.println("");writer.println("");
    
    for(int i=yol.length-1;i>0;i--)
    {
      
       writer.println("Adim "+m);m++;
       writer.println(indisten_sehir_ismi_Bul(Integer.parseInt(yol[i]))+" sehrinden  "
               +indisten_sehir_ismi_Bul(Integer.parseInt(yol[i-1])) + " sehrine gidiliyor...");
       
       writer.println(indisten_sehir_ismi_Bul(Integer.parseInt(yol[i])) 
               +"  rakim=  "+rakimlar[Integer.parseInt(yol[i])]
               +"  "+indisten_sehir_ismi_Bul(Integer.parseInt(yol[i-1]))
               +"  rakim=  "+rakimlar[Integer.parseInt(yol[i-1])] );
       
       
       writer.println("İki sehir arasindaki kus ucumu mesafe= "+ mesafeBul(Integer.parseInt(yol[i])
               +1,Integer.parseInt(yol[i-1])+1)+" km  Asil mesafe= "
               +asil_mesafeler[Integer.parseInt(yol[i])+1][Integer.parseInt(yol[i-1])+1]);
       
       if(i!=yol.length-1 && (i-1) != 0)
       {
           if(rakimlar[Integer.parseInt(yol[i])] > rakimlar[Integer.parseInt(yol[i-1])])
           {
               int yukseklik_farki= rakimlar[Integer.parseInt(yol[i])]-rakimlar[Integer.parseInt(yol[i-1])];
               double uzaklik=tum_mesafeler[Integer.parseInt(yol[i])+1][Integer.parseInt(yol[i-1])+1];
               double d=Math.toRadians(yukseklik_farki);
               double f=Math.toRadians(uzaklik);
               double aci = Math.toDegrees(Math.atan(d/f));
               
               writer.println("ucgenin a kenari (yukseklik farki) =>"+rakimlar[Integer.parseInt(yol[i])]
                  +" - "+rakimlar[Integer.parseInt(yol[i-1])]+" "
                  +" = "+yukseklik_farki+" ");
               writer.println("ucgenin b kenari (mesafe) => "+uzaklik+"  "
                  + "egim =  arctan("+yukseklik_farki+"/"+uzaklik+") = "+aci+ " ve  "+aci+ "<"+(80-yolcu_sayisi) 
                  +" oldugu icin iki dugum arasi kenar vardir."    );
                //writer.println("Egim= "+ "" + (int)egim+ "");
           }
           
           if(rakimlar[Integer.parseInt(yol[i])] < rakimlar[Integer.parseInt(yol[i-1])])
           {
               int yukseklik_farki= rakimlar[Integer.parseInt(yol[i-1])]-rakimlar[Integer.parseInt(yol[i])];
               double uzaklik=tum_mesafeler[Integer.parseInt(yol[i])+1][Integer.parseInt(yol[i-1])+1];
               double d=Math.toRadians(yukseklik_farki);
               double f=Math.toRadians(uzaklik);
               double aci = Math.toDegrees(Math.atan(d/f));
               writer.println("ucgenin a kenari (yukseklik farki) =>"+rakimlar[Integer.parseInt(yol[i-1])]
                  +" - "+rakimlar[Integer.parseInt(yol[i])]+" "
                  +" = "+yukseklik_farki+" ");
               writer.println("ucgenin b kenari (mesafe) => "+uzaklik+"  "
                  + "egim =  arctan("+yukseklik_farki+"/"+uzaklik+") = "+aci+ " ve  "+aci+ "<"+(80-yolcu_sayisi) 
                  +" oldugu icin iki dugum arasi kenar vardir."    );
                //writer.println("Egim= "+ "" + (int)egim+ "");
           }
       }
       
       
       if(i==yol.length-1 || (i-1) == 0)
       {
           
         if (i==yol.length-1 && (i-1) == 0){
           if(rakimlar[Integer.parseInt(yol[i])] > rakimlar[Integer.parseInt(yol[i-1])])
           {
               int yukseklik_farki= rakimlar[Integer.parseInt(yol[i])]-rakimlar[Integer.parseInt(yol[i-1])];
               double uzaklik=tum_mesafeler[Integer.parseInt(yol[i])+1][Integer.parseInt(yol[i-1])+1];
               double d=Math.toRadians(yukseklik_farki);
               double f=Math.toRadians(uzaklik);
               double aci = Math.toDegrees(Math.atan(d/f));
               
               writer.println("ucgenin a kenari (yukseklik farki) =>"+rakimlar[Integer.parseInt(yol[i])]
                  +" - "+rakimlar[Integer.parseInt(yol[i-1])]
                  +" =  "+yukseklik_farki+" ");
               writer.println("ucgenin b kenari (mesafe) => "+uzaklik+"  "
                  + "egim =  arctan("+yukseklik_farki+"/"+uzaklik+") = "+aci+ " ve  "+aci+ "<"+(80-yolcu_sayisi) 
                  +" oldugu icin iki dugum arasi kenar vardir."    );
                //writer.println("Egim= "+ "" + (int)egim+ "");
           }           
       
       
            if(rakimlar[Integer.parseInt(yol[i])] < rakimlar[Integer.parseInt(yol[i-1])])
           {
               int yukseklik_farki= rakimlar[Integer.parseInt(yol[i-1])]-rakimlar[Integer.parseInt(yol[i])];
               double uzaklik=tum_mesafeler[Integer.parseInt(yol[i])+1][Integer.parseInt(yol[i-1])+1];
               double d=Math.toRadians(yukseklik_farki);
               double f=Math.toRadians(uzaklik);
               double aci = Math.toDegrees(Math.atan(d/f));
               writer.println("ucgenin a kenari (yukseklik farki) =>"+rakimlar[Integer.parseInt(yol[i-1])]
                  +" - "+rakimlar[Integer.parseInt(yol[i])]
                  +" = "+yukseklik_farki+" ");
               writer.println("ucgenin b kenari (mesafe) => "+uzaklik+"  "
                  + "egim =  arctan("+yukseklik_farki+"/"+uzaklik+") = "+aci+ " ve  "+aci+ "<"+(80-yolcu_sayisi) 
                  +" oldugu icin iki dugum arasi kenar vardir."    );
                //writer.println("Egim= "+ "" + (int)egim+ "");
           }             
         }
           
         else{
           if(rakimlar[Integer.parseInt(yol[i])] > rakimlar[Integer.parseInt(yol[i-1])])
           {
               int yukseklik_farki= rakimlar[Integer.parseInt(yol[i])]-rakimlar[Integer.parseInt(yol[i-1])]+50;
               double uzaklik=tum_mesafeler[Integer.parseInt(yol[i])+1][Integer.parseInt(yol[i-1])+1];
               double d=Math.toRadians(yukseklik_farki);
               double f=Math.toRadians(uzaklik);
               double aci = Math.toDegrees(Math.atan(d/f));
               
               writer.println("ucgenin a kenari (yukseklik farki) =>"+rakimlar[Integer.parseInt(yol[i])]
                  +" - "+rakimlar[Integer.parseInt(yol[i-1])]+" + 50 "
                  +" =  "+yukseklik_farki+" ");
               writer.println("ucgenin b kenari (mesafe) => "+uzaklik+"  "
                  + "egim =  arctan("+yukseklik_farki+"/"+uzaklik+") = "+aci+ " ve  "+aci+ "<"+(80-yolcu_sayisi) 
                  +" oldugu icin iki dugum arasi kenar vardir."    );
                //writer.println("Egim= "+ "" + (int)egim+ "");
           }           
       
       
            if(rakimlar[Integer.parseInt(yol[i])] < rakimlar[Integer.parseInt(yol[i-1])])
           {
               int yukseklik_farki= rakimlar[Integer.parseInt(yol[i-1])]-rakimlar[Integer.parseInt(yol[i])]+50;
               double uzaklik=tum_mesafeler[Integer.parseInt(yol[i])+1][Integer.parseInt(yol[i-1])+1];
               double d=Math.toRadians(yukseklik_farki);
               double f=Math.toRadians(uzaklik);
               double aci = Math.toDegrees(Math.atan(d/f));
               writer.println("ucgenin a kenari (yukseklik farki) =>"+rakimlar[Integer.parseInt(yol[i-1])]
                  +" - "+rakimlar[Integer.parseInt(yol[i])]+" + 50 "
                  +" = "+yukseklik_farki+" ");
               writer.println("ucgenin b kenari (mesafe) => "+uzaklik+"  "
                  + "egim =  arctan("+yukseklik_farki+"/"+uzaklik+") = "+aci+ " ve  "+aci+ "<"+(80-yolcu_sayisi) 
                  +" oldugu icin iki dugum arasi kenar vardir."    );
                //writer.println("Egim= "+ "" + (int)egim+ "");
           }      
       }
        
       }       
       
       if((i-1)!=0)
       {
            writer.println("Su anki rakim= "+ (rakimlar[Integer.parseInt(yol[i-1])]+50)+" (Zeplin "
                + indisten_sehir_ismi_Bul(Integer.parseInt(yol[i-1])) +" sehrinin 50 metre üstünde)");
            writer.println("");writer.println("");
       }
       
       if((i-1)==0)
       {
            writer.println("Su anki rakim= "+ (rakimlar[Integer.parseInt(yol[i-1])])+" (Zeplin "
                + indisten_sehir_ismi_Bul(Integer.parseInt(yol[i-1])) +" sehrine inis yapti.)");
            writer.println("");writer.println("");
       }
    }
    
    
    writer.close();    
}
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
