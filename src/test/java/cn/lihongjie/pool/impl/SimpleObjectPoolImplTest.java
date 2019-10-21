package cn.lihongjie.pool.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleObjectPoolImplTest {

    private SimpleObjectPoolImpl<TestObject> pool;

    @BeforeEach
    void setUp() {
        pool = new SimpleObjectPoolImpl<>();
    }

    @AfterEach
    void tearDown() {
    }


    public static class TestObject{

        private int n;

        public TestObject(final int n) {
            this.n = n;
        }
    }

    @Test
    void testAddAndGetObject() {

        TestObject object = new TestObject(1);
        pool.addObject(object);

        TestObject borrow = pool.borrow();


        assertTrue(object == borrow);
    }

    @Test
    void testBorrowAndReturn() {

        TestObject t = new TestObject(1);
        pool.addObject(t);
        assertNumber(1, 0, pool);
        TestObject borrow = pool.borrow();

        assertNumber(0, 1, pool);

        pool.returnObject(borrow);

        assertNumber(1, 0, pool);


    }

    private void assertNumber(final int idle,
                              final int active,
                              final SimpleObjectPoolImpl<TestObject> pool) {
        assertTrue(pool.getNumIdle() == idle);
        assertTrue(this.pool.getNumActive() == active);
    }


    @Test
    void testBorrowTimeOut() {

        SimpleObjectPoolImpl<TestObject> pool = new SimpleObjectPoolImpl<>(10000);

        TestObject t = new TestObject(1);
        pool.addObject(t);
        assertNumber(1, 0, pool);
        TestObject borrow = pool.borrow();


        pool.borrow();


    }



}