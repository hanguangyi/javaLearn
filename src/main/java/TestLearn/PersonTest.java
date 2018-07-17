package TestLearn;
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
 * @Date: 2018/7/17 下午4:44
 */

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 *@Brief: 简要说明.
 *
 *@Detail: 详细注释.
 *
 *@Note:
 */
public class PersonTest {
    private Person p;//成员域

    //以前在main里面测试，测试一个要注释一个 麻烦，
    //现在你想测试那个就在那个的方法上右击测试就ok

    @Before
    public void before(){
        System.out.println("before");
        p = new Person();//测试方法之前自动执行(每執行一個方法都要執行一次，因為不是static)，可以放初始化代码片段
    }

    @Test
    public void testRun() {
        p.run();
    }

    @Test
    public void testEat() {
        p.eat();
    }

    @After
    public void after(){
        System.out.println("after");
        p = null;
    }

}
