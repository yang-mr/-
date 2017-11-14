java基础知识
    泛型
        extends 类型绑定

        通配符
            无边界通配符：？
                只能用于填充泛型变量T。它是用来填充T的！！！！只是填充方式的一种！！！
                        //无边界通配符填充
                        Box<?> box;
                        //其它类型填充
                        Box<String> stringBox;
                        ◆ 如果你想从一个数据类型里获取数据，使用 ? extends 通配符（能取不能存）
                        ◆ 如果你想把对象写入一个数据结构里，使用 ? super 通配符（能存不能取）
                        ◆ 如果你既想存，又想取，那就别用通配符。

                        所以下面这两个是对等的：
                        [java] view plain copy
                        Point point3 = new Point(new Integer(23),new Integer(23));
                        Point<?> point3 = new Point(new Integer(23),new Integer(23));

    反射

    设计模式：https://www.cnblogs.com/foryang/p/5849402.html
        创建型模式，共五种：工厂方法模式、抽象工厂模式、单例模式、建造者模式、原型模式。
        结构型模式，共七种：适配器模式、装饰器模式、代理模式、外观模式、桥接模式、组合模式、享元模式。
        行为型模式，共十一种：策略模式、模板方法模式、观察者模式、迭代子模式、责任链模式、命令模式、备忘录模式、状态模式、访问者模式、中介者模式、解释器模式。