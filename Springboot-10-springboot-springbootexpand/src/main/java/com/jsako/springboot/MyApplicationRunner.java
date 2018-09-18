package com.jsako.springboot;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Date 2018/9/18
 * @Author LLJ
 * @Description
 */
@Component
public class MyApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        String[] sourceArgs = args.getSourceArgs();
        for (String sourceArg : sourceArgs) {
            System.out.println(sourceArg);
        }

        System.out.println(args.getOptionNames());
        System.out.println(args.getOptionValues("myname"));

    }
}
