package decorator;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018-05-16 16:34
 *  description : T恤装饰器
 */
public class TShirt extends Finey {

    public TShirt(Person component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.print("大T恤 ");
        super.show();
    }
}
