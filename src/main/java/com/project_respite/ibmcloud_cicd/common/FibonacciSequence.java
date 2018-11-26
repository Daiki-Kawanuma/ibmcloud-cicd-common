package com.project_respite.ibmcloud_cicd.common;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class FibonacciSequence {

    private static final BigInteger ZERO = BigInteger.ZERO;
    private static final BigInteger ONE = BigInteger.ONE;
    private static final BigInteger TWO = ONE.add(ONE);

    private static final Map<BigInteger, BigInteger> FIBONACCI_MAP = new HashMap<>();
    static {
        FIBONACCI_MAP.put(ZERO, ZERO);
        FIBONACCI_MAP.put(ONE, ONE);
    }

    public static BigInteger nary(BigInteger n) {
        return FIBONACCI_MAP.computeIfAbsent(n, key -> nary(n.subtract(ONE)).add(nary(n.subtract(TWO))));
    }
}
