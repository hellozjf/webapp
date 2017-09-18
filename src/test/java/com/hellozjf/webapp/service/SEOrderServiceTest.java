package com.hellozjf.webapp.service;

import static org.testng.Assert.assertEquals;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTransactionalTestNGSpringContextTests;
import org.testng.annotations.Test;

@ContextConfiguration("classpath*:/webapp-context.xml")
public class SEOrderServiceTest extends AbstractTransactionalTestNGSpringContextTests {

    @Autowired
    private SEOrderService seOrderService;
    
    @Test
    public void getFBillNo() {
        String FBrNo = "0";
        int FInterID = 1134;
        String FBillNo = seOrderService.getFBillNoByFBrNoAndFInterID(FBrNo, FInterID);
        assertEquals(FBillNo, "abc123");
    }
}
