import java.util.Scanner;

public class Rectangle 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 

        System.out.print("Masukkan panjang: ");
        double panjang = input.nextDouble();
        System.out.print("Masukkan lebar: ");
        double lebar = input.nextDouble();
        double persegipanjang = panjang * lebar;
        System.out.println("Luas persegi panjang: " + persegipanjang);

        input.close();
    }    
}
