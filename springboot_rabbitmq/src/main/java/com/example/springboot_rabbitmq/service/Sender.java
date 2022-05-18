package com.example.springboot_rabbitmq.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author i531869
 * @Date 2020/9/20 16:22
 * @Version 1.0
 */
@Component
public class Sender {
  @Autowired
  private AmqpTemplate amqpTemplate;

  public void send(String msg){
    this.amqpTemplate.convertAndSend("hello-queue", msg);
  }

  public void sendLog(String nsg){
    this.amqpTemplate.convertAndSend("log.info","info message");
    this.amqpTemplate.convertAndSend("log.error","error message");
    this.amqpTemplate.convertAndSend("log","log message");
  }
}
