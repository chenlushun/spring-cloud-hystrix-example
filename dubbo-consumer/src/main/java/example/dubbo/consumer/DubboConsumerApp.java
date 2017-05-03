package example.dubbo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

/**
 * Created by Alex on 2017/5/3.
 *
 * @author Alex
 */
@SpringBootApplication
@EnableHystrix
@EnableEurekaClient
public class DubboConsumerApp {
    public static void main(String[] args) {
        SpringApplication.run(DubboConsumerApp.class, args);
    }
}
