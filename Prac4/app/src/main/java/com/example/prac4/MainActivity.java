package com.example.prac4;
import androidx.activity.ComponentActivity;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends ComponentActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new myview(this));
    }

    private class myview extends View {
        public myview(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            Paint paint = new Paint();
            paint.setTextSize(40);
            paint.setColor(Color.GREEN);

            canvas.drawText("Circle", 55, 30, paint);
            paint.setColor(Color.RED);
            canvas.drawCircle(100, 150, 100, paint);
            paint.setColor(Color.GREEN);
            canvas.drawText("Rectangle", 255, 30, paint);
            paint.setColor(Color.RED);
            canvas.drawRect(250, 50, 400, 350, paint);
            paint.setColor(Color.RED);
            canvas.drawText("SQUARE", 55, 430, paint);
            paint.setColor(Color.RED);
            canvas.drawRect(50, 450, 150, 550, paint);
            paint.setColor(Color.RED);
            canvas.drawText("LINE", 255, 430, paint);
            paint.setColor(Color.RED);
            canvas.drawLine(250, 500, 350, 500, paint);
        }
    }
}