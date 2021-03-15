import java.util.Scanner;

class daftarNilai{
    String nim, nama;
    float nilaiUts, nilaiTugas, nilaiUas, pNilaiTugas = 0.2f, pNilaiUts = 0.35f, pNilaiUas = 0.45f, nilaiAkhir;

    public void hitungNilai(){
        nilaiAkhir = nilaiTugas*pNilaiTugas + nilaiUts*pNilaiUts + nilaiUas*pNilaiUas;
    }
    public float cetakNilai(){
        return(nilaiAkhir);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        daftarNilai nilai = new daftarNilai();

        boolean a = true;
        int b = 1;
        while (a){
            if (b == 1){
                while (true){
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.print("NIM\t\t: ");
                    nilai.nim = input.next();
                    System.out.print("Nama\t\t: ");
                    nilai.nama = input.next();
                    nilai.nama += input.nextLine();
                    System.out.print("Nilai Tugas\t: ");
                    nilai.nilaiTugas = input.nextFloat();
                    System.out.print("Nilai Uts\t: ");
                    nilai.nilaiUts = input.nextFloat();
                    System.out.print("Nilai Uas\t: ");
                    nilai.nilaiUas = input.nextFloat();

                    System.out.println();
                    nilai.hitungNilai();

                    System.out.println("Nim\t\t: " +nilai.nim);
                    System.out.println("Nama\t\t: "+nilai.nama);
                    System.out.println("Nilai Tugas\t: " +nilai.nilaiTugas+" 20%   : " +nilai.nilaiTugas*nilai.pNilaiTugas);
                    System.out.println("Nilai Uts\t: " +nilai.nilaiUts+" 35%   : " +nilai.nilaiUts*nilai.pNilaiUts);
                    System.out.println("Nilai Uas\t: " +nilai.nilaiUas+" 45%   : " +nilai.nilaiUas*nilai.pNilaiUas);
                    System.out.println("Nilai Akhir\t: " +nilai.cetakNilai());

                    System.out.println("Input nilai lagi? y/n");
                    System.out.print("-> ");
                    String ulang = input.next();
                    if (ulang.equalsIgnoreCase("y")){
                        b -= 0;
                    }else {
                        System.exit(0);
                    }
                }
            }
        }
    }
}