package com.example.yakisoba;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class YummyTest {

    @Autowired
    Yummy Yummy;

    @Test
    public void testHello() throws Exception{
        assertEquals("hello", Yummy.hello());
    }
}