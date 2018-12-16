package viscropst.OnZJFFClass.Phase1.cheapter2;

/**
 * BMI体重计算器
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
			System.out.println("你的体重过轻");
		else if(bmi>=18.5 && bmi<=23.5)
			System.out.println("你的体重正常");
		else if(bmi>=24 && bmi<=27)
			System.out.println("你的体重过重");
		else if(bmi>=28 && bmi<=32)
			System.out.println("你的体重有点过重");
		else if(bmi>32)
			System.out.println("你的体重非常过重");
//		System.out.println("你的BMI指数是："+bmi);
	}

}
