import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int sayi = input.nextInt();
        input.close();

        int toplam = 0, adet = 0;
        double ortalama = 0;

        for (int i = 1; i < sayi; i++) {
            if (i % 3 == 0 && i % 4 == 0) {
                toplam += i;
                adet++;
            }
        }

        if (adet == 0) {
            System.out.println("3 ve 4 e bölünen sayı bulunamadı");
        } else {
            ortalama = toplam / adet;
            System.out.println("3 ve 4 e bölünen sayıların aritmetik ortalaması :" + ortalama);
        }


    }
}
