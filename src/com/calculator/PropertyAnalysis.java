/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TabHost.OnTabChangeListener;

/**
 *
 * @author Collins
 */
public class PropertyAnalysis extends Activity implements OnTabChangeListener{

    /**
     * Called when the activity is first created.
     * @param icicle
     */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.propertyanalysis);
        // ToDo add your GUI initialization code here        
    }

    public void onTabChanged(String tabId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
