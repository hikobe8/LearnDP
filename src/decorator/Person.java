package decorator;

import java.text.MessageFormat;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018-05-16 16:23
 *  description : 被装饰的类，人类
 */
public class Person {

    private String mName;

    Person(){}

    public void setName(String name) {
        mName = name;
    }

    public void show() {
        System.out.println(MessageFormat.format("装扮的{0}", mName));
    }

}
