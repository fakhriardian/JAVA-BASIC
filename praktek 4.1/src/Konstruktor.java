import java.util.Scanner;

class konversiWaktu{
    int Detik, day = 86400, hour = 3600, minute = 60;

    public int dayConvertion(){
        return Detik / day;
//        2
    }
    public int dayConvertion2(){
        return dayConvertion() * day;
//        172800
    }
    public int dayConvertion3(){
        return Detik - dayConvertion2();
//        67261
    }
    public int hourConvertion(){
        return dayConvertion3() / hour;
//        18
    }
    public int hourConvertion2(){
        return hourConvertion() * hour;
//        64800
    }
    public int hourConvertion3(){
        return dayConvertion3() - hourConvertion2();
//        2461
    }
    public int minuteConvertion(){
        return hourConvertion3() / minute;
//        41
    }
    public int minuteConvertion2(){
        return minuteConvertion() * minute;
//        2460
    }
    public int minuteConvertion3(){
        return hourConvertion3() - minuteConvertion2();
    }
}

public class Konstruktor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        konversiWaktu waktu = new konversiWaktu();

        System.out.print("Detik\t : ");
        waktu.Detik = input.nextInt();

        System.out.print("Hari\t : ");
        System.out.println(waktu.dayConvertion());
        System.out.print("Jam\t\t : ");
        System.out.println(waktu.hourConvertion());
        System.out.print("Menit\t : ");
        System.out.println(waktu.minuteConvertion());
        System.out.print("Detik\t : ");
        System.out.println(waktu.minuteConvertion3());
    }
}
