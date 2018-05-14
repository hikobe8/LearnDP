package strategy;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018-05-14 18:46
 *  description : 正常收费策略实现类
 */
public class CashNormalStrategy implements CashSuper {
    @Override
    public float acceptCash(float inputMoney) {
        return inputMoney;
    }
}
