package com.utcc.layout1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Switch2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch2);

        final Button clicktopage3 = (Button) findViewById(R.id.btn2);
        clicktopage3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent click = new Intent(v.getContext(),
                        Switch3Activity.class);
                startActivity(click);
            }
        });
    }
}
