package com.xx.idoctorall.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

@ConfigurationProperties(prefix = "async.threadpool")
public class AsyncThreadPoolConfig {
    private int corePoolSize;
    private int maxPoolSize;
    private int queueCapacity;
    private int keepAliveSeconds;

    @Bean
    public Executor messageExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(corePoolSize);
        executor.setMaxPoolSize(maxPoolSize);
        //队列最大长度 默认为Integer.MAX_VALUE 太大了阻塞容易瘫
        executor.setQueueCapacity(queueCapacity);
        //线程维护时间 默认360
        executor.setKeepAliveSeconds(keepAliveSeconds);
        executor.setThreadNamePrefix("messageExecutor");
        // CALLER_RUNS：不在新线程中执行任务，而是有调用者所在的线程来执行
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
        executor.initialize();
        return executor;
    }
}
