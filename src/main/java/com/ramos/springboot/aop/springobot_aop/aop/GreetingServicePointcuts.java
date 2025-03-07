package com.ramos.springboot.aop.springobot_aop.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class GreetingServicePointcuts {
    @Pointcut("execution(* com.ramos.springboot.aop.springobot_aop.services.GreetingService.*(..))")
    public void greetingLoggerPointCut(){    }
}
