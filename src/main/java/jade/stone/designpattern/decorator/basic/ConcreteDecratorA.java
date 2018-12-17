package jade.stone.designpattern.decorator.basic;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : qinyang
 * @date : 2018/11/6 上午11:43
 */
@Slf4j
public class ConcreteDecratorA extends Decorator {

  /** 本类的独有的功能，区别B */
  private String addedState;

  /**
   * 先执行接口的方法，再执行本类的方法.
   *
   * <p>相当于对接口做了装饰.
   */
  @Override
  public void operation() {
    super.operation();
    addedState = "new state";
    log.info("具体装饰A的操作.");
  }
}
