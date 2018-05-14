package simple_factory;

/***
 *  Author : ryu18356@gmail.com
 *  Create at 2018/5/14 13:40
 *  description : 运算类的工厂类
 */
public class OperationFactory {

    public static Operation createOperate(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                throw new RuntimeException("doesn't support this operation : " + operate);
        }
        return operation;
    }

}
