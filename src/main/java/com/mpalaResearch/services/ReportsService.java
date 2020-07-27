/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mpalaResearch.services;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.HashBiMap;
import com.mpalaResearch.Datalayer.Accounts;
import com.mpalaResearch.Repositories.AccountsRepository;
import com.mpalaResearch.Repositories.PostGLRepository;
import com.mpalaResearch.responses.OperationsResponse;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author mutub
 */
@Service
public class ReportsService {
   @Autowired
   private AccountsRepository accountsRepository;
   @Autowired
   private PostGLRepository postGLRepository;
   ObjectMapper obj=new ObjectMapper();
    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");

   
   public Map<String,List> summarySheet(String startDate,String endDate) throws Exception{
       try {
           List<Integer>allIds=new ArrayList<>();
          Map<String,List>maps=new HashMap<>();
          List<Accounts>accounts=accountsRepository.findAll();
        List<Integer>incomeAccountLinks=accounts.stream().filter(r->r.getDescription().startsWith("Income")).map((Accounts a)->a.getAccountLink()).collect(Collectors.toList());
        List<Integer>CogAccountLinks=accounts.stream().filter(r->r.getDescription().startsWith("Cost of Sales")).map((Accounts a)->a.getAccountLink()).collect(Collectors.toList());
       List<Integer>ExpenseAccountLinks=accounts.stream().filter(r->r.getDescription().contains("Cost")).map((Accounts a)->a.getAccountLink()).collect(Collectors.toList());
        ExpenseAccountLinks.removeAll(CogAccountLinks);
       allIds.addAll(CogAccountLinks);
       allIds.addAll(incomeAccountLinks);
       allIds.addAll(ExpenseAccountLinks);
        Date date=format.parse(startDate);
        Date date1=format.parse(endDate);
         List<OperationsResponse> pvalues=postGLRepository.findByDateBetweenAndAccountLinks(date, date1,allIds);
         List<OperationsResponse>postGlIncome=pvalues.stream().filter(i->incomeAccountLinks.contains(i.getAccountLink())).map((OperationsResponse p)->p).collect(Collectors.toList());
         postGlIncome.parallelStream().forEach(action->{
         action.setTotal(action.getTotal()*-1);
         });
         List<OperationsResponse>postGlCog=pvalues.stream().filter(i->CogAccountLinks.contains(i.getAccountLink())).map((OperationsResponse p)->p).collect(Collectors.toList());
         List<OperationsResponse>postGlExpenses=pvalues.stream().filter(i->ExpenseAccountLinks.contains(i.getAccountLink())).map((OperationsResponse p)->p).collect(Collectors.toList());
           //System.out.println("postGlCog: "+ obj.writerWithDefaultPrettyPrinter().writeValueAsString(CogAccountLinks));
         maps.put("INCOME", postGlIncome);
         maps.put("COGS",postGlCog);
         maps.put("EXPENSES", postGlExpenses); 
    return maps;
       } catch (Exception e) {

           throw e;
       }
      
   }
   public Map<String,List>OperationsSheet(String startDate,String endDate) throws Exception{
       try {
           List<Integer>allIds=new ArrayList<Integer>();
           Map<String,List>maps=new HashMap<>();
           List<Accounts>accounts=accountsRepository.findAll();
           List<Integer>serviceIncomeLinks=accounts.stream().filter(r->r.getDescription().contains("Recoverable")).map((Accounts a)->a.getAccountLink()).collect(Collectors.toList());
           List<Integer>CogAccountLinks=accounts.stream().filter(r->r.getDescription().startsWith("Cost of Sales")).map((Accounts a)->a.getAccountLink()).collect(Collectors.toList());
           List<Integer>donationsLinks=accounts.stream().filter(r->r.getDescription().contains("Donation")).map((Accounts a)->a.getAccountLink()).collect(Collectors.toList());
           //donationsLinks.removeAll(incomeAccountLinks);
           allIds.addAll(donationsLinks);
           allIds.addAll(CogAccountLinks);
           allIds.addAll(serviceIncomeLinks);
           Date date=format.parse(startDate);
           Date date1=format.parse(endDate);
        
           
           List<OperationsResponse>postGlValues=postGLRepository.findByDateBetweenAndAccountLinks(date, date1,allIds);
           List<OperationsResponse>postGlDonations=postGlValues.stream().filter(f->donationsLinks.contains(f.getAccountLink())).map((OperationsResponse h)->h).collect(Collectors.toList());
           postGlDonations.parallelStream().forEach(action->{
           action.setTotal(action.getTotal()*-1);
           });
           List<OperationsResponse>postServiceIncome=postGlValues.stream().filter(f->serviceIncomeLinks.contains(f.getAccountLink())).map((OperationsResponse h)->h).collect(Collectors.toList());
            List<OperationsResponse>postCog=postGlValues.stream().filter(f->CogAccountLinks.contains(f.getAccountLink())).map((OperationsResponse h)->h).collect(Collectors.toList());
           
           maps.put("DONATIONS", postGlDonations);
           maps.put("SERVICEINCOME", postServiceIncome);
           maps.put("COG", postCog);
          return maps;
       } catch (Exception e) {
           throw e;
       }
   
   }
}
