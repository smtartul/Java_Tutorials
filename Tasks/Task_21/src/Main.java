import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int base, exp, res = 1;
        Scanner input = new Scanner(System.in);
        System.out.printf("Üssü alınacak sayıyı giriniz:");
        base = input.nextInt();

        System.out.printf("Üs sayısını giriniz:");
        exp = input.nextInt();
        input.close();
        for (int i = 1; i <= exp; i++) {
            res *= base;
        }
        System.out.println("Üst sonucu :" + res);
    }
}
