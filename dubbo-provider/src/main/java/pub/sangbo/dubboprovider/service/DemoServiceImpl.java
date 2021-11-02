package pub.sangbo.dubboprovider.service;

import org.apache.dubbo.config.annotation.DubboService;
import pub.sangbo.dubboapi.service.DemoService;

@DubboService
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello(String name) {
        return "hi , "+name;
    }
}
