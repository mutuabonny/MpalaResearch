/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mpalaResearch.responses;

import lombok.Data;

/**
 *
 * @author mutub
 */
@Data
public class OperationsResponse {
   private String name;   
   private double total; 
   private Integer AccountLink;
    public OperationsResponse(String name,Integer AccountLink, double total) {
        this.name = name;
        this.AccountLink=AccountLink;
        this.total = total;
       
    }
   
   
}
