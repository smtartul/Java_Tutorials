import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int base,exp;
        Scanner input=new Scanner(System.in);
        System.out.printf("Base rakamını giriniz:");
        base=input.nextInt();
        System.out.printf("Us rakamını giriniz:");
        exp=input.nextInt();
        input.close();
        System.out.println("Sonuc :"+pow(base,exp));
    }

    public static int pow(int base,int exp) {
        if (exp > 0) {
            return base * pow(base,exp - 1);
        } else {
            return 1;
        }
    }
}
