import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        int n1, n2, selection;
        float res;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz:");
        n1 = input.nextInt();

        System.out.print("İkinci sayıyı giriniz:");
        n2 = input.nextInt();

        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bolme");
        System.out.print("Seçiminizi giriniz:");
        selection = input.nextInt();
        input.close();
        switch (selection) {
            case 1:
                res = n1 + n2;
                System.out.println("İşlem sonucu Toplama:" + res);
                break;
            case 2:
                res = n1 - n2;
                System.out.println("İşlem sonucu Çıkarma:" + res);
                break;
            case 3:
                res = n1 * n2;
                System.out.println("İşlem sonucu Çarpma:" + res);
                break;
            case 4:
                if(n2==0){
                    System.out.println("Bölme işleminde 2.eleman 0 olamaz.");
                    break;
                }
                res = n1 / n2;
                System.out.println("İşlem sonucu Bölme:" + res);
                break;
            default:
                System.out.println("Yanlış seçim yaptınız");
                break;
        }

    }
}
