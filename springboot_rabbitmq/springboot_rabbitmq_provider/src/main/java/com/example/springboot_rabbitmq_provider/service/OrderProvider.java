package com.example.springboot_rabbitmq_provider.service;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Author i531869
 * @Date 2020/9/21 19:50
 * @Version 1.0
 */
@Component("sender")
public class OrderProvider {

  @Autowired
  private AmqpTemplate amqpTemplate;

  @Value("${mq.config.exchange}")
  private String exchange;

  public void sendOrder(String msg) throws InterruptedException {
    amqpTemplate.convertAndSend(exchange,"",msg);
    // amqpTemplate.convertAndSend(exchange,"",msg);
    // amqpTemplate.convertAndSend(exchange,"",msg);
  }

  public void sendPay(String msg) throws InterruptedException {
    amqpTemplate.convertAndSend(exchange,"pay.log.info",msg);
    amqpTemplate.convertAndSend(exchange,"pay.log.warn",msg);
    amqpTemplate.convertAndSend(exchange,"pay.log.error",msg);
  }

  // public void sendError(String msg) throws InterruptedException {
  //   while (true) {
  //     this.amqpTemplate.convertAndSend(exchange, routingKeyError, msg);
  //     Thread.sleep(2 * 1000);
  //   }
  // }
}
