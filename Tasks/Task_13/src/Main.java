import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int distance, age, type;
        double total, discountRate = 0, unitPrice = 0.10;
        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km cinsinden giriniz:");
        distance = input.nextInt();
        if (distance < 0) {
            System.out.println("Hatalı giriş yaptınız!");
            return;
        }
        System.out.print("Yaşınızı giriniz:");
        age = input.nextInt();
        System.out.print("yolculuk tipini giriniz(1 => Tek Yön , 2 => Gidiş Dönüş) ");
        type = input.nextInt();
        input.close();
        total = distance * unitPrice;
        if (age < 12) {
            discountRate = 0.5;
        } else if (age <= 24) {
            discountRate = 0.1;
        } else if (age > 65) {
            discountRate = 0.3;
        }

        total -= total * discountRate;

        if (type == 2) {
            total -= total * 0.2;
            total *= 2;
        }

        System.out.println("Toplam tutar :" + total);
    }
}
