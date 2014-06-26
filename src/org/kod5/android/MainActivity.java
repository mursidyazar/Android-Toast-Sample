package org.kod5.android;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.Toast;

public class MainActivity extends Activity {

	//Bu k�s�mda bile�enlerimizi tan�ml�yoruz.
	private Button button;
	private RelativeLayout layout;
	private int kontrol=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) { //Bu metod uygulama a��ld���nda �al��t�r�lan metod.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Bu k�s�mda yukar�da tan�mlad���m�z bile�enlerle xml olarak haz�rlad���m�z bile�enleri birbirlerine ba�l�yoruz. 
        button = (Button)findViewById(R.id.button1);
        layout = (RelativeLayout)findViewById(R.id.layout);
        
		layout.setBackgroundColor(Color.CYAN);//layout'un arkaplan�n� ayarl�yoruz.

        button.setOnClickListener(new OnClickListener() {  
			
			@Override
			public void onClick(View v) { //Burada Buttona t�kland���nda �al��t�r�lacak kodlar yer al�yor.
			  
				Toast.makeText(getApplicationContext(),"Arkaplan Rengi De�i�ti.", Toast.LENGTH_LONG).show();
				if(kontrol==0){
					layout.setBackgroundColor(Color.parseColor("#f8a64c"));
					kontrol=1;
				}else{
					layout.setBackgroundColor(Color.CYAN);
					kontrol=0;
				}
				  			
			}
		});
        
        
    }
}
