package com.example.springboot_rabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author i531869
 * @Date 2020/9/20 16:26
 * @Version 1.0
 */
@Component
public class Receiver {
  @Autowired
  private AmqpTemplate amqpTemplate;

  /**
   * 采用消息队列监听机制
   *
   * @return
   */
  @RabbitListener(queues = "hello-queue")
  public void process(String msg) {
    System.out.println("receiver: " + msg);
  }
}
