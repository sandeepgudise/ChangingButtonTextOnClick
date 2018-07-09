package com.example.sandeep.changingbuttontext;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button button;
    private boolean isChanged = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn_change_text);
        button.setOnClickListener(this);
        button.setTag(1);
       // button.setText("sandeep kumar welcome");
    }

    @Override
    public void onClick(View v) {
        int status = (Integer) v.getTag();
        if (status == 1){
            button.setText("Hai sandeep");
            button.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
            v.setTag(0);
        }else {
            button.setText("Hello sandeep");
            button.setBackgroundColor(getResources().getColor(R.color.colorAccent));
            v.setTag(1);
        }
    }



   /* @Override
    public void onClick(View v) {
        if (!isChanged){
            button.setText("Hai Sandeep");
            isChanged = true;
        }else {
            button.setText("Text Not Changed");
            isChanged = false;
        }
    }*/


}
