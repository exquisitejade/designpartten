package jade.stone.designpattern.simplefactory.cashfactory;

/**
 * @author : qinyang
 * @date : 2018/10/22 上午11:18
 */
public class CashFactory {
  public static BaseCash createCashAccept(String type) {
    BaseCash bc;
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
    return bc;
  }
}
