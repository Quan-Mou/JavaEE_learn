package pers.quan.spring.service2;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

//@Component
//@Aspect
public class TransactionAspect {

    @Pointcut("execution(* pers.quan.spring.service2..*(..))")
    public void commonPoint() {}

    @Around("commonPoint()")
    public void aroundAdvice(ProceedingJoinPoint pjp) {
        System.out.println("开启事务");
        try {
            pjp.proceed();
            System.out.println("提交事务");
        } catch (Throwable throwable) {
            System.out.println("回滚事务");
            throwable.printStackTrace();
        }
    }


}
