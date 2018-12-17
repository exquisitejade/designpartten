package jade.stone.designpattern.simplefactory.opreation;

/**
 * 减法运算类.
 *
 * @author : qinyang @Date : 2018/10/16 上午9:39
 */
public class OperationSub extends Operation {
  @Override
  public double getResult() {
    return getFirstNumber() - getSecondNumber();
  }
}
