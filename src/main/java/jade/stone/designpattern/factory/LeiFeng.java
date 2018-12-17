package jade.stone.designpattern.factory;

import lombok.extern.slf4j.Slf4j;

/**
 * 雷锋类.
 *
 * @author : qinyang
 * @date : 2018/11/6 下午8:24
 */
@Slf4j
public class LeiFeng {
  public void sweep() {
    log.info("扫地");
  }

  public void wash() {
    log.info("洗衣");
  }

  public void buyRice() {
    log.info("买米");
  }
}
