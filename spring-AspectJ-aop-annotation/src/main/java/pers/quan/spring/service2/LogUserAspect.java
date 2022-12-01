package pers.quan.spring.service2;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Aspect
@Component
public class LogUserAspect {
//    需求是这样的：项目开发结束了，已经上线了。
//    运行正常。客户提出了新的需求：凡事在系统中进行修改操作的，删除操作的，新增操作的，都要把这个人记录下来。因为这几个操作是属于危险行为。

    @Pointcut("execution(* pers.quan.spring.service2.UserService.addUser(..))")
    public void addPoint(){}

    @Pointcut("execution(* pers.quan.spring.service2.UserService.modifyUser(..))")
    public void modifyPoint(){}

    @Pointcut("execution(* pers.quan.spring.service2.UserService.deleteUser(..))")
    public void deletePoint(){}





    @Around("addPoint() || modifyPoint() || deletePoint()")
    public void aroundAdvice(ProceedingJoinPoint pjp) {
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        String format = s.format(new Date());
        System.out.println("韩立 在时间：" + format + "操作了" + pjp.getSignature().getName() + "方法");
        try {
            pjp.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }
}
