package com.example.springboot_rabbitmq.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author i531869
 * @Date 2020/9/20 16:19
 * @Version 1.0
 */
@Configuration
public class QueueConfig {

  @Bean
  public Queue creatQueue() {
    return new Queue("hello-queue");
  }

  @Bean
  public Queue logInfoQueue(){
    return new Queue("log.info");
  }

  @Bean
  public Queue logErrorQueue(){
    return new Queue("log.error");
  }
}
