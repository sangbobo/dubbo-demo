package pub.sangbo.dubboconsumer.config;

import javax.annotation.Resource;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ConsumerConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pub.sangbo.dubboconsumer.properties.DubboProperties;

@Configuration
public class DubboConfig {

    @Resource
    DubboProperties dubboProperties;

    @Bean
    public ApplicationConfig applicationConfig(){
        ApplicationConfig applicationConfig = new ApplicationConfig();
        applicationConfig.setName(dubboProperties.getName());
        return applicationConfig;
    }

    @Bean
    public RegistryConfig registryConfig(){
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress(dubboProperties.getAddress());
        registryConfig.setClient(dubboProperties.getClient());
        return registryConfig;
    }

    @Bean
    public ConsumerConfig consumerConfig(){
        ConsumerConfig consumerConfig = new ConsumerConfig();
        consumerConfig.setTimeout(3000);
        return consumerConfig;
    }

}
