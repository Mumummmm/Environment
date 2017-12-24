package com.pansy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:app.properties")
@PropertySource("classpath:/${my.placeholder:config}/app.properties")
public class AppConfig {

    @Autowired
    Environment env;

    public TestBean testBean() {
        TestBean testBean = new TestBean();
        testBean.setName(env.getProperty("testbean.name"));
        return testBean;
    }
}
