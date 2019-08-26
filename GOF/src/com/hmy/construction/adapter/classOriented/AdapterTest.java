package com.hmy.construction.adapter.classOriented;

public class AdapterTest {

    public static void main(String[] args) {

        // 注意：由于实现了一个接口，所以都使用EnglishLanguage接收

        // 调用普通方法
        EnglishLanguage englishLanguage = new EnglishPeople();
        System.out.println(englishLanguage.talk());

        // 调用被适配的老接口
        EnglishLanguage chineseLanguage = new TranslationAdapter();
        System.out.println(chineseLanguage.talk());

        // 以后想用老接口，直接找Adatper（翻译官）就行了
    }
}
