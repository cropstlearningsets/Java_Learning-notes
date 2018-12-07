package viscropst.HomeworkOfLife.Phase1.ObjectOriend.Phase0;

public class TestCustomer {

    public static void main(String[] args) {

        Customer c0 = new Customer();

        c0.scoreOnCard = 3050;

        c0.cardType = "金卡";

        c0.showCard();

        c0.cardType = "普卡";

        c0.showCard();

    }

}

class Customer {

    String cardType = "";

    int scoreOnCard = 0;

    void showCard() {

        System.out.println(String.format("积分: %d, 卡类型: %s", scoreOnCard, cardType));

        boolean normalCard = "普卡".equals(cardType) && scoreOnCard > 5000;

        boolean goldCard = "金卡".equals(cardType) && scoreOnCard > 1000;

        int returnScore = 500;

        if (normalCard || goldCard)

            System.out.println("回馈积分" + returnScore + "分");

    }

}
