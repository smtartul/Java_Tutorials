import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] sayilar = {1, 2, 5, 7, 9, 0};
        boolean res = false;
        System.out.printf("Bir sayi giriniz:");
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        input.close();
        for (int i = 0; i < sayilar.length; i++) {
            if (sayi == sayilar[i]) {
                res = true;
                break;
            }
        }
        System.out.println(res);
    }
}
