import java.util.Scanner;

public class HasilSurvey09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] survey = new int [10][6];
        int i,j;

        for (i = 0; i < 10; i++) {
            for (j = 0; j < 6; j++) {
                survey[i][j] = 3;
            }
        }
    }
}
