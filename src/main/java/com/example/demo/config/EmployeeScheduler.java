//package com.example.demo.config;
//
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.scheduling.annotation.EnableScheduling;
//import org.springframework.scheduling.annotation.Scheduled;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//
//@Component
//@EnableScheduling
//public class EmployeeScheduler {
//
//    public static final Logger Log = LoggerFactory.getLogger(EmployeeScheduler.class);
//
////  @Scheduled(fixedRate = 2000L)
////	@Scheduled(fixedDelay = 2000L, initialDelay = 3000L)
////	@Scheduled(fixedDelayString =  "PT3S", initialDelay = 3000L)
//
//    //	cron format ( second, minute, hour, day(month), month, day(week))
//    @Scheduled(cron = "*/2 * * * * *")
//    public void job() throws InterruptedException {
//        Log.info("job1 current time :" + new Date());
//        Thread.sleep(1000L);
//
//    }
//    @Scheduled(cron = "*/2 * * * * *")
//    public void job2() throws InterruptedException {
//        Log.info("job2 current time :" + new Date());
//        Thread.sleep(1000L);
//    }
//}
