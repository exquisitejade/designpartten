package jade.stone.designpattern.simplefactory;

/**
 * 乘法运算类.
 *
 * @author : qinyang @Date : 2018/10/16 上午9:41
 */
public class OperationMul extends Operation {
  @Override
  public double getResult() {
    return getFirstNumber() * getSecondNumber();
  }
}
