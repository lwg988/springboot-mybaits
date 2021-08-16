package com.li.test;

import org.springframework.transaction.annotation.Transactional;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.a());
    }

    @Transactional(rollbackFor = Exception.class)
    public int a(){
        int a = 10;
        a = 10/0;
        a = 10000;
        return a;
    }
}
