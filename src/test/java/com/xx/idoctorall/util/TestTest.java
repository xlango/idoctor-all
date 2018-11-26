package com.xx.idoctorall.util;

import com.xx.idoctorall.BaseTests;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class TestTest extends BaseTests {

    @Autowired
    private com.xx.idoctorall.util.Test  test;

    @Test
    public void loadPic() {
        test.loadPic();
    }
}