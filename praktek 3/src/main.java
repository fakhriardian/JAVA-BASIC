import java.util.Scanner;

class tv{
    boolean power = false;
    int channel = 1, volume = 0;

    public void turnOnOff(){
        if (power == true){
            power = false;
        }else {
            power = true;
        }
    }
    public void channelUp(){
        channel +=1;
    }
    public void channelDown(){
        channel -=1;
    }
    public void volumeUp(){
        volume +=1;
    }
    public void volumeDown(){
        volume -=1;
    }
    public void setChannel(int newChannel){
        channel = newChannel;
    }
    public void setVolume(int newVolume){
        volume = newVolume;
    }
    public void next(){
        System.out.print("--ENTER--");
        Scanner next = new Scanner(System.in);
        String enter = next.nextLine();
    }
}

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        tv remote = new tv();
        while (true){
            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("-------------------------------");
            System.out.print("TV is ");
            if (remote.power == true){
                System.out.println("ON");
                System.out.print("Now watching ");
                if (remote.channel == 1){
                    System.out.println("TVRI");
                }else if (remote.channel == 2){
                    System.out.println("TVKU");
                }else if (remote.channel == 3){
                    System.out.println("ANTV");
                }else if (remote.channel == 4){
                    System.out.println("Indosiar");
                }else if (remote.channel == 5){
                    System.out.println("TransTV");
                }else if (remote.channel == 6){
                    System.out.println("MNCTV");
                }else if (remote.channel == 7){
                    System.out.println("RCTI");
                }else if (remote.channel == 8){
                    System.out.println("SCTV");
                }else if (remote.channel == 9){
                    System.out.println("GlobalTV");
                }
                if (remote.volume == 0){
                    System.out.println("Volume Mute");
                }else {
                    System.out.println("Volume " +remote.volume);
                }
                System.out.println("-------------------------------");

                System.out.println("1. Power");
                System.out.print("2. Channel +\t5. ");
                System.out.println("Volume + ");
                System.out.print("3. Channel -\t6. ");
                System.out.println("Volume -");
                System.out.print("4. Input Ch\t7. ");
                System.out.println("Input Vol");

                System.out.print("-> ");
                String choose = input.next();
                switch (choose){
                    case "1":
                        remote.turnOnOff();
                        break;
                    case "2":
                        if (remote.channel == 9){
                            remote.channel = 1;
                        }else {
                            remote.channelUp();
                        }
                        break;
                    case "3":
                        if (remote.channel == 1){
                            remote.channel = 9;
                        }else {
                            remote.channelDown();
                        }
                        break;
                    case "4":
                        System.out.print("input channel : ");
                        int numberCh = input.nextInt();
                        if (numberCh > 9){
                            System.out.println("Channel " +numberCh+ " no signal");
                            remote.next();
                            break;
                        } else {
                            remote.setChannel(numberCh);
                        }
                        break;
                    case "5":
                        if (remote.volume == 10){
                            System.out.println("Max volume");
                        }else {
                            remote.volumeUp();
                        }
                        break;
                    case "6":
                        if (remote.volume == 0){
                            System.out.println("Mute");
                        }else {
                            remote.volumeDown();
                        }
                        break;
                    case "7":
                        System.out.print("Input volume : ");
                        int numberVol = input.nextInt();
                        if (numberVol > 10){
                            System.out.println("Max volume");
                            remote.next();
                            break;
                        } else {
                            remote.setVolume(numberVol);
                        }
                        break;
                }
            }else {
                System.out.println("OFF");
                System.out.println("1. Power");
                System.out.print("-> ");
                String choose = input.next();
                switch (choose){
                    case "1":
                        remote.turnOnOff();
                }
            }
        }
    }
}