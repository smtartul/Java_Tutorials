import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int number, total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.printf("Sayı giriniz:");
            number = input.nextInt();
            if ((number % 4) == 0) {
                total += number;
            }
        }
        while (number % 2 == 0);
        input.close();
        System.out.println("Girilen sayı toplamı:" + total);

    }
}
