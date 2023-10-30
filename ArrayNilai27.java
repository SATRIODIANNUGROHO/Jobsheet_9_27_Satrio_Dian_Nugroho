import java.util.Scanner;

public class ArrayNilai27 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int[] nilaiAkhir = new int[10];
    

    for (int i = 0; i < 10; i++) {
        System.out.print("Masukkan Nilai Akhir Ke-"+i+" : ");
        nilaiAkhir[i] = sc.nextInt();

    }

            for (int i = 0; i < nilaiAkhir.length; i++) {
                if (nilaiAkhir[i] > 70) {
                    System.out.println("Mahasiswa Ke-"+i+" Lulus");
                }else {
                    System.out.println("Mahasiswa Ke-"+i+" Tidak Lulus");
                }
            
        }
    
    }
}
