package com.hgy.javacode.Test;
/**
 * Copyright (c) 2018/7/17. XiaoMi Inc.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * @Author: Han Guangyi
 * @Mail: hanguangyi@xiaomi.com
 * @Date: 2018/7/17 下午4:47
 */

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *@Brief: 简要说明.
 *
 *@Detail: 详细注释.
 *
 *@Note:
 */
public class Person2Test {
    private static Person p;//成员域

    @BeforeClass
    public static void beforeClass(){//需要是static
        System.out.println("beforeclass");
        p = new Person();//测试方法之前自动执行(整个过程只执行一次因為是static)，可以放初始化代码片段
    }
    @Test
    public void testRun() {
//		Person p = new Person();//这代码可以注释掉了因为前面定义了一个全局的p对象，在测试方法时会自动执行
        p.run();
    }
    @Test
    public void testEat(){
//		Person p = new Person();//同上
        p.eat();
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("afterclass");
        p = null;//使其不再指向對象
    }
}
