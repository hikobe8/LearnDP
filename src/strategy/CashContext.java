package strategy;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018-05-14 18:23
 *  description : 策略的上下文环境，用于操作策略
 */
public class CashContext {

    private CashSuper mCashSuper;

    public CashContext(CashSuper cashSuper) {
        mCashSuper = cashSuper;
    }

    /**
     * 结合简单工厂模式实现策略的选择
     * @param type 收费类型
     */
    public CashContext(int type) {
        switch (type) {
            case CASHTYPE.NORMAL:
                mCashSuper = new CashNormalStrategy();
                break;
            case CASHTYPE._300_SUB_100:
                mCashSuper = new CashSubStrategy();
                break;
            case CASHTYPE.DISCOUNT_8:
                mCashSuper = new CashDiscountStrategy();
                break;
            default:
                throw new RuntimeException("不支持的收费类型!");
        }
    }

    public float getResult(float inputMoney) {
        return mCashSuper.acceptCash(inputMoney);
    }

}
