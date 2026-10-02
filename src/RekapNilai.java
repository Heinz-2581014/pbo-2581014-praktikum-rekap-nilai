import java.util.Scanner;
import java.util.Locale;

public class RekapNilai {

    static final int SELESAI = -1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlah = 0;
        double total = 0;
        int nilai;

        System.out.println("====Rekap Nilai====");
        System.out.println("Ketik -1 kalau sudah selesai");

        do {
            System.out.print("Nilai ke-" + (jumlah + 1) + " : ");
            nilai = scanner.nextInt();

            if (nilai == SELESAI) {
                continue; // lompat ke kondisi while, loop nya berhenti
            }

            if (nilai < 0 || nilai > 100) {
                System.out.println("  ditolak — nilai harus 0-100");
                continue;
            }

            char grade;
            if (nilai >= 90) {
                grade = 'A';
            } else if (nilai >= 80) {
                grade = 'B';
            } else if (nilai >= 70) {
                grade = 'C';
            } else if (nilai >= 60) {
                grade = 'D';
            } else {
                grade = 'E';
            }

            String keterangan = switch (grade) {
                case 'A' -> "Sangat Baik";
                case 'B' -> "Baik";
                case 'C' -> "Cukup";
                case 'D' -> "Kurang";
                default -> "Tidak Lulus";

            };

            System.out.println("  Grade " + grade + " — " + keterangan);

            total += nilai;
            jumlah++;

        } while (nilai != SELESAI);

    }
            System.out.close();

    }
}