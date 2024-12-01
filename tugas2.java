import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


class Pelajar {
    private String namaLengkap;
    private String nomorInduk;

    public Pelajar(String namaLengkap, String nomorInduk) {
        this.namaLengkap = namaLengkap;
        this.nomorInduk = nomorInduk;
    }

    public String getNamaLengkap() {
        return namaLengkap;
    }

    public String getNomorInduk() {
        return nomorInduk;
    }

    public String toString() {
        return "NIM: " + nomorInduk + ", Nama: " + namaLengkap;
    }
}


public class ManajemenPelajar {
    private Map<String, Pelajar> dataPelajar = new HashMap<>();
    private Scanner input = new Scanner(System.in);

    public void tampilkanMenu() {
        int opsi;
        do {
            System.out.println("\n=== Pilih Menu ===");
            System.out.println("1. Tambah Pelajar");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan: ");
            opsi = input.nextInt();
            input.nextLine(); 
            switch (opsi) {
                case 1:
                    tambahPelajar();
                    break;
                case 2:
                    tampilkanData();
                    break;
                case 3:
                    ubahData();
                    break;
                case 4:
                    hapusData();
                    break;
                case 5:
                    System.out.println("Terima kasih! Program berakhir.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid! Silakan coba lagi.");
            }
        } while (opsi != 5);
    }

    private void tambahPelajar() {
        System.out.print("Masukkan NIM: ");
        String nomorInduk = input.nextLine();
        if (dataPelajar.containsKey(nomorInduk)) {
            System.out.println("NIM sudah ada! Silakan masukkan NIM lain.");
            return;
        }
        System.out.print("Masukkan Nama: ");
        String namaLengkap = input.nextLine();
        dataPelajar.put(nomorInduk, new Pelajar(namaLengkap, nomorInduk));
        System.out.println("Pelajar berhasil ditambahkan!");
    }

    private void tampilkanData() {
        if (dataPelajar.isEmpty()) {
            System.out.println("Belum ada data pelajar.");
            return;
        }
        System.out.println("\n=== Data Pelajar ===");
        for (Pelajar p : dataPelajar.values()) {
            System.out.println(p);
        }
    }

    private void ubahData() {
        System.out.print("Masukkan NIM yang akan diubah: ");
        String nomorInduk = input.nextLine();
        if (!dataPelajar.containsKey(nomorInduk)) {
            System.out.println("NIM tidak ditemukan!");
            return;
        }

        System.out.print("Masukkan Nama baru: ");
        String namaBaru = input.nextLine();
        dataPelajar.put(nomorInduk, new Pelajar(namaBaru, nomorInduk));
        System.out.println("Data pelajar berhasil diubah!");
    }

    private void hapusData() {
        System.out.print("Masukkan NIM yang akan dihapus: ");
        String nomorInduk = input.nextLine();
        if (!dataPelajar.containsKey(nomorInduk)) {
            System.out.println("NIM tidak ditemukan!");
            return;
        }

        dataPelajar.remove(nomorInduk);
        System.out.println("Data pelajar berhasil dihapus!");
    }

    public static void main(String[] args) {
        ManajemenPelajar aplikasi = new ManajemenPelajar();
        aplikasi.tampilkanMenu();
    }
}
