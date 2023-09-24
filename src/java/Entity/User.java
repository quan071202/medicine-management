/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;


/**
 *
 * @author ASUS
 */
public class User {
    
     private String username;
     private String password;
     private String gmail;
     private int session;
      private int maCH;
    public User() {
    }

    public User(String username, String password, String gmail, int session, int maCH) {
        this.username = username;
        this.password = password;
        this.gmail = gmail;
        this.session = session;
        this.maCH = maCH;
    }

  

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public int getSession() {
        return session;
    }

    public void setSession(int session) {
        this.session = session;
    }

    public int getMaCH() {
        return maCH;
    }

    public void setMaCH(int maCH) {
        this.maCH = maCH;
    }

    @Override
    public String toString() {
        return "User{" + "username=" + username + ", password=" + password + ", gmail=" + gmail + ", session=" + session + ", maCH=" + maCH + '}';
    }

   
   

}
