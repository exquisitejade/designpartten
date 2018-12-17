package jade.stone.designpattern.strategy;

/**
 * 打折收费.
 *
 * @author : qinyang
 * @date : 2018/10/22 上午10:42
 */
public class CashRebate extends BaseCash {

  /** 打折率 */
  private double moneyRebate;

  CashRebate(double moneyRebate) {
    this.moneyRebate = moneyRebate;
  }

  @Override
  public double acceptCash(double money) {
    return money * moneyRebate;
  }
}
