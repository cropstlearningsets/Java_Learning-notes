package cheapter2;

public class Course {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int math = 90;
		int sql = 89;
		int chinese = 60;
		int difference_cn_math = math - chinese;
		double avrange = (math + sql + chinese) / 3.0;
        System.out.println("语文和数学的差" + difference_cn_math);
        System.out.println("三门课的平均分" + avrange);
		System.out.println(20/3.0);
		
	}

}
