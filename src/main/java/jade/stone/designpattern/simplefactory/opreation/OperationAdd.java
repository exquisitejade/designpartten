package jade.stone.designpattern.simplefactory.opreation;

/**
 * 加法运算类.
 *
 * @author : qinyang @Date : 2018/10/16 上午9:34
 */
public class OperationAdd extends Operation {
  @Override
  public double getResult() {
    return getFirstNumber() + getSecondNumber();
  }
}
