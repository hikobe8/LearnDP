package strategy;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018-05-14 18:46
 *  description : 打8折策略实现类
 */
public class CashDiscountStrategy implements CashSuper {
    @Override
    public float acceptCash(float inputMoney) {
        return inputMoney * 0.8f;
    }
}
