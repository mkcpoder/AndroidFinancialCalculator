package com.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import java.text.DecimalFormat;

/**
 * MonthlyPaymentCalculation class displays 3 text fields and allows the user to input
 * the property value, interest rate and term and it will return the monthly
 * payment
 */

/**
 *
 * @author Collins
 */
public class MonthlyPaymentCalculation extends Activity {

    EditText propertyValue;
    EditText interestRate;
    EditText term;
    TextView calculateResult;
    Button buttonCalculate;
    double num1,num2, num3, monthlyPayment;
    /**
     * Called when the activity is first created.
     * @param savedInstanceState
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.monthlypaymentcalculation); 

    
        propertyValue = (EditText)findViewById(R.id.value1);
        interestRate = (EditText)findViewById(R.id.value2);
        term = (EditText)findViewById(R.id.value3);
        calculateResult = (TextView)findViewById(R.id.txtResult);
        buttonCalculate = (Button)findViewById(R.id.buttonCalculate);
        
                buttonCalculate.setOnClickListener(new OnClickListener() {	
	public void onClick(View v) {
	        num1 = Double.parseDouble(propertyValue.getText().toString());
		num2 = (Double.parseDouble(interestRate.getText().toString())/100)/12;
                num3 = Double.parseDouble(term.getText().toString())*12;
                monthlyPayment = calculatePayment(num1, num2, num3);
		calculateResult.setText(new DecimalFormat("##.##").format(monthlyPayment));
    }
                
     /**
 * This method takes in the value of the property, interest rate and
 * term inputted by the user and calculates the monthly payment. 
 *
 * @param  {double} value    Property value inputted by the user
 * @param  {double} interest Current interest rate inputted by the user
 * @param  {double} term     Current term inputted by the user
 * @return {double} The calculated monthly payment
 */
             private double calculatePayment(double value, double interest, double term) {
                
                  double monthlyPayment = 
                      (value * interest) / (1 - Math.pow(1+interest, -term));
       
       return monthlyPayment;
           
            }
           
        });
    }
    
}
    

