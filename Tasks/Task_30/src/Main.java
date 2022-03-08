public class Main {

    public static void main(String[] args) {
	for (int i=2;i<100;i++){
        boolean asal=true;
        for (int y=2;y<i;y++){
            if (i%y==0){
                asal=false;

            }
        }
        if(asal){
            System.out.printf(String.valueOf(i)+" ");
        }
    }
    }
}
