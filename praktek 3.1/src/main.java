//Fakhri Ardian Rafi
//A11.2019.11848

import java.util.Scanner;

class matematika{
    float angka1, angka2 ,bagi, tambah, kurang, kali;

    public void pertambahan(){
        tambah = angka1 + angka2;
    }
    public void pengurangan(){
        kurang = angka1 - angka2;
    }
    public void perkalian(){
        kali = angka1 * angka2;
    }
    public void pembagian(){
        bagi = angka1 / angka2;
    }
    public void next(){
        Scanner enter = new Scanner(System.in);
        System.out.print("--ENTER--");
        String next = enter.nextLine();
    }
}

public class main {
    public static void main(String[] args) {
        matematika kalkulator = new matematika();
        Scanner input = new Scanner(System.in);

        while (true){
//          clear console terminal
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Kalkulator");
            System.out.println("1. Pertambahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.print("-> ");
            String choose = input.next();
            switch (choose){
                case "1":
                    System.out.println("Pertambahan");
                    System.out.print("Input ");
                    kalkulator.angka1 = input.nextInt();
                    System.out.print("Input ");
                    kalkulator.angka2 = input.nextInt();
                    kalkulator.pertambahan();
                    System.out.println(+kalkulator.angka1+" + "+kalkulator.angka2+" = "+ kalkulator.tambah);
                    kalkulator.next();
                    break;
                case "2":
                    System.out.println("Pengurangan");
                    System.out.print("Input ");
                    kalkulator.angka1 = input.nextInt();
                    System.out.print("Input ");
                    kalkulator.angka2 = input.nextInt();
                    kalkulator.pengurangan();
                    System.out.println(+kalkulator.angka1+" - "+ kalkulator.angka2+" = "+ kalkulator.kurang);
                    kalkulator.next();
                    break;
                case "3":
                    System.out.println("Perkalian");
                    System.out.print("Input ");
                    kalkulator.angka1 = input.nextInt();
                    System.out.print("Input ");
                    kalkulator.angka2 = input.nextInt();
                    kalkulator.perkalian();
                    System.out.println(+kalkulator.angka1+" X "+ kalkulator.angka2+" = "+ kalkulator.kali);
                    kalkulator.next();
                    break;
                case "4":
                    System.out.println("Pembagian");
                    System.out.print("Input ");
                    kalkulator.angka1 = input.nextInt();
                    System.out.print("Input ");
                    kalkulator.angka2 = input.nextInt();
                    kalkulator.pembagian();
                    System.out.println(+kalkulator.angka1+" : "+ kalkulator.angka2+" = "+ kalkulator.bagi);
                    kalkulator.next();
                    break;
            }
        }
    }
}
