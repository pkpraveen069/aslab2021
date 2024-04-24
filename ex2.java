package com.example.ex6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    ImageView i;
    Button b1,b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i=(ImageView)findViewById( R.id.i );
        b1=(Button)findViewById( R.id.b1 );
        b2=(Button)findViewById( R.id.b2 );
        b1.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {
            new Thread( new Runnable() {
                @Override
                public void run() {
                    i.post( new Runnable() {
                        @Override
                        public void run() {
                            i.setImageResource( R.drawable.download );
                        }
                    } );
                }
            } ).start();
        }
        } );
        b2.setOnClickListener( new View.OnClickListener()
        { @Override
        public void onClick(View v) {
            new Thread( new Runnable() {
                @Override
                public void run() {
                    i.post( new Runnable() {
                        @Override
                        public void run() {
                            i.setImageResource( R.drawable.s1 );
                        }
                    } );
                }
            } ).start();
        }
        } );
    }
}