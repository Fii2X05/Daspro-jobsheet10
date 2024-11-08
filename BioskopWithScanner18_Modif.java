import java.util.Scanner;

public class BioskopWithScanner18_Modif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] penonton = new String[4][2];
        int pilihan;

        while (true) {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();  

            switch (pilihan) {
                case 1:
                    String nama;
                    int baris, kolom;
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.nextLine();

                        System.out.print("Masukkan baris (1-4): ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom (1-2): ");
                        kolom = sc.nextInt();
                        sc.nextLine(); 

                        if (baris < 1 || baris > 4 || kolom < 1 || kolom > 2) {
                            System.out.println("Nomor baris atau kolom tidak tersedia. Coba lagi.");
                            continue;
                        }

                       
                        if (penonton[baris - 1][kolom - 1] != null) {
                            System.out.println("Kursi ini sudah terisi oleh " + penonton[baris - 1][kolom - 1] + ". Silakan pilih kursi lain.");
                        } else {
                           
                            penonton[baris - 1][kolom - 1] = nama;
                            System.out.println("Data penonton berhasil dimasukkan.");
                        }

                        System.out.print("Input penonton lainnya? (y/n): ");
                        String next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                        }
                    }
                    break;

                case 2:
                    
                    System.out.println("\n=== Daftar Penonton ===");
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[i].length; j++) {
                           
                            String output = (penonton[i][j] == null) ? "***" : penonton[i][j];
                            System.out.printf("Baris %d, Kolom %d: %s\n", i + 1, j + 1, output);
                        }
                    }
                    break;

                case 3:
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih menu yang tersedia.");
            }
        }
    }
}
