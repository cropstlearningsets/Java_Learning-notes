package viscropst.OnZJFFClass.Phase1.cheapter4.src.cheapter42;

import java.util.Random;

public class guessNum {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        Random rand = new Random();
        int random = rand.nextInt(99);//(int)(Math.random()*10);
        System.out.print("��������Ҫ�µ�����");
        int usrcode = scanner.nextInt();
        int count = 1;
        String Message = "��ϲ��,�¶���! һ������%d�Ρ�";
        while (usrcode != random) {
            count++;
            if (usrcode > random)
                System.out.println("�´���");
            else
                System.out.println("��С��");

            System.out.print("��������Ҫ�µ�����");
            usrcode = scanner.nextInt();
        }
        System.out.println(String.format(Message, count));
    }

}
