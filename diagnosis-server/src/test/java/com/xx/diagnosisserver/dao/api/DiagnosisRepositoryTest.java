package com.xx.diagnosisserver.dao.api;

import com.xx.diagnosisserver.BaseTests;
import com.xx.diagnosisserver.dao.DiagnosisDao;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;

public class DiagnosisRepositoryTest extends BaseTests {

    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Autowired
    private DiagnosisDao diagnosisDao;

    @Test
    public void save() {


    }
}