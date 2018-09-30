package com.xx.diagnosisserver;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest
@Rollback(value = false)
@Transactional(rollbackOn = Exception.class)
public class BaseTests {

    @Test
    public void contextLoads() {
    }

}
