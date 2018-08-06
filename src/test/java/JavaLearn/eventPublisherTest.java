package JavaLearn;
/**
 * Copyright (c) 2018/8/6. XiaoMi Inc.
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
 * @Date: 2018/8/6 上午10:47
 */

/**
 *@Brief: 简要说明.
 *
 *@Detail: 详细注释.
 *
 *@Note:
 */


import com.hgy.javacode.Event.EventPublisher;
import com.hgy.javacode.Application;
import com.hgy.javacode.InterfaceInjection.PersonTool;
import com.hgy.javacode.InterfaceInjection.TestInjection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(
        //webEnvironment = SpringBootTest.WebEnvironment.MOCK,
        classes = {Application.class}
)
public class eventPublisherTest {
    @Autowired
    private ApplicationContext context;
    @Test
    /*public void testEventPublish() throws Exception{
            EventPublisher eventPublisher = context.getBean(EventPublisher.class);
            eventPublisher.publishEvent("hanguangyi",11);

    }*/
    public void testPersonTool(){
        //ApplicationContext ctx = new AnnotationConfigApplicationContext(eventPublisherTest.class);
        PersonTool personTool = context.getBean(PersonTool.class);
        int age = personTool.getNewAge();
        String name = personTool.getNewName("bill");
        System.out.println("age: "+age+" name: "+name);}


}
