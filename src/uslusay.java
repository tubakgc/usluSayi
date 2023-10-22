import java.util.Scanner;
public class uslusay {
    public static void main(String[] args) {
        int n;
        Scanner tuba = new Scanner(System.in);
        System.out.print("Sınır sayıyı giriniz:");
        n=tuba.nextInt();


        for (int i=1; i<=n; i*=4){
            System.out.println(i);

        }
        System.out.println("----------------");

        for (int i=1; i<=n; i*=5){
            System.out.println(i);

        }

    }
}
