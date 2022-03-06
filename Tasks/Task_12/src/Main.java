import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int day,month;
        String burc;
        Scanner input=new Scanner(System.in);
        System.out.printf("Dogum tarihini ay olarak giriniz:");
        month=input.nextInt();
        System.out.printf("Dogum tarhinizi gun olarak giriniz:");
        day=input.nextInt();
        input.close();

        if(day>0 && day<=31 && month>0 && month<=12){
            if(month==1){
                burc=(day<22)?"Oglak":"Kova";
            } else if(month==2){
                burc=(day>=20)?"Balık":"Kova";
            }
            else if(month==3){
                burc=(day<22)?"Balıl":"Koç";
            }
            else if(month==4){
                burc=(day<21)?"Koç":"Boga";
            }
            else if(month==5){
                burc=(day<22)?"Boga":"ikizler";
            }
            else if(month==6){
                burc=(day<23)?"ikizler":"Yengeç";
            }
            else if(month==7){
                burc=(day<23)?"Yengeç":"Aslan";
            }
            else if(month==8){
                burc=(day<23)?"Aslan":"Başak";
            }
            else if(month==9){
                burc=(day<23)?"Başak":"Terazi";
            }
            else if(month==10){
                burc=(day<24)?"Terazi":"Akrep";
            }
            else if(month==11){
                burc=(day<22)?"Akrep":"Yay";
            } else {
                burc=(day<22)?"Yay":"Oglak";
            }
        }else {
            System.out.println("Hatalı giriş yaptınız.");
            return;
        }

        System.out.println("Burcunuz :"+burc);
    }
}
