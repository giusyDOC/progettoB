package com.doc.test;

import android.app.Activity;
import android.os.Bundle;

public class WelcomeActivity extends Activity
{
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

	System.out.println("Questa è una stampa ");
    
    	System.out.println("questa modifica fatta da dev2 causerà un errore - provo a modificare");
	System.out.println("Simulo una modifica da un'altra postazione");
	}

}
