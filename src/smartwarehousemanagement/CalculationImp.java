/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smartwarehousemanagement;

/**
 *
 * @author NISHU JAYASUNDARA
 */
public class CalculationImp implements Calculations {
    
    Double space;
    double duration;
    double Total;
    double Pay;
    double Balance;
    double subtotal;

 
    @Override
    public double calculation(double space, double duration, double Total) {
        
        if(space < 20 ){
           
           Total = space*40*duration; 
        
        } else if(space < 40){
            
            Total = space *60* duration; 
        
        }else if(space < 50){
            
            Total = space * 80 * duration; 
        }else if(space < 40){
            
            Total = space * 50 * duration; 
        }
        else{
        
            Total = space * 100 *duration; 
        }
        
               return Total;
        
    }

    @Override
    public double balance(double Total,double pay,double Balance) {
        Balance = pay - Total;
        return Balance;
    }
    }

  
    

