package pub.sangbo.dubboprovider.config;

import javax.annotation.Resource;

import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pub.sangbo.dubboprovider.properties.DubboProperties;

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
        return registryConfig;
    }

}
