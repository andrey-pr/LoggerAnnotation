package logannotation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.logging.Logger;

public class ProxyMethod implements InvocationHandler {
    private final Object original;
    Logger logger;

    public ProxyMethod(Object original) {
        this.original = original;
        logger = Logger.getLogger(ProxyMethod.class.getName());
    }

    public Object invoke(Object proxy, Method method, Object[] args)
            throws IllegalAccessException, IllegalArgumentException,
            InvocationTargetException {
        LogFunc annotation = method.getAnnotation(LogFunc.class);
        if (annotation != null) {
            logger.log(annotation.level().getLevel(), Arrays.toString(args));
        }
        Object result = method.invoke(original, args);
        if (annotation != null) {
            logger.log(annotation.level().getLevel(), result.toString());
        }
        return result;
    }
}
