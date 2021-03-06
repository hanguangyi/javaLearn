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
 * @Date: 2018/7/23 下午3:43
 */

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *@Brief: 简要说明.
 *
 *@Detail: 详细注释.
 *
 *@Note:
 */
@Data
@Component
public class Person implements PersonTool{
    private int age;
    private String name;
    @Autowired
    private MerryApi merryTool;

    @Override
    public int getNewAge() {
        return 1;
    }

    @Override
    public String getNewName(String name) {
        String merryName = merryTool.merrySb("levey");
        return name+merryName;
    }
}
