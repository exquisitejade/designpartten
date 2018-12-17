package jade.stone.designpattern.proxy;

import lombok.extern.slf4j.Slf4j;

/**
 * 被代理类.
 * 此处引入调用的对方依赖，因为代理只是替代被代理类的身份，不处理被代理类的业务逻辑
 *
 * @author : qinyang
 * @date : 2018/10/22 下午7:49
 */
@Slf4j
public class RealSubject implements Subject{

  @Override
  public void request() {
    log.info("被代理类实现调用方的逻辑");
  }
}
