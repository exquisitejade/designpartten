package jade.stone.designpattern.factory;

/**
 * @author : qinyang
 * @date : 2018/11/6 下午8:47
 */
public class VolunteerFactory implements IFactory {

  @Override
  public LeiFeng createLeifeng() {
    return new Volunteer();
  }
}
