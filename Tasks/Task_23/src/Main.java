import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi;
        double res = 0;
        System.out.printf("Sayı giriniz :");
        sayi = input.nextInt();
        if (sayi <= 1) {
            System.out.println("Yanlış giriş yaptınız.");
            return;
        }
        input.close();
        for (int i = 1; i <= sayi; i++) {
            res += (1.0 / i);
        }
        System.out.println("Girmiş olduğunuz sayının harmonik seri sonucu :" + res);

    }
}
