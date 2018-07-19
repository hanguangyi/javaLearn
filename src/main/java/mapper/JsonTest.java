package mapper;
/**
 * Copyright (c) 2018/7/18. XiaoMi Inc.
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
 * @Date: 2018/7/18 下午4:25
 */

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *@Brief: 简要说明.
 *
 *@Detail: 详细注释.
 *
 *@Note:
 */
public class JsonTest {
    //private static Object User;
    //private static Object List;

    public static void main(String[] args) throws JsonGenerationException, JsonMappingException, IOException{
        User user=new User("隔壁老王", 18, new Date(), "110");
        User user1=new User("隔壁老韩", 18, new Date(), "110");
        List<User> list = new ArrayList<User>();
        list.add(user);
        list.add(user1);
        System.out.println("object list "+list);

        //转换器
        ObjectMapper mapper = new ObjectMapper();

        //对象
        String json=mapper.writeValueAsString(user);
        System.out.println("bill debug class trans to json: "+json);

        String jsonTest = "{\"name\":\"隔壁老王\",\"age\":18,\"birthday\":1531980953039,\"email\":\"110\"}";
        //将json 字符串转换为List<User>
        User u = mapper.readValue(jsonTest,User.class);
        //JsonNode u = mapper.readTree(json);
        System.out.println("bill debug json trans into json node "+u);
        
        //将json 字符串转化为List<User>
        String json2=mapper.writeValueAsString(list);
        System.out.println("bill debug json test mapper json to list:"+json2);
        List<User> list1 = new ArrayList<User>();
        list1 = mapper.readValue(json2,List.class);//这里必须要类型对应上，json数组对应list
        System.out.println(list.size());
        System.out.println("bill debug Json tranfer to list: "+list1);
    }
}
