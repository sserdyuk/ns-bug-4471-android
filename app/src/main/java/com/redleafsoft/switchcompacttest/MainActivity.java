package com.redleafsoft.switchcompacttest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.SwitchCompat;
import android.util.Log;
import android.widget.CompoundButton;

public class MainActivity extends AppCompatActivity implements
        CompoundButton.OnCheckedChangeListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SwitchCompat switchCompat = (SwitchCompat) findViewById(R.id
                .switch_compat);
        switchCompat.setSwitchPadding(40);
        switchCompat.setOnCheckedChangeListener(this);

        SwitchCompat switchCompat2 = (SwitchCompat) findViewById(R.id
                .switch_compat2);
        switchCompat2.setSwitchPadding(40);
        switchCompat2.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        SwitchCompat swView = (SwitchCompat) buttonView;
        if (isChecked) {
            swView.getThumbDrawable().setColorFilter(Color.RED, android.graphics.PorterDuff.Mode.SRC_IN);
        } else {
            swView.getThumbDrawable().setColorFilter(Color.BLUE, android.graphics.PorterDuff.Mode.SRC_IN);
        }

    }
}