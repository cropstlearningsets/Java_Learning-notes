package viscropst.OnZJFFClass.Phase1.cheapter2;

public class Pay {

	static String form = "%s\t%s\t%s\t%s\n";// "������Ʒ���۸������"��ʽ

	static String form1 = "%s��%s\n";// ���������û���true����ʽ

	static String form2 = "%s?%s\n";// ���������û���true����ʽ

	static String seprateline = "========================================";// �ָ���

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

		System.out.println("�����ܽ�" + finalPay);

		System.out.println(seprateline);

		java.util.Scanner scanner = new java.util.Scanner(System.in);

		System.out.print("������֧����");

		double usrPaid = scanner.nextDouble();

		returnMoney = usrPaid - finalPay;

		score = (int) (finalPay * 3 / 100);

		System.out.format("����������������*%s*��������������\n", "���ѵ�");

		System.out.format(form, "������Ʒ", "����", "����", "���");

		System.out
				.format(form, "T��", shirtPrice, shirtNo, shirtNo * shirtPrice);

		System.out.format(form, "����Ь", shoePrice, shoeNo, shoeNo * shoePrice);

		System.out.format(form, "������", padPrice, padNo, padNo * padPrice);

		System.out.format(form1, "�����ܽ��", "��" + finalPay);

		System.out.format(form1, "ʵ�ʽ���", "��" + usrPaid);

		System.out.format(form1, "��Ǯ", "��" + returnMoney);

		System.out.format(form1, "���ι�������Ļ�����", score);

		System.out.println(seprateline);

		System.out.println("������4λ��Ա���ţ�");

		int usrcode = scanner.nextInt();

		int ge = usrcode % 10;// ȡ��Ա�ŵĵ�1λ

		int shi = usrcode / 10 % 10;// ȡ��Ա�ŵĵ�2λ

		int bai = usrcode / 100 % 10;// ȡ��Ա�ŵ�3λ

		int qian = usrcode / 1000;// ȡ��Ա�ŵĵ�4λ

		int luckynum = ge + shi + bai + qian;

		System.out.println("��Ա��" + usrcode + "�ĸ�λ֮�ͣ�" + luckynum);

		System.out.format(form1, "�����˿ͻ���", (luckynum > 20));

		System.out.println(seprateline);

		System.out.println("�������ۿۣ�");

		double discontusr = scanner.nextDouble();

		System.out.format(form2, "T�����ۿۼ۵���100��",
				((shirtPrice * discontusr) < 100));

		System.out.format(form2, "����Ь���ۿۼ۵���100��",
				((shoePrice * discontusr) < 100));

		System.out.format(form2, "�����ĵ��ۿۼ۵���100��",
				((padPrice * discontusr) < 100));

		scanner.close();

	}

}
