package jade.stone.designpattern.factory;

/**
 * @author : qinyang
 * @date : 2018/11/6 下午8:33
 */
public class UndergraduateFactory implements IFactory {

  @Override
  public LeiFeng createLeifeng() {
    return new Undergraduate();
  }
}
