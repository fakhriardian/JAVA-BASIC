//Fakhri Ardian Rafi
//A11.2019.11848

import java.util.Scanner;

class konversiSuhu{
    float celcius, kelvin, fahrenheit, rankine, delisle, newton, reaumur, romer;

    public void suhuKelvin(){
        kelvin = celcius + 273.15f;
    }
    public void suhuFahrenheit(){
        fahrenheit = celcius * 1.8f + 32;
    }
    public void suhuRankine(){
        rankine = celcius * 1.8f + 491.67f;
    }
    public void suhuDelisle(){
        delisle = (100 - celcius) * 1.5f;
    }
    public void suhuNewton(){
        newton = celcius * 33 / 100;
    }
    public void suhuReaumur(){
        reaumur = celcius * 0.8f;
    }
    public void suhuRomer(){
        romer = celcius * 21 / 40 + 7.5f;
    }
    public void next(){
        Scanner enter = new Scanner(System.in);
        System.out.print("-- Enter --");
        String Enter = enter.nextLine();
    }
}

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        konversiSuhu suhu = new konversiSuhu();

        while(true){
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("Konversi suhu");
            System.out.println("1. Celcius --> Kelvin");
            System.out.println("2. Celcius --> Fahrenheit");
            System.out.println("3. Celcius --> Rankine");
            System.out.println("4. Celcius --> Delisle");
            System.out.println("5. Celcius --> Newton");
            System.out.println("6. Celcius --> Reaumur");
            System.out.println("7. Celcius --> Romer");
            System.out.print("-> ");
            String choose = input.next();
            switch (choose){
                case "1":
                    System.out.print("Input suhu ");
                    suhu.celcius = input.nextFloat();
                    suhu.suhuKelvin();
                    System.out.println(suhu.celcius+"°C --> "+suhu.kelvin+" K");
                    suhu.next();
                    break;
                case "2":
                    System.out.print("Input suhu ");
                    suhu.celcius = input.nextFloat();
                    suhu.suhuFahrenheit();
                    System.out.println(suhu.celcius+"°C --> "+suhu.fahrenheit+" °F");
                    suhu.next();
                    break;
                case "3":
                    System.out.print("Input suhu ");
                    suhu.celcius = input.nextFloat();
                    suhu.suhuRankine();
                    System.out.println(suhu.celcius+"°C --> " +suhu.rankine+" °Ra");
                    suhu.next();
                    break;
                case "4":
                    System.out.print("Input suhu ");
                    suhu.celcius = input.nextFloat();
                    suhu.suhuDelisle();
                    System.out.println(suhu.celcius+"°C --> "+ suhu.delisle+" °De");
                    suhu.next();
                    break;
                case "5":
                    System.out.print("Input suhu ");
                    suhu.celcius = input.nextFloat();
                    suhu.suhuNewton();
                    System.out.println(suhu.celcius+"°C --> "+ suhu.newton+" °N");
                    suhu.next();
                    break;
                case "6":
                    System.out.print("Input suhu ");
                    suhu.celcius = input.nextFloat();
                    suhu.suhuReaumur();
                    System.out.println(suhu.celcius+"°C --> "+suhu.reaumur+"° Re");
                    suhu.next();
                    break;
                case "7":
                    System.out.print("Input suhu ");
                    suhu.celcius = input.nextFloat();
                    suhu.suhuRomer();
                    System.out.println(suhu.celcius+"°C --> "+suhu.romer+" °Rø");
                    suhu.next();
                    break;
            }
        }
    }
}
