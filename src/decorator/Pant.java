package decorator;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018-05-16 16:34
 *  description : 阔腿裤装饰器
 */
public class Pant extends Finey {

    public Pant(Person component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.print("阔腿裤 ");
        super.show();
    }
}
