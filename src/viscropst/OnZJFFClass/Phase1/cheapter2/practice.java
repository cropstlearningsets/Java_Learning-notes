package viscropst.OnZJFFClass.Phase1.cheapter2;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int days=46;
//		System.out.println("周数为："+(days/7)+"，剩余天数："+(days%7));
//		double radius=1.5;
//		System.out.format("圆的面积为: %f", (Math.PI*Math.pow(radius, 2)));
		java.util.Scanner scanner = new java.util.Scanner(System.in);
//	    int height=scanner.nextInt();
//	    float wei=(float) (((height-100)*0.9)*2);
//	    System.out.format("%.1f",wei);
//		int insecs=scanner.nextInt();
//		int hrs=insecs/3600;
//		int minute=(insecs-3600)/60;
//		int sec=(insecs-3600)%60;
//		System.out.format("%d:%d:%d", hrs,minute,sec);
		String[] str = scanner.nextLine().split("");
		System.out.println(((str[2].equals("0"))?"":str[2])
				+((str[2].equals("0")&&(str[1].equals("0")))?"":str[1])
				+str[0]);
		
	}

}
