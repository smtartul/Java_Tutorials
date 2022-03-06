import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        var total = 0;
        System.out.print("Lutfen bir sayı giriniz:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
            }
        }

        String result = (total == number) ? "Girmiş olduqunuz sayı mukemmel sayıdır" : "girilen sayı mukemmel sayı degildir!";
        System.out.println(result);
    }
}
