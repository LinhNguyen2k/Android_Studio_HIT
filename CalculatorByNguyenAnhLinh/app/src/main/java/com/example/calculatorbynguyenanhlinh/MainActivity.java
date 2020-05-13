package com.example.calculatorbynguyenanhlinh;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {

    Button btnzero, btn1, btn2, btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnAdd,btnSubtraction,btnmultiplication,btndivision,btnDelete,btnAC,btnexponential,btndots,btnequalsign,btnSQRT;
    EditText edtinput,edtoutput;
     float a,b;
     double kq =0;
     int k,tg;
     String pheptoan;
     DecimalFormat h = new DecimalFormat( "0.00000");
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        anhxa();
        edtinput.setFocusable(false);
        edtoutput.setFocusable(false);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "9");
            }
        });
        btnzero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText(edtinput.getText() + "0");
            }
        });
        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(edtinput.getText().toString());
                edtinput.setText(edtinput.getText()+ "+");
                tg = edtinput.getText().toString().length();
                pheptoan = "+";
            }
        });
        btnSubtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(edtinput.getText().toString());
                edtinput.setText(edtinput.getText()+ "-");
                tg = edtinput.getText().toString().length();
                pheptoan = "-";
            }
        });
        btnmultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(edtinput.getText().toString());
                edtinput.setText(edtinput.getText()+ "*");
                tg = edtinput.getText().toString().length();
                pheptoan = "*";
            }
        });
        btndivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(edtinput.getText().toString());
                edtinput.setText(edtinput.getText()+ ":");
                tg = edtinput.getText().toString().length();
                pheptoan = ":";
            }
        });
        btnexponential.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(edtinput.getText().toString());
                edtinput.setText(edtinput.getText()+ "^");
                tg = edtinput.getText().toString().length();
                pheptoan = "^";


            }
        });
        btndots.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                edtinput.setText(edtinput.getText() + ".");
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtinput.setText("");
                edtoutput.setText("");

            }
        });

        btnDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String k = edtinput.getText().toString();
                k = k.substring(0, k.length() - 1);
                edtinput.setText(k);
            }
        });
        btnSQRT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = Float.parseFloat(edtinput.getText().toString());
                edtinput.setText(edtinput.getText()+ "SQRT");
                tg = edtinput.getText().toString().length();
                pheptoan = "SQRT";

            }
        });
        btnequalsign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String k = edtinput.getText().toString().substring(tg);
                b = Float.parseFloat(k);
                if(pheptoan == "+")
                {
                    kq = a+b ;

                }
                else if(pheptoan=="-")
                {
                    kq = a-b;
                }
                else if(pheptoan =="*")
                {
                    kq = a*b;
                }
                else if(pheptoan ==":")
                    {

                            kq = a/b;
                    }
                else if(pheptoan =="^")
                {
                    kq = Math.pow(a,b);
                }
                 else if(pheptoan =="SQRT")
                {
                    kq = Math.sqrt(a);
                }
                 else
                     kq = kq +0;
                edtoutput.setText(String.valueOf(kq));

            }
        });


    }
    public  void anhxa()
    {
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5= findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnAdd = findViewById(R.id.btnAdd);
        btnAC = findViewById(R.id.btnAC);
        btnDelete = findViewById(R.id.btnDelete);
        btnSubtraction = findViewById(R.id.btnSubtraction);
        btnmultiplication = findViewById(R.id.btnmultiplication);
        btndivision = findViewById(R.id.btndivision);
        btnexponential = findViewById(R.id.btnexponential);
        btnzero = findViewById(R.id.btn2zero);
        btndots = findViewById(R.id.btndots);
        btnequalsign = findViewById(R.id.btnequalsign);
        btnSQRT = findViewById(R.id.btnSQRT);
        edtinput = findViewById(R.id.edtinput);
        edtoutput = findViewById(R.id.edtoutput);
    }
}
