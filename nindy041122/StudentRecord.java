/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nindy041122;

/**
 *
 * @author hp
 */

public class StudentRecord 
{ 
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade; 
    private double average; 
    private double maximum; 
    //area penulisan kode selanjutnya 
    
    private static int studentCount;
    
    public StudentRecord(){ 
        
    }
    
    public StudentRecord(String temp){
        this.name = temp;
    }
    
    public StudentRecord(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public StudentRecord(double mGrade, double eGrade,double sGrade){
        mathGrade=mGrade;
        englishGrade=eGrade;
        scienceGrade=sGrade;
    }
    
    public String getName(){ 
        return name; 
    }
    
    public void setName( String name ){ 
        this.name = name; 
    } 
    
    public String getAddress(){ 
        return address; 
    }
    
    //address
    public void setAddress( String address ){ 
        this.address = address; 
    } 
    
    //age
    public int getAge() {
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    //mathGrade
    public double getmathGrade() {
        return mathGrade;
    }
    
    public void setmathGrade(double mathGrade){
        this.mathGrade = mathGrade;
    }
    
    //englishGrade
    public double getenglishGrade() {
        return englishGrade;
    }
    
    public void setenglishGrade(double englishGrade){
        this.englishGrade = englishGrade;
    }
    
    //scienceGrade
    public double getscienceGrade() {
        return scienceGrade;
    }
    
    public void setscienceGrade(double scienceGrade){
        this.scienceGrade = scienceGrade;
    }
    
    //average
    public double getaverage(){
        average = (mathGrade + englishGrade + scienceGrade)/3;
        return average;
    }
    
    public int studentCount(){
        return studentCount;
    
    }
    
    //maximum
    public double getMaximum() {
    
        maximum = (mathGrade >= englishGrade)? mathGrade:englishGrade;
        maximum = (scienceGrade >= maximum)? scienceGrade:maximum;
        
        return maximum;
    }
} 