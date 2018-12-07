package viscropst.HomeworkOfLife.Phase1.ObjectOriend.Phase0;

public class TestAdministrator {

    public static void main(String[] args) {
        Administrator a0 = new Administrator("admin1", "111111");
        a0.show();
        new Administrator("admin2", "111111").show();
        a0.update();
    }

}


class Administrator {

    String name;
    String pass;

    Administrator(String n, String p) {
        this.name = n;
        this.pass = p;
    }

    void show() {
        System.out.println(String.format("姓名: %s, 密码: %s", this.name, this.pass));
    }

    void update() {
        java.util.Scanner in = new java.util.Scanner(System.in);
        String tmp0, tmp1;
        System.out.print("请输入用户名 : ");
        tmp0 = in.nextLine();
        System.out.print("请输入密码 : ");
        tmp1 = in.nextLine();
        boolean wrongOrRight = name.equals(tmp0) && pass.equals(tmp1);
        if (!wrongOrRight)
            System.out.println("用户名和密码不匹配!您没有权限更新管理员信息。");
        else {
            System.out.println("\n");
            System.out.print("请输入新密码 : ");
            tmp1 = in.nextLine();
            pass = tmp1;
            if (tmp1.equals(pass))
                System.out.println("修改密码成功,您的新密码为: " + pass);
        }
        in.close();
    }

}
