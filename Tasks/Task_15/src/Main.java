import java.util.Scanner;

public class Main {

    static boolean isPalindrom(int number){
        String reversed="",toReversed=String.valueOf(number);
        for(char a:toReversed.toCharArray()){
            reversed+=a;
        }
        boolean res=(reversed.equals(toReversed))?true:false;
        return res;
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Sayı giriniz:");
        int number=input.nextInt();
        input.close();
        String result=isPalindrom(number)?"Palindrom":"Palindrom deqil";
        System.out.println(result);


    }
}
