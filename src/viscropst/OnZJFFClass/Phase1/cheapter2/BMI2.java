package viscropst.OnZJFFClass.Phase1.cheapter2;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * @author TEDU
 * @version 2.0
 * ����ͨ����ȡ�û�������ȡ��BMI
 */
public class BMI2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] info_in=str.split(" ");
		double height=Double.parseDouble(info_in[0]);
		double weight=Double.parseDouble(info_in[1]);
		char sex = info_in[2].charAt(0);
		double bmi=weight/(Math.pow(height, 2));
		DecimalFormat df= new DecimalFormat("0.00");
		System.out.println("���BMIָ���ǣ�"+df.format(bmi));
		scanner.close();
	}

}
