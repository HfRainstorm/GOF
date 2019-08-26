package com.hmy.create.factory.abstractFactory;

import com.hmy.create.factory.abstractFactory.util.XMLUtils;

import java.util.function.Supplier;


public class AbstractFactoryTest {

    public static void madeComputer(AbstractFactory af){
        af.getComputer();
        af.getKeyBoard();
    }

    // 反射方法
    public static Object getClass(Class<? extends AbstractFactory> clazz) {
        Object obj = null;

        try {
            obj = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return obj;
    }

    public static void main(String[] args) {

        System.out.println("Lenovo配置清单如下：");
        AbstractFactory computerPartsFacotry = new LenovoPartsFacotry();
        madeComputer(computerPartsFacotry);

        System.out.println("MacPro配置清单如下：");
        computerPartsFacotry = new MacProPartsFactory();
        madeComputer(computerPartsFacotry);

        // 通过反射创建
        LenovoPartsFacotry lenovo1 = (LenovoPartsFacotry)getClass(LenovoPartsFacotry.class);
        madeComputer(lenovo1);
        System.out.println();


        // 通过配置文件方式创建
        AbstractFactory lenovo2;
        lenovo2 = (AbstractFactory) XMLUtils.getBean();

        // Predicate<AbstractFactory> predicate = (b) -> b != null;
        // System.out.println(predicate.test(lenovo2));
        assert lenovo2 != null;
        madeComputer(lenovo2);

        System.out.println("-----------------");

        Supplier<AbstractFactory> lenovo3 = () -> (AbstractFactory) XMLUtils.getBean();
        madeComputer(lenovo3.get());
    }
}
