import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama: ");
        String userName = input.nextLine();
        
        System.out.print("Masukkan NIM: ");
        String userNim = input.nextLine();

        System.out.println("Nama: " + userName);
        System.out.println("NIM: " + userNim);
        
        input.close();
    }
}
