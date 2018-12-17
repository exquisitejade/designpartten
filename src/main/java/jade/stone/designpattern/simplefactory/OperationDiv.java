package jade.stone.designpattern.simplefactory;

/**
 * 除法运算类.
 *
 * @author : qinyang @Date : 2018/10/16 上午9:42
 */
public class OperationDiv extends Operation {
  @Override
  public double getResult() throws Exception {
    double secondNumber = getSecondNumber();
        if (secondNumber == 0) {
          throw new Exception("除数为0");
        }
    return getFirstNumber() / secondNumber;
  }
}
