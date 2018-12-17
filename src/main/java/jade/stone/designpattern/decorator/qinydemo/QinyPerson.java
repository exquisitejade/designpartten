package jade.stone.designpattern.decorator.qinydemo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : qinyang
 * @date : 2018/11/6 下午2:02
 */
@Slf4j
public class QinyPerson extends Person implements Run, Walk {
  protected Person component;

  /**
   * 打扮.
   *
   * @param component co
   */
  public void decorate(Person component) {
    this.component = component;
  }

  @Override
  public void interduce() {
    if (component != null) {
      component.interduce();
      decurate();
      walk();
      run();
    }
  }

  @Override
  public void decurate() {
    log.info("实现接口的默认方法，qiny是个男孩子");
  }

  @Override
  public void walk() {
    log.info("qiny走");
  }

  @Override
  public void run() {
    log.info("qiny跑");
  }
}
