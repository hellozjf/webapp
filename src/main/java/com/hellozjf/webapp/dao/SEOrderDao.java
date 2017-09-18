package com.hellozjf.webapp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hellozjf.webapp.domain.SEOrder;

@Repository
public class SEOrderDao {
    
    @Autowired
    private JdbcTemplate sqlserverJdbcTemplate;
    
    public SEOrder getSEOrderByFBrNoAndFInterID(String FBrNo, int FInterID) {
        String sql = "select * from dbo.SEOrder where FBrNo=? and FInterID=?";
        SEOrder seOrder = new SEOrder();
        sqlserverJdbcTemplate.query(sql, new Object[] {FBrNo, FInterID}, (rs) -> {
            seOrder.setFBrNo(FBrNo);
            seOrder.setFInterID(FInterID);
            seOrder.setFBillNo(rs.getString("FBillNo"));
        });
        return seOrder;
    }
}
