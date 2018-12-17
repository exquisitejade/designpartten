package jade.stone.designpattern.decorator.basic;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : qinyang
 * @date : 2018/11/6 上午11:59
 */
@Slf4j
public class ConcreteDecratorB extends Decorator {
  /**
   * 先执行接口的方法，再执行本类的方法.
   *
   * <p>相当于对接口做了装饰.
   */
  @Override
  public void operation() {
    super.operation();
    addBehavior();
    log.info("具体装饰B的操作.");
  }

  /** 区别A，此处用了方法. */
  private void addBehavior() {}
}
