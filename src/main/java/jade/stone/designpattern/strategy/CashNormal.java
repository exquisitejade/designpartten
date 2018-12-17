package jade.stone.designpattern.strategy;

/**
 * 正常不打折.
 *
 * @author : qinyang
 * @date : 2018/10/22 上午10:40
 */
public class CashNormal extends BaseCash {

  @Override
  public double acceptCash(double money) {
    return money;
  }
}
