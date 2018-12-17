package jade.stone.designpattern.decorator.example;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @author : qinyang
 * @date : 2018/11/6 下午12:12
 */
@Slf4j
@NoArgsConstructor
public class Persion {
  private String name;

  public Persion(String name) {
    this.name = name;
  }

  protected void show() {
    log.info("装扮的{}", name);
  };
}
