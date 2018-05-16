package decorator;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018-05-16 16:38
 *  description : 西装装饰器
 */
public class Suit extends Finey{

    public Suit(Person component) {
        super(component);
    }

    @Override
    public void show() {
        System.out.print("西装 ");
        super.show();
    }
}
