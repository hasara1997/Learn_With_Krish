/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import business.DbServiceImpl;
import javax.jws.WebMethod;
import javax.jws.WebService;



/**
 *
 * @author manee
 */
@WebService
public class FindBD {
    
    DbServiceImpl dbService=new DbServiceImpl();
    
   @WebMethod
    public int calculateDB(int year,int month,int day){
        return dbService.calculateDB(year, month, day);
    }
    
    
}
