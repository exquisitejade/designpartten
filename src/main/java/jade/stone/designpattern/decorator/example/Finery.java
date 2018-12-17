package jade.stone.designpattern.decorator.example;

/**
 * 服饰类.
 *
 * @author : qinyang
 * @date : 2018/11/6 下午1:11
 */
public class Finery extends Persion {
  protected Persion component;

  /**
   * 打扮.
   *
   * @param component co
   */
  public void decorate(Persion component) {
    this.component = component;
  }

  @Override
  public void show() {
    if (component != null) {
      component.show();
    }
  }
}
