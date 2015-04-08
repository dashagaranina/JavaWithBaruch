package foo.bar.lab06;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DatabaseExceptionMailDeliverAspect {
    @AfterThrowing(
//            pointcut = "execution(* *.*(..))",
              pointcut = "within(@org.springframework.stereotype.Repository *)*",
            throwing= "error")
    public void sendMailAfterThrowing(JoinPoint joinPoint, DatabaseException error) {

        System.out.println("RepositoryImpl throws exception!");
        System.out.println("Failed : " + joinPoint.getSignature().getName());
        System.out.println("Exception : " + error);
        System.out.println("******");

    }
}
