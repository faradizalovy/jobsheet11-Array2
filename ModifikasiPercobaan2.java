import  java.util.Scanner;

public class ModifikasiPercobaan2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        while (true) { 
           System.out.println("\n=== MENU BIOSKOP ==="); 
           System.out.println("1. Input data penonton"); //Modifikasi Nomer 2
           System.out.println("2. Tampilkan daftar penonton");
           System.out.println("3. Exit");
           System.out.print("Pilih menu: ");

           int pilihan = sc.nextInt();
           sc.nextLine();

           if (pilihan == 1) {
            System.out.print("Masukkan baris (0-3): ");
            int b = sc.nextInt();
            System.out.print("Masukkan kolom (0-1): ");
            int k = sc.nextInt();
            sc.nextLine();
            
            if (b < 0 || b >=4 || k < 0 || k >= 2) {
                System.out.println("Kursi tidak tersedia!"); //Modifikasi nomer 3
            continue;
            }

            if (penonton[b][k] != null) {
                System.out.println("Kursi sudah terisi!"); //Modifikasi nomer 4
                continue;
            }
                System.out.print("Masukkan nama penonton: ");
                penonton[b][k] = sc.nextLine();
            }
            else if (pilihan == 2) {
                System.out.println("\nDaftar nama penonton:");
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j < 2; j++) {
                        if (penonton[i][j] == null) { 
                            System.out.print("***\t"); //Modifikasi nomer 5
                        } else {
                            System.out.print(penonton[i][j] + "\t");
                        }
                    }
                    System.out.println();
                }
            }
            else if (pilihan == 3) {
                System.out.println("Keluar...");
                break;
            }
            else {
                System.out.println("Pilihan tidak tersedia!");
            }
        }
    }
}
