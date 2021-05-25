/*
 * Watch.java represents watches
 * David Lonie, 18/11/2019, dpl0795
 */
package mainapp;

import java.time.LocalDate;
import java.util.ArrayList;

public class Watch {
    
    private final String make;
    private String comments;
    private double charge;
    
    
    public Watch( String m){
        this.make=m;
        this.charge=0.0;
        this.comments="";
        
    }
  
    public String getMake(){
        return make;
    }
    
    public double getCharge(){
        return charge;
    }
    
    public void addToCharge(double v){
        this.charge +=v;
    }
    public String getComments(){
        return comments;
    }
    public void addComment(String s){
        this.comments += s+ "\n";
        
    }

    @Override
    public String toString() {
        return "Make=" + make + ", charge=" + charge +"\ncomments = "+ comments;
    }
    public void service(){
        addComment("Watch Serviced "+LocalDate.now());
    }
    public static void main(String[] args) {
        Watch w1 = new Watch("Seiko");
        System.out.println(w1);
        w1.service();
        System.out.println(w1);
    }
}