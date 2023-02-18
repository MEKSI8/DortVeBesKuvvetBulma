import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("bir sayı girin: ");
        int say = input.nextInt();
        int toplam=0;

        for (int i=1; i<say/2; i++){

             if (Math.pow(4,i)<=say){
                 System.out.println(Math.pow(4,i));
             }
             if (Math.pow(5,i)<=say){
                 System.out.println(Math.pow(5,i));
             }
        }
    }
}