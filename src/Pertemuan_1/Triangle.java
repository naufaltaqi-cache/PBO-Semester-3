import java.util.Scanner;

public class Triangle 
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan alas: ");
        double alas = input.nextDouble();
        System.out.print("Masukkan tinggi: ");
        double tinggi = input.nextDouble();
        double segitiga = 0.5 * alas * tinggi;
        System.out.println("Luas segitiga: " + segitiga);

        input.close();
    }
}
