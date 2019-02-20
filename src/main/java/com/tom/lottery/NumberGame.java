package com.tom.lottery;

import java.util.HashSet;
import java.util.Set;

public abstract class NumberGame {
//    繼承後可以用的兩個方法 1.儲存數字的number集合 2.訂定遊戲要有幾個數字
    Set<Integer> numbers = new HashSet<>();
    int numberCount = 0;
    public abstract void generate();
//    確認資料
    public boolean validate(){
        if (numbers.size() == numberCount)
            return true;
        else
            return false;
    }

}
