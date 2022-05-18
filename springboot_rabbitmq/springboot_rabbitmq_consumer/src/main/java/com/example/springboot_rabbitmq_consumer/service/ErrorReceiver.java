package com.example.springboot_rabbitmq_consumer.service;

import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @Author i531869
 * @Date 2020/9/21 19:44
 * @Version 1.0
 */
@Component
@RabbitListener(
    bindings = @QueueBinding(
        value = @Queue(value = "${mq.config.queue.error}", autoDelete = "false"),
        exchange = @Exchange(value = "${mq.config.exchange}", type = ExchangeTypes.FANOUT,autoDelete ="false" )
    )
)
public class ErrorReceiver {
  @RabbitHandler
  public void process(String msg) {
    System.out.println("Error........Receiver:" + msg);
  }

}
