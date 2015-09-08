package net.solooo.designpatterns.mixstrategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DeductionFacadeTest {


    public static void main(String args[]) {
        Card card = initCard();
        System.out.printf("=================初始化卡信息=====================");
        showCard(card);
        boolean flag = true;

        while(flag) {
            Trade trade = createTrade();
            DeductionFacade.deduct(card, trade);
            System.out.println("===============订单详情====================");
            System.out.println("交易成功，编号：" + trade.getTradeNo());
            System.out.println("交易金额：" + trade.getAmount());
            showCard(card);
            System.out.println("是否退出？(y/n)");
            String hasNext = getInput();
            if("y".equals(hasNext)) {
                flag = false;
            }

        }
    }

    private static Card initCard() {
        Card card = new Card();
        card.setCardNo(108819);
        card.setFreeMoney(500);
        card.setSteadyMoney(1000);
        return card;
    }

    private static void showCard(Card card) {
        System.out.println("卡号：" + card.getCardNo());
        System.out.println("固定帐户余额：：" + card.getSteadyMoney());
        System.out.println("电子钱包余额：" + card.getFreeMoney());
    }

    private static Trade createTrade() {
        Trade trade = new Trade();
        System.out.println("请输入交易编号:");
        trade.setTradeNo(getInput());
        System.out.println("请输入交易金额:");
        trade.setAmount(Integer.parseInt(getInput()));
        return trade;
    }

    private static String getInput() {
        String str = "";
        try {
            str = (new BufferedReader(new InputStreamReader(System.in))).readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}