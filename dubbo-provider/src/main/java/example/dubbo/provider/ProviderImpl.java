package example.dubbo.provider;


import com.alibaba.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created by Alex on 2017/5/3.
 *
 * @author Alex
 */
@Component
@DubboService
public class ProviderImpl implements Provider {

    @Override
    public String sayHello(String name) {
        name.endsWith("java");
        try {
            Thread.sleep(200L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(name);
        return new Date() + ":" + name;
    }
}
