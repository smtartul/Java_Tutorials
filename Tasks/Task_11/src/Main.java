import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a, b, c;
        String res;
        Scanner input = new Scanner(System.in);
        System.out.printf("1.sayıyı giriniz:");
        a = input.nextInt();

        System.out.printf("2.sayıyı giriniz:");
        b = input.nextInt();

        System.out.printf("3.sayıyı giriniz:");
        c = input.nextInt();
        input.close();

        if (a > b) {
            if (a < c) {
                res = b + "<" + a + "<" + c;
            } else if (b < c) {
                res = b + "<" + c + "<" + a;
            } else {
                res = c + "<" + b + "<" + a;
            }
        } else {
            if (b < c) {
                res = a + "<" + b + "<" + c;
            } else if (a < c) {
                res = a + "<" + c + "<" + b;
            } else {
                res = c + "<" + a + "<" + b;
            }
        }

        System.out.println("Sayılar kucukten buyuge:" + res);
    }
}
