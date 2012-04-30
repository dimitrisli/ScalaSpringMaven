package com.dimitrisli.scala

import org.springframework.context.ApplicationContext
import org.springframework.context.support.ClassPathXmlApplicationContext


object Application {

  def main(args: Array[String]) {

    val context:ApplicationContext = new ClassPathXmlApplicationContext("application-context.xml")
    val myBean:MyBean = context.getBean("myBean").asInstanceOf[MyBean]
    print(myBean performTask)
  }
}
