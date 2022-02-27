import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int mat, fizik, kimya, turkce, tarih, muzik, toplam;
        float sonuc;

        Scanner input = new Scanner(System.in);

        System.out.println("Matematik notunuzu giriniz:");
        mat = input.nextInt();
        System.out.println("Fizik notunuzu giriniz:");
        fizik = input.nextInt();
        System.out.println("Kimya notunuzu giriniz:");
        kimya = input.nextInt();
        System.out.println("Turkce notunuzu giriniz:");
        turkce = input.nextInt();
        System.out.println("Tarih notunuzu giriniz:");
        tarih = input.nextInt();
        System.out.println("Muzik notunuzu giriniz:");
        muzik = input.nextInt();

        input.close();
        toplam = mat + fizik + kimya + turkce + tarih + muzik;
        sonuc = toplam / 6;
        System.out.println(sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta kaldı");
    }

}