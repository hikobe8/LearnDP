package strategy;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018-05-14 18:46
 *  description : 满300减100策略实现类
 */
public class CashSubStrategy implements CashSuper {
    @Override
    public float acceptCash(float inputMoney) {
        return (float) (inputMoney - Math.floor(inputMoney / 300f)*100f);
    }
}
