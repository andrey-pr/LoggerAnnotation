import java.lang.reflect.Proxy;
import logannotation.LogFunc;
import logannotation.LogLevel;
import logannotation.ProxyMethod;
import test.TestClass;
import test.TestInterface;

public class TestMain {
    @LogFunc(level = LogLevel.INFO)
    public static void main(String[] args) {
        TestClass original = new TestClass();
        ProxyMethod handler = new ProxyMethod(original);
        TestInterface f
                = (TestInterface) Proxy.newProxyInstance(TestInterface.class.getClassLoader(),
                new Class[]{TestInterface.class},
                handler);
        f.summ(1, 1);
    }
}
