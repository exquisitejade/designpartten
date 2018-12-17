package jade.stone.designpattern.decorator.basic;

import lombok.Setter;

/**
 * @author : qinyang
 * @date : 2018/11/6 上午11:39
 */
public class Decorator implements Componet {

  /**
   * 设置component
   */
  @Setter protected Componet componet;

  /**
   * 重写operation，实际执行Compoent的方法.
   */
  @Override
  public void operation() {
    if (componet != null) {
      componet.operation();
    }
  }
}
