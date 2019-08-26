package com.hmy.construction.adapter.classOriented;

/**
 * @description:
 * Adapter  转换方法
 *      类适配模式： 继承老的接口（被转换的接口Adaptee），实现目标接口（Target）
 */
public class TranslationAdapter extends ChineseLanguage implements EnglishLanguage {

    @Override
    public String talk() {
        System.out.println("翻译官登场！闲人避让！ ");
        System.out.println("TranslationAdapter 开始调用父类的talk方法：");
        // 由于继承ChineseLanguage， 所以super.talk()会调用ChineseLanguage的talk()方法
        return super.talk();
    }

}
