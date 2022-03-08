public class Main {

    public static void main(String[] args) {
        int res = 0, n1 = 1, n2 = 1;
        while ((n1 + n2) < 100) {
            res = n1 + n2;
            System.out.println(n1 + " + " + n2 + " = " + res);
            n1 = n2;
            n2 = res;
        }
    }
}
