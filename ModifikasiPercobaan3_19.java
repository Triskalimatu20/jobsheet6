import java.util.Scanner;

public class ModifikasiPercobaan3_19 {
    public static void main(String[] args) {
        Scanner input19 = new Scanner(System.in);
        String kategori;
        int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.print("Masukkan kategori : ");
        kategori = input19.nextLine();
        System.out.print("Masukkan Besarnya Penghasilan : ");
        penghasilan = input19.nextInt();

        if (kategori.equals("pekerja")) {
            if (penghasilan <= 20000000)
            pajak = 0.1;
            else if (penghasilan <= 30000000)
            pajak = 0.15;
            else
            pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("Penghasilan Bersih : " + gajiBersih);
        }else if (kategori.equals("pebisnis")) {
            if (penghasilan <= 25000000)
            pajak = 0.15;
            else if (penghasilan <= 35000000)
            pajak = 0.2;
            else
            pajak = 0.25;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.print("penghasil Bersih : " + gajiBersih);
        } else
            System.out.println("Masukkan Kategori salah");
    }
    
}