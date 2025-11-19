import java.util.Arrays;

public class Numbers09 {
    public static void main(String[] args) {
        int[][] myNumbers = new int [3][];
        myNumbers[0] = new int[5];
        myNumbers[1] = new int[3];
        myNumbers[2] = new int[1];

    //1. Tambahkan kode program sebagai berikut (Pertanyaan Nomer 1)
    for (int i = 0; i < myNumbers.length; i++) {
        System.out.println(Arrays.toString(myNumbers[i]));
    }
    //4. Tambahkan kode program berikut (Pertanyaan Nomer 4)
    for (int i = 0; i < myNumbers.length; i++) {
        System.out.println("Panjang baris ke-" + (i+1) + ": " + myNumbers[i].length);
    }
    }
}

/*PERTANYAAN*/

/*2. Apa fungsi dari Arrays.toString()?*/
/*Jawaban: Fungsinya adalah mengubah array menjadi representasi string, sehingga isi array dapat 
ditampilkan dalam satu baris secara rapi. */

/*3. Apa nilai default untuk elemen pada array dengan tipe data int?*/
/*Jawaban: Nilai default tipe data int pada array adalah 0*/

/*5. Array myNumbers memiliki length berbeda untuk setiap barisnya. Apakah panjang array dapat dimodifikasi 
setelah diinstansiasi? */
/*Jawaban: Tidak. Panjang array bersifat tetap (fixed) setelah array dibuat. Tidak dapat menambah atau 
mengurangi jumlah elemen pada baris mana pun setelah instansiasi.  */
