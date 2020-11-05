import java.util.Scanner;
public class AsalSayiBulma
{

    public static void main(String[] args)
    {

        System.out.println("Bir sayi giriniz");
        Scanner girilenSayi = new Scanner(System.in);

        int sayi = girilenSayi.nextInt();
        int sayac = 0;

        if(sayi<=1)
         {
                System.out.println("Bu sayılar asal olamaz!");
         }
        else
         {
                for(int i=1;i<=sayi;i++)
                {
                    int kalan=sayi%i;
                    if(kalan==0)
                    {
                        sayac++;
                    }
                }
                if(sayac==2){
                    System.out.println("Sayi asaldir");
                }
                else{
                    System.out.println("Sayi asal degildir");
                }
                /*sayi 7 olsun 1<7 olduğundan for a girdi. Kalan = 7%1=0 oldu. alttaki if e girdi.
                 sayac 0 yerine 1 oldu. i 2 oldu. 2<7 den. 7%2 den sonuç 1 oldu. i 3 oldu. 3<7 den. 7%3=1 oldu.
                 i 4 oldu.4<7.7%4 = 3 oldu. i 5 oldu. 5<7. 7%5=2. i 6 oldu.6>7.7%6=1. i 7 oldu 7=7. 7½7=0 oldu if e girdi sayac
                 1 idi 2 oldu. i 8 oldu 8<= 7 mi diye bakınca sonuç false çıktı bu for a tekrar girmedi altına indi. sayac 2
                 ye eşit olduğundan false oldu ve sayac ın içine girdi. Sayı asaldır yazdırdı. Sayı 4 olsun. 4 asal sayı
                 değildir bakalım programda nasıl işliyor. 1<4 den. 4%1=0. if e girdi sayac 0 dan 1 e çıktı. i 2 oldu. 2<4.
                 4%2=0 sayac 2 oldu. i 3 oldu. 3<4.4%3=1. i 4 oldu. 4 =4. 4%4 =0 sayac 2 den 3 e çıktı. i 5 oldu. 5<=4 false
                 olduğundan for a girmeden aşağı indi. sayac 2 ye eşit olmadığından if e girmedi. else e girdi. Sayi asal
                 değildir yazdırdı.*/

                 /* Yani sayac sayısı bize bölen sayısını vermekte. Sadece kendisine ve 1 e bölünebilen sayılar
                 asal sayılardır. Sayac 2 olduğunda bu sebeple sayı asal çıkacaktır. 4 sayısında ise sayac 3 oldu.
                 Çünkü 4 ün 1,2,4 bölenleri vardır. System.out.println(sayac); ile de sayının bölen sayısı yazdırılabilir.*/
         }

    }

}