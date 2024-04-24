package com.example.ex3;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity
{ ImageView i;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    { super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );
        Bitmap b= Bitmap.createBitmap( 720,1280,Bitmap.Config.ARGB_8888 );
        i=(ImageView)findViewById(R.id.imageView);
        i.setBackgroundDrawable( new
            BitmapDrawable( b ) );

        Canvas canvas=new Canvas( b );
        Paint paint =new Paint( );
        paint.setColor( Color.BLUE );
        paint.setTextSize( 50 );

        canvas.drawText( "Rectangle", 420, 150, paint );
        canvas.drawRect( 400, 200, 650, 700, paint );

        canvas.drawText( "Circle",120, 150, paint );
        canvas.drawCircle( 200,350, 150, paint );
        canvas.drawText( "Square", 120, 800, paint );
        canvas.drawRect( 50, 850, 350, 1150, paint );
        canvas.drawText( "Line", 480, 800, paint );
        canvas.drawLine( 520,850, 520, 1150, paint );
    }
}
