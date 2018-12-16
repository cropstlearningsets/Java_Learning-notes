package OnClassWork.Phase0;


public class TestAdministrator {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Administrator ad0 =
                new Administrator("admin1", "111111");
        Administrator ad1 =
                new Administrator("admin2", "111111");
        ad0.show();
        ad1.show();
        ad0.update();
    }

}
