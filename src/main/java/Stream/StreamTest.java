package JavaLearn;
/**
 * Copyright (c) 2018/6/28. XiaoMi Inc.
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
 * @Date: 2018/6/28 下午7:31
 */

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


/**
 *@Brief: 简要说明.
 *
 *@Detail: 详细注释.
 *
 *@Note:
 */

public class StreamTest {

    public static void main(String[] args){
        List<Student> studentList = new ArrayList<Student>();
        Student student1 = new Student("aa",10);
        Student student2 = new Student("bb",10);
        Student student3 = new Student("cc",11);
        Student student4 = new Student("aa",11);

        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        List<Man> manList = new ArrayList<>();
        Man man1 = new Man("aa",10,10);
        Man man2 = new Man("bb",10,12);
        Man man3 = new Man("aa",11,11);
        Man man4 = new Man("cc",11,14);

        manList.add(man1);
        manList.add(man2);
        manList.add(man3);
        manList.add(man4);

        Map<String, List<Student>> womanList = studentList.stream().collect(Collectors.groupingBy(Student::getName));
        System.out.println(womanList);

        Map<Long, List<Student>> peopleById = studentList.stream().collect(Collectors.groupingBy(Student::getId));
        System.out.println(peopleById);

        for(Map.Entry<String,List<Student>> entry: womanList.entrySet()){
            System.out.println(entry.getKey()+":"+entry.getValue());
        }


    }

}

@Data
class Student {
    private String name;
    private long    id;

    public Student(){
    }

    public Student(String name, long id){
        this.name = name;
        this.id  = id;
    }
}

@Data
class Man{
    public String name;
    public long   id;
    public long   age;

    public Man(String name, long id, long age){
        this.name = name;
        this.id = id;
        this.age = age;

    }
}
@Data
class Woman{
    public List<Man> men;
    public List<Student> students;
}

