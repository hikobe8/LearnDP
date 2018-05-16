package decorator;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018-05-16 16:27
 *  description : 服装类的父类
 */
public class Finey extends Person {

    private Person mComponent;

    public Finey(Person component) {
        mComponent = component;
    }

    @Override
    public void show() {
        if (mComponent != null) {
            mComponent.show();
        }
    }
}
