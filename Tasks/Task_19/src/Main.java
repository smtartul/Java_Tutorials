import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Sayı giriniz:");
        int sayi = input.nextInt();
        input.close();

        for (int i = 1; i < sayi; i *= 4) {
            if (i < sayi)
                System.out.println(i);
        }
        for (int i = 5; i < sayi;  i *= 5) {
            if (i < sayi)
                System.out.println(i);
        }
    }
}
