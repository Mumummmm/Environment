package com.pansy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("dev");
//        ctx.getEnvironment().setActiveProfiles("profile1", "profile2");
        ctx.getEnvironment().setDefaultProfiles("default");
        ctx.register(StandaloneDataConfig.class, JndiDataConfig.class);
        ctx.refresh();
    }
}
