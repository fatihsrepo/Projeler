using System;

namespace deneme1
{
    partial class Form1
    {
        /// <summary>
        /// Required designer variable.
        /// </summary>
        private System.ComponentModel.IContainer components = null;

        /// <summary>
        /// Clean up any resources being used.
        /// </summary>
        /// <param name="disposing">true if managed resources should be disposed; otherwise, false.</param>
        protected override void Dispose(bool disposing)
        {
            if (disposing && (components != null))
            {
                components.Dispose();
            }
            base.Dispose(disposing);
        }

        #region Windows Form Designer generated code

        /// <summary>
        /// Required method for Designer support - do not modify
        /// the contents of this method with the code editor.
        /// </summary>
        private void InitializeComponent()
        {
            System.ComponentModel.ComponentResourceManager resources = new System.ComponentModel.ComponentResourceManager(typeof(Form1));
            this.openFileDialog1 = new System.Windows.Forms.OpenFileDialog();
            this.menuStrip1 = new System.Windows.Forms.MenuStrip();
            this.dosyaToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.görüntüAçToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.görüntüyüKaydetToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.yenidenYükleToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.efektToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.AynalamaToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.griTonlamaToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.TerslemeToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.döndürToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.sağToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.solToolStripMenuItem = new System.Windows.Forms.ToolStripMenuItem();
            this.kırmızı_bar = new System.Windows.Forms.TrackBar();
            this.yesil_bar = new System.Windows.Forms.TrackBar();
            this.mavi_bar = new System.Windows.Forms.TrackBar();
            this.button1 = new System.Windows.Forms.Button();
            this.pictureBox1 = new System.Windows.Forms.PictureBox();
            this.menuStrip1.SuspendLayout();
            ((System.ComponentModel.ISupportInitialize)(this.kırmızı_bar)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.yesil_bar)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.mavi_bar)).BeginInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).BeginInit();
            this.SuspendLayout();
            // 
            // openFileDialog1
            // 
            this.openFileDialog1.FileName = "openFileDialog1";
            // 
            // menuStrip1
            // 
            this.menuStrip1.Items.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.dosyaToolStripMenuItem,
            this.efektToolStripMenuItem,
            this.döndürToolStripMenuItem});
            this.menuStrip1.Location = new System.Drawing.Point(0, 0);
            this.menuStrip1.Name = "menuStrip1";
            this.menuStrip1.Size = new System.Drawing.Size(1022, 24);
            this.menuStrip1.TabIndex = 13;
            this.menuStrip1.Text = "menuStrip1";
            // 
            // dosyaToolStripMenuItem
            // 
            this.dosyaToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.görüntüAçToolStripMenuItem,
            this.görüntüyüKaydetToolStripMenuItem,
            this.yenidenYükleToolStripMenuItem});
            this.dosyaToolStripMenuItem.Name = "dosyaToolStripMenuItem";
            this.dosyaToolStripMenuItem.Size = new System.Drawing.Size(51, 20);
            this.dosyaToolStripMenuItem.Text = "Dosya";
            // 
            // görüntüAçToolStripMenuItem
            // 
            this.görüntüAçToolStripMenuItem.Name = "görüntüAçToolStripMenuItem";
            this.görüntüAçToolStripMenuItem.Size = new System.Drawing.Size(170, 22);
            this.görüntüAçToolStripMenuItem.Text = "Görüntü Aç";
            this.görüntüAçToolStripMenuItem.Click += new System.EventHandler(this.görüntüAçToolStripMenuItem_Click);
            // 
            // görüntüyüKaydetToolStripMenuItem
            // 
            this.görüntüyüKaydetToolStripMenuItem.Name = "görüntüyüKaydetToolStripMenuItem";
            this.görüntüyüKaydetToolStripMenuItem.Size = new System.Drawing.Size(170, 22);
            this.görüntüyüKaydetToolStripMenuItem.Text = "Görüntüyü Kaydet";
            this.görüntüyüKaydetToolStripMenuItem.Click += new System.EventHandler(this.görüntüyüKaydetToolStripMenuItem_Click);
            // 
            // yenidenYükleToolStripMenuItem
            // 
            this.yenidenYükleToolStripMenuItem.Name = "yenidenYükleToolStripMenuItem";
            this.yenidenYükleToolStripMenuItem.Size = new System.Drawing.Size(170, 22);
            this.yenidenYükleToolStripMenuItem.Text = "Yeniden Yükle";
            this.yenidenYükleToolStripMenuItem.Click += new System.EventHandler(this.yenidenYükleToolStripMenuItem_Click);
            // 
            // efektToolStripMenuItem
            // 
            this.efektToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.AynalamaToolStripMenuItem,
            this.griTonlamaToolStripMenuItem,
            this.TerslemeToolStripMenuItem});
            this.efektToolStripMenuItem.Name = "efektToolStripMenuItem";
            this.efektToolStripMenuItem.Size = new System.Drawing.Size(45, 20);
            this.efektToolStripMenuItem.Text = "Efekt";
            // 
            // AynalamaToolStripMenuItem
            // 
            this.AynalamaToolStripMenuItem.Name = "AynalamaToolStripMenuItem";
            this.AynalamaToolStripMenuItem.Size = new System.Drawing.Size(138, 22);
            this.AynalamaToolStripMenuItem.Text = "Aynalama";
            this.AynalamaToolStripMenuItem.Click += new System.EventHandler(this.AynalamaToolStripMenuItem_Click);
            // 
            // griTonlamaToolStripMenuItem
            // 
            this.griTonlamaToolStripMenuItem.Name = "griTonlamaToolStripMenuItem";
            this.griTonlamaToolStripMenuItem.Size = new System.Drawing.Size(138, 22);
            this.griTonlamaToolStripMenuItem.Text = "Gri Tonlama";
            this.griTonlamaToolStripMenuItem.Click += new System.EventHandler(this.griTonlamaToolStripMenuItem_Click);
            // 
            // TerslemeToolStripMenuItem
            // 
            this.TerslemeToolStripMenuItem.Name = "TerslemeToolStripMenuItem";
            this.TerslemeToolStripMenuItem.Size = new System.Drawing.Size(138, 22);
            this.TerslemeToolStripMenuItem.Text = "Tersleme";
            this.TerslemeToolStripMenuItem.Click += new System.EventHandler(this.TerslemeToolStripMenuItem_Click);
            // 
            // döndürToolStripMenuItem
            // 
            this.döndürToolStripMenuItem.DropDownItems.AddRange(new System.Windows.Forms.ToolStripItem[] {
            this.sağToolStripMenuItem,
            this.solToolStripMenuItem});
            this.döndürToolStripMenuItem.Name = "döndürToolStripMenuItem";
            this.döndürToolStripMenuItem.Size = new System.Drawing.Size(59, 20);
            this.döndürToolStripMenuItem.Text = "Döndür";
            // 
            // sağToolStripMenuItem
            // 
            this.sağToolStripMenuItem.Name = "sağToolStripMenuItem";
            this.sağToolStripMenuItem.Size = new System.Drawing.Size(107, 22);
            this.sağToolStripMenuItem.Text = "90 sağ";
            this.sağToolStripMenuItem.Click += new System.EventHandler(this.sağToolStripMenuItem_Click);
            // 
            // solToolStripMenuItem
            // 
            this.solToolStripMenuItem.Name = "solToolStripMenuItem";
            this.solToolStripMenuItem.Size = new System.Drawing.Size(107, 22);
            this.solToolStripMenuItem.Text = "90 sol";
            this.solToolStripMenuItem.Click += new System.EventHandler(this.solToolStripMenuItem_Click);
            // 
            // kırmızı_bar
            // 
            this.kırmızı_bar.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.kırmızı_bar.BackColor = System.Drawing.Color.Red;
            this.kırmızı_bar.Location = new System.Drawing.Point(965, 102);
            this.kırmızı_bar.Maximum = 50;
            this.kırmızı_bar.Name = "kırmızı_bar";
            this.kırmızı_bar.Orientation = System.Windows.Forms.Orientation.Vertical;
            this.kırmızı_bar.Size = new System.Drawing.Size(45, 139);
            this.kırmızı_bar.TabIndex = 10;
            this.kırmızı_bar.TickStyle = System.Windows.Forms.TickStyle.Both;
            this.kırmızı_bar.Scroll += new System.EventHandler(this.kırmızı_bar_Scroll);
            // 
            // yesil_bar
            // 
            this.yesil_bar.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.yesil_bar.BackColor = System.Drawing.Color.LimeGreen;
            this.yesil_bar.Location = new System.Drawing.Point(965, 247);
            this.yesil_bar.Maximum = 50;
            this.yesil_bar.Name = "yesil_bar";
            this.yesil_bar.Orientation = System.Windows.Forms.Orientation.Vertical;
            this.yesil_bar.Size = new System.Drawing.Size(45, 139);
            this.yesil_bar.TabIndex = 10;
            this.yesil_bar.TickStyle = System.Windows.Forms.TickStyle.Both;
            this.yesil_bar.Scroll += new System.EventHandler(this.yesil_bar_Scroll);
            // 
            // mavi_bar
            // 
            this.mavi_bar.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.mavi_bar.BackColor = System.Drawing.Color.Blue;
            this.mavi_bar.Location = new System.Drawing.Point(965, 392);
            this.mavi_bar.Maximum = 50;
            this.mavi_bar.Name = "mavi_bar";
            this.mavi_bar.Orientation = System.Windows.Forms.Orientation.Vertical;
            this.mavi_bar.Size = new System.Drawing.Size(45, 139);
            this.mavi_bar.TabIndex = 10;
            this.mavi_bar.TickStyle = System.Windows.Forms.TickStyle.Both;
            this.mavi_bar.Scroll += new System.EventHandler(this.mavi_bar_Scroll);
            // 
            // button1
            // 
            this.button1.Anchor = ((System.Windows.Forms.AnchorStyles)((System.Windows.Forms.AnchorStyles.Top | System.Windows.Forms.AnchorStyles.Right)));
            this.button1.BackgroundImage = global::deneme1.Properties.Resources.resize_icon_63153;
            this.button1.BackgroundImageLayout = System.Windows.Forms.ImageLayout.Zoom;
            this.button1.Location = new System.Drawing.Point(965, 53);
            this.button1.Name = "button1";
            this.button1.Size = new System.Drawing.Size(34, 32);
            this.button1.TabIndex = 14;
            this.button1.UseVisualStyleBackColor = true;
            this.button1.Click += new System.EventHandler(this.button1_Click);
            // 
            // pictureBox1
            // 
            this.pictureBox1.BorderStyle = System.Windows.Forms.BorderStyle.Fixed3D;
            this.pictureBox1.Dock = System.Windows.Forms.DockStyle.Fill;
            this.pictureBox1.Location = new System.Drawing.Point(0, 24);
            this.pictureBox1.Name = "pictureBox1";
            this.pictureBox1.Size = new System.Drawing.Size(1022, 663);
            this.pictureBox1.SizeMode = System.Windows.Forms.PictureBoxSizeMode.StretchImage;
            this.pictureBox1.TabIndex = 0;
            this.pictureBox1.TabStop = false;
            this.pictureBox1.Click += new System.EventHandler(this.pictureBox1_Click);
            // 
            // Form1
            // 
            this.AutoScaleDimensions = new System.Drawing.SizeF(6F, 13F);
            this.AutoScaleMode = System.Windows.Forms.AutoScaleMode.Font;
            this.BackColor = System.Drawing.SystemColors.GradientInactiveCaption;
            this.BackgroundImageLayout = System.Windows.Forms.ImageLayout.None;
            this.ClientSize = new System.Drawing.Size(1022, 687);
            this.Controls.Add(this.button1);
            this.Controls.Add(this.mavi_bar);
            this.Controls.Add(this.yesil_bar);
            this.Controls.Add(this.kırmızı_bar);
            this.Controls.Add(this.pictureBox1);
            this.Controls.Add(this.menuStrip1);
            this.ForeColor = System.Drawing.SystemColors.InfoText;
            this.Icon = ((System.Drawing.Icon)(resources.GetObject("$this.Icon")));
            this.MainMenuStrip = this.menuStrip1;
            this.MinimizeBox = false;
            this.Name = "Form1";
            this.Text = "Görüntü Editörü";
            this.Load += new System.EventHandler(this.Form1_Load);
            this.menuStrip1.ResumeLayout(false);
            this.menuStrip1.PerformLayout();
            ((System.ComponentModel.ISupportInitialize)(this.kırmızı_bar)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.yesil_bar)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.mavi_bar)).EndInit();
            ((System.ComponentModel.ISupportInitialize)(this.pictureBox1)).EndInit();
            this.ResumeLayout(false);
            this.PerformLayout();

        }

        private void button7_Click_1(object sender, EventArgs e)
        {
            throw new NotImplementedException();
        }

        #endregion

        private System.Windows.Forms.PictureBox pictureBox1;
        private System.Windows.Forms.OpenFileDialog openFileDialog1;
        private System.Windows.Forms.MenuStrip menuStrip1;
        private System.Windows.Forms.ToolStripMenuItem dosyaToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem görüntüAçToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem görüntüyüKaydetToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem yenidenYükleToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem efektToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem griTonlamaToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem TerslemeToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem döndürToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem sağToolStripMenuItem;
        private System.Windows.Forms.ToolStripMenuItem solToolStripMenuItem;
        private System.Windows.Forms.TrackBar kırmızı_bar;
        private System.Windows.Forms.TrackBar yesil_bar;
        private System.Windows.Forms.TrackBar mavi_bar;
        private System.Windows.Forms.Button button1;
        private System.Windows.Forms.ToolStripMenuItem AynalamaToolStripMenuItem;
    }
}

