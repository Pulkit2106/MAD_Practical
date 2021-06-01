package com.example.prac3;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends Activity implements OnClickListener {
    EditText input1;
    EditText input2;
    Button addition;
    Button subtraction;
    Button multiplication;
    Button division;
    TextView tvResult;
    String oper = "";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        input1 = (EditText) findViewById(R.id.etNum1);
        input2 = (EditText) findViewById(R.id.etNum2);
        addition = (Button) findViewById(R.id.btnAdd);
        subtraction = (Button) findViewById(R.id.btnSub);
        multiplication = (Button) findViewById(R.id.btnMult);
        division = (Button) findViewById(R.id.btnDiv);
        tvResult = (TextView) findViewById(R.id.tvResult);
        addition.setOnClickListener(this);
        subtraction.setOnClickListener(this);
        multiplication.setOnClickListener(this);
        division.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float num1 = 0;
        float num2 = 0;
        float result = 0;
        if (TextUtils.isEmpty(input1.getText().toString())
                || TextUtils.isEmpty(input2.getText().toString())) {
            return;
        }
        num1 = Float.parseFloat(input1.getText().toString());
        num2 = Float.parseFloat(input2.getText().toString());
// defines the button that has been clicked and performs the corresponding operation
        switch (v.getId()) {
            case R.id.btnAdd:
                oper = "+";
                result = num1 + num2;
                break;
            case R.id.btnSub:
                oper = "-";
                result = num1 - num2;
                break;
            case R.id.btnMult:
                oper = "*";
                result = num1 * num2;
                break;
            case R.id.btnDiv:
                oper = "/";
                result = num1 / num2;

                break;
            default:
                break;
        }
    }
}
