package viscropst.OnZJFFClass.Phase1.cheapter5.src.cheapter52;

import java.util.Scanner;

/**
 * �������༶�ÿ���༶ѧ����ƽ����
 *
 * @author TEDU
 */
public class Score2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {  //�༶ѭ��
            int[] score = new int[4];
            int sum = 0;
            for (int j = 0; j < 4; j++) {  //�༶ѧ���ɼ�ѭ��
                score[j] = scanner.nextInt();
                sum += score[j];
            }
            System.out.println(String.format("�� %d ���༶��ƽ����Ϊ %.2f ", i + 1, sum * 1.0 / 4));
        }
    }

}
