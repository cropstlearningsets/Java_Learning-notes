package cheapter6;

public class TestPhone {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Telephone huawei = new Telephone();
        huawei.screen = 6.5;
        huawei.cpu = 2.0;
        huawei.mem = 8;
        huawei.sendMessage();
        Telephone iphone = new Telephone();
        iphone.screen = 6.5;
        iphone.cpu = 2.0;
        iphone.mem = 8;
        iphone.sendMessage();
        Telephone nokia_x5 = new Telephone();
        nokia_x5.screen = 5.8;
        nokia_x5.cpu = 2.2;
        nokia_x5.mem = 3;
        nokia_x5.sendMessage();
    }

}
