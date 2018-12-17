package jade.stone.designpattern.strategy;

/**
 * 返利模式.
 *
 * @author : qinyang
 * @date : 2018/10/22 上午10:57
 */
public class CashReturn extends BaseCash {

  /** 返利条件 */
  private double moneyCondition;
  /** 返利金额 */
  private double moneyReturn;

  public CashReturn(double moneyCondition, double moneyReturn) {
    this.moneyCondition = moneyCondition;
    this.moneyReturn = moneyReturn;
  }

  @Override
  public double acceptCash(double money) {
    return money >= moneyCondition
        ? money - Math.floor(money / moneyCondition) * moneyReturn
        : money;
  }
}
