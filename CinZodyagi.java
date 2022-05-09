import java.util.Scanner;
public class CinZodyagi {

    public static void main (String[]args){
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Dogum yilinizi giriniz: ");
        int yil = keyboard.nextInt();

        System.out.print("Cin zodyagi burcunuz: ");
        yil%=12;
        switch(yil){
            case 0:
                System.out.println("Maymun");
            case 1:
                System.out.println("Horoz");
            case 2:
                System.out.println("Köpek");
            case 3:
                System.out.println("Domuz");
            case 4:
                System.out.println("Fare");
            case 5:
                System.out.println("Öküz");
            case 6:
                System.out.println("Kaplan");
            case 7:
                System.out.println("Tavşan");
            case 8:
                System.out.println("Ejderha");
            case 9:
                System.out.println("Yilan");
            case 10:
                System.out.println("At");
            case 11:
                System.out.println("Koyun");
            default:
                System.out.println("hata!!");
        }
    }

}
