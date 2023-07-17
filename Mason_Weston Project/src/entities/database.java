/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author cente
 */
public class database {
    private ArrayList<UserAccount> ua = new ArrayList<>();

    public database() {
        
    }
    
    public database(ArrayList<UserAccount> updatedDB) {
        this.ua = updatedDB;
    }
    
    public ArrayList<UserAccount> GetUser(){
        return ua;
    }
    public void addusers(UserAccount newuser) {
        ua.add(newuser);

    }       
            
}
