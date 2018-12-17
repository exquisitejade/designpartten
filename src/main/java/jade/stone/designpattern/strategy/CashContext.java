package jade.stone.designpattern.strategy;

/**
 * 策略模式.
 *
 * @author : qinyang
 * @date : 2018/10/22 下午2:12
 */
public class CashContext {
  BaseCash bc;

  public CashContext(String type) {
    switch (type) {
      case "正常收费":
        bc = new CashNormal();
        break;
      case "满300返100":
        bc = new CashReturn(300, 100);
        break;
      case "打8折":
        bc = new CashRebate(0.8);
        break;
      default:
        bc = new CashNormal();
        break;
    }
  }

  /**
   * 提供获得baseCash子类实现的方法.
   * @param money 原来的钱
   * @return 实际付款的钱
   */
  public double acceptCash(double money){
    return bc.acceptCash(money);
  }
}
