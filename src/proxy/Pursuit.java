package proxy;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018-05-17 19:26
 *  description : 追求者类
 */
public class Pursuit implements ISendGift{

    private String mGirlName;

    public Pursuit(String girlName) {
        mGirlName = girlName;
    }

    @Override
    public void sendFlower() {
        System.out.println(mGirlName + ", 送你玫瑰花");
    }

    @Override
    public void sendCake() {
        System.out.println(mGirlName + ", 送你蛋糕");

    }

    @Override
    public void sendChocolate() {
        System.out.println(mGirlName + ", 送你巧克力");

    }

}
