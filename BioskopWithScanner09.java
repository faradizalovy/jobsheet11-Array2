import  java.util.Scanner;

public class BioskopWithScanner09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];

        int baris, kolom;
        String nama, next;

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

           penonton[baris-1][kolom-1] = nama;

           System.out.print("Input penonton lainnya? (y/n): ");
           next = sc.nextLine();

           if (next.equalsIgnoreCase("n")) {
            break;
           }
        }
    }
}

/*PERTANYAAN*/

/*1.  Apakah pengisian elemen array dari scanner harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan! */
/*Jawaban: Tidak harus. Namun karena input menggunakan nested loop, sistem secara otomatis mengisi berurutan. Yang wajib 
adalah indeksnya harus valid. */

/*===== modifikasi ada di file ModifikasiPercobaan2.java ====== */

/*2. 2. Modifikasi kode program untuk memberikan opsi menu sebagai berikut: - - - 
Menu 1: Input data penonton 
Menu 2: Tampilkan daftar penonton 
Menu 3: Exit */
/*3. Modifikasi kode program untuk menghandle apabila nomor baris/kolom kursi yang 
tidak tersedia */
/*4. Pada menu 1, modifikasi kode program untuk memberikan warning apabila kursi yang 
dipilih sudah terisi oleh penonton lainnya lalu munculkan perintah untuk memasukkan 
baris dan kolom kembali */ 
/*5. Pada menu 2, jika kursi kosong, ganti null dengan *** */