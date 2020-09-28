package com.example.angulos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class MainActivity extends Activity implements View.OnClickListener{
    float resultado;
    int operador;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RadioButton sin_button = findViewById(R.id.sin_radio_button);
        RadioButton cos_button = findViewById(R.id.cos_radio_button);
        RadioButton tan_button = findViewById(R.id.tan_radio_button);
        RadioButton a_button = findViewById(R.id.a_radio_button);
        a_button.setOnClickListener(this);
        RadioButton b_button = findViewById(R.id.b_radio_button);
        b_button.setOnClickListener(this);
        RadioButton c_button = findViewById(R.id.c_radio_button);
        c_button.setOnClickListener(this);

        sin_button.setOnClickListener(view ->{
            operador=1;
        });
        cos_button.setOnClickListener(view ->{
            operador=2;
        });
        tan_button.setOnClickListener(view ->{
            operador=3;
        });
    }

    @Override
    public void onClick(View v) {
        TextView pantalla = findViewById(R.id.Resultado);
        ImageView im = findViewById(R.id.imagen1);
        int angulo = v.getId();
        try {
            switch (angulo) {
                case R.id.a_radio_button:
                    im.setImageResource(R.drawable.cuarenta);
                    switch (operador) {
                        case 1:
                            pantalla.setText("");
                            resultado= (float) Math.sin(45*2.0*Math.PI/360.0);
                            pantalla.setText(String.valueOf(resultado));
                            break;
                        case 2:
                            pantalla.setText("");
                            resultado= (float) Math.cos(45*Math.PI/180);
                            pantalla.setText(String.valueOf(resultado));;
                            break;
                        case 3:
                            pantalla.setText("");
                            resultado= (float) Math.tan(45*2.0*Math.PI/360.0);
                            pantalla.setText(String.valueOf( resultado));
                            break;
                    }
                    break;
                case R.id.b_radio_button:
                    im.setImageResource(R.drawable.noventa);
                    switch (operador) {
                        case 1:
                            pantalla.setText("");
                            resultado= (float) Math.sin(90*2.0*Math.PI/360.0);
                            pantalla.setText(String.valueOf(resultado));
                            break;
                        case 2:
                            pantalla.setText("");
                            //resultado= (float) Math.cos(90*Math.PI/180);
                            resultado=(float)0;
                            pantalla.setText(String.valueOf(resultado));;
                            break;
                        case 3:
                            pantalla.setText("");
                            //resultado= (float) Math.tan(90*2.0*Math.PI/360.0);
                            pantalla.setText("NULL");
                            break;
                    }
                    break;
                case R.id.c_radio_button:
                    im.setImageResource(R.drawable.cien);
                    switch (operador) {
                        case 1:
                            pantalla.setText("");
                            //resultado= (float) Math.sin(180*2.0*Math.PI/360.0);
                            resultado=(float) 0;
                            pantalla.setText(String.valueOf(resultado));
                            break;
                        case 2:
                            pantalla.setText("");
                            resultado= (float) Math.cos(180*Math.PI/180);
                            pantalla.setText(String.valueOf(resultado));;
                            break;
                        case 3:
                            pantalla.setText("");
                            //resultado= (float) Math.tan(180*2.0*Math.PI/360.0);
                            resultado=(float)0.0;
                            pantalla.setText(String.valueOf( resultado));
                            break;
                    }
                    break;
            }
        }catch(Exception e){
        };
    }
}