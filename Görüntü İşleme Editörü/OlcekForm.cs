using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace deneme1
{
    public partial class OlcekForm : Form
    {
        
        public OlcekForm()
        {
            InitializeComponent();
            tmmButon.DialogResult = DialogResult.OK;
        }


        public int YeniGenislik;
        public int YeniYukseklik;



        public void textBox1_TextChanged(object sender, EventArgs e)
        {
            YeniGenislik = Convert.ToInt32(textBox1.Text);
        }

        public void textBox2_TextChanged(object sender, EventArgs e)
        {
            YeniYukseklik = Convert.ToInt32(textBox2.Text);
        }

        private void tmmButon_Click(object sender, EventArgs e)
        {
            
        }

        private void OlcekForm_Load(object sender, EventArgs e)
        {

        }
    }
}
