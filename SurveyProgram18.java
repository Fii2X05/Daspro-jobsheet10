import java.util.Scanner;

public class SurveyProgram18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] survey = new int[10][5];
        int total = 0;
        int count = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Input data untuk responden ke-" + (i + 1) + ":");
            for (int j = 0; j < 5; j++) {
                System.out.print("Pertanyaan ke-" + (j + 1) + ": ");
                survey[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nRata-rata nilai per responden:");
        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 5; j++) {
                sum += survey[i][j];
            }
            double rataRataResponden = (double) sum / 5;
            System.out.println("Responden ke-" + (i + 1) + ": " + rataRataResponden);
        }

        System.out.println("\nRata-rata nilai per pertanyaan:");
        for (int j = 0; j < 5; j++) {
            int sum = 0;
            for (int i = 0; i < 10; i++) {
                sum += survey[i][j];
            }
            double rataRataPertanyaan = (double) sum / 10;
            System.out.println("Pertanyaan ke-" + (j + 1) + ": " + rataRataPertanyaan);
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                total += survey[i][j];
                if (survey[i][j] >= 60) {
                    count++;
                }
            }
        }

        double rataRataKeseluruhan = (double) total / (10 * 5);
        System.out.println("\nRata-rata keseluruhan nilai: " + rataRataKeseluruhan);
        System.out.println("Jumlah nilai >= 60: " + count);

        sc.close();
    }
}
