import java.util.*;
import java.io.*;

class Main {
    public static int Factorial(int n2){
        int factorial=1;
        for(int i=1;i<=n2;i++){
            factorial*=i;
        }
        return factorial;
    }

    public static int CombinatoricsChallenge(int num) {
        // code goes here


    public static void main (String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        System.out.print(CombinatoricsChallenge(s.nextLine()));
    }

}