package com.example.lab1_2;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

public class Lab1_2 extends AppCompatActivity {

    TextView text1, text2;
    CheckBox chk1;
    RadioGroup rg1;
    RadioButton rb1, rb2, rb3;
    Button bt1;
    ImageView ima1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        setContentView(R.layout.activity_main);


        text1 = (TextView) findViewById(R.id.txt1);
        text2 = (TextView) findViewById(R.id.txt2);
        chk1 = (CheckBox) findViewById(R.id.chkAgree);
        rg1 = (RadioGroup) findViewById(R.id.rGroup);
        rb1 = (RadioButton) findViewById(R.id.rBtn1);
        rb2 = (RadioButton) findViewById(R.id.rBtn2);
        rb3 = (RadioButton) findViewById(R.id.rBtn3);
        bt1 = (Button) findViewById(R.id.btnOk);
        ima1 = (ImageView) findViewById(R.id.imgPet);
        text2.setVisibility(View.INVISIBLE);
        rg1.setVisibility(View.INVISIBLE);
        bt1.setVisibility(View.INVISIBLE);
        ima1.setVisibility(View.INVISIBLE);
        chk1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (chk1.isChecked() == true) {
                    text2.setVisibility(View.VISIBLE);
                    rg1.setVisibility(View.VISIBLE);
                    bt1.setVisibility(View.VISIBLE);
                    ima1.setVisibility(View.VISIBLE);
                } else {
                    text2.setVisibility(View.INVISIBLE);
                    rg1.setVisibility(View.INVISIBLE);
                    bt1.setVisibility(View.INVISIBLE);
                    ima1.setVisibility(View.INVISIBLE);
                }
            }
        });
        bt1.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("NonConstantResourceId")
            @Override
            public void onClick(View view) {
                int checkedRadioButtonId = rg1.getCheckedRadioButtonId();
                if (checkedRadioButtonId == R.id.rBtn1) {
                    ima1.setImageResource(R.drawable.dog);
                } else if (checkedRadioButtonId == R.id.rBtn2) {
                    ima1.setImageResource(R.drawable.cat);
                } else if (checkedRadioButtonId == R.id.rBtn3) {
                    ima1.setImageResource(R.drawable.koala);
                } else {
                    Toast.makeText(getApplicationContext(), "Амьтан сонгоно уу!!!",
                            Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
