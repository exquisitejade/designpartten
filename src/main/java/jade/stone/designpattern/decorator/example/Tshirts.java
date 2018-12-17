package jade.stone.designpattern.decorator.example;

import lombok.extern.slf4j.Slf4j;

/**
 * Tshirt类.
 *
 * @author : qinyang
 * @date : 2018/11/6 下午1:17
 */
@Slf4j
public class Tshirts extends Finery {

  @Override
  public void show() {
    super.show();
    log.info("大T恤");
  }
}
