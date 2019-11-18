package com.panda.demo;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Auther: wl
 * @Date: 2019/11/18 16:10
 * @Description:
 */
public class BeanFactory {
    //管理bean
    Map<String, BeanIns> beanMap = new ConcurrentHashMap();
    //获取bean名称
    public Object getBean(String beanName) {
        return beanMap.get(beanName).getBean();
    }
    //添加bean
    public void setBean(String beanName, BeanIns object) {
         beanMap.put(beanName,object);
    }
}
