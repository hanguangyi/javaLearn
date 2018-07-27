package Thread;
/**
 * Copyright (c) 2018/7/27. XiaoMi Inc.
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
 * @Date: 2018/7/27 下午2:38
 */

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 *@Brief: 简要说明.
 *
 *@Detail: 详细注释.
 *
 *@Note:
 */
public class TestThread {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ThreadConfig.class);
        AsynTaskService service = context.getBean(AsynTaskService.class);
        for(int i= 0; i<10;i++){//执行异步任务

            service.f2();
            service.f1();
        }
        context.close();
    }
}
