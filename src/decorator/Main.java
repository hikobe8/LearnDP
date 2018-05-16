package decorator;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018-05-16 16:39
 *  description : 装饰器模式的客户端类
 */
public class Main {

    public static void main(String[] args) {
        Person mike = new Person();
        mike.setName("迈克尔");
        Pant pant = new Pant(mike);
        TShirt tShirt = new TShirt(pant);
        tShirt.show();
    }

}
