// package com.example.springboot_rabbitmq_consumer.service;
//
// import org.springframework.amqp.core.ExchangeTypes;
// import org.springframework.amqp.rabbit.annotation.Exchange;
// import org.springframework.amqp.rabbit.annotation.Queue;
// import org.springframework.amqp.rabbit.annotation.QueueBinding;
// import org.springframework.amqp.rabbit.annotation.RabbitHandler;
// import org.springframework.amqp.rabbit.annotation.RabbitListener;
// import org.springframework.stereotype.Component;
//
// /**
//  * @Author i531869
//  * @Date 2020/9/22 19:36
//  * @Version 1.0
//  */
// @Component
// @RabbitListener(
//     bindings = @QueueBinding(
//         value = @Queue(value = "${mq.config.queue.all}", autoDelete = "true"),
//         exchange = @Exchange(value = "${mq.config.exchange}", type = ExchangeTypes.FANOUT)
//     )
//
// )
// public class LogReceiver {
//
//   @RabbitHandler
//   public void process(String msg) {
//     System.out.println("Log........Reciever");
//   }
// }
