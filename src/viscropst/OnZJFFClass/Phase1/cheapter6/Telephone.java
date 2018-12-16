package cheapter6;

/***
 * 定义手机类
 * @author TEDU
 *
 */
public class Telephone {
    //定义属性或者成员变量
    double screen;
    double cpu;
    int mem;

    //方法，干什么
    void call() {
        System.out.println("Telephone有打电话的功能");
    }

    void sendMessage() {
        System.out.println("手机屏幕:" + screen + "，CPU:" + cpu + "，内存： " + mem + "G 的手机具有发短信的功能");
    }

}
