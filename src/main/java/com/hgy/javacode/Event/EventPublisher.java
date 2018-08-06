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
 * @Date: 2018/8/5 下午4:43
 */

import org.apache.camel.language.Bean;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

/**
 *@Brief: 简要说明.
 *
 *@Detail: 详细注释.
 *
 *@Note:
 */
@Component
public class EventPublisher {
    private EventCustomType eventType;
    //private ApplicationEventPublisher publisher;
    @Autowired
    ApplicationContext applicationContext;

    public void setEventType(EventCustomType eventType){
        this.eventType = eventType;
    }

    //@Override
    //public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
    //}

    public void publishEvent(String name,int number){
        EventCustomType eventCustomType = new EventCustomType(this,name,number);
        applicationContext.publishEvent(eventCustomType);
        return;
    }
}
