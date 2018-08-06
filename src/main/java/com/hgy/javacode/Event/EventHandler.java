package com.hgy.javacode.Event;
/**
 * Copyright (c) 2018/8/5. XiaoMi Inc.
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
 * @Date: 2018/8/5 下午4:51
 */

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 *@Brief: 有两种方式，一个是implement ApplicationListener，另一种是使用注解@EventListener
 *
 *@Detail: 详细注释.
 *
 *@Note:
 */
@Service
public class EventHandler {
    @EventListener
    public void onApplicationEvent(EventCustomType eventCustomType) {
        System.out.println("receive event "+eventCustomType);
    }
}
