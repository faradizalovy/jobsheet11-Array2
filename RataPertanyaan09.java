public class RataPertanyaan09 {
    public static void main(String[] args) {
        int [][] survey = {
            {4,3,5,2,4,2},{3,3,4,4,5,2},{5,5,4,3,4,5},{2,3,3,4,2,3},{4,4,5,5,4,4},{3,2,3,4,3,3},{5,4,5,4,5,5},{3,3,4,2,3,3},{4,5,4,4,5,4},{3,3,2,3,4,3} };

        for(int j = 0; j < 6; j++) {
            int total = 0;
            for (int i = 0; i < 10; i++) {
                total += survey[i][j];
            }
            double rata = total / 10.0;
            System.out.println("Rata-rata pertanyaan " + (j + 1) + ": " +rata);
        }
    }
}
