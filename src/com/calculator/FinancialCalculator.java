package com.calculator;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * FinancialCalculator class is the home screen of the application. This class
 * displays buttons that will take you to property financial calculators.
 */

public class FinancialCalculator extends Activity implements View.OnClickListener
{
    
Button buttonMonthlyCalculation;
Button buttonPropertyAnalysis;
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       
    buttonMonthlyCalculation = (Button)findViewById(R.id.buttonMonthlyCalculation);    
    buttonMonthlyCalculation.setOnClickListener(this);
    buttonPropertyAnalysis = (Button)findViewById(R.id.buttonPropertyAnalysis);    
    buttonPropertyAnalysis.setOnClickListener(this);
}
 /**
 * Methods will start the activity that was selected once clicked.
 */
    private void buttonMonthlyCalculationclick(){
        
        startActivity(new Intent("com.calculator.MonthlyPaymentCalculation"));
    }
    
    private void buttonPropertyAnalysisclick(){
        
        startActivity(new Intent("com.calculator.PropertyAnalysis"));
    }
    
 /**
 * Method called when a button is clicked from the home screen.
 */
    
    public void onClick(View v) {
        switch (v.getId())
        {
            
            case R.id.buttonPropertyAnalysis:
                buttonPropertyAnalysisclick();
                break;
                            
            case R.id.buttonMonthlyCalculation:
                buttonMonthlyCalculationclick();
                break;
                
        }
            
    }
}


