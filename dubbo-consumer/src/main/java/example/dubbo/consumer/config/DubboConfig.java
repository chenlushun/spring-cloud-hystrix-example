package example.dubbo.consumer.config;

import com.alibaba.dubbo.config.spring.ReferenceBean;
import example.dubbo.provider.Provider;
import org.mvnsearch.spring.boot.dubbo.DubboAutoConfiguration;
import org.mvnsearch.spring.boot.dubbo.DubboBasedAutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Alex on 2017/5/3.
 *
 * @author Alex
 */
@Configuration
@AutoConfigureAfter(DubboAutoConfiguration.class)
public class DubboConfig extends DubboBasedAutoConfiguration {
    @Bean
    public ReferenceBean provider() {
        return getConsumerBean(Provider.class, "", 100);
    }
}
