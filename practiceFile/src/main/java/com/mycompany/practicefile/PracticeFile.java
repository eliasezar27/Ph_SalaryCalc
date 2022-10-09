/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicefile;

/**
 *
 * @author Asus
 */

public class PracticeFile {

    public static void main(String[] args) {
        NetProfit net1;
        net1 = new NetProfit(15500, "semi-monthly");
        
        NetProfit net2 = new NetProfit(31000, "monthly");
    }
}

class NetProfit {
    
    public NetProfit(float gross, String cutOff){
        
        float sss = this.sss_deduction(gross);
        System.out.println("Less SSS: " + sss);
        
        float philH = this.philhealth_deduction(gross, cutOff);
        System.out.println("Less PhilHealth: " + philH);
        
        float pagibig = this.pagibig_deduction(gross);
        System.out.println("Less Pag-IBIG: " + pagibig);
        
        float taxable = gross - sss - philH - pagibig;
        System.out.println("Taxable income: " + taxable);
        
        float tax = this.gross_Salary(taxable, cutOff);
        System.out.println("Tax: " + tax);
        
        float netInc = taxable - tax;        
        System.out.println("Your Net Profit is: " + String.format("PhP %,.2f", netInc));
        System.out.println("");
        
    }
    
    
    final float sss_deduction(float gross){
        float deduction = 0;
        
        if(gross <= 3000){
            deduction = (float) 135.0;
        }else if(gross <= 3500) {
            deduction = (float) 157.5;
        }else if(gross <= 4000) {
            deduction = (float) 180;
        }else if(gross <= 4500) {
            deduction = (float) 202.5;
        }else if(gross <= 5000) {
            deduction = (float) 225;
        }else if(gross <= 5500) {
            deduction = (float) 247.5;
        }else if(gross <= 6000) {
            deduction = (float) 270;
        }else if(gross <= 6500) {
            deduction = (float) 292.5;
        }else if(gross <= 7000) {
            deduction = (float) 315;
        }else if(gross <= 7500) {
            deduction = (float) 337.5;
        }else if(gross <= 8000) {
            deduction = (float) 360;
        }else if(gross <= 8500) {
            deduction = (float) 382.5;
        }else if(gross <= 9000) {
            deduction = (float) 405;
        }else if(gross <= 9500) {
            deduction = (float) 427.5;
        }else if(gross <= 10000) {
            deduction = (float) 450;
        }else if(gross <= 10500) {
            deduction = (float) 472.5;
        }else if(gross <= 11000) {
            deduction = (float) 495;
        }else if(gross <= 11500) {
            deduction = (float) 517.5;
        }else if(gross <= 12000) {
            deduction = (float) 540;
        }else if(gross <= 12500) {
            deduction = (float) 562.5;
        }else if(gross <= 13000) {
            deduction = (float) 585;
        }else if(gross <= 13500) {
            deduction = (float) 607.5;
        }else if(gross <= 14000) {
            deduction = (float) 630;
        }else if(gross <= 14500) {
            deduction = (float) 652.5;
        }else if(gross <= 15000) {
            deduction = (float) 675;
        }else if(gross <= 15500) {
            deduction = (float) 697.5;
        }else if(gross <= 16000) {
            deduction = (float) 720;
        }else if(gross <= 16500) {
            deduction = (float) 742.5;
        }else if(gross <= 17000) {
            deduction = (float) 765;
        }else if(gross <= 17500) {
            deduction = (float) 787.5;
        }else if(gross <= 18000) {
            deduction = (float) 810;
        }else if(gross <= 18500) {
            deduction = (float) 832.5;
        }else if(gross <= 19000) {
            deduction = (float) 855;
        }else if(gross <= 19500) {
            deduction = (float) 877.5;
        }else if(gross <= 20000) {
            deduction = (float) 900;
        }else if(gross > 20000) {
            deduction = (float) 922.5;
        }
                
        return deduction;
    }
    
    
    final float philhealth_deduction(double gross, String cutOff){
        
        if(!cutOff.toLowerCase().equals("monthly")){
            gross *= 2;
        }
        
        float deduction = (float)((gross * 0.04)/2);
        
        return deduction;
    }
    
    final float pagibig_deduction(double gross){
        
        float deduction = (float)(100);
        
        return deduction;
    }
    
    public float monthlySalary(float gross){
        float netInc = 0;
        
        if(gross < 20833){
            netInc = gross;
        }else if((gross >= 20833) && (gross <= 33332)){
            netInc = (float)(0 + ((gross-20833) * 0.2));
        }else if((gross >= 33333) && (gross <= 66666)){
            netInc = (float)(2500 + ((gross-33333) * 0.25));
        }else if((gross >= 66667) && (gross <= 166666)){
            netInc = (float)(10833.33 + ((gross-66667) * 0.3));
        }else if((gross >= 166667) && (gross <= 666666)){
            netInc = (float)(40833.33 + ((gross-166667) * 0.32));
        }else if(gross >= 666667){
            netInc = (float)(200833.33 + ((gross-666667) * 0.35));
        }
                
        return netInc;
    }
    
    
    public float semi_monthlySalary(float gross){
        float netInc = 0;
        
        if(gross < 10417){
            netInc = gross;
        }else if((gross >= 10417) && (gross <= 16666)){
            netInc = (float)(0 + ((gross-10417) * 0.2));
        }else if((gross >= 16667) && (gross <= 33332)){
            netInc = (float)(1250 + ((gross-16667) * 0.25));
        }else if((gross >= 33333) && (gross <= 83332)){
            netInc = (float)(5416.67 + ((gross-33333) * 0.3));
        }else if((gross >= 83333) && (gross <= 333332)){
            netInc = (float)(20416.67 + ((gross-83333) * 0.32));
        }else if(gross >= 333333){
            netInc = (float)(100416.67 + ((gross-333333) * 0.35));
        }
                
        return netInc;
    }
    
    
    final float gross_Salary(float taxable, String cutOff){
        
        float netSalary = 0;
        
        if(cutOff.toLowerCase().equals("monthly")){
            netSalary = this.monthlySalary(taxable);
        }else if (cutOff.toLowerCase().equals("semi-monthly")){
            netSalary = this.semi_monthlySalary(taxable);
        }
        
        return netSalary;
    }
    
}