package test;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class ExceptionImplementation {
    public String checkForException(double number1, double number2, char opr) throws Exception
    {
        if (number1 > 1000 || number2 > 1000){
            throw new NumberIsLargeException("large");
        }

        else if (number1 < 0 || number2 < 0){
            throw new NumberIsNegativeException("negative");
        }
        else if (opr!= '+' && opr!= '-' && opr!= '*'){
            throw new Exception(opr+ " is not a valid operator");
        }
        else return "No Exception Found";
    }
    public double evaluate(double val1, double val2, char opr) throws NumberIsLargeException, NumberIsNegativeException, Exception{
        double result=0.0;
        try {
        String z= checkForException(val1, val2, opr);
        } catch(NumberIsLargeException large) {
        	System.err.println(large.getMessage());
        }
        catch(NumberIsNegativeException neg) {
        	System.err.println(neg.getMessage());
        }
        
        
            switch(opr){
                case '+': result=val1+val2; 
                break;

                case '-': result=val1-val2; 
                break;

                case '*': result=val1*val2; 
                break;
            }
            return result;

    }     
}

class NumberIsLargeException extends Exception {
    //Write Your Code Here..
    public NumberIsLargeException(String s){
        super(s);
    }
}

class NumberIsNegativeException extends Exception {
    //Write Your Code Here..
    public NumberIsNegativeException(String s){
        super(s);
    }
}

class test2 {
    public static void main(String args[]) throws NumberIsLargeException, NumberIsNegativeException, Exception {
      ExceptionImplementation i = new ExceptionImplementation();
    	System.out.println(i.evaluate(2000.0, 2.0, '/'));
    }
}