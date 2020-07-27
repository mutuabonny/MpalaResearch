/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mpalaResearch.Controller;

import com.mpalaResearch.services.ReportsService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author mutub
 */
@RestController
@RequestMapping("/api/ReportsController")
public class ReportsController {
    @Autowired
    private ReportsService reportsService;
    
    @GetMapping(value = {"/getIncomes"})
   public Map<String,List> summarySheet(@RequestParam("startDate")String startDate,@RequestParam("endDate")String endDate) throws Exception{
        try {
           return reportsService.summarySheet(startDate, endDate);
        } catch (Exception e) {
            throw e;
        }
    }
  @GetMapping(value = {"/OperationsSheet"})
  public Map<String,List> OperationsSheet(@RequestParam("startDate")String startDate,@RequestParam("endDate")String endDate) throws Exception{
      try {
          return reportsService.OperationsSheet(startDate, endDate);
      } catch (Exception e) {
          throw e;
      }
  }
}
