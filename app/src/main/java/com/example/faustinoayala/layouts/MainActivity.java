package com.example.faustinoayala.layouts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.scrolliview);

        LinearLayout run = (LinearLayout) findViewById(R.id.button_container);

        for (int i = 0; i < 15; i++) {
            Button btn = new Button(this);

            btn.setText(getString(R.string.button) + " " + (i + 1));
            run.addView(btn);
        }
    }
}
