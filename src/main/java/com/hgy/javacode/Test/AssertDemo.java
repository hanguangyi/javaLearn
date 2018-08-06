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
 * @Date: 2018/7/17 下午4:51
 */

import org.junit.Assert;
import org.junit.Test;

/**
 *@Brief: 简要说明.
 *
 *@Detail: 详细注释.
 *
 *@Note:
 */
public class AssertDemo {
    @Test
    public void testA(){
        Person p = new Person();
        //斷言
		Assert.assertEquals("1",p.a());//通过测试，期望返回1，结果也返回了1
        //Assert.assertNotSame("oh no""1",p.a());//担心返回1，结果返回了1
        Assert.assertArrayEquals(new int[]{1,1}, new int[]{1,1});//測試通過
//		Assert.assertArrayEquals(new int[]{1,1}, new int[]{1,2});//測試失敗


//		Assert.assertTrue(false);//測試失敗，
        Assert.assertFalse(false);//測試成功
    }

}
