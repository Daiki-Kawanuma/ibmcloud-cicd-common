package com.project_respite.ibmcloud_cicd.common;

import org.junit.Test;

import java.math.BigInteger;

import static org.junit.Assert.assertEquals;

public class FibonacciSequenceTest {

    @Test
    public void testNary1() throws Exception {
        assertEquals(FibonacciSequence.nary(BigInteger.valueOf(1)), new BigInteger("1"));
    }

    @Test
    public void testNary10() throws Exception {
        assertEquals(FibonacciSequence.nary(BigInteger.valueOf(10)), new BigInteger("55"));
    }

    @Test
    public void testNary50() throws Exception {
        assertEquals(FibonacciSequence.nary(BigInteger.valueOf(50)), new BigInteger("12586269025"));
    }

    @Test
    public void testNary100() throws Exception {
        assertEquals(FibonacciSequence.nary(BigInteger.valueOf(100)), new BigInteger("354224848179261915075"));
    }

    @Test
    public void testNary1000() throws Exception {
        assertEquals(FibonacciSequence.nary(BigInteger.valueOf(1000)), new BigInteger("43466557686937456435688527675040625802564660517371780402481729089536555417949051890403879840079255169295922593080322634775209689623239873322471161642996440906533187938298969649928516003704476137795166849228875"));
    }
}
