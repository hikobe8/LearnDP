package proxy;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018-05-17 19:28
 *  description : 追求者的代理类，真正帮追求者送礼物的人
 */
public class Proxy implements ISendGift{

    private Pursuit mPursuit;

    public Proxy( String girlName ) {
        mPursuit = new Pursuit(girlName);
    }

    @Override
    public void sendFlower() {
        mPursuit.sendFlower();
    }

    @Override
    public void sendCake() {
        mPursuit.sendCake();
    }

    @Override
    public void sendChocolate() {
        mPursuit.sendChocolate();
    }
}
