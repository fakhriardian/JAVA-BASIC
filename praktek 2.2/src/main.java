import java.util.Scanner;

class dispenser{
    boolean mesin = false;

    public void HidupMatikan(){
        if (mesin == false){
            mesin = true;
        }else {
            mesin = false;
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        dispenser cosmos = new dispenser();
        while(true){
            System.out.println("Dispenser cosmos");
            System.out.println();
            System.out.print("Dispenser is ");
            if (cosmos.mesin == false){
                System.out.println("OFF");
            }else {
                System.out.println("ON");
            }
            System.out.println("0. ON/OFF");
            System.out.println("1. Normal");
            System.out.println("2. Heat");
            System.out.println("3. Cold");
            System.out.println("4. Water out");
            String pilih = masukan.next();
            switch (pilih){
                case "0":
                    cosmos.HidupMatikan();
                    break;
                case "1":
                    if (cosmos.mesin == false){
                        System.out.println("Hidupkan mesin terlebih dahulu");
                        break;
                    }else {
                        System.out.println("Tingkat panas & dingin normal");
                        System.out.println("Tekan no 4 mengeluarkan air");
                        break;
                    }
                case "2":
                    if (cosmos.mesin == false){
                        System.out.println("Hidupkan mesin terlebih dahulu");
                        break;
                    }else {
                        int suhu;
                        System.out.print("Input suhu panas : ");
                        suhu = masukan.nextInt();
                        System.out.println("Suhu di set ke : " +suhu);
                        System.out.println("Tekan no 4 untuk mengeluarkan air");
                        break;
                    }
            }
        }
    }
}