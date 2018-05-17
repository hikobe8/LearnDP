package proxy;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018-05-17 19:30
 *  description : (静态)代理模式的客户端类
 */
public class Main {

    public static void main(String[] args) {
        Proxy proxy = new Proxy("Cindy");
        proxy.sendCake();
        proxy.sendChocolate();
        proxy.sendFlower();
    }

}
