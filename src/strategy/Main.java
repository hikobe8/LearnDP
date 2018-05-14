package strategy;

import java.text.MessageFormat;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018-05-14 18:42
 *  description : 策略模式客户端类
 */
public class Main {

    public static void main(String[] args) {
        float price = 800f;
        System.out.println(MessageFormat.format("客户购买商品的标签价格为 : {0}元", price));
        CashContext cashContext = new CashContext(CASHTYPE.NORMAL);
        System.out.println(MessageFormat.format("原价收取 : {0}元", cashContext.getResult(price)));
        cashContext = new CashContext(CASHTYPE.DISCOUNT_8);
        System.out.println(MessageFormat.format("打八折收取 : {0}元", cashContext.getResult(price)));
        cashContext = new CashContext(CASHTYPE._300_SUB_100);
        System.out.println(MessageFormat.format("满300减100收取 : {0}元", cashContext.getResult(price)));
    }

}
