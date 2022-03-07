import java.util.Scanner;

public class Main {

    static int factorial(int number) {
        int total = 1;
        for (int i = 1; i <= number; i++) {
            total *= i;
        }
        return total;
    }

    public static void main(String[] args) {
        int n, r;
        Scanner input = new Scanner(System.in);
        System.out.printf("Eleman sayısını giriniz:");
        n = input.nextInt();

        System.out.printf("Kombinasyon için eleman sayısını giriniz:");
        r = input.nextInt();
        input.close();
        double combination = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("Kombinasyon sonucu :" + combination);
    }
}
