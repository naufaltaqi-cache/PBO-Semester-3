import java.util.Scanner;
public class BacklogGame3
{
    static Scanner input = new Scanner(System.in); // Satu Scanner dipakai bersama oleh semua fungsi
    static String inputString(String pesan) // Fungsi input teks
    {
        System.out.print(pesan);
        return input.nextLine();
    }

    static int inputRating() // Fungsi input rating
    {
        System.out.print("Rating bintang (0-5): ");
        int rating = input.nextInt();

        if (rating <= 0) 
        {
            System.out.println("Rating tidak boleh negatif atau nol!");
            return -1; // Kode error
        } 
        else if (rating > 5) 
        {
            System.out.println("Rating tidak boleh lebih dari 5!");
            return -1; // Kode error
        }
        return rating;
    }

    static int pilihPlatform() // Fungsi tampilan menu platform
    {
        System.out.println("\n----- Pilih Platform -----");
        System.out.println("1. Steam");
        System.out.println("2. PlayStation");
        System.out.println("3. Others");
        System.out.println("--------------------------");
        System.out.print("Masukkan kode platform (1-3): ");
        int kodePlatform = input.nextInt();

        if (kodePlatform < 1 || kodePlatform > 3) 
        {
            System.out.println("Kode platform tidak valid!");
            return -1; // Kode error
        }
        return kodePlatform;
    }

    static String namaPlatform(int kodePlatform) 
    {
        String platform;
        switch (kodePlatform) 
        {
            case 1:
                platform = "Steam";
                break;
            case 2:
                platform = "PlayStation";
                break;
            default:
                platform = "Others";
                break;
        }
        return platform;
    }

    static String buatBintang(int rating) // Fungsi rating -> bintang
    {
        String bintang = "";
        for (int i = 1; i <= 5; i++) 
        {
            if (i <= rating) 
            {
                bintang += "*";
            } 
            else 
            {
                bintang += " ";
            }
        }
        return bintang;
    }

    // Fungsi tampilan data game
    static void tampilkanData(String judul, int rating, String platform) 
    {
        System.out.println("\n==========================================");
        System.out.println("===== Sistem Manajemen Backlog Game ======");
        System.out.println("==========================================");
        System.out.println("Judul: " + judul); // ekspresi
        System.out.println("Rating: " + rating + "/5 | " + buatBintang(rating));
        System.out.println("Platform: " + platform);
        System.out.println("==========================================\n");
    }

    public static void main(String[] args) // Fungsi main
    {
        String judul = inputString("Masukkan Judul Game: ");

        int rating = inputRating();
        if (rating == -1) 
        {
            System.out.println("Input rating tidak valid.");
            return;
        }

        int kodePlatform = pilihPlatform();
        if (kodePlatform == -1) 
        {
            System.out.println("Input platform tidak valid.");
            return;
        }
        String platform = namaPlatform(kodePlatform);

        tampilkanData(judul, rating, platform); // Tampilkan akhir
    }
}