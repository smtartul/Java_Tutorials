import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float armut = 2.14f, elma = 3.67f, domates = 1.11f, muz = 0.95f, patlican = 5.00f, tutar;
        int wArmut, wElma, wDomates, wMuz, wPatlican;

        System.out.println("Armut Kaç Kilo ?");
        wArmut = input.nextInt();
        System.out.println("Elma Kaç Kilo ?");
        wElma = input.nextInt();
        System.out.println("Domates Kaç Kilo ?");
        wDomates = input.nextInt();
        System.out.println("Muz Kaç Kilo ?");
        wMuz = input.nextInt();
        System.out.println("Patlıcan Kaç Kilo ?");
        wPatlican = input.nextInt();

        input.close();
        tutar = (armut * wArmut) + (elma * wElma) + (domates * wDomates) + (muz * wMuz) + (patlican * wPatlican);
        System.out.println("Toplam Tutar :" + tutar);

    }
}
