using System;
using System.Collections.Generic;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace deneme1
{
    class islem
    {
        public islem()
        {

        }

        public static bool GriYap(Bitmap bmp)
        {
            for(int i=0; i<bmp.Width; i++)
            {
                for(int j=0; j<bmp.Height; j++)
                {
                    Color renk = bmp.GetPixel(i, j);
                    int r1 = renk.R;
                    int g1 = renk.G;
                    int b1 = renk.B;
                    int gray = (byte)(.299 * r1 + .587 * g1 + .114 * b1);
                    bmp.SetPixel(i, j, Color.FromArgb(gray, gray, gray));

                }
            }


            return true;

        }

        public static bool Tersleme(Bitmap bmp)
        {
            for(int i=0; i<bmp.Width; i++)
            {
                for(int j=0; j<bmp.Height; j++)
                {
                    Color renk = bmp.GetPixel(i, j);
                    int a1 = renk.A;
                    int r1 = renk.R;
                    int g1 = renk.G;
                    int b1 = renk.B;

                    r1 = 255 - r1;
                    g1 = 255 - g1;
                    b1 = 255 - b1;
                    bmp.SetPixel(i, j, Color.FromArgb(a1, r1, g1, b1));

                }
                
            }
            return true;
        }

        public static Image Boyut_Degistir(Image imgToResize, Size size)
        {
            return (Image)(new Bitmap(imgToResize, size));
        }




    }
}
