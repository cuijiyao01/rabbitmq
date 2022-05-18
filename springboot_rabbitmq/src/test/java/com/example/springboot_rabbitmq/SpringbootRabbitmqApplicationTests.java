package com.example.springboot_rabbitmq;

import com.example.springboot_rabbitmq.service.Receiver;
import com.example.springboot_rabbitmq.service.Sender;
import com.example.springboot_rabbitmq_provider.service.OrderProvider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootRabbitmqApplicationTests {

	@Autowired
	private Sender sender;

	@Autowired
	private Receiver receiver;

	@Autowired
	@Qualifier("sender")
	private OrderProvider orderProvider;

	@Test
	public void test(){
		orderProvider.sendInfo("这是一条info信息.");
	}

}
