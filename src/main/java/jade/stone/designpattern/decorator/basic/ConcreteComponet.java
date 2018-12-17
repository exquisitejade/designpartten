package jade.stone.designpattern.decorator.basic;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : qinyang
 * @date : 2018/11/6 上午11:38
 */
@Slf4j
public class ConcreteComponet implements Componet {

  @Override
  public void operation() {
    log.info("具体的对象操作");
  }
}
