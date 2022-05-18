package com.example.springboot_rabbitmq_provider;

import com.example.springboot_rabbitmq_provider.service.OrderProvider;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootRabbitmqProviderApplicationTests {

	@Autowired
	@Qualifier("sender")
	private OrderProvider orderProvider;

	@Test
	public void test() throws InterruptedException {
		orderProvider.sendOrder("创建订单");
		// orderProvider.sendPay("支付成功");

	}

}
