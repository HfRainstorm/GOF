package com.hmy.construction.adapter.objectOriented;

/**
 * @description:
 * Adapter  转换方法
 *      对象适配模式： 关联老的接口（被转换的接口Adaptee）【将老接口作为属性】，实现目标接口（Target）
 */
public class TranslationAdapter implements EnglishLanguage {

    private ChineseLanguage chineseLanguage;

    // TranslationAdapter的有参构造函数，将老接口作为参数传入方法获取实例
    public TranslationAdapter(ChineseLanguage chineseLanguage) {
        this.chineseLanguage = chineseLanguage;
    }

    @Override
    public String talk() {
        System.out.println("翻译官登场！闲人避让！ ");
        System.out.println("TranslationAdapter 开始调用父类的talk方法：");
        // 由于关联ChineseLanguage，所以this.chineseLanguage.talk()会调用ChineseLanguage的talk()方法
        return this.chineseLanguage.talk();
    }

}
