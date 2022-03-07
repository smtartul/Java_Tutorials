import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number,total=0;
        Scanner input=new Scanner(System.in);
        System.out.printf("Sayı giriniz:");
        number=input.nextInt();
        input.close();
	do {
        total+=(number%10);
        number/=10;
    }
    while (number!=0);
        System.out.println("Girmiş olduğunuz sayının basamak değerleri toplamı:"+total);
    }

}
