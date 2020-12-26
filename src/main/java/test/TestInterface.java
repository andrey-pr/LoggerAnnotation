package test;

import logannotation.LogFunc;
import logannotation.LogLevel;

public interface TestInterface {
    @LogFunc(level = LogLevel.INFO)
    double summ(double a, double b);
}
