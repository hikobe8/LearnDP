package simple_factory;

/***
  *  Author : ryu18356@gmail.com
  *  Create at 2018/5/14 14:41
  *  description : 减法运算符的继承与实现
  */
public class OperationSub extends Operation {
    @Override
    public float calculateResult() {
        return numA - numB;
    }
}
