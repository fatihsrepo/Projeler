#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <windows.h>
#define IN 10000
#define N 100




int findCode(char sehir[][N],char sehirAdi[N],int sehirSay);
int dijsktra(int cost[][N],int source,int target,char sehir[][N]);

int main()
{


    system("color 79");
    char  sehir[N][N];
    char sehirAdi[N];
    int kod;
    int sehirSay=0,k=0;


    char baslangic[N];
    char bitis[N];
    int mesafe[N][N];
    int j=0,i=0;
    int uzaklik;
    int secim;

    do
    {
        sehirSay=0;
        uzaklik=0;
        k=0;
        j=0;
        i=0;
        kod=0;

        FILE *dosya;
        FILE *dosya2;
        for(k=1; k<N; k++)
            for(j=1; j<N; j++)
                mesafe[k][j]=IN;




        dosya = fopen("sehir.txt","r");
        dosya2 = fopen("mesafe.txt","r");

      if(dosya!= NULL){
        do
        {

            fscanf(dosya,"%s - %d",&sehirAdi,&kod);

            strcpy(sehir[kod],sehirAdi);
            sehirSay++;


        }
        while (!feof(dosya));
      }
      else{
        printf("Lutfen sehir kodlarinin bulundugu dosya ismini 'sehir' yapiniz.\n\n");
        int cikis;
        do{
             printf("Cikis icin 0'a basiniz.");
             scanf("%d", &cikis);
          if(cikis!=0)
          {
             printf("\n");
          }
          else{
            return 0;
          }
        }while (cikis !=0);
        }

        fclose(dosya);


      if(dosya2!= NULL){
        do
        {
            fscanf(dosya2,"%s - %s - %d",&baslangic,&bitis,&uzaklik);

            j=findCode(sehir,baslangic,sehirSay);
            k=findCode(sehir,bitis,sehirSay);
            mesafe[j][k]=uzaklik;
            mesafe[k][j]=uzaklik;

        }
        while (!feof(dosya2));
    }
      else{
        printf("Lutfen sehirler arasi mesafelerin bulundugu dosya ismini 'mesafe' yapiniz.\n\n");
        int cikis;
        do{
             printf("Cikis icin 0'a basiniz.");
             scanf("%d", &cikis);
          if(cikis!=0)
          {
             printf("\n");
          }
          else{
            return 0;
          }
        }while (cikis !=0);
      }


        fclose(dosya2);

        line1:
        printf("Baslangic sehrini giriniz:");
        scanf("%s",&baslangic);

        char ilkharf =baslangic[0];
    if(ilkharf >= 'A' && ilkharf <='Z'){

        for(i=1; i<sehirSay; i++)
        {
            if(findCode(sehir,baslangic,sehirSay)!=i)
            {
                printf("---------------------\n");
                uzaklik = dijsktra(mesafe,i,findCode(sehir,baslangic,sehirSay),sehir);
                printf("\n %s den %s e olan en kisa uzaklik: %d KM\n",baslangic,sehir[i],uzaklik);

            }
        }
        }
    else{
       printf("Ilk harfi buyuk harf olarak giriniz. (Ankara, Mersin vb.)\n\n");
       goto line1;
    }


        line2:
        printf("\n\n\n\n\n");
        printf("Baslangic sehrini giriniz(Ankara,Mersin vb.):");//
        scanf("%s",&baslangic);

        printf("Bitis sehrini giriniz(Ankara,Mersin vb.): ");
        scanf("%s",&bitis);
        printf("\n");

    if(baslangic[0]>='A' && baslangic [0]<='Z' && bitis[0]>='A' && bitis [0]<='Z'){

        uzaklik = dijsktra(mesafe,findCode(sehir,bitis,sehirSay),findCode(sehir,baslangic,sehirSay),sehir);
        printf("\n%s - %s  arasindaki en kisa yol: %d KM \n\n",baslangic,bitis,uzaklik);
        }
    else{
            printf("Ilk harfleri buyuk harf olarak giriniz. (Ankara, Mersin vb.)\n");
            goto line2;
        }

        do{
        printf("\nDevam etmek istiyorsaniz '1', istemiyorsaniz '0' giriniz:");
        scanf("%d",&secim);

        if(secim!=0 && secim!=1)
        {
            printf("!!! 0 veya 1 disinda bir deger girdiniz...tekrar giriniz....!!!");
        }

        }while(secim!=0 && secim!=1);


    }
    while(secim!=0);


    return 0;
}

int findCode(char sehir[][N],char sehirAdi[100],int sehirSay)
{

    int i;
    for(i=0; i<sehirSay; i++)
    {
        if(strcmp(sehir[i],sehirAdi)==0)
        {
            return i;
        }
    }
    return 0;
}
int dijsktra(int cost[][N],int source,int target,char sehir[][N])
{
    int dist[N],prev[N],selected[N]= {0},i,m,min,start,d,j,pathNum[N];
    char path[N];
    for(i=1; i< N; i++)
    {
        dist[i] = IN;
        prev[i] = -1;
    }
    start = source;

    selected[start]=1;
    dist[start] = 0;
    while(selected[target] ==0)
    {
        min = IN;
        m = 0;
        for(i=1; i< N; i++)
        {
            d = dist[start] +cost[start][i];
            if(d< dist[i]&&selected[i]==0)
            {
                dist[i] = d;
                prev[i] = start;

            }
            if(min>dist[i] && selected[i]==0)
            {
                min = dist[i];
                m = i;

            }
        }
        start = m;
        selected[start] = 1;

    }

    start = target;
    j = 0;
    while(start != -1)
    {
        path[j++] = start+65;
        start = prev[start];

    }
    start=target;
    j=0;
    while(start!=-1)
    {
        pathNum[j]=start;
        if(j!=0)
            printf(">");
        printf("%s",sehir[start]);
        start = prev[start];
        j++;

    }



    path[j]='\0';
    strrev(path);

    return dist[target];
}
