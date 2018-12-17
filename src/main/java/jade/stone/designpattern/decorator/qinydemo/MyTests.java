package jade.stone.designpattern.decorator.qinydemo;

/**
 * @author : qinyang
 * @date : 2018/11/6 下午2:14
 */
public class MyTests {
  public static void main(String[] args) {
    Person person = new Person("人");
    CaiCaiPerson caiCaiPerson = new CaiCaiPerson();
    caiCaiPerson.decorate(person);
    caiCaiPerson.interduce();
    QinyPerson qinyPerson = new QinyPerson();
    qinyPerson.decorate(person);
    qinyPerson.interduce();
  }
}
