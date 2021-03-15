import java.util.Scanner;
import java.util.ArrayList;

class Mobil2 {
    String warnaMobil,tahun;

}
public class main {
    public static void main(String[] args) {
        int a = 0;
        Scanner input = new Scanner(System.in);
        ArrayList Warna = new ArrayList();
        ArrayList TahunProduksi = new ArrayList();
        Mobil2 mobil = new Mobil2();

        while (true){
            System.out.println("1. Tambah mobil");
            System.out.println("2. Garasi");
            System.out.println("3. Pakai mobil");
            System.out.print("-> ");
            String choose = input.next();
            switch (choose){
                case "1":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    System.out.print("Warna mobil : ");
                    mobil.warnaMobil = input.next();
                    System.out.print("Tahun produksi : ");
                    mobil.tahun = input.next();

                    Warna.add(mobil.warnaMobil);
                    TahunProduksi.add(mobil.tahun);
                    break;
                case "2":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    if (Warna.size() == 0){
                        System.out.println("Tidak ada mobil di garasi");
                        System.out.println();
                        break;
                    }else {
                        System.out.println("           GARASI");
                        System.out.println("Warna mobil\t" +Warna);
                        System.out.println("Tahun Produksi\t" +TahunProduksi);
                        System.out.println("------------------------");
                        break;
                    }
                case "3":
                    System.out.print("\033[H\033[2J");
                    System.out.flush();

                    if (Warna.size() == 0){
                        System.out.println("Anda tidak memiliki mobil");
                        System.out.println();
                        break;
                    }else {
                        boolean b = true;
                        while(b){
                            if (a == 0){
                                System.out.print("Hidupkan mesin : ");
                                String hidupkan = input.next();
                                if (Warna.contains(hidupkan)){
                                    a+=1;
                                    mobil.warnaMobil = hidupkan;
                                }else {
                                    a+=0;
                                }
                            }else if (a == 1){
                                System.out.print("Ubah gigi : ");
                                String hidupkan = input.next();
                                if (hidupkan.equals(mobil.warnaMobil)){
                                    a+=1;
                                }else {
                                    a+=0;
                                }
                            }else if (a == 2){
                                System.out.print("Matikan mesin : ");
                                String hidupkan = input.next();
                                if (hidupkan.equals(mobil.warnaMobil)){
                                    a*=0;
                                    b = false;
                                }else {
                                    a+=0;
                                }
                            }
                        }
                        break;
                    }
            }
        }
    }
}