package example.dubbo.consumer;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import example.dubbo.provider.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Alex on 2017/5/3.
 *
 * @author Alex
 */
@RestController
@RequestMapping
public class ConsumerController {
    @Autowired
    private Provider provider;

    @RequestMapping
    @HystrixCommand(fallbackMethod = "isError")
    public Object demo(String name) {
        System.out.println(name);
        return provider.sayHello(name);
    }

    public String isError(String name) {
        return "sorry,error occurrence! name is " + name;
    }

}
