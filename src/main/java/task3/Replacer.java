package task3;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class Replacer implements MethodReplacer {
    @Override
    public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {

        System.out.println("Replacer");

        return obj;
    }

}
