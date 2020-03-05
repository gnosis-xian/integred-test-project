package test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author: gaojing [gaojing1996@vip.qq.com]
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class TestMain implements ApplicationContextAware {

    static ApplicationContext applicationContext;

    @Before
    public void before() {
        String consulDiscoveryPort = applicationContext.getEnvironment().getProperty("spring.cloud.consul.discovery.port");
        System.out.println(consulDiscoveryPort);
    }

    @Test
    public void test() {

    }

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }
}
