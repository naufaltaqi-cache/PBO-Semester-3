import java.util.Scanner;
class Mahasiswa
{
    private String nama, nim;
    private int tugas, UTS, UAS;

    public Mahasiswa(String nama, String nim)
    {
        this.nama = nama;
        this.nim = nim;
        this.tugas = 0;
        this.UTS = 0;
        this.UAS = 0;
    }

    public double nilaiakhir() 
    {
        return (this.tugas * 0.30) + (this.UTS * 0.30) + (this.UAS * 0.40);
    }

    public String status()
    {
        if (nilaiakhir() >= 60) 
        {
            return "Lulus";
        } 
        else 
        {
            return "Tidak lulus";
        }
    }

    public String getNama()
    { 
        return nama; 
    }

    public String getNim() 
    { 
        return nim; 
    }

    public int getTugas() 
    { 
        return tugas; 
    }

    public int getUTS() 
    { 
        return UTS; 
    }
    
    public int getUAS() 
    { 
        return UAS; 
    }

    public double getNilaiAkhir()
    {
        return nilaiakhir();
    }

    public String getStatus()
    {
        return status();
    }

    public void setNama(String nama)
    { 
        this.nama = nama; 
    }

    public void setNim(String nim) 
    { 
        this.nim = nim; 
    }

    public void setTugas(int tugas) 
    {
        if (tugas < 0 || tugas > 100) 
        {
            System.out.println("Nilai tugas tidak valid!");
        }
        else
        {
            this.tugas = tugas;
        }
    }

    public void setUTS(int UTS) 
    {
        if (UTS < 0 || UTS > 100) 
        {
            System.out.println("Nilai UTS tidak valid!");
        }
        else
        {
            this.UTS = UTS;
        }
    }

    public void setUAS(int UAS) 
    {
        if (UAS < 0 || UAS > 100) 
        {
            System.out.println("Nilai UAS tidak valid!");
        }
        else
        {
            this.UAS = UAS;
        }
    }
}

public class Kuis2
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

    static void tampilkanData(Mahasiswa mahasiswa)
    {
        System.out.println("\n============================");
        System.out.println("===== NILAI MAHASISWA ======");
        System.out.println("============================");
        System.out.println("Nama: " + mahasiswa.getNama());
        System.out.println("NIM: " + mahasiswa.getNim());
        System.out.println("Nilai Tugas: " + mahasiswa.getTugas());
        System.out.println("Nilai UTS: " + mahasiswa.getUTS());
        System.out.println("Nilai UAS: " + mahasiswa.getUAS());
        System.out.printf("Nilai Akhir: %.2f\n", mahasiswa.nilaiakhir());
        System.out.println("Status: " + mahasiswa.status());
        System.out.println("============================\n");
    }

    public static void main(String[] args)
    {
        String nama = inputString("Masukkan Nama: ");
        String nim = inputString("Masukkan NIM: ");
        Mahasiswa mahasiswa = new Mahasiswa(nama, nim);

        mahasiswa.setTugas(inputAngka("Masukkan Nilai Tugas: "));
        mahasiswa.setUTS(inputAngka("Masukkan Nilai UTS: "));
        mahasiswa.setUAS(inputAngka("Masukkan Nilai UAS: "));

        tampilkanData(mahasiswa);
    }
}