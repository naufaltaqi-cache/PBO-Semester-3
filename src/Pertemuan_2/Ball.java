import java.util.Scanner;

public class Ball
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print ("Masukkan jari: ");

        double jari = input.nextDouble();

        double volume = (4.0 / 3.0) * Math.PI * Math.pow (jari, 3);
        System.out.print("Volume Bola: " + volume);

        input.close();
    }
}