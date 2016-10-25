package com.developes.hw1p5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public String sign = "";
    public int holdInt, num1;

    public void plus( View p){
        EditText e1 = (EditText)findViewById(R.id.num1);
       // EditText e2 = (EditText)findViewById(R.id.num2);
        TextView t1 = (TextView)findViewById(R.id.result);
         num1 = Integer.parseInt(e1.getText().toString());
        //int num2 = Integer.parseInt(e2.getText().toString());

        e1.append(Integer.toString(num1));
        holdInt = num1;
        e1.setText("");

        sign="+";

    }



    public void equals ( View eq){
        EditText e1 = (EditText)findViewById(R.id.num1);
        //EditText e2 = (EditText)findViewById(R.id.num2);
        TextView t1 = (TextView)findViewById(R.id.result);
        holdInt = Integer.parseInt(e1.getText().toString());
      //  int num2 = Integer.parseInt(e2.getText().toString());

        if(sign== "+"){

            try {
                e1.setText(Integer.toString(num1 + holdInt ));

            } catch (Exception e) {
                holdInt = 0;
                t1.setText("your math sucks...");
            }

        }





    }
}
