package jade.stone.designpattern.decorator.example;

/**
 * @author : qinyang
 * @date : 2018/11/6 下午1:22
 */
public class PersionTest {
  public static void main(String[] args) {
    Persion xq = new Persion("小秦");
    BigTrouser bigTrouser = new BigTrouser();
    Tshirts tshirts = new Tshirts();
    bigTrouser.decorate(xq);
    tshirts.decorate(bigTrouser);
    tshirts.show();
  }
}
