package viscropst.OnZJFFClass.Phase1.cheapter2;

/**
 * BMI���ؼ�����
 * @author TEDU
 * @version 1.0
 */
public class BMI_1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char sex='男';
		double height=1.72;
		double weight=89.0;
		double bmi=weight/(Math.exp(height));
		System.out.println(Math.exp(height));
		if(bmi<18.5)
			System.out.println("������ع���");
		else if(bmi>=18.5 && bmi<=23.5)
			System.out.println("�����������");
		else if(bmi>=24 && bmi<=27)
			System.out.println("������ع���");
		else if(bmi>=28 && bmi<=32)
			System.out.println("��������е����");
		else if(bmi>32)
			System.out.println("������طǳ�����");
//		System.out.println("���BMIָ���ǣ�"+bmi);
	}

}
