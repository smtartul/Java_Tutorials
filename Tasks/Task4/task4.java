import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float r,pi=3.14f,alfa,area;

        System.out.println("Dairenin yarıçapını giriniz?");
        r=input.nextFloat();
        System.out.println("Dairenin merkez açısını giriniz?");
        alfa=input.nextFloat();

        area=(pi*alfa*(r*r))/360;
        System.out.println("Dairenin alanı:"+area);

        input.close();
    }
}
