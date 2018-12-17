package jade.stone.designpattern.simplefactory.cashfactory;

/**
 * 收银超类.
 *
 * @author : qinyang
 * @date : 2018/10/22 上午10:33
 */
public abstract class BaseCash {

  /**
   * 接收价格的方法.
   * @param money 原价
   * @return 当前优惠价
   */
  public abstract double acceptCash(double money);
}
