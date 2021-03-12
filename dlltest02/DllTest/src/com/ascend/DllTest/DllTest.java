package com.ascend.DllTest;

/**
 * @Classname DllTest
 * @Description TODO
 * @Date 2021/2/25 16:57
 * @Created by AscendW
 */
public class DllTest {
    public static void main(String[] args) {
        double addtest = MyDll.mdll.Addtest(7, 8);
        System.out.println(addtest);
    }
}
