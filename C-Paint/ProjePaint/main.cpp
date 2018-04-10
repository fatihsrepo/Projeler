#include <graphics.h>
#include <stdlib.h>
#include <stdio.h>
#include <conio.h>
#include <math.h>
#include <windows.h>
#pragma GCC diagnostic ignored "-Wwrite-strings"



void renk_tablosu(void);
void gorev_tablosu(void);
void silgi(void);
void kalem(void);
void cizgi(void);
void dortgen(void);
void cember(void);
void temizle(void);
int cikis(void);


int main(){


initwindow(1180, 800);
setcolor(3);


		for(int i=0; i<20; i++)
		{
    		rectangle(250-i,250-i,850+i,650+i);
		}

		setcolor(2);
		settextstyle(9,HORIZ_DIR,3);
		outtextxy(350,40,"KOCAELI UNIVERSITESI");
		settextstyle(9,HORIZ_DIR,3);
		outtextxy(380,80,"Bilgisayar Muhendisligi");
		setcolor(12);
		outtextxy(430,120,"Paint Uygulamasi");
		setcolor(7);
		settextstyle(9,HORIZ_DIR,1);
		outtextxy(415,160,"Mert Var ve Fatih Dalgic");
		settextstyle(8,HORIZ_DIR,2);
		setcolor(14);
		outtextxy(430,270,"KULLANIM TALIMATLARI");
		settextstyle(8,HORIZ_DIR,1);
		setcolor(15);
		outtextxy(270,330,"1. Programda renk degisikligi yapmak icin asagi ve ");
		outtextxy(270,360,"yukari yon tuslarini kullanmaniz yeterlidir.");
		outtextxy(270,410,"2. Programda kalem, silgi vb. gibi islemler arasinda");
		outtextxy(270,440,"gecis yapabilmek icin sag ve sol yon tuslarini");
		outtextxy(270,470,"kullanmaniz yeterli olacaktir.");
		setcolor(5);
		outtextxy(440,620,"Baslamak icin 'Space' tusuna basin...");


	delay(10);
	while(!GetAsyncKeyState(VK_END))
	{
		if(GetAsyncKeyState(VK_SPACE))
		{
			temizle();
			break;
		}
	}


getch();
closegraph();


return 0;


}


void renk_tablosu()


{
   int renkler[16];
   int sol,ust,renk,c;
   sol =15;
   ust = 85;
   renk = getcolor();




        setfillstyle(1, 15);
        bar(25,110,sol+55,710);
        setcolor(0);
        rectangle(34,664,sol+46,692);
        setcolor(1);

		for(int i=0; i<5; i++)
		{
       		rectangle(24-i,110-i,(sol+58)-i,705+i);
		}




   for( c = 0 ; c < 16 ; c++ )

   {
      setfillstyle(1, c);
      bar(sol+20, ust+40, sol+46, ust+66);
      renkler[c] = ust;
      ust+= 36;


   }
   setcolor(renk);


}


void gorev_tablosu()
{
   int sol, ust, renk,c;
   sol = 45;
   ust = 10;
   renk = getcolor();


   //Çizim alaný için

   setcolor(5);
   rectangle(sol+100, ust+100, sol+1025, ust+700);


   //TEMIZLE= DELETE KAPAT= END

   setcolor(2);
   for(int i=0; i<5; i++)
{
        rectangle(894-i,(ust+4)-i,(sol+1020)+i,89-i);
}
    bar(sol+850, ust+5, sol+1020, ust+75);




    setcolor(15);
    outtextxy(904,25,"TEMIZLE=DELETE");
    outtextxy(904,50,"KAPAT=END");


   //SILGI KALEM DIKDÖRTGEN DAIRE


   setcolor(2);
   for(int i=0; i<5; i++)
{
        rectangle(154-i,(ust+4)-i,(sol+780)+i,59-i);
}


   for( c = 1 ; c <= 5 ; c++ )
   {
      setcolor(15);
      bar(sol+110, ust+5, sol+460, ust+45);
      sol += 80;
   }


   settextstyle(8,HORIZ_DIR,1);
   outtextxy(230,25,"SILGI");
   outtextxy(330,25,"KALEM");
   outtextxy(430,25,"CIZGI");
   outtextxy(530,25,"DIKDORTGEN");
   outtextxy(680,25,"CEMBER");


}


void silgi()
{
POINT imlec;
int a,b;


    setbkcolor(2);
    setcolor(15);
    outtextxy(230,25,"SILGI");

        	while(1)
        {
                GetCursorPos(&imlec);
                a=imlec.x;
                b=imlec.y;

            if(GetAsyncKeyState(VK_LBUTTON))
            {
            	if(a>156 && a<1065 && b>142 && b<725)
            	{
                    setfillstyle(1,0);
                    bar(a-9,b-31,a+5,b-15);
                    delay(1);
            	}


            }


            if(GetAsyncKeyState(VK_RIGHT))
            {
                    delay(500);
                    setbkcolor(0);
                    setcolor(15);
                    outtextxy(230,25,"SILGI");
                    kalem();
            }


            if(GetAsyncKeyState(VK_DELETE))
            {
                    setbkcolor(0);
                    setcolor(15);
                    outtextxy(230,25,"SILGI");
                    delay(50);
                    temizle();
            }
                if(GetAsyncKeyState(VK_END))
        	{
            	cikis();
        	}


        }
}




void kalem()
{
POINT imlec;
int a,b;
int renk=15;


   setbkcolor(2);
   setcolor(15);
   outtextxy(330,25,"KALEM");
   setfillstyle(1, renk);
   bar(35, 30, 61, 56);

  		while(1)
		  {
                GetCursorPos(&imlec);
                a=imlec.x;
                b=imlec.y;

			    if(GetAsyncKeyState(VK_LBUTTON))
                {
                	if(a>156 && a<1065 && b>142 && b<725)
                	{
                    	setfillstyle(1,renk);
                    	bar(a-9,b-31,a+5,b-15);
                    	delay(1);
                	}

                }

                if(GetAsyncKeyState(VK_DOWN))
                {
                    delay(50);
                    renk++;
                    delay(50);
                    setcolor(15);
					rectangle(35,30,61,56);
                    if(renk==16)
                    renk=0;
                    setfillstyle(1, renk);
      				bar(35, 30, 61, 56);
                }

                if(GetAsyncKeyState(VK_UP))
                {
                    delay(50);
                    renk--;
                    delay(50);
                    setcolor(15);
					rectangle(35,30,61,56);
                    if(renk==-1)
                    renk=15;
                    setfillstyle(1, renk);
      				bar(35, 30, 61, 56);
                }


                if(GetAsyncKeyState(VK_LEFT))
                {
                    delay(100);
                    setbkcolor(0);
                    setcolor(15);
                    outtextxy(330,25,"KALEM");
                    silgi();
                }


                if(GetAsyncKeyState(VK_RIGHT))
            	{
                    delay(100);
                    setbkcolor(0);
                    setcolor(15);
                    outtextxy(330,25,"KALEM");
                    cizgi();
            	}


            	if(GetAsyncKeyState(VK_DELETE))
                {
                    setbkcolor(0);
                    setcolor(15);
                    outtextxy(330,25,"KALEM");
                	delay(50);
                    temizle();
                }
                    if(GetAsyncKeyState(VK_END))
        		{
            		cikis();
       			}


        }
}


void cizgi()
{
        int renk=15;
        int a,b,c,d;

        setbkcolor(2);
        setcolor(15);
    	outtextxy(430,25,"CIZGI");
    	setfillstyle(1, renk);
    	bar(35, 30, 61, 56);

        	while(1)
			{


        		if(GetAsyncKeyState(VK_DOWN))
                  {
                        delay(50);
                        renk++;
                        delay(50);
                        setcolor(15);
						rectangle(35,30,61,56);
                        if(renk==16)
                        renk=0;
                        setfillstyle(1, renk);
      					bar(35, 30, 61, 56);
				 }

        		if(GetAsyncKeyState(VK_UP))
                  {
                        delay(50);
                        renk--;
                        delay(50);
                        setcolor(15);
						rectangle(35,30,61,56);
                        if(renk==-1)
                        renk=15;
                        setfillstyle(1, renk);
      					bar(35, 30, 61, 56);
                  }


            	delay(900);
            	if(GetAsyncKeyState(VK_LBUTTON))
         		{

            			getmouseclick(WM_LBUTTONDOWN, a, b);
            			delay(900);
            			getmouseclick(WM_LBUTTONUP, c, d);

					if(a>145 && a<1065 && b>115 && b<710 && c>145 && c<1065 && d>115 && d<710)
            		{
            			setcolor(renk);
            			line(a,b,c,d);
         			}


        		}

                if(GetAsyncKeyState(VK_RIGHT))
            	{
                    setbkcolor(0);
                    setcolor(15);
                    outtextxy(430,25,"CIZGI");
                    delay(100);
                    dortgen();
            	}

                if(GetAsyncKeyState(VK_LEFT))
                 {
                         setbkcolor(0);
                     	 setcolor(15);
                         outtextxy(430,25,"CIZGI");
                         delay(100);
                         kalem();
                 }


                if(GetAsyncKeyState(VK_DELETE))
                {
                        setbkcolor(0);
                        setcolor(15);
                        outtextxy(430,25,"CIZGI");
                        delay(50);
                        temizle();
                }
        if(GetAsyncKeyState(VK_END))
        {
            cikis();
        }
			}
}


void dortgen()
{

	int renk=15;
	int a,b,c,d;


    setbkcolor(2);
    setcolor(15);
    outtextxy(530,25,"DIKDORTGEN");
    setfillstyle(1, renk);
    bar(35, 30, 61, 56);

          	while(1)
          {
                if(GetAsyncKeyState(VK_DOWN))
                  {
                          delay(50);
                          renk++;
                          delay(50);
                          setcolor(15);
						  rectangle(35,30,61,56);
                          if(renk==16)
                          renk=0;
                          setfillstyle(1, renk);
      					  bar(35, 30, 61, 56);
                  }


                if(GetAsyncKeyState(VK_UP))
                  {
                         delay(50);
                         renk--;
                         delay(50);
                         setcolor(15);
						 rectangle(35,30,61,56);
                         if(renk==-1)
                         renk=15;
                         setfillstyle(1, renk);
      					 bar(35, 30, 61, 56);
                  }


            	delay(900);
            	if(GetAsyncKeyState(VK_LBUTTON))
            	{
            			getmouseclick(WM_LBUTTONDOWN, a, b);
            			delay(900);
            			getmouseclick(WM_LBUTTONUP, c, d);

            		if(a>145 && a<1065 && b>115 && b<710 && c>145 && c<1065 && d>115 && d<710)
            		{
            			setcolor(renk);
            			rectangle(a,b,c,d);
            		}
            	}


         		if(GetAsyncKeyState(VK_RIGHT))
         		{
                		setbkcolor(0);
                		setcolor(15);
                		outtextxy(530,25,"DIKDORTGEN");
                		delay(100);
                		cember();
         		}
        		if(GetAsyncKeyState(VK_LEFT))
         		{
                		setbkcolor(0);
                		setcolor(15);
                		outtextxy(530,25,"DIKDORTGEN");
                		delay(100);
                		cizgi();
         		}


         		if(GetAsyncKeyState(VK_DELETE))
         		{
                		setbkcolor(0);
                		setcolor(15);
                		outtextxy(530,25,"DIKDORTGEN");
                		delay(50);
                		temizle();
         		}
         		    if(GetAsyncKeyState(VK_END))
       				 {
            			cikis();
       				}


     	 }
}


void cember()
{
	int a,b,c,d;
	int renk=15;

   	setbkcolor(2);
   	setcolor(15);
   	outtextxy(680,25,"CEMBER");
    setfillstyle(1, renk);
    bar(35, 30, 61, 56);


    	while(1)
		 {


            if(GetAsyncKeyState(VK_DOWN))
                  {
                          delay(50);
                          renk++;
                          delay(50);
                          setcolor(15);
						  rectangle(35,30,61,56);
                          if(renk==16)
                          renk=0;
                          setfillstyle(1, renk);
      					  bar(35, 30, 61, 56);
                  }


            if(GetAsyncKeyState(VK_UP))
                  {
                          delay(50);
                          renk--;
                          delay(50);
                          setcolor(15);
						  rectangle(35,30,61,56);
                          if(renk==-1)
                          renk=15;
                          setfillstyle(1, renk);
      					  bar(35, 30, 61, 56);
                  }


            delay(1000);
            if(GetAsyncKeyState(VK_LBUTTON))
            {
            		getmouseclick(WM_LBUTTONDOWN,a,b);
            		delay(1000);
            		getmouseclick(WM_LBUTTONUP,c,d);
            		int kok=sqrt((c-a)*(c-a)+(d-b)*(d-b));

					if(a>145 && a<1065 && b>115 && b<710 && c>175 && c<1065 && d>145 && d<710)
            		{
            			setcolor(renk);
            			circle((c+a)/2,(d+b)/2,kok/2);
            		}
            }


                if(GetAsyncKeyState(VK_DELETE))
                {
                        setbkcolor(0);
                        setcolor(15);
                        outtextxy(680,25,"CEMBER");
                        delay(50);
                        temizle();
                }
                if(GetAsyncKeyState(VK_LEFT))
                 {
                        setbkcolor(0);
                        setcolor(15);
                        outtextxy(680,25,"CEMBER");
                        delay(50);
                        dortgen();
                 }
                  if(GetAsyncKeyState(VK_END))
        {
            cikis();
        }


         }
}


void temizle()
{
delay(50);
cleardevice();
renk_tablosu();
gorev_tablosu();
setcolor(15);
rectangle(35,30,61,56);
setfillstyle(1, 15);
bar(34, 29, 61, 56);
delay(300);
setcolor(0);
kalem();
}
int cikis()
{
	closegraph();
	return 0;
}





