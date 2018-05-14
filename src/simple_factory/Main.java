package simple_factory;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        int numA = 8, numB = 2;
        Operation opAdd = OperationFactory.createOperate("+");
        opAdd.numA = numA;
        opAdd.numB = numB;
        System.out.println("8 + 2 = " + opAdd.calculateResult());
        Operation opSub = OperationFactory.createOperate("-");
        opSub.numA = numA;
        opSub.numB = numB;
        System.out.println("8 - 2 = " + opSub.calculateResult());
        Operation opMul = OperationFactory.createOperate("*");
        opMul.numA = numA;
        opMul.numB = numB;
        System.out.println("8 * 2 = " + opMul.calculateResult());
        Operation opDiv = OperationFactory.createOperate("/");
        opDiv.numA = numA;
        opDiv.numB = numB;
        System.out.println("8 / 2 = " + opDiv.calculateResult());
    }

}
