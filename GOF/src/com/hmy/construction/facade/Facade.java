package com.hmy.construction.facade;

import com.hmy.construction.facade.subsystem.SubSystemOne;
import com.hmy.construction.facade.subsystem.SubSystemThree;
import com.hmy.construction.facade.subsystem.SubSystemTwo;

/**
 * @date 2019-09-28 10:42
 * 外观类，令使用者不必一个一个的去组装方案，提供一个完整的方案
 *       屏蔽了子系统组件，减少了客户端所需处理的对象数目，并使得子系统使用起来更加容易
 */
public class Facade {

    private SubSystemOne one = new SubSystemOne();
    private SubSystemTwo two = new SubSystemTwo();
    private SubSystemThree three = new SubSystemThree();

    public void planA() {
        System.out.println("方案A");
        one.methodOne();
        two.methodTwo();
    }

    public void planB() {
        System.out.println("方案B");
        one.methodOne();
        three.methodThree();
    }
}
