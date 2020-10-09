package com.example.android.lesson2_clic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = findViewById(R.id. button2 );  // способ 2
        button2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast. makeText (MainActivity. this , "Нью Йорк" ,
                        Toast.LENGTH_SHORT ).show();
            }
        });

        Button button3 = findViewById(R.id. button3 ); // пособ 3
        button3.setOnClickListener( this );

        Button button4 = findViewById(R.id.button4); // способ 4
        button4.setOnClickListener(button4Listener);

        Button button5 = findViewById(R.id.button5); // способ 5
        button5.setOnClickListener(new Button5Listener());

    }
    public class Button5Listener implements View.OnClickListener{
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Токио", Toast.LENGTH_SHORT).show();
        }
    }

    View.OnClickListener button4Listener = new View.OnClickListener() { // способ 4
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "Лондон", Toast.LENGTH_SHORT).show();
        }
    };



    @Override
    public void onClick(View v) {  // пособ 3
        switch (v.getId()) {
            case R.id. button3 :
                Toast. makeText ( this , "Чебоксары" ,
                        Toast. LENGTH_SHORT ).show();
               return ;
            default :
               return ;
        }
    }





    public void button1_onClic(View view) {   // Способ 1
       Toast. makeText ( this , "Москва" ,
                Toast.LENGTH_LONG ).show();
    }



}