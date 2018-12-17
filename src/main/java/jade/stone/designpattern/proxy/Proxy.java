package jade.stone.designpattern.proxy;

/**
 * 代理模式，实现同一个接口，传入被代理对象，构造即可.
 *
 * @author : qinyang
 * @date : 2018/10/22 下午7:54
 */
public class Proxy implements Subject {
  private RealSubject realSubject;

  /**
   * 可以通过传入构造函数构造对象
   */
  @Override
  public void request() {
    if(realSubject==null){
      realSubject=new RealSubject();
    }
    realSubject.request();
  }
}
