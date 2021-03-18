import java.util.Scanner;
import java.util.ArrayList;

class Mahasiswa{
    private String Nama, Nim, Matkul;

    public void setNama(String Nama){
        this.Nama = Nama;
    }
    public void setNim(String Nim){
        this.Nim = Nim;
    }
    public void setMatkul(String Matkul){
        this.Matkul = Matkul;
    }
    public String getNama(){
        return this.Nama;
    }
    public String getNim(){
        return this.Nim;
    }
    public String getMatkul(){
        return this.Matkul;
    }
}

public class main {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Scanner input = new Scanner(System.in);
        ArrayList NamaMhs = new ArrayList();
        ArrayList NimMhs = new ArrayList();

        System.out.print("Jumlah mahasiswa : ");
        int jmlMhs = input.nextInt();
        for (int awalMhs = 1; awalMhs <= jmlMhs; awalMhs++){
            System.out.print("Nama : ");
            mhs.setNama(input.next());
            System.out.print("NIM : ");
            mhs.setNim(input.next());

            NamaMhs.add(mhs.getNama());
            NimMhs.add((mhs.getNim()));
            System.out.println("Matakuliah");
            System.out.println("1. Otomata & Teori Bahasa");
            System.out.println("2. Pemprograman Beorientasi Objek");
            System.out.println("3. Basis Data");
            System.out.println("4. Rekayasa Perangkat Lunak");
            System.out.println("5. Logika Informatika");
            System.out.println("6. Pemprograman Web Lanjut");
            System.out.println("7. Sistem Operasi");
            System.out.println("8. Kriptografi");

            System.out.print("Input jumlah matakuliah : ");
            int jmlMatkul = input.nextInt();
            for (int awalMatkul = 1; awalMatkul <= jmlMatkul; awalMatkul++){
                System.out.print("Input nomor matakuliah : ");
                String choose = input.next();
                switch (choose){
                    case "1":
                        System.out.println("Otomata & Teori Bahasa");
                        break;
                    case "2":
                        System.out.println("Pemprograman Beorientasi Objek");
                        break;
                    case "3":
                        System.out.println("Basis Data");
                        break;
                    case "4":
                        System.out.println("Rekayasa Perangkat Lunak");
                        break;
                    case "5":
                        System.out.println("Logika Informatika");
                        break;
                    case "6":
                        System.out.println();
                        break;
                }
                System.out.println(NamaMhs);
            }
            System.out.println("Input berhasil disimpan");

        }
    }
}