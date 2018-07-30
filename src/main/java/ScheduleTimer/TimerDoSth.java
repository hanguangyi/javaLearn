package ScheduleTimer;
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
 * @Date: 2018/7/27 下午4:40
 */

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 *@Brief: 简要说明.
 *
 *@Detail: 详细注释.
 *
 *@Note:
 */

@Service
public class TimerDoSth {
    /**
     * 定时任务，每隔10s打印一句话
     */
    @Scheduled(cron = "0/1 * * * * ?")
    public void printSth(){
        System.out.println("here print ******hgy");
    }

}
