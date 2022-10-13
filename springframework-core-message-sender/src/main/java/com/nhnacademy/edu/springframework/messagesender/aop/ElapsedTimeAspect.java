package com.nhnacademy.edu.springframework.messagesender.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Aspect
@Component
public class ElapsedTimeAspect {
    @Pointcut("execution(* com.nhnacademy.edu.springframework.messagesender.service..sendMessage(..))")
    private void serviceOperation() {}

    @Around("serviceOperation()")
    private Object loggingSendMessage(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stopWatch = new StopWatch("logger");
        try {
            stopWatch.start();

            pjp.proceed();

            return pjp;
        } finally {
            stopWatch.stop();
            System.out.println(stopWatch.prettyPrint());
        }
    }


}
