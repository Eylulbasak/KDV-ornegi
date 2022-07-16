import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar , kdv = 0.18;
        Scanner input= new Scanner(System.in);
        System.out.print("Lutfen tutari giriniz : ");
        tutar= input.nextDouble();
        double kdvtutar = tutar * kdv;
        System.out.println(kdvtutar);
        double sontutar = kdvtutar + tutar;
        System.out.print(sontutar);


    }
}