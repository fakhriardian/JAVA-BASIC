import java.util.Scanner;

class nilai {
    private Float nilaiuts, nilaitugas, nilaiuas;
    Float aNilaiuts = 0.2f, aNilaitugas = 0.35f, aNilaiuas = 0.45f;

    public void setNilaiuts(Float nilaiuts){
        this.nilaiuts = nilaiuts;
    }

    public void setNilaitugas(Float nilaitugas) {
        this.nilaitugas = nilaitugas;
    }

    public void setNilaiuas(Float nilaiuas) {
        this.nilaiuas = nilaiuas;
    }

    public Float getNilaiuts() {
        return this.nilaiuts;
    }

    public Float getNilaitugas() {
        return this.nilaitugas;
    }

    public Float getNilaiuas() {
        return this.nilaiuas;
    }

    public void inputnilai() {
        Scanner inputan = new Scanner(System.in);
        System.out.print("Nilai UTS anda : ");
        setNilaiuts(inputan.nextFloat());
        System.out.print("Nilai Tugas anda : ");
        setNilaitugas(inputan.nextFloat());
        System.out.print("Nilai UAS anda : ");
        setNilaiuas(inputan.nextFloat());

    }

    public void hitung() {
        float hasilakhir = nilaiuts * aNilaiuts + nilaitugas * aNilaitugas + nilaiuas * aNilaiuas;
        System.out.println(" Nilai Akhir anda : " + hasilakhir);
    }
}
public class main {
    public static void main(String[] args) {
        nilai inputannilai = new nilai();
        String nim,nama;
        Scanner inputan = new Scanner(System.in);
        System.out.print("Masukan NIM Mahasiswa anda : ");
        nim = inputan.next();
        System.out.print("Masukan Nama Mahasiswa anda : ");
        nama = inputan.next();
        nama+=inputan.nextLine();

        inputannilai.inputnilai();
        System.out.println("");
        System.out.println("____ Inilah Hasil Nilai Yang dapat Peroleh Mahasiswa ____");
        System.out.println("");
        System.out.println(" Nim >> "+nim);
        System.out.println(" Nama >> "+nama);
        System.out.println(" Nilai UTS >> "+inputannilai.getNilaiuts()+"\t20%\t"+ "\t>>\t"+inputannilai.getNilaiuts()*inputannilai.aNilaiuts);

        System.out.println(" Nilai Tugas >> "+inputannilai.getNilaitugas()+"\t35%\t"+ "\t>>\t"+inputannilai.getNilaitugas()*inputannilai.aNilaitugas);
        System.out.println(" Nilai UAS >> "+inputannilai.getNilaiuas()+"\t45%\t"+ "\t>>\t"+inputannilai.getNilaiuas()*inputannilai.aNilaiuas);
        inputannilai.hitung();
    }
}