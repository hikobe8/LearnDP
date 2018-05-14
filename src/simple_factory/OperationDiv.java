package simple_factory;

/***
  *  Author : ryu18356@gmail.com
  *  Create at 2018/5/14 14:42
  *  description : 除法运算符的继承与实现
  */
public class OperationDiv extends Operation {
    @Override
    public float calculateResult()
    {
        if ( numB == 0 ) {
            throw new RuntimeException(" the divisor can't be zero!");
        }
        return numA / numB;
    }
}
