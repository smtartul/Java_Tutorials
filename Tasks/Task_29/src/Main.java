import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.printf("Basamak sayısını giriniz :");
        int counter=input.nextInt();
        for (int i=counter;i>0;i--){
            for (int y=1;y<=(counter-i);y++){
                System.out.printf(" ");
            }
            for (int z=0;z<((2*i)-1);z++){
                System.out.printf("*");
            }
            System.out.println("");
        }
        input.close();
    }
}
