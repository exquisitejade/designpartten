package jade.stone.designpattern.factory;

/**
 * @author : qinyang
 * @date : 2018/11/6 下午8:53
 */
public class FactoryTests {
  public static void main(String[] args) {
    IFactory iFactory = new VolunteerFactory();
    LeiFeng leifeng = iFactory.createLeifeng();
    leifeng.buyRice();
    leifeng.sweep();
    leifeng.wash();
  }
}
