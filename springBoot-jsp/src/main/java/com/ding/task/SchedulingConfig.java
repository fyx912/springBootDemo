package com.ding.task;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by ding on 16-7-28.
 */

@Configuration
@EnableScheduling
public class SchedulingConfig {

    @Scheduled(cron = "0/20 * * * * ?") // 每20秒执行一次
    public void scheduler() {
     System.out.println(">>>>>>>>>>>>> scheduled ... ");
    }
}
