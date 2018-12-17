package jade.stone.designpattern.decorator.basic;

import com.google.common.annotations.VisibleForTesting;
import lombok.extern.slf4j.Slf4j;

/**
 * @author : qinyang
 * @date : 2018/11/6 下午12:02
 */
@Slf4j
public class DecoratorTest {
  public static void main(String[] args) {
    // A包装c，B包装A，这样B具备三个属性.
    ConcreteComponet c = new ConcreteComponet();
    ConcreteDecratorA d1 = new ConcreteDecratorA();
    ConcreteDecratorB d2 = new ConcreteDecratorB();

    d1.setComponet(c);
    d2.setComponet(d1);
    d2.operation();
  }
}
