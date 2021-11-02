package pub.sangbo.dubboconsumer.service;

import org.apache.dubbo.config.annotation.DubboReference;
import pub.sangbo.dubboapi.service.DemoService;
import org.springframework.stereotype.Service;


@Service
public class ConsumerService {

    @DubboReference
    private DemoService demoService;

    public String sayHello(String name) {
        String str = demoService.sayHello(name);
        return "调用内容："+str;
    }
}
