package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class AppRunner implements ApplicationRunner {
    @Autowired
    ApplicationContext applicationContext;

    @Override
    public void run(ApplicationArguments args) throws InterruptedException {
        while(true) {
            System.out.println(applicationContext.getMessage("greeting",
                                                        new String[] {"leehw22", "test"},
                                                        Locale.KOREA));

            System.out.println(applicationContext.getMessage("greeting",
                                                        new String[] {"leehw22", "test"},
                                                        Locale.getDefault()));

            Thread.sleep(1000l);
        }
    }
}
