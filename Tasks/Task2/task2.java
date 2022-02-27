import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float money,tax,total;

        System.out.println("Tutar giriniz:");
        money=input.nextFloat();
        if(money<0){
            System.out.println("Yanlış deqer girdiniz!");
        }else{
            float taxRate=(money<1000?0.18f:0.08f);
            tax=money*taxRate;
            total=tax+money;
            System.out.println("Kdv'siz Fiyat="+money+"\nKdv'li Fiyat="+total+"\nKdv Tutarı="+tax); 
        }
        
        input.close();
    }
}
