import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean artikYil;
        Scanner input = new Scanner(System.in);
        System.out.printf("Yılı giriniz:");
        int year = input.nextInt();
        input.close();
        if (year % 100 == 0) {
            artikYil = (year % 400 == 0) ? true : false;
        } else if (year % 4 == 0) {
            artikYil = true;
        } else {
            artikYil = false;
        }

        System.out.println((artikYil) ? year + " bir artık yıldır !" : year + " bir artık yıldır değildir !");
    }
}
