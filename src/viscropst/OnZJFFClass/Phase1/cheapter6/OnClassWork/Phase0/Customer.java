package OnClassWork.Phase0;

import java.util.HashMap;

public class Customer {
    int score = 0;
    int type = 0;
    private HashMap<Integer, String> cardTypeMap =
            new HashMap<Integer, String>();
    private String typeString = "";

    public Customer(int score, int type) {
        // TODO Auto-generated constructor stub
        cardTypeMap.put(0, "普卡");
        cardTypeMap.put(1, "金卡");
        this.score = score;
        this.type = type;
        System.out.println("积分：" + this.score + "，卡类型：" + cardTypeMap.get(type));
    }

    void showReturnScore() {
        typeString = cardTypeMap.get(type);
        boolean cardGold = typeString.equals("金卡") && score > 1000;
        boolean cardNormal = typeString.equals("普卡") && score > 5000;
        if (cardGold || cardNormal)
            System.out.println("回馈积分500分！");
    }
}
