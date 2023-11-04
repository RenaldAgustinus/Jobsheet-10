import java.util.Scanner;

public class BioskopWithScanner27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int baris, kolom, barisfull = -1, kolomfull = -1;
        String next, nama, menu;
        String[][] penonton = new String[4][2];

        do {
            System.out.println("Menu : 1. Input Data Penonton \n2. Tampilkan Data Penonton \n3. Exit");
            menu = input.nextLine();

            if (menu.equalsIgnoreCase("1")) {
                System.out.println("Input Data Penonton");
                input.nextLine();
                System.out.print("Masukkan nama : ");
                nama = input.nextLine();
                System.out.print("Masukkan baris : ");
                baris = input.nextInt();
                System.out.print("Masukkan kolom : ");
                kolom = input.nextInt();

                while (barisfull == baris && kolomfull == kolom) {
                    System.out.println("Kursi sudah diisi");
                    System.out.print("Masukkan baris : ");
                    baris = input.nextInt();
                    System.out.print("Masukkan kolom : ");
                    kolom = input.nextInt();
                }
                penonton[baris - 1][kolom - 1] = nama;
                barisfull = baris;
                kolomfull = kolom;

                System.out.println("Input Penonton Lainnya? (y/n): ");
                next = input.next();
                if (next.equalsIgnoreCase("n")) {
                    break;
                }
            }

            if (menu.equalsIgnoreCase("2")) {
                System.out.println("Daftar Penonton");
                for (int i = 0; i < penonton.length; i++) {
                    for (int x = 0; x < 2; x++) {
                        if (penonton[i][x] == null) {
                            penonton[i][x] = "**";
                        }
                    }
                    System.out.println("penonton dalam baris ke-" + (i + 1) + ":" + String.join(",", penonton[i]));
                }
            }

        } while (!(menu.equalsIgnoreCase("3")));
        input.close();
    }
}
