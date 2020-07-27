/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mpalaResearch.Repositories;

import com.mpalaResearch.Datalayer.PostGL;
import com.mpalaResearch.responses.OperationsResponse;
import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author mutub
 */
public interface PostGLRepository extends JpaRepository<PostGL, Long>{
    @Query("select new com.mpalaResearch.responses.OperationsResponse(a.description,a.accountLink,sum(v.debit-v.credit)) from PostGL v join Accounts a on v.accountLink=a.accountLink where v.txDate between :startDate and :endDate and a.accountLink in (:accountLinks)group by a.description,a.accountLink")
     public List<OperationsResponse>findByDateBetweenAndAccountLinks(@Param("startDate")Date startDate,@Param("endDate")Date endDate,@Param("accountLinks")List<Integer>accountLinks);
}
