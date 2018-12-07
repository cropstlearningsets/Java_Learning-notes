package viscropst.OnZJFFClass.Phase1.cheapter4.src.cheapter43;

/**
 * �����ſγ̵ĳɼ�ƽ���֣����������������ǣ������ɼ�¼��
 *
 * @author TEDU
 */
public class Score3 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int sum = 0;
        boolean isOk = true;
        for (int i = 0; i < 5; i++) {
            System.out.println("�������" + (i + 1) + "�ſγɼ�");
            int score = scanner.nextInt();
            if (score < 0) {
                isOk = false;
                break;
            }
            sum = sum + score;
        }
        if (isOk) {
            double average = sum * 1.0 / 5;
            System.out.println(String.format("5�ſγ̵�ƽ����Ϊ%.2f", average));
        } else {
            System.out.println("��Ǹ������¼�����������¼��");
        }
    }

}
