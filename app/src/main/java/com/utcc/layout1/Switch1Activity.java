package com.utcc.layout1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Switch1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch1);

        final Button clicktopage2 = (Button) findViewById(R.id.btn1);
        clicktopage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click = new Intent(v.getContext(),
                        Switch2Activity.class);
                startActivity(click);
            }
        });
    }
}
