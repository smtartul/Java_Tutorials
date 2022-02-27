import java.util.Scanner;
public class task5 {
     public static void main(String[] args) {
         Scanner input=new Scanner(System.in);
         float vki,height,weight;

         System.out.println("Lütfen boyunuzu (metre cinsinde) giriniz :");
         height=input.nextFloat();
         System.out.println("Lütfen kilonuzu giriniz :");
         weight=input.nextFloat();
         vki=weight/(height*height);
         System.out.println("Vücut Kitle İndeksiniz :"+vki);
         input.close();
     }
}
