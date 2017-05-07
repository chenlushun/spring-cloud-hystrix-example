package dubbo.consumer.test;

import com.alibaba.dubbo.config.annotation.DubboConsumer;
import example.dubbo.provider.Provider;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Alex on 2017/5/7.
 *
 * @author Alex
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProviderTest.class)
public class ProviderTest {

    @DubboConsumer
    private Provider provider;

    @Test
    public void demo() {
        String s = provider.sayHello("张三");
        Assert.assertNotNull(s);
    }
}
