import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Sayı giriniz :");
        int number=input.nextInt();
        input.close();
        String res=isPrime(number,2)!=0?"Sayı asal":"Sayı asal değil";
        System.out.println(res);
    }
    public static int isPrime(int number,int start) {
        if(number<2){
            return 0;
        }
        if (start < number) {
            if (number%start==0){
                return 0;
            }
            return (number%start) * isPrime(number,start+1);
        } else {
            return 1;
        }
    }
}
