import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int loop = 0, smaller = 0, greater = 0, number, order = 1;
        Scanner input = new Scanner(System.in);
        System.out.printf("Kaç sayı gireceksiniz? :");
        loop = input.nextInt();

        while (loop > 0) {
            System.out.printf(order + ". Sayıyı giriniz :");
            number = input.nextInt();
            if (number < smaller) {
                smaller = number;
            }
            if (number > greater) {
                greater = number;
            }
            order++;
            loop--;
        }
        input.close();
        System.out.println("En büyük sayı :" + greater);
        System.out.println("En küçük sayı :" + smaller);
    }
}
