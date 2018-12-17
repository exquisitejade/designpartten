package jade.stone.designpattern.decorator.qinydemo;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author : qinyang
 * @date : 2018/11/6 下午1:52
 */
@Slf4j
@NoArgsConstructor
public class Person {
  private String name;

  public Person(String name) {
    this.name = name;
  }

  protected void interduce() {
    log.info("我的品种是:{}", name);
  }
}
