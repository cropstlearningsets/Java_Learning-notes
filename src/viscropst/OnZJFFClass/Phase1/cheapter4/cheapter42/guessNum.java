package cheapter42;

import java.util.Random;

public class guessNum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Random rand = new Random();
        int random = rand.nextInt(99);//(int)(Math.random()*10);
        System.out.print("请输入你要猜的数：");
        int usrcode = scanner.nextInt();
        int count = 1;
        String Message = "恭喜你,猜对了! 一共猜了%d次。";
        while (usrcode != random) {
            count++;
            if (usrcode > random)
                System.out.println("猜大了");
            else
                System.out.println("猜小了");

            System.out.print("请输入你要猜的数：");
            usrcode = scanner.nextInt();
        }
        System.out.println(String.format(Message, count));
    }

}
