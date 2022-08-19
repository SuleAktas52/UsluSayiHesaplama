import java.util.Scanner;

public class UsluSayiHesaplama {
    public static void main(String[] args) {
        int sayi,us,total=1;

        Scanner input = new Scanner(System.in);
        System.out.print("Ussu Alinacak Sayiyi giriniz: ");
        sayi = input.nextInt();

        System.out.print("Us Olacak Sayiyi giriniz: ");
        us = input.nextInt();

       /* int i=1;
        while ( i<=us){
            total=total*sayi;
            i++;
        }
        System.out.println(total); */

        for (int i=1; i<=us; i++){
            total*=sayi;
        }
        System.out.println("Sayinin kuvveti: " + total);
    }
}
