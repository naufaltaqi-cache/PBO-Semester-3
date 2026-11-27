import java.util.Scanner;

class Buku
{
    private String judul, penulis;
    private int tahun;

    public Buku(String judul, String penulis, int tahun)
    {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
    }

    public void tampilkanData() 
    {
        System.out.println("\n======================");
        System.out.println("===== DATA BUKU ======");
        System.out.println("======================");
        System.out.println("Judul: " + this.judul);
        System.out.println("Penulis: " + this.penulis);
        System.out.println("Tahun: " + this.tahun);
        System.out.println("======================\n");
    }
}

public class Kuis1
{
    static Scanner input = new Scanner(System.in);
    static String inputString(String pesan)
    {
        System.out.print(pesan);
        return input.nextLine();
    }

    static int inputAngka(String pesan)
    {
        System.out.print(pesan);
        int angka = input.nextInt();
        input.nextLine();
        return angka;
    }

    static void tampilkanData(Buku buku)
    {
        buku.tampilkanData();
    }

    public static void main(String[] args)
    {
        String judul1 = inputString("Masukkan Judul: ");
        String penulis1 = inputString("Masukkan Penulis: ");
        int tahun1 = inputAngka("Masukkan Tahun: ");
        Buku buku1 = new Buku(judul1, penulis1, tahun1);

        String judul2 = inputString("Masukkan Judul: ");
        String penulis2 = inputString("Masukkan Penulis: ");
        int tahun2 = inputAngka("Masukkan Tahun: ");
        Buku buku2 = new Buku(judul2, penulis2, tahun2);

        tampilkanData(buku1);
        tampilkanData(buku2);
    }
}
