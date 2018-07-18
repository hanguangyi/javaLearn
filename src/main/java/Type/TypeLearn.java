package TypeLearn;
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
 * @Date: 2018/7/17 下午3:47
 */

/**
 *@Brief: 简要说明.
 *
 *@Detail: 详细注释.
 *
 *@Note:
 */
public class TypeLearn {
    public static void main(String[] args){
        //使用泛型
        Test<Integer> intOb = new Test<Integer>(88);
        intOb.showType();
        int i = intOb.getOb();
        System.out.println("value= "+i);
        System.out.println("------------------------");

        Test<String> strOb = new Test<String>("hello gen");
        strOb.showType();
        String s = strOb.getOb();
        System.out.println("value = "+s);
        //使用泛型end
    }
}

class Test<T> {
    private T ob;
    public Test(T ob){
        this.ob = ob;
    }
    public T getOb(){
        return ob;
    }
    public void setOb(T ob){
        this.ob = ob;
    }
    public void showType(){
        System.out.println("T 的实际类型是：" + ob.getClass().getName());
    }
}