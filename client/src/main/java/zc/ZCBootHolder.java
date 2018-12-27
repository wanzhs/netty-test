package zc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.text.MessageFormat;
import java.util.concurrent.atomic.AtomicInteger;

@Slf4j
@Component
public class ZCBootHolder implements ApplicationContextAware {
    private static ApplicationContext applicationContext=null;
    public static ApplicationContext getApplicationContext(){
        return applicationContext;
    }
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name){
        return (T)applicationContext.getBean(name);
    }
    public static <T> T getBean(Class<T> requiredType){
        return (T)applicationContext.getBean(requiredType);
    }
    public static void clearHolder(){
        applicationContext=null;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ZCBootHolder.applicationContext=applicationContext;
    }

    private static final int THREADS_CONUT = 20;
    public  static AtomicInteger count = new AtomicInteger(0);
//    public volatile static int count = 0;
    public static void increase() {
        count.incrementAndGet();
//        count++;
    }
//    @PostConstruct
    public void start(){

        System.out.println("++++++++++++++++++++++++++++");
        System.out.println("ApplicationContextAware测试成功");
        System.out.println("++++++++++++++++++++++++++++");
        AtomicInteger atomicInteger=new AtomicInteger();
        Thread[] threads = new Thread[THREADS_CONUT];
        for (int i = 0; i < THREADS_CONUT; i++) {
            threads[i] = new Thread(new Runnable() {
                public void run() {
                    for (int i = 0; i < 10000; i++) {
                        increase();
                    }
                }
            });
            threads[i].start();
        }
        while (Thread.activeCount()>2){
            Thread.yield();
        }
//        System.out.println("Thread"+Thread.activeCount());
        System.out.println(count);
    }

    @PostConstruct
    public void start1(){
        System.out.println("+++++++++++++++++++++++++++++++");
        String ctrlAddress="23456";
        log.info("集控器,{},没有登陆",ctrlAddress);
        String message= MessageFormat.format("平安到家，{0}，你好,{1}，我爱你..........","wanzhs","nanyan");
        log.info(message);
        System.out.println("+++++++++++++++++++++++++++++++");
    }

}
