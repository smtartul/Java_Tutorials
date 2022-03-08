import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int sayi1,sayi2,ebob=1,ekok;
        Scanner input=new Scanner(System.in);
        System.out.printf("1.sayıyı giriniz :");
        sayi1=input.nextInt();
        System.out.printf("2.sayıyı giriniz :");
        sayi2=input.nextInt();
        input.close();
        int ksayi=(sayi1<sayi2)?sayi1:sayi2;
        int i=1;
        while (ksayi>1){
            if(sayi1%ksayi==0 && sayi2%ksayi==0){
                ebob=ksayi;
                break;
            }
            ksayi--;
        }
        ekok=(sayi1*sayi2)/ebob;
        System.out.printf("Girmiş olduğunuz sayıların ebobu :"+ebob);
        System.out.println();
        System.out.printf("Girmiş olduğunuz sayıların ekoku :"+ekok);
    }
}
