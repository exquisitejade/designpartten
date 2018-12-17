package jade.stone.designpattern.decorator.qinydemo;

/**
 * @author : qinyang
 * @date : 2018/11/6 下午2:00
 */
public interface Walk {

  /** 默认方法. */
  default void decurate() {
    System.out.println("接口默认方法装饰walk");
  }

  /** 走 */
  void walk();
}
