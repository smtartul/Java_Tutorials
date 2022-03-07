import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Bir sayı giriniz:");
        int n = input.nextInt();
        input.close();

        for (int i = 1; i <= n; i++) {
            for (int y = 0; y < (n - i); y++) {
                System.out.printf(" ");
            }
            for (int z = 0; z < ((2 * i) - 1); z++) {
                System.out.printf("*");
            }
            System.out.println();
        }
        for (int i = (n - 1); i > 0; i--) {
            for (int y = 0; y < (n - i); y++) {
                System.out.printf(" ");
            }
            for (int z = 0; z < ((2 * i) - 1); z++) {
                System.out.printf("*");
            }
            System.out.println();
        }
    }
}
