import java.util.Scanner;

// Class induk (parent): data yang dimiliki semua jenis game
class Game 
{
    private String judul;
    private String platform;
    private String status;

    public Game(String judul) 
    {
        this.judul = judul;
        this.platform = "Tidak ada";
        this.status = "Tidak ada";
    }

    public String getJudul() 
    {
        return judul;
    }

    public String getPlatform() 
    {
        return platform;
    }

    public String getStatus() 
    {
        return status;
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

// Class anak (child) dari Game: game yang sudah dimainkan
class GameDimainkan extends Game 
{
    private int rating; // Rating bintang 1-5
    private String ulasan;

    public GameDimainkan(String judul) 
    {
        super(judul); // Memanggil constructor class induk
        this.rating = 0;
        this.ulasan = " ";
    }

    public int getRating() 
    {
        return rating;
    }

    public String getUlasan() 
    {
        return ulasan;
    }

    public void setRating(int rating) 
    {
        if (rating < 1 || rating > 5) 
        {
            System.out.println("Rating harus antara 1 sampai 5!");
        } 
        else 
        {
            this.rating = rating;
        }
    }

    public void setUlasan(String ulasan) 
    {
        if (ulasan.length() > 200) 
        {
            System.out.println("Ulasan tidak boleh lebih dari 200 karakter!");
        } 
        else 
        {
            this.ulasan = ulasan;
        }
    }
}

// Class anak (child) dari Game: game yang belum dimainkan (Backlog / Wishlist)
class GameBelumDimainkan extends Game
{
    public GameBelumDimainkan(String judul) 
    {
        super(judul);
    }
}

public class BacklogGame5 
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

    static void tampilkanMenuPlatform() 
    {
        System.out.println("\n----- Pilih Platform -----");
        System.out.println("1. Steam");
        System.out.println("2. PlayStation");
        System.out.println("3. Others");
        System.out.println("--------------------------");
    }

    static void tampilkanMenuStatus() 
    {
        System.out.println("\n----- Pilih Status -----");
        System.out.println("1. Completed");
        System.out.println("2. Playing");
        System.out.println("3. Backlog");
        System.out.println("4. Wishlist");
        System.out.println("------------------------");
    }

    static String buatBintang(int rating) 
    {
        String bintang = " ";
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

    // Fungsi menampilkan data yang dimiliki semua jenis game
    // Parameter bertipe Game, sehingga objek anak juga bisa dikirim ke sini
    static void tampilkanDataUmum(Game game) 
    {
        System.out.println("\n==========================================");
        System.out.println("===== Sistem Manajemen Backlog Game ======");
        System.out.println("==========================================");
        System.out.println("Judul: " + game.getJudul()); // Ekspresi
        System.out.println("Platform: " + game.getPlatform());
        System.out.println("Status: " + game.getStatus());
    }

    // Fungsi menampilkan game yang sudah dimainkan
    static void tampilkanData(GameDimainkan game) 
    {
        tampilkanDataUmum(game);
        System.out.println("Rating: " + game.getRating() + "/5 | " + buatBintang(game.getRating()));
        System.out.println("Ulasan: " + game.getUlasan());
        System.out.println("==========================================\n");
    }

    // Fungsi menampilkan game yang belum dimainkan
    static void tampilkanData(GameBelumDimainkan game) 
    {
        tampilkanDataUmum(game);
        System.out.println("==========================================\n");
    }

    public static void main(String[] args) // Fungsi main
    {
        String judul = inputString("Masukkan Judul Game: ");

        tampilkanMenuPlatform();
        int kodePlatform = inputAngka("Masukkan kode platform (1-3): ");

        tampilkanMenuStatus();
        int kodeStatus = inputAngka("Masukkan kode status (1-4): ");

        if (kodeStatus == 1 || kodeStatus == 2) 
        {
            GameDimainkan game = new GameDimainkan(judul);
            game.setPlatform(kodePlatform);
            game.setStatus(kodeStatus);
            game.setRating(inputAngka("Rating bintang (1-5): "));
            game.setUlasan(inputString("Ulasan singkat (maks 200 karakter): "));
            tampilkanData(game);
        } 
        else if (kodeStatus == 3 || kodeStatus == 4) 
        {
            GameBelumDimainkan game = new GameBelumDimainkan(judul);
            game.setPlatform(kodePlatform);
            game.setStatus(kodeStatus);
            tampilkanData(game);
        } 
        else 
        {
            System.out.println("Kode status tidak valid. Program dihentikan.");
        }
    }
}