public class HitungNilai27 {

  public static void main(String[] args) {
    // Input
    int banyakElemen = Integer.parseInt(
        System.console().readLine("Masukkan banyak elemen: "));
    int[] angka = new int[banyakElemen];
    for (int i = 0; i < banyakElemen; i++) {
      angka[i] = Integer.parseInt(
          System.console().readLine("Masukkan elemen ke-" + (i + 1) + ": "));
    }

    // Output
    int nilaiTertinggi = angka[0];
    int nilaiTerendah = angka[0];
    double nilaiRataRata = 0.0;
    for (int i = 1; i < banyakElemen; i++) {
      if (angka[i] > nilaiTertinggi) {
        nilaiTertinggi = angka[i];
      }
      if (angka[i] < nilaiTerendah) {
        nilaiTerendah = angka[i];
      }
      nilaiRataRata += angka[i];
    }
    System.out.println("Nilai tertinggi: " + nilaiTertinggi);
    System.out.println("Nilai terendah: " + nilaiTerendah);
    System.out.println("Nilai rata-rata: " + nilaiRataRata / banyakElemen);
  }
}
