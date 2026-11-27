import java.util.Scanner;
public class BacklogGame2 
{
    // Fungsi tampilan data game
    static void tampilkanData(String judul, int rating, String bintang, String platform) 
    {
        System.out.println("\n==========================================");
        System.out.println("===== Sistem Manajemen Backlog Game ======");
        System.out.println("==========================================");
        System.out.println("Judul: " + judul); // Ekspresi
        System.out.println("Rating: " + rating + "/5 | " + bintang);
        System.out.println("Platform: " + platform);
        System.out.println("==========================================\n");
    }

    public static void main(String[] args) // Fungsi main
    {
        Scanner input = new Scanner(System.in);

        String judul;
        int rating, kodePlatform;
        String platform = "";
        String bintang = "";

        System.out.print("Masukkan Judul Game: ");
        judul = input.nextLine();

        System.out.print("Rating bintang (0-5): "); // Validasi rating
        rating = input.nextInt();
        if (rating <= 0) 
        {
            System.out.println("Rating tidak boleh negatif atau nol!");
            return;
        } 
        else if (rating > 5) 
        {
            System.out.println("Rating tidak boleh lebih dari 5!");
            return;
        }

        for (int i = 1; i <= 5; i++) // Fungsi rating -> bintang
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

        System.out.println("\n----- Pilih Platform -----"); // Tampilan menu platform
        System.out.println("1. Steam");
        System.out.println("2. PlayStation");
        System.out.println("3. Others");
        System.out.println("--------------------------");
        System.out.print("Masukkan kode platform (1-3): ");
        kodePlatform = input.nextInt();

        switch (kodePlatform) 
        {
            case 1:
                platform = "Steam";
                break;
            case 2:
                platform = "PlayStation";
                break;
            case 3:
                platform = "Others";
                break;
            default:
                System.out.println("Kode platform tidak valid!");
                return;
        }

        tampilkanData(judul, rating, bintang, platform); // Tampilkan akhir
    }
}