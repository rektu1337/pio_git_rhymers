package edu.kis.vh.nursery;

import org.junit.Assert;
import org.junit.Test;

public class DefaultCountingOutRhymerTest {

    @Test
    public void testCallCheck() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        boolean result = rhymer.callCheck();
        Assert.assertEquals(true, result);
    }

    @Test
    public void testCountIn() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        rhymer.countIn(4);
        int result = rhymer.peekaboo();
        Assert.assertEquals(4, result);
    }

    @Test
    public void testCountOut() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        rhymer.countIn(8);
        int result = rhymer.countOut();
        Assert.assertEquals(8, result);

        int emptyResult = rhymer.countOut();
        Assert.assertEquals(defaultCountingOutRhymer.EMPTY_RHYMER_INDICATOR, emptyResult);
    }

    @Test
    public void testIsFull() {
        defaultCountingOutRhymer rhymer = new defaultCountingOutRhymer();
        for (int i = 0; i < defaultCountingOutRhymer.MAX_CAPACITY; i++) {
            boolean isFull = rhymer.isFull();
            Assert.assertEquals(false, isFull);
            rhymer.countIn(888);
        }

        boolean isFull = rhymer.isFull();
        Assert.assertEquals(true, isFull);
    }
}