import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double a,b,c,area,pmeter;
        System.out.println("1.kenar uzunluqunu giriniz:");
        a=input.nextFloat();
        System.out.println("2.kenar uzunluqunu giriniz:");
        b=input.nextFloat();
        System.out.println("3.kenar uzunluqunu giriniz:");
        c=input.nextFloat();
        pmeter=(a+b+c)/2;
        area=Math.sqrt(pmeter*(pmeter-a)*(pmeter-b)*(pmeter-c));
        System.out.println("Ucgenin alanı:"+area);
        input.close();
    }
    
}
