package jade.stone.designpattern.decorator.qinydemo;

/**
 * @author : qinyang
 * @date : 2018/11/6 下午1:55
 */
public interface Run {

  /** 默认方法. */
  default void decurate() {
    System.out.println("接口默认方法装饰run");
  }

  /** 跑 */
  void run();
}
