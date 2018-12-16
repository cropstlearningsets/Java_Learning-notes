package OnClassWork.Phase0;

public class Administrator {
    String name = "";
    String pass = "";

    public Administrator(String n, String p) {
        // TODO Auto-generated constructor stub
        this.name = n;
        this.pass = p;
    }

    void show() {
        System.out.println("姓名:" + name + "，密码:" + pass);
    }

    void update() {
        java.util.Scanner in =
                new java.util.Scanner(System.in);
        System.out.print("请输入用户名:");
        String tmp0 = in.nextLine();
        System.out.print("请输入密码:");
        String tmp1 = in.nextLine();
        boolean rightOrwrong = name.equals(tmp0) && pass.equals(tmp1);
        if (!rightOrwrong)
            System.out.print("用户名和密码不匹配！您没有权限更新管理员信息。");
        else {
            System.out.println("\n");
            System.out.print("请输入新密码:");
            String tmp3 = in.nextLine();
            this.pass = tmp3;
            System.out.println("修改密码成功，您的新密码为:" + tmp3);
        }
        in.close();
    }
}
