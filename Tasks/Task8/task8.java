import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
        String userName, password, pwdef = "java123", req;
        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı adınız:");
        userName = input.nextLine();

        System.out.print("Kullanıcı şifreniz:");
        password = input.nextLine();

        if (userName.equals("patika")) {
            if (password.equals(pwdef)) {
                System.out.println("Giriş yaptınız!");
            } else {
                System.out.println("Bilgileriniz yanlış!");
                System.out.println("Şifrenizi deqiştirmek ister misiniz?E-H");
                req = input.nextLine().toUpperCase();
                if (req.equals("E")) {
                    System.out.println("Yeni şifreniz?");
                    password = input.nextLine();
                    System.out.println(
                            password == pwdef ? "Şifre oluşturulamadı, lütfen başka şifre giriniz."
                                    : "Şifre oluşturuldu");
                }

            }

        } else {
            System.out.println("Bilgileriniz yanlış!");
        }
    }
}
