package com.hellozjf.webapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hellozjf.webapp.dao.SEOrderDao;
import com.hellozjf.webapp.domain.SEOrder;

@Service
public class SEOrderService {

    @Autowired
    private SEOrderDao seOrderDao;
    
    public String getFBillNoByFBrNoAndFInterID(String FBrNo, int FInterID) {
        SEOrder seOrder = seOrderDao.getSEOrderByFBrNoAndFInterID(FBrNo, FInterID);
        return seOrder.getFBillNo();
    }
}
