import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int heat;
        String res;
        System.out.printf("Sıcaklık giriniz:");
        Scanner input = new Scanner(System.in);
        heat = input.nextInt();
        input.close();

        if (heat > 25) {
            res = "Ywzme";
        } else if (heat >= 15) {
            res = "Piknik";
        } else if (heat >= 5) {
            res = "Sinema";
        } else {
            res = "Kayak";
        }

        System.out.println(res);
    }
}
