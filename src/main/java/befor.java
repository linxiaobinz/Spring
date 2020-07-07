import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class befor implements MethodBeforeAdvice {
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("a");
    }
}
