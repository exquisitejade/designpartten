package jade.stone.designpattern.decorator.example;

import lombok.extern.slf4j.Slf4j;

/**
 * @author : qinyang
 * @date : 2018/11/6 下午1:19
 */
@Slf4j
public class BigTrouser extends Finery {

  @Override
  public void show() {
    super.show();
    log.info("垮裤");
  }
}
