package pers.quan.spring.service;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

//切面类
@Aspect
@Component
public class MyAspectJ {

    @Pointcut("execution(* pers.quan.spring.service.*.*(..))")
    public void commonPoint(){}

    //需要增强的代码-通知
//    切点表达式
//    @Before("execution(* pers.quan.spring.service.*(..))")
//    @Before("execution(* pers.quan.spring.service.*.*(..))")
//    public void advice() {
//        System.out.println("我是一个前置通知");
//    }
//
//    @AfterReturning("execution(* pers.quan.spring.service.*.*(..))")
//    public void afterReturningAdvice() {
//        System.out.println("后置通知");
//    }
//
//    @Around("execution(* pers.quan.spring.service.*.*(..))")
//    public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
//        System.out.println("环绕通知开始");
////        pjp.getSignature() 获取方法签名
//        System.out.println("方法名：" + pjp.getSignature().getName());
//        pjp.proceed();
//        System.out.println("环绕通知结束");
//    }
//
//    @AfterThrowing("execution(* pers.quan.spring.service.*.*(..))")
//    public void exceptionAdvice() {
//        System.out.println("异常通知");
//    }
//
//    @After("execution(* pers.quan.spring.service.*.*(..))")
//    public void finalAdvice() {
//        System.out.println("最终通知");
//    }

//    使用@Pointcut

    @Before("commonPoint()")
    public void advice() {
        System.out.println("我是一个前置通知");
    }

    @AfterReturning("commonPoint()")
    public void afterReturningAdvice() {
        System.out.println("后置通知");
    }

    @Around("commonPoint()")
    public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("环绕通知开始");
//        pjp.getSignature() 获取方法签名
        System.out.println("方法名：" + pjp.getSignature().getName());
        pjp.proceed();
        System.out.println("环绕通知结束");
    }

    @AfterThrowing("commonPoint()")
    public void exceptionAdvice() {
        System.out.println("异常通知");
    }

    @After("commonPoint()")
    public void finalAdvice() {
        System.out.println("最终通知");
    }

}
