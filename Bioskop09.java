public class Bioskop09 {
    public static void main(String[] args) {
        String[][] penonton = new String[4][2];

        penonton[0][0] = "Amin";
        penonton[0][1] = "Bena";
        penonton[1][0] = "Candra";
        penonton[1][1] = "Dela";
        penonton[2][0] = "Eka";
        penonton[2][1] = "Farhan";
        penonton[3][0] = "Gisel";
        penonton[3][1] = "Hana"; 

       for (int i = 0; i < penonton.length; i++) {
        System.out.println("Penonton pada baris ke-" + (i+1) + ":" + String.join(", ", penonton[i]));
       }
    }
}

/*PERTANYAAN*/

/*1. Apakah pengisian elemen array harus dilakukan secara berurutan mulai dari indeks ke-0? Jelaskan!*/
/*Jawaban: Tidak harus. Java hanya mensyaratkan bahwa mengisi elemen menggunakan indeks yang valid. 
Selama indeks berada dalam batas ukuran array, maka boleh mengisi dari indeks berapa saja, boleh melewati 
beberapa indeks, boleh acak. Namun, pengisian secara berurutan lebih aman agar tidak ada elemen yang lupa 
diisi dan lebih mudah dibaca.*/

/*2. Mengapa terdapat null pada daftar nama penonton? */
/*Jawaban: null muncul karena array telah dibuat tetapi elemen tertentu belum diberi nilai. Pada array bertipe 
String, nilai default semua elemennya adalah null sampai diisi secara manual.*/

/*3. Lengkapi daftar penonton pada langkah ke-4 sebagai berikut*/
/*Jawaban: Program menampilkan seluruh isi array dua dimensi yang berisi nama-nama penonton. 
Setiap baris menampilkan dua nama yang berada pada kolom pertama dan kedua. Hasil yang muncul sesuai dengan data 
yang telah dimasukkan secara manual, sehingga menampilkan empat baris nama penonton mulai dari “Amin – Bena” 
hingga “Gisel – Hana”. Output ini menunjukkan bahwa pengisian elemen array berhasil dilakukan dan printf() menampilkan 
nilai sesuai posisi indeks masing-masing. */

/*4. Jelaskan fungsi dari penonton.length dan penonton[0].length! Apakah penonton[0].length, penonton[1].length,
penonton[2].length, dan penonton[3].length memiliki nilai yang sama? Mengapa? */
/*Jawaban: Pada kode tersebut, penonton.length digunakan untuk mengetahui berapa banyak baris yang dimiliki oleh 
array dua dimensi bernama penonton. Karena array tersebut dibuat dengan ukuran 4×2, maka nilai yang dihasilkan oleh 
penonton.length adalah 4, yang berarti terdapat empat baris kursi penonton di dalam bioskop mini tersebut. Sementara 
itu, penonton[0].length, penonton[1].length, penonton[2].length, dan penonton[3].length berfungsi untuk mengetahui 
berapa banyak kolom pada masing-masing baris. Setiap baris memiliki dua kolom, sehingga semua baris akan menghasilkan 
nilai 2. Nilai ini sama karena array penonton dibuat sebagai array dua dimensi dengan ukuran tetap, yaitu empat baris 
dan masing-masing baris memiliki dua kolom. Jadi, seluruh baris memiliki panjang kolom yang identik.*/

/*5. Modifikasi kode program pada pertanyaan 4 untuk menampilkan panjang setiap baris pada array menggunakan for loop. Compile, run, 
lalu amati hasilnya. *
/*Jawaban: Program menampilkan jumlah baris array, yaitu empat, lalu dilanjutkan dengan menampilkan panjang masing-masing baris 
menggunakan perulangan for. Setiap iterasi menghasilkan informasi bahwa panjang setiap baris adalah dua. Hasil tersebut menunjukkan 
bahwa penggunaan perulangan for memungkinkan program untuk membaca panjang baris secara sistematis, tanpa perlu menuliskan setiap 
indeks secara manual seperti pada percobaan sebelumnya.*/

/*6. Modifikasi kode program pada pertanyaan 5 untuk menampilkan panjang setiap baris pada array menggunakan foreach loop. Compile, run, 
lalu amati hasilnya. */
/*Jawaban: Setelah dimodifikasi menggunakan perulangan foreach, program tetap menampilkan panjang masing-masing baris, dan seluruh baris 
memiliki panjang dua. Perbedaannya adalah proses iterasi menjadi lebih sederhana karena foreach langsung mengambil setiap baris array 
tanpa menggunakan indeks. Hasil ini menunjukkan bahwa foreach merupakan cara yang lebih ringkas dan efektif untuk membaca isi array dua 
dimensi, terutama ketika tidak memerlukan akses indeks secara langsung. */

/*7. Tambahkan kode program untuk menampilkan nama penonton pada baris ke-3 menggunakan for loop. Compile, run, lalu amati hasilnya.*/
/*Jawaban: Program menampilkan seluruh elemen pada baris ketiga, yaitu elemen yang berada pada indeks ke-2. Baris tersebut berisi nama 
“Eka” dan “Farhan”. Hasil ini menunjukkan bahwa program berhasil mengakses satu baris tertentu dari array dua dimensi dan menampilkan 
semua elemen dalam baris tersebut menggunakan perulangan for. Penampilan data sesuai dengan isi array menandakan bahwa akses indeks 
pada array dua dimensi sudah berjalan dengan benar*/

/*8. Modifikasi kode program pada pertanyaan 7 menjadi perulangan dengan foreach loop. Compile, run, lalu lakukan amati hasilnya */
/*Jawaban: Hasil yang ditampilkan tetap berupa nama “Eka” dan “Farhan”, sesuai isi baris ketiga. Meskipun hasilnya sama dengan percobaan sebelumnya, 
penggunaan foreach membuat proses pengambilan data lebih sederhana karena tidak perlu menyebutkan indeks secara eksplisit. Hal ini menunjukkan bahwa 
foreach dapat digunakan sebagai alternatif perulangan yang lebih ringkas ketika hanya ingin membaca seluruh elemen 
dalam satu baris tanpa memerlukan akses indeks.*/

/*9. Modifikasi kembali kode program pada langkah 11 untuk menampilkan nama penonton untuk setiap baris. Compile dan run program kemudian amati hasilnya.*/
/*Jawaban:  Program menampilkan seluruh nama penonton pada setiap baris menggunakan metode String.join(). Setiap baris ditampilkan dalam satu kalimat yang rapi, 
misalnya “Amin, Bena” atau “Gisel, Hana”. Hasil ini lebih mudah dibaca dibandingkan menampilkan elemen per baris secara terpisah menggunakan perulangan. 
Penggunaan String.join() membuktikan bahwa metode ini efektif untuk menggabungkan elemen-elemen dalam array menjadi satu string yang lebih terstruktur dan jelas.*/

/*10. Menurut Anda, apa kekurangan dan kelebihan foreach loop dibandingkan dengan for loop?  */
/*Jawaban: Foreach loop memiliki kelebihan berupa sintaks yang lebih sederhana dan mudah dibaca, sehingga cocok digunakan ketika hanya ingin mengambil nilai dari 
setiap elemen tanpa perlu mengetahui posisi indeksnya. Namun, foreach loop memiliki kekurangan karena tidak mengizinkan mengakses indeks secara langsung. Artinya, 
ketika kita membutuhkan nomor baris atau ingin mengubah nilai tertentu pada indeks tertentu, foreach menjadi kurang fleksibel dibandingkan for loop. */

/*11. Berapa indeks baris maksimal untuk array penonton? */
/*Jawaban: Array penonton memiliki empat baris, sehingga indeks baris maksimalnya adalah 3, karena indeks array selalu dimulai dari 0. Jadi, baris keempat berada 
pada indeks 3.*/

/*12.  Berapa indeks kolom maksimal untuk array penonton? */
/*Jawaban: Setiap baris pada array penonton memiliki dua kolom, sehingga indeks kolom maksimal adalah 1, karena indeks dimulai dari 0. Dengan kata lain, elemen 
kolom kedua berada pada indeks 1.*/

/*13.  Apa fungsi dari String.join()? */
/*Jawaban: Fungsi String.join() adalah menggabungkan beberapa elemen string menjadi satu string utuh dengan menggunakan pemisah tertentu, seperti koma atau spasi. 
Pada program array dua dimensi, metode ini digunakan untuk menampilkan seluruh elemen dalam satu baris secara rapi dan mudah dibaca, tidak perlu mencetak elemen 
satu per satu menggunakan perulangan. */