package viscropst.OnZJFFClass.Phase1.cheapter2;

public class Pay {

	static String form = "%s\t%s\t%s\t%s\n";// "购买物品单价个数金额"格式

	static String form1 = "%s：%s\n";// “是幸运用户吗：true”格式

	static String form2 = "%s?%s\n";// “是幸运用户吗？true”格式

	static String seprateline = "========================================";// 分割线

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		double shirtPrice = 245;

		double shoePrice = 570;

		double padPrice = 320;

		double finalPay = 0;

		double returnMoney = 0;

		double discount = 8;

		int shirtNo = 2;

		int shoeNo = 1;

		int padNo = 1;

		int score = 0;

		finalPay = ((shirtPrice * shirtNo) + (shoePrice * shoeNo) + (padPrice * padNo))
				* (discount / 10);

		System.out.println("消费总金额：" + finalPay);

		System.out.println(seprateline);

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("请输入支付金额：");

		double usrPaid = scanner.nextDouble();

		returnMoney = usrPaid - finalPay;

		score = (int) (finalPay * 3 / 100);

		System.out.format("＊＊＊＊＊＊＊＊*%s*＊＊＊＊＊＊＊\n", "消费单");

		System.out.format(form, "购买物品", "单价", "个数", "金额");

		System.out
				.format(form, "T恤", shirtPrice, shirtNo, shirtNo * shirtPrice);

		System.out.format(form, "网球鞋", shoePrice, shoeNo, shoeNo * shoePrice);

		System.out.format(form, "网球拍", padPrice, padNo, padNo * padPrice);

		System.out.format(form1, "消费总金额", "￥" + finalPay);

		System.out.format(form1, "实际交费", "￥" + usrPaid);

		System.out.format(form1, "找钱", "￥" + returnMoney);

		System.out.format(form1, "本次购物所获的积分是", score);

		System.out.println(seprateline);

		System.out.println("请输入4位会员卡号：");

		int usrcode = scanner.nextInt();

		int ge = usrcode % 10;// 取会员号的第1位

		int shi = usrcode / 10 % 10;// 取会员号的第2位

		int bai = usrcode / 100 % 10;// 取会员号第3位

		int qian = usrcode / 1000;// 取会员号的第4位

		int luckynum = ge + shi + bai + qian;

		System.out.println("会员卡" + usrcode + "的各位之和：" + luckynum);

		System.out.format(form1, "是幸运客户吗", (luckynum > 20));

		System.out.println(seprateline);

		System.out.println("请输入折扣：");

		double discontusr = scanner.nextDouble();

		System.out.format(form2, "T恤的折扣价低于100吗",
				((shirtPrice * discontusr) < 100));

		System.out.format(form2, "网球鞋的折扣价低于100吗",
				((shoePrice * discontusr) < 100));

		System.out.format(form2, "网球拍的折扣价低于100吗",
				((padPrice * discontusr) < 100));

		scanner.close();

	}

}
