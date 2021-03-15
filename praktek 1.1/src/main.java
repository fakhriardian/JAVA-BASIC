import java.util.Scanner;

class tv{
    boolean machine = false;
    int channel = 0, volume = 0, bright = 5;
    String picture = "Standard", sound = "Standard";

    public void OnOff(){
        if (machine == false){
            machine = true;
        }else{
            machine = false;
        }
    }
    public void channelUp(){
        channel += 1;
    }
    public void channelDown(){
        channel -= 1;
    }
    public void volumeUp(){
        volume += 1;
    }
    public void volumeDown(){
        volume -= 1;
    }
    public void brightUp(){
        bright += 1;
    }
    public void brigthDown(){
        bright -= 1;
    }
    public void pictureUp(int encoder){
        if (encoder == 1){
            picture = "Standard";
        }else if(encoder == 2){
            picture = "Vivid";
        }else if(encoder == 3){
            picture = "Movie";
        }
    }
    public void soundUp(int encoder){
        if (encoder == 1){
            sound = "Standard";
        }else if (encoder == 2){
            sound = "Music";
        }else if (encoder == 3){
            sound = "Movie";
        }
    }
}

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tv samsung = new tv();

        int run = 1;
        while(run == 1){

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("-----------------------");
            System.out.println("|       SAMSUNG       |");
            System.out.println("-----------------------");
            System.out.print("Tv turns ");
            if (samsung.machine == true){
                System.out.println("ON");
                System.out.print("Now watching ");
                if (samsung.channel == 0){
                    System.out.println("Tvku");
                }else if (samsung.channel == 1){
                    System.out.println("ANTV");
                }else if (samsung.channel == 2){
                    System.out.println("Indosiar");
                }else if (samsung.channel == 3){
                    System.out.println("Trans TV");
                }else if (samsung.channel == 4){
                    System.out.println("MNC TV");
                }else if (samsung.channel == 5){
                    System.out.println("RCTI");
                }
                System.out.println("Volume " +samsung.volume +" | Brightness " +samsung.bright);
                System.out.println("Picture mode " +samsung.picture);
                System.out.println("Sound mode " +samsung.sound);

                System.out.println("-----------------------");
                System.out.println("1. Power On/Off");
                System.out.println("2. Channel Up");
                System.out.println("3. Channel Down");
                System.out.println("4. Volume Up");
                System.out.println("5. Volume Down");
                System.out.println("6. Option");
                System.out.print("-> ");
                String choose = input.next();
                switch (choose){
                    case "1":
                        samsung.OnOff();
                        break;
                    case "2":
                        if (samsung.channel == 5){
                            samsung.channel = 0;
                        }else {
                            samsung.channelUp();
                        }
                        break;
                    case "3":
                        if (samsung.channel == 0){
                            samsung.channel = 5;
                        }else{
                            samsung.channelDown();
                        }
                        break;
                    case "4":
                        if (samsung.volume == 100) {
                            System.out.println("Max Volume");
                        }
                        else {
                            samsung.volumeUp();
                        }
                        break;
                    case "5":
                        if (samsung.volume == 0){
                            System.out.println("Mute");
                        }else{
                            samsung.volumeDown();
                        }
                        break;
                    case "6":
                        System.out.print("\033[H\033[2J");
                        System.out.flush();

                        System.out.println("Option");
                        System.out.println("1. Brightness");
                        System.out.println("2. Picture mode");
                        System.out.println("3. Sound mode");
                        System.out.print("-> ");

                        choose = input.next();
                        switch (choose){
                            case "1":
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                System.out.println("Brightness level " +samsung.bright);
                                System.out.println("1. +");
                                System.out.println("2. -");
                                System.out.print("-> ");

                                choose = input.next();
                                switch (choose){
                                    case "1":
                                        if (samsung.bright == 10){
                                            System.out.println("Max brightness");
                                            break;
                                        }else {
                                            samsung.brightUp();
                                            break;
                                        }
                                    case "2":
                                        if (samsung.bright == 5){
                                            System.out.println("Min brightness");
                                            break;
                                        }else {
                                            samsung.brigthDown();
                                            break;
                                        }
                                }
                                break;
                            case "2":
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                System.out.println("Picture mode " +samsung.picture);
                                System.out.println("1. Standard");
                                System.out.println("2. Vivid");
                                System.out.println("3. Movie");
                                System.out.print("-> ");
                                choose = input.next();
                                switch (choose){
                                    case "1":
                                        samsung.pictureUp(Integer.parseInt(choose));
                                        break;
                                    case "2":
                                        samsung.pictureUp(Integer.parseInt(choose));
                                        break;
                                    case "3":
                                        samsung.pictureUp(Integer.parseInt(choose));
                                        break;
                                }
                                break;
                            case "3":
                                System.out.print("\033[H\033[2J");
                                System.out.flush();

                                System.out.println("Sound mode " +samsung.sound);
                                System.out.println("1. Standard");
                                System.out.println("2. Music");
                                System.out.println("3. Movie");
                                System.out.print("-> ");
                                choose = input.next();
                                switch (choose){
                                    case "1":
                                        samsung.soundUp(Integer.parseInt(choose));
                                    case "2":
                                        samsung.soundUp(Integer.parseInt(choose));
                                    case "3":
                                        samsung.soundUp(Integer.parseInt(choose));
                                }
                        }
                }
            }else{
                System.out.println("OFF");
                System.out.println("1. Power ON/OFF");
                System.out.print("-> ");
                String choose = input.next();

                switch (choose){
                    case "1":
                        samsung.OnOff();
                        break;
                }
            }
        }
    }
}