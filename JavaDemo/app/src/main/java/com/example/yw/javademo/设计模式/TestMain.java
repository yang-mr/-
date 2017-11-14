package com.example.yw.javademo.设计模式;

import com.example.yw.javademo.设计模式.享元模式.单纯享元模式.FlyWeight;
import com.example.yw.javademo.设计模式.代理模式.ProxyObj;
import com.example.yw.javademo.设计模式.原型模式Prototype.clone.Monkey;
import com.example.yw.javademo.设计模式.原型模式Prototype.登记形式.ConcretePrototype1;
import com.example.yw.javademo.设计模式.原型模式Prototype.登记形式.ConcretePrototype2;
import com.example.yw.javademo.设计模式.原型模式Prototype.登记形式.Prototype1;
import com.example.yw.javademo.设计模式.原型模式Prototype.登记形式.PrototypeManager;
import com.example.yw.javademo.设计模式.工厂方法模式.普通工厂方法模式.Banana;
import com.example.yw.javademo.设计模式.工厂方法模式.普通工厂方法模式.Orange;
import com.example.yw.javademo.设计模式.工厂方法模式.静态工厂方法模式.Factory;
import com.example.yw.javademo.设计模式.建造者模式.Builder;
import com.example.yw.javademo.设计模式.建造者模式.ConcreteBuilder;
import com.example.yw.javademo.设计模式.建造者模式.Director;
import com.example.yw.javademo.设计模式.建造者模式.Product;
import com.example.yw.javademo.设计模式.建造者模式.demo2.InsuranceContract;
import com.example.yw.javademo.设计模式.建造者模式.demo3.DirectorDemo3;
import com.example.yw.javademo.设计模式.建造者模式.demo3.WelcomBuilder;
import com.example.yw.javademo.设计模式.抽象工厂模式.IFactory;
import com.example.yw.javademo.设计模式.抽象工厂模式.OrangeFactory;
import com.example.yw.javademo.设计模式.行为模式.中介者模式.AColleague;
import com.example.yw.javademo.设计模式.行为模式.中介者模式.AbstractColleague;
import com.example.yw.javademo.设计模式.行为模式.中介者模式.AbstractMediator;
import com.example.yw.javademo.设计模式.行为模式.中介者模式.BColleague;
import com.example.yw.javademo.设计模式.行为模式.中介者模式.ConcreteMediator;
import com.example.yw.javademo.设计模式.行为模式.命令模式.AudioPlayer;
import com.example.yw.javademo.设计模式.行为模式.命令模式.Command;
import com.example.yw.javademo.设计模式.行为模式.命令模式.Keypad;
import com.example.yw.javademo.设计模式.行为模式.命令模式.PlayCommand;
import com.example.yw.javademo.设计模式.行为模式.命令模式.RewindCommand;
import com.example.yw.javademo.设计模式.行为模式.备忘录模式.白箱.Caretaker;
import com.example.yw.javademo.设计模式.行为模式.备忘录模式.白箱.Originator;
import com.example.yw.javademo.设计模式.行为模式.状态模式.Status;
import com.example.yw.javademo.设计模式.行为模式.状态模式.StatusManager;
import com.example.yw.javademo.设计模式.行为模式.策略模式.AStrategy;
import com.example.yw.javademo.设计模式.行为模式.策略模式.Strategy;
import com.example.yw.javademo.设计模式.行为模式.策略模式.StrategyManager;
import com.example.yw.javademo.设计模式.行为模式.观察者模式.Java中的观察者.Watched;
import com.example.yw.javademo.设计模式.行为模式.观察者模式.Java中的观察者.Watcher;
import com.example.yw.javademo.设计模式.行为模式.观察者模式.拉模式.ConcreteObserver1;
import com.example.yw.javademo.设计模式.行为模式.观察者模式.拉模式.ConcreteSubject11;
import com.example.yw.javademo.设计模式.行为模式.观察者模式.拉模式.Observer1;
import com.example.yw.javademo.设计模式.行为模式.观察者模式.推模式.ConcreteObserver;
import com.example.yw.javademo.设计模式.行为模式.观察者模式.推模式.ConcreteSubject;
import com.example.yw.javademo.设计模式.行为模式.观察者模式.推模式.Observer;
import com.example.yw.javademo.设计模式.行为模式.观察者模式.推模式.Subject;
import com.example.yw.javademo.设计模式.行为模式.责任链模式.DeptManager;
import com.example.yw.javademo.设计模式.行为模式.责任链模式.GeneralManager;
import com.example.yw.javademo.设计模式.行为模式.责任链模式.Handler;
import com.example.yw.javademo.设计模式.行为模式.责任链模式.ProjectManager;
import com.example.yw.javademo.设计模式.装饰模式.透明.Fruit;
import com.example.yw.javademo.设计模式.装饰模式.透明.Orang;
import com.example.yw.javademo.设计模式.装饰模式.透明.OrangDecorate;
import com.example.yw.javademo.设计模式.适配器.对象适配器.Adapter2;
import com.example.yw.javademo.设计模式.适配器.类适配器.Adaptee;
import com.example.yw.javademo.设计模式.适配器.类适配器.Adapter;
import com.example.yw.javademo.设计模式.适配器.类适配器.ConcreteTarget;
import com.example.yw.javademo.设计模式.适配器.类适配器.Target;

import java.lang.reflect.Proxy;
import java.util.Date;
import java.util.Observable;

/**
 * Created on 2017/11/923:06.
 * Author jackyang
 * -------------------------------
 *
 * @description
 * @email 3180518198@qq.com
 */

public class TestMain {
    public static void main(String[] args) {
      //  普通工厂方法模式();
        //多个工厂方法模式();
        //静态工厂方法模式();
        //抽象工厂模式();
        //建造者模式();
       // 建造者模式02();
       // 建造者模式03();
        //登记模式();
       // 浅度克隆();
        try {
            //深度克隆();
        } catch (Exception e) {
            e.printStackTrace();
        }
       // 类适配器();
        //对象适配器();
//        String a1 = "abc";
//        String b1 = "abc";
//        boolean c = a1 == b1;
     //   代理();
       // 装饰模式透明();
       // 装饰模式();
//        享元单纯模式();

      //  中介者模式();
        //观察者模式推();
        //观察者模式拉();
        //观察者模式java();
      //  责任链模式();
       // 备忘录白箱();
       // 命令模式();
      //  策略();
        状态();
    }

    private static void 状态() {
        StatusManager m = new StatusManager();
        m.handler(9);
    }

    private static void 策略() {
        StrategyManager s = new StrategyManager();
        Strategy strategy = new AStrategy();
        s.setStrategy(strategy);
        int now = s.handler(100);
    }

    private static void 命令模式() {
        AudioPlayer player = new AudioPlayer();
        Command play = new PlayCommand(player);
        Command rewind = new RewindCommand(player);

        Keypad k = new Keypad();
        k.setPlayCommand(play);
        k.setRewindCommand(rewind);
        k.play();
        k.rewind();
    }

    private static void 备忘录白箱() {
        Originator o = new Originator();
        Caretaker c = new Caretaker();
        //改变负责人对象的状态
        o.setStatus("On");
        System.out.println(o.getStatus());

        //创建备忘录对象，并将发起人对象的状态储存起来
        c.saveMemento(o.createMemento());
        //修改发起人的状态
        o.setStatus("Off");
        System.out.println(o.getStatus());

        //恢复发起人对象的状态
        o.restoreMemento(c.retrieveMemento());

        System.out.println(o.getStatus());
    }

    private static void 责任链模式() {
        Handler projectManager = new ProjectManager();
        Handler deptManager = new DeptManager();
        Handler generalManager = new GeneralManager();

        projectManager.setSuccessor(deptManager);
        deptManager.setSuccessor(generalManager);

        projectManager.handleFeeRequest("jfkd", 400);
    }

    private static void 观察者模式java() {
        Watched o = new Watched();
        java.util.Observer ob = new Watcher();
        o.addObserver(ob);
        o.setStatus("test");
    }

    private static void 观察者模式拉() {
        ConcreteSubject11 s = new ConcreteSubject11("test");
        Observer1 o = new ConcreteObserver1();
        s.add(o);
        s.change();
        s.remove(o);
        s.change();
    }

    private static void 观察者模式推() {
        ConcreteSubject s = new ConcreteSubject();
        Observer o = new ConcreteObserver();
        s.add(o);
        s.change("jkfdk");
        s.remove(o);
        s.change("nn");
    }

    private static void 中介者模式() {
        AbstractColleague a1 = new AColleague();
        AbstractColleague b1 = new BColleague();
        AbstractMediator m = new ConcreteMediator(a1, b1);
        a1.setNumber(100, m);

        int aNumber = a1.getNumber();
        int bNumber = b1.getNumber();
    }

    private static void 普通工厂方法模式() {
        com.example.yw.javademo.设计模式.工厂方法模式.普通工厂方法模式.Factory factory = new
                com.example.yw.javademo.设计模式.工厂方法模式.普通工厂方法模式.Factory();
        Orange juzi = (Orange) factory.produce("橘子");
        juzi.getName();
        Banana xiangjiao = (Banana) factory.produce("香蕉");
        xiangjiao.getName();
    }

    private static void 多个工厂方法模式() {
        com.example.yw.javademo.设计模式.工厂方法模式.多个工厂方法模式.Factory factory =
                new com.example.yw.javademo.设计模式.工厂方法模式.多个工厂方法模式.Factory();
        Orange juzi = factory.produceOrange();
        juzi.getName();
    }

    private static void 静态工厂方法模式() {
        Orange juzi = Factory.produceOrange();
        juzi.getName();
    }

    private static void 抽象工厂模式() {
        IFactory orangeFactory = new OrangeFactory();
        Orange o = (Orange) orangeFactory.produce();
        o .getName();
    }

    private static void 建造者模式() {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveProduct();
        System.out.print("零件的名字:" + product.getName() + "\n零件的价格:" + product.getPrice());
    }

    private static void 建造者模式02() {
        InsuranceContract.Builder builder = new InsuranceContract.Builder("合同1", 12, 10);
        InsuranceContract contract = builder.setPersonName("jack").build();
        contract.someOperate();

    }

    private static void 建造者模式03() {
        com.example.yw.javademo.设计模式.建造者模式.demo3.Builder builder = new WelcomBuilder();
        DirectorDemo3 directorDemo3 = new DirectorDemo3(builder);
        directorDemo3.construct("2323@qq.com", "0e94@163.com");
        System.out.print(builder.autoMessage.getBody());
    }

    private static void 登记模式() {
//        Prototype1 p1 = new ConcretePrototype1();
//        p1.setName("jack");
//        PrototypeManager.setPrototype1("p1", p1);
//
//        Prototype1 p2 = p1.clone();
//        p2.setName("rose");

        Prototype1 p1 = new ConcretePrototype1();
        p1.setName("jack");
        PrototypeManager.setPrototype1("p1", p1);
        //获取原型来创建对象
        Prototype1 p3 = PrototypeManager.getPrototype1("p1").clone();
      //  p3.setName("张三");
        System.out.println("第一个实例：" + p3.getName());
        System.out.println("第一个实例：" + p1);
        System.out.println("第一个实例：" + p1);
        //有人动态的切换了实现
        Prototype1 p2 = new ConcretePrototype2();
        PrototypeManager.setPrototype1("p1", p2);
        //重新获取原型来创建对象
        Prototype1 p4 = PrototypeManager.getPrototype1("p1").clone();
      //  p4.setName("李四");
        System.out.println("第二个实例：" + p4);
        //有人注销了这个原型
        PrototypeManager.removePrototype1("p1");
        //再次获取原型来创建对象
        /*Prototype1 p5 = PrototypeManager.getPrototype1("p1").clone();
        p5.setName("王五");
        System.out.println("第三个实例：" + p5);*/

    }

    private static void 浅度克隆() {
        Monkey monkey = new Monkey();
        Monkey monkey1 = (Monkey) monkey.clone();
   //     monkey1.setBirthday(new Date(9));
        monkey1.getStaff().grow();
        monkey1.setHeight(200);
    }

    private static void 深度克隆() throws Exception {
        Monkey monkey = new Monkey();
        Monkey monkey1 = (Monkey) monkey.deepClone();
        monkey1.setBirthday(new Date(9));
    }

    private static void 类适配器() {
        Target target = new Adapter();
        target.request();

        target = new ConcreteTarget();
        target.request();
    }

    private static void 对象适配器() {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter2(adaptee);
        target.request();

        target = new ConcreteTarget();
        target.request();
    }

    private static void 代理() {
        ProxyObj proxyObj = new ProxyObj();
        proxyObj.operate();
    }

    private static void 装饰模式透明() {
        Fruit fruit = new Orang();
        Fruit decorate = new OrangDecorate(fruit);
        decorate.getName();
    }

    private static void 装饰模式() {
        com.example.yw.javademo.设计模式.装饰模式.透明.demo1.Orang
                fruit = new com.example.yw.javademo.设计模式.装饰模式.透明.demo1.Orang();
        com.example.yw.javademo.设计模式.装饰模式.透明.demo1.OrangDecorate decorate = new
                com.example.yw.javademo.设计模式.装饰模式.透明.demo1.OrangDecorate(fruit);
        decorate.getName();
    }

    private static void 享元单纯模式() {
        com.example.yw.javademo.设计模式.享元模式.单纯享元模式.Factory factory = new com.example.yw.javademo.设计模式.享元模式.单纯享元模式.Factory();
        FlyWeight f = factory.getFlyWeight(new Character('c'));
        f.operate("jfdkj");

        f = factory.getFlyWeight(new Character('b'));
        f.operate("jfdkj");

        f = factory.getFlyWeight(new Character('c'));
        f.operate("jfdkj");
    }
}
