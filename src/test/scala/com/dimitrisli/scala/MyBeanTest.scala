package com.dimitrisli.scala

import org.junit.runner.RunWith
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.test.context.ContextConfiguration
import org.springframework.beans.factory.annotation.Autowired
import org.junit.{Assert, Test}

@RunWith(classOf[SpringJUnit4ClassRunner])
@ContextConfiguration(Array("/application-context.xml"))
 class MyBeanTest{

  @Autowired var myBean:MyBean = null

  @Test
  def testMyBean =
    Assert.assertEquals("Greetings from MyBean!",myBean.performTask)

}
