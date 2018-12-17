package jade.stone.designpattern.decorator.qinydemo;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : qinyang
 * @date : 2018/11/6 下午2:12
 */
@Slf4j
public class CaiCaiPerson extends Person implements Run, Walk {
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
    log.info("实现接口的默认方法，菜菜是个女孩子");
  }

  @Override
  public void walk() {
    log.info("菜菜走");
  }

  @Override
  public void run() {
    log.info("菜菜跑");
  }
}
