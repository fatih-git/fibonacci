import java.util.Scanner;

/**
 * @author fatih-git
 * */

public class fibonacci {

    public static void main(String[] args) {

        int sayi1=0, sayi2=1, sonuc;
        int basamak;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen basamak sayısı girin: ");
        basamak=input.nextInt();

        for(int i=0; i<basamak-1; i++){

            sonuc=sayi1+sayi2;
            System.out.println(sayi1+"+"+sayi2+"= "+sonuc);

            sayi1=sayi2;
            sayi2=sonuc;

        }

    }

}
