package com.hgy.javacode.InterfaceInjection;
/**
 * Copyright (c) 2018/7/23. XiaoMi Inc.
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
 * @Date: 2018/7/23 下午3:44
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 *@Brief: 简要说明.
 *
 *@Detail: 详细注释.
 *
 *@Note:
 */
//@Configuration
@ComponentScan
public class TestInjection {

    public static void main(String[] args){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(TestInjection.class);

        PersonTool personTool = ctx.getBean(PersonTool.class);
        int age = personTool.getNewAge();
        String name = personTool.getNewName("bill");
        System.out.println("age: "+age+" name: "+name);

    }
}