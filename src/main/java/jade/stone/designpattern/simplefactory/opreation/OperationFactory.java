package jade.stone.designpattern.simplefactory.opreation;

/**
 * 简单工厂模式.
 *
 * @author : qinyang @Date : 2018/10/16 上午9:47
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
        break;
    }
    return operation;
  }
}
