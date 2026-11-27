import java.util.Scanner;

public class Circle 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in); 
                
        System.out.print("Masukkan jari jari: ");
        double jari = input.nextDouble();
        double lingkaran = 2 * Math.PI * jari;
        System.out.println("Keliling lingkaran: " + lingkaran);

        input.close();
    }    
}
