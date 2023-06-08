import java.util.Arrays;
import java.util.Scanner;

public class main2 {
    public static void main(String[] args) {
        int number = (int)(Math.random()*100);
        int[] top = new int[5];
        int count = 0;
        int n;
        int round = 5;
        Scanner inp = new Scanner(System.in);
        System.out.println(number);

        while(count < 5){
            System.out.print("Tahmininizi giriniz : ");
            n = inp.nextInt();
            if(n<0 || n > 100){
                System.out.println("0-100 arasinda bir sayi giriniz!");
                System.out.println("Kural disi tahmin yaptiniz her kuraldisi tahmin 1 hak sayilacaktir dikkat ediniz ");
            }
            if(number == n) {
                System.out.println("Gizli sayi : " + number);
                System.out.println("Dogru tahmin! Tebrikler kazandiniz ");
                break;
            }
            if(count == 4){
                System.out.println("Gizli sayi : " + number);
                System.out.println("Kaybettiniz tekrar deneyiniz ");
                System.out.println("Butun tahminleriniz : " + Arrays.toString(top));
                break;
            }
            if(number < n){
                System.out.println("Tahmininiz gizli sayidan buyuk ");
            }else{
                System.out.println("Tahmininiz gizli sayidan kucuk ");
            }
            round--;
            System.out.println("kalan hakkiniz : " + round);
            top[count++] = n;

        }

    }
}