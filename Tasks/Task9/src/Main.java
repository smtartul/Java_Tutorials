import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.printf("Matematik notunuz:");
        Scanner input = new Scanner(System.in);
        int Mat = input.nextInt();

        System.out.printf("Turkce notunuz:");
        int Tur = input.nextInt();

        System.out.printf("Fizik notunuz:");
        int Fiz = input.nextInt();

        System.out.printf("Kimya notunuz:");
        int Kim = input.nextInt();

        System.out.printf("Muzik notunuz:");
        int Muz = input.nextInt();
        input.close();

        int[] dersler = {Mat, Tur, Fiz, Kim, Muz};
        double total = 0;
        int courseCount = 5;
        for (int i = 0; i < dersler.length; i++) {
            if (dersler[i] < 0 || dersler[i] > 100) {
                courseCount--;
            } else {
                total += dersler[i];
            }
        }
        double average = total / courseCount;
        String res = (average >= 55) ? "Ogrenci sınıfı geçti" : "Ogrenci sınıfta kaldı";
        System.out.println(res);
    }
}
