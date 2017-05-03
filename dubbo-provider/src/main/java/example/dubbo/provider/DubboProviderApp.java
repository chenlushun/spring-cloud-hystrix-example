package example.dubbo.provider;

import org.mvnsearch.spring.boot.dubbo.EnableDubboConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Alex on 2017/5/3.
 *
 * @author Alex
 */
@SpringBootApplication
@EnableDubboConfiguration("example.dubbo.provider")
@EnableEurekaClient
public class DubboProviderApp {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApp.class, args);
    }
}
