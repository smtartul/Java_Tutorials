import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.printf("Sayı giriniz :");
        int number = input.nextInt();
        if(number>0){
            decrease(number, number);
        }else {
            System.out.println("Bu fonksiyon için pozitif sayı girişi yapmalısınız.");
        }
    }

    static int decrease(int num, int limit) {
        if (num > 0) {
            System.out.printf(" " + num);
        }
        if (num > 0) {
            return decrease(num - 5, limit);
        } else {
            return increase(num, limit);
        }

    }

    static int increase(int num, int limit) {
        System.out.printf(" " + num);
        if (num < limit) {
            return increase(num + 5, limit);
        } else {
            return limit;
        }

    }
}
