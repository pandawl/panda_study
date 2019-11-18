package com.panda;

import com.panda.demo.BeanFactory;
import com.panda.demo.BeanIns;
import com.panda.demo.HelloWorld;
import com.sun.xml.internal.messaging.saaj.soap.Envelope;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        BeanFactory beanFactory = new BeanFactory();
        BeanIns beanIns = new BeanIns();
        beanIns.setBean(new HelloWorld());
        beanFactory.setBean("hello", beanIns);
        HelloWorld bean = (HelloWorld)beanFactory.getBean("hello");
        bean.say();



    }
}
