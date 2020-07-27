/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mpalaResearch.Repositories;

import com.mpalaResearch.Datalayer.Accounts;
import java.util.List;
import org.eclipse.persistence.internal.oxm.record.deferred.StartCDATAEvent;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author mutub
 */
public interface AccountsRepository extends JpaRepository<Accounts, Object>{
// public List<Accounts>findByDateBetween(String startDate,String endDate);
}
