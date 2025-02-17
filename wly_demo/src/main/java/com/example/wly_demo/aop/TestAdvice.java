package com.example.wly_demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class TestAdvice {


    //统计目标方法耗时
    @Around("execution(* com.example.wly_demo.*.*.getStudnetById(..))")
    public Object method(ProceedingJoinPoint pjp) throws Throwable {
        //记录运行前时间start
        long start = System.nanoTime();

        //执行目标方法
        Object result = pjp.proceed();

        //记录运行后时间end
        long end = System.nanoTime();


        //start-end
        System.out.println("目标方法"+pjp.toShortString()+"运行时间"+(end-start)+"纳秒");
        return result;
    }
}
