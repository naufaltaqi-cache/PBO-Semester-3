import java.util.Scanner;
class Game // Class Game: data game dibungkus
{
    private String judul, platform, status; // Atribut private
    private int rating; // Rating bintang

    public Game(String judul) // Constructor
    {
        this.judul = judul;
        this.platform = "";
        this.rating = 0;
        this.status = "";
    }

    public String getJudul() // Getter: membaca nilai atribut
    {
        return judul;
    }

    public String getPlatform() 
    {
        return platform;
    }

    public int getRating() 
    {
        return rating;
    }

    public String getStatus() 
    {
        return status;
    }

    public void setRating(int rating) // Setter: mengubah nilai atribut
    {
        if (rating < 1 || rating > 5) 
        {
            System.out.println("Rating tidak valid!");
        }
        else 
        {
            this.rating = rating;
        }
    }

    public void setPlatform(int kodePlatform) 
    {
        switch (kodePlatform) 
        {
            case 1:
                this.platform = "Steam";
                break;
            case 2:
                this.platform = "PlayStation";
                break;
            case 3:
                this.platform = "Others";
                break;
            default:
                System.out.println("Kode platform tidak valid!");
                break;
        }
    }

    public void setStatus(int kodeStatus) 
    {
        switch (kodeStatus) 
        {
            case 1:
                this.status = "Completed";
                break;
            case 2:
                this.status = "Playing";
                break;
            case 3:
                this.status = "Backlog";
                break;
            case 4:
                this.status = "Wishlist";
                break;
            default:
                System.out.println("Kode status tidak valid!");
                break;
        }
    }
}

public class BacklogGame4
{
    static Scanner input = new Scanner(System.in); // Satu Scanner dipakai bersama oleh semua fungsi
    static String inputString(String pesan) // Fungsi input teks
    {
        System.out.print(pesan);
        return input.nextLine();
    }

    static int inputAngka(String pesan) // Fungsi input angka
    {
        System.out.print(pesan);
        int angka = input.nextInt();
        input.nextLine(); // Buang sisa enter
        return angka;
    }

    static void tampilkanMenuPlatform() // Fungsi tampilan menu platform
    {
        System.out.println("\n----- Pilih Platform -----");
        System.out.println("1. Steam");
        System.out.println("2. PlayStation");
        System.out.println("3. Others");
        System.out.println("--------------------------");
    }

    static void tampilkanMenuStatus() // Fungsi tampilan menu status
    {
        System.out.println("\n----- Pilih Status -----");
        System.out.println("1. Completed");
        System.out.println("2. Playing");
        System.out.println("3. Backlog");
        System.out.println("4. Wishlist");
        System.out.println("------------------------");
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

    static void tampilkanData(Game game) // Fungsi tampilan data game
    {
        System.out.println("\n==========================================");
        System.out.println("===== Sistem Manajemen Backlog Game ======");
        System.out.println("==========================================");
        System.out.println("Judul: " + game.getJudul()); // Ekspresi
        System.out.println("Rating: " + game.getRating() + "/5 | " + buatBintang(game.getRating()));
        System.out.println("Platform: " + game.getPlatform());
        System.out.println("Status: " + game.getStatus());
        System.out.println("==========================================\n");
    }

    public static void main(String[] args) // Fungsi Main 
    {
        String judul = inputString("Masukkan Judul Game: ");
        Game game = new Game(judul);

        game.setRating(inputAngka("Rating bintang (0-5): "));

        tampilkanMenuPlatform();
        game.setPlatform(inputAngka("Masukkan kode platform (1-3): "));

        tampilkanMenuStatus();
        game.setStatus(inputAngka("Masukkan kode status (1-4): "));

        tampilkanData(game); // Tampilkan akhir
    }
}