# spring-cloud-hystrix-example
Use hystrix‘s example

Netflix has created a library called Hystrix that implements the circuit breaker pattern. In a microservice architecture it is common to have multiple layers of service calls.


## chinese describe
使用断路器的一个简单实例

如果你使用了feign，feign是自带断路器的，并且是已经打开了。如果使用feign不想用断路器的话，可以在配置文件中关闭它，配置如下：


```xml
feign.hystrix.enabled=false

```
本案例使用dubbo做演示

## hystrix-server、eureka-server

启动这两个应用

启动好之后访问
http://localhost:8084/hystrix

输入
http://localhost:8083/hystrix.stream
dubbo-consumer

进入dubbo-consumer的监控界面

## version info：
   
    * dubbo3
    * spring-boot 1.5.2
    * spring-cloud Brixton.SR5

