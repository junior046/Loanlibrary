/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BusinessLayer;

import DataAccess.User;


/**
 *
 * @author David B
 */
public class Session {
    private Session currentSesion;
    private User currentUser;

    
    private Session(User currentUser){
        this.currentUser= currentUser;
    }
    
    public Session getCurrentSession(String username, String password){
        if(currentSesion==null && User.validateUser(username,password)) 
            currentSesion = new Session(new User(username,password));
        return currentSesion;
    }

    public User getCurrentUser() {
        return currentUser;
    }
    
}
