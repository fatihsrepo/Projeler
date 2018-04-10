using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Drawing.Imaging;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Diagnostics;

namespace deneme1
{
    public partial class Form1 : Form
    {


        Boolean islemde = false;
        Image resim;

        

        public Form1()
        {
            InitializeComponent();
           
        }


        private void pictureBox1_Click(object sender, EventArgs e)
        {

        }

        private void label1_Click(object sender, EventArgs e)
        {

        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
       
        //Menü Araçları
        private void görüntüAçToolStripMenuItem_Click(object sender, EventArgs e)
        {
            DialogResult dr = openFileDialog1.ShowDialog();
            if (dr == DialogResult.OK)
            {
                
                resim = Image.FromFile(openFileDialog1.FileName);
                pictureBox1.SizeMode = PictureBoxSizeMode.AutoSize;
                pictureBox1.Image = resim;
                islemde = true;
            }
        }

        private void görüntüyüKaydetToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (!islemde)
            {
                MessageBox.Show("Resim bulunamadı.");
            }
            else
            {
                SaveFileDialog resim = new SaveFileDialog();
                resim.Filter = "JPEG files(*.jpeg)|*.jpeg";
                if (DialogResult.OK == resim.ShowDialog())
                {
                    pictureBox1.Image.Save(resim.FileName, ImageFormat.Jpeg);
                }
            }
        }

        private void yenidenYükleToolStripMenuItem_Click(object sender, EventArgs e)
        {
            if (!islemde)
            {
                MessageBox.Show("Resim bulunamadı.");
            }
            else
            {
                if (islemde)
                {
                    resim = Image.FromFile(openFileDialog1.FileName);
                    pictureBox1.SizeMode = PictureBoxSizeMode.AutoSize;
                    pictureBox1.Image = resim;
                    islemde = true;
                }
            }
        }

        private void AynalamaToolStripMenuItem_Click(object sender, EventArgs e)
        {
            pictureBox1.Image.RotateFlip(RotateFlipType.RotateNoneFlipX);
            pictureBox1.SizeMode = PictureBoxSizeMode.AutoSize;
            pictureBox1.Refresh();
        }

        private void griTonlamaToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Bitmap gri = new Bitmap((Bitmap)this.pictureBox1.Image);
            islem.GriYap(gri);
            pictureBox1.Image = gri;
        }

        private void TerslemeToolStripMenuItem_Click(object sender, EventArgs e)
        {
            Bitmap ters = new Bitmap((Bitmap)this.pictureBox1.Image);
            islem.Tersleme(ters);
            pictureBox1.Image = ters;
        }

        private void sağToolStripMenuItem_Click(object sender, EventArgs e)
        {
            pictureBox1.Image.RotateFlip(RotateFlipType.Rotate270FlipXY);
            pictureBox1.SizeMode = PictureBoxSizeMode.AutoSize;
            pictureBox1.Refresh();
        }

        private void solToolStripMenuItem_Click(object sender, EventArgs e)
        {
            pictureBox1.Image.RotateFlip(RotateFlipType.Rotate90FlipXY);
            pictureBox1.SizeMode = PictureBoxSizeMode.AutoSize;
            pictureBox1.Refresh();
        }

        //Ölçeklendirme Butonu
        private void button1_Click(object sender, EventArgs e)
        {
            OlcekForm b1 = new OlcekForm();

            if (b1.ShowDialog() == DialogResult.OK)
            {
                int gnslk = b1.YeniGenislik;
                int yksklk = b1.YeniYukseklik;

                resim = islem.Boyut_Degistir(resim, new Size(gnslk, yksklk));
                pictureBox1.Image = resim;
                pictureBox1.Refresh();

            }
        }


        //Renk Kanalları Fonksiyonu
        void renk_Kanallari()
        {
            float red1 = kırmızı_bar.Value * 0.1f;
            float green1 = yesil_bar.Value * 0.1f;
            float blue1 = mavi_bar.Value * 0.1f;
            

            if (!islemde)
            {
                MessageBox.Show("Resim bulunamadı.");

            }
            else
            {

                pictureBox1.Image = resim;                      
                Bitmap bmp = new Bitmap(resim.Width, resim.Height);                                                         
                ImageAttributes ia = new ImageAttributes();

                ColorMatrix cmPicture = new ColorMatrix(new float[][]       
                {
                    new float[]{1+red1, 0, 0, 0, 0},
                    new float[]{0, 1+green1, 0, 0, 0},
                    new float[]{0, 0, 1+blue1, 0, 0},
                    new float[]{0, 0, 0, 1, 0},
                    new float[]{0, 0, 0, 0, 1}
                });

                ia.SetColorMatrix(cmPicture);           
                Graphics g = Graphics.FromImage(bmp);                                                            
                g.DrawImage(resim, new Rectangle(0, 0, resim.Width, resim.Height), 0, 0, resim.Width, resim.Height, GraphicsUnit.Pixel, ia);      
                g.Dispose();                           
                pictureBox1.Image = bmp;           

            }
        }       
        
        //Renk Kanalı Araçları
        private void kırmızı_bar_Scroll(object sender, EventArgs e)
        {
            renk_Kanallari();
        }

        private void yesil_bar_Scroll(object sender, EventArgs e)
        {
            renk_Kanallari();
        }

        private void mavi_bar_Scroll(object sender, EventArgs e)
        {
            renk_Kanallari();
        }
              

    }
}
