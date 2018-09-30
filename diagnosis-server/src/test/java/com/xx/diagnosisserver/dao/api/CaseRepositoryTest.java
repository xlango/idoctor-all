package com.xx.diagnosisserver.dao.api;

import com.xx.diagnosisserver.BaseTests;
import com.xx.diagnosisserver.dao.CaseDao;
import com.xx.diagnosisserver.entity.Case;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CaseRepositoryTest extends BaseTests {

    @Autowired
    private CaseDao caseDao;
    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Test
    public void save() {

        Case aCase = new Case();
        aCase.setPid(1L);
        aCase.setDetectionid(1L);
        aCase.setDetectionresultid(1L);
        aCase.setDiagnosisid(1L);
        aCase.setDiagnosisresultid(1L);
        aCase.setHospitalizationid(1L);
        aCase.setPrescriptionid(1L);
        Date date = new Date();
        aCase.setTime(sdf.format(date));
        caseDao.save(aCase);
    }

    @Test
    public void findByPidAndTime() {
        Case c=caseDao.findByPidAndTime(1L,"2018-09-27 14:50:14");

        System.out.println("=============="+c.getDetectionid()+" "+c.getDetectionresultid()+" "+c.getTime());
    }
}