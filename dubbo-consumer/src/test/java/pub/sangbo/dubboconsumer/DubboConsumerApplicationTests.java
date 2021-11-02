package pub.sangbo.dubboconsumer;

import javax.annotation.Resource;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import pub.sangbo.dubboconsumer.service.ConsumerService;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class DubboConsumerApplicationTests {

    @Resource
    private ConsumerService consumerService;

    @Test
    void contextLoads() {
        System.out.println(consumerService.sayHello("sangbo"));
    }

}
