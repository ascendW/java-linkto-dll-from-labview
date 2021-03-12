package com.ascend.DllTest;

import com.sun.jna.Library;
import com.sun.jna.Native;

/**
 * @Classname MyDll
 * @Description 配置动态链接库的函数接口与路径
 * @Date 2021/2/25 16:57
 * @Created by AscendW
 */
public interface MyDll extends Library {
    //将dll实例化为对象
    MyDll mdll = (MyDll) Native.load("C:\\Users\\vanccipo\\Desktop\\addtest\\myDLL\\add.dll",MyDll.class);
    double Addtest(double a,double b);
}
