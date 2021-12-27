import java.util.Random;
import java.util.Scanner;

public class Gun {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int scan;
        int rand = random.nextInt(7);
        boolean win = false;

        for (int i = 1; i<7;i++) {
            if (i==1) System.out.println("Револьвер заряжен одним патроном, Вы готовы сделать выстрел? 1 - Да/0 - Нет");
            scan = sc.nextInt();
            if(scan==1) {
                win = false;
            } else if(scan == 0) {
                System.out.println("Трус но живой");
                break;
            }
        if(i != rand) {
            System.out.println("Вы живы, поздравляю");
        } else if (i == rand) {
            System.out.println("Выстрел");
            System.out.println("Повторить игру? 1 - Да/0 - Нет");
            win = true;
            scan = sc.nextInt();

            if(scan == 1) {
                 i = 0;
                 win = false;
                 rand = random.nextInt(6);

            } else if (scan == 0) {
                System.out.println("Трус");
                break;
            }
        } if(i==0) {
                System.out.println("Вы везунчик ");
                System.out.println("Повторить игру? 1 - Да/0 - Нет");
                win = true;
                scan = sc.nextInt();

                if(scan == 1) {
                    i = 0;
                    win = false;
                    rand = random.nextInt(6);

                } else if (scan == 0) {
                    System.out.println("Трус");
                    break;
                }
            }
        }

    }
}
