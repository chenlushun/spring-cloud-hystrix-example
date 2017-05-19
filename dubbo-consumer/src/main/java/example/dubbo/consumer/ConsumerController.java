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

    @RequestMapping("A")
    @HystrixCommand(fallbackMethod = "isErrorA")
    public Object demoA(String name) {
        //构造异常情况，name为null
        System.out.println(name.endsWith("ios"));
        return provider.sayHello(name);
    }

    public String isErrorA(String name) {
        return "sorry,errorA occurrence! name is " + name;
    }

    @RequestMapping("B")
    @HystrixCommand(fallbackMethod = "isErrorB", ignoreExceptions = {NullPointerException.class})
    public Object demoB(String name) {
        //构造异常情况，name为null
        // System.out.println(name.endsWith("ios"));
        return provider.sayHello(name);
    }

    public String isErrorB(String name) {
        return "sorry,errorB occurrence! name is " + name;
    }

}
