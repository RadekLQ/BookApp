package be.lizak.bookapp;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class BookAspect {

    @Before("execution(* be.lizak.bookapp.service.BookServiceImpl.findAll(..))")
    public void loggingAdvice(JoinPoint joinPoint) {
        System.out.println("LOGGINGADVICE: Before execution of" + joinPoint.getSignature().getName() + "method!");
    }

    @Before("execution(* *.find*(..))")
    public void loggingAdvice2(JoinPoint joinPoint) {
        System.out.println("LOGGINGADVICE2: Before execution of" + joinPoint.toLongString() + "method!");
    }

    @After("within(be.lizak.bookapp.service..*)")
    public void loggingAdvice3() {
        System.out.println("Something happened in Service Package");
    }
}
