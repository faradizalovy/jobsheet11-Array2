import java.util.Scanner;

public class Siakad09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] nilai = new int[4][3];

    for (int i = 0; i < nilai.length; i++) {
    System.out.println("Input nilai mahasiswa ke-" + (i+1));

    for (int j = 0; j < nilai[i].length; j++) {
        System.out.print("Nilai mata kuliah " + (j+1) + ": ");
        nilai[i][j] = sc.nextInt();
    }
    System.out.println();
    }
    System.out.println("\n==========================================");
    System.out.println("Rata-rata nilai setiap siswa");
    System.out.println("\n==========================================");

    for (int i = 0; i < nilai.length; i++) {
        double totalPerSiswa = 0;

    for (int j = 0; j < nilai[i].length; j++) {
        totalPerSiswa += nilai[i][j];
    }
    double rata = totalPerSiswa / 3;
    System.out.println("Nilai rata-rata mahasiswa ke-" + (i+1) + ": " +rata);
    }
    System.out.println("\n===========================================");
    System.out.println("Rata-rata Nilai Setiap Mata Kuliah");
    System.out.println("\n===========================================");

    for (int j = 0; j < 3; j++) {
        double totalPerMatkul = 0;

    for (int i = 0; i < 4; i++) {
        totalPerMatkul += nilai[i][j];
    }
    double rataMatkul = totalPerMatkul / 4;
    System.out.println("Mata Kuliah " + (j+1) + ": " + rataMatkul);
}
}
}

