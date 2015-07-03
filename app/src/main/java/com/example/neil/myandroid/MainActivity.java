package com.example.neil.myandroid;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;


public class MainActivity extends Activity implements OnClickListener {
    private Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnP, btnM, btnX, btnD, equal;
    private EditText num1;
    private double n1;
    private TextView ans;
    private String s = ""; //用來判斷+-*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //this is mark
        btn1 = (Button) findViewById(R.id.button1);
        btn2 = (Button) findViewById(R.id.button2);
        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);
        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);
        btn7 = (Button) findViewById(R.id.button7);
        btn8 = (Button) findViewById(R.id.button8);
        btn9 = (Button) findViewById(R.id.button9);
        btn0 = (Button) findViewById(R.id.button0);
        btnP = (Button) findViewById(R.id.buttonP);// +
        btnM = (Button) findViewById(R.id.buttonM);// -
        btnX = (Button) findViewById(R.id.buttonX);// *
        btnD = (Button) findViewById(R.id.buttonD);// /
        equal = (Button) findViewById(R.id.equal);  // =

        btn1.setText(R.string.btn1); //建議文字適用語法來設定string.xml設定的字串
        btn2.setText(R.string.btn2); //而不要直接在版面配置中設定或直接setText("字串")
        btn3.setText(R.string.btn3); //因為這樣才可以設定多國語言
        btn4.setText(R.string.btn4);
        btn5.setText(R.string.btn5);
        btn6.setText(R.string.btn6);
        btn7.setText(R.string.btn7);
        btn8.setText(R.string.btn8);
        btn9.setText(R.string.btn9);
        btn0.setText(R.string.btn0);
        btnP.setText(R.string.btnP);
        btnM.setText(R.string.btnM);
        btnX.setText(R.string.btnX);
        btnD.setText(R.string.btnD);
        equal.setText(R.string.equal);

        num1 = (EditText) findViewById(R.id.editText1);

        ans = (TextView) findViewById(R.id.textView1);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(Number);
        btn4.setOnClickListener(Number);
        btn5.setOnClickListener(Number);
        btn6.setOnClickListener(Number);
        btn7.setOnClickListener(Number);
        btn8.setOnClickListener(Number);
        btn9.setOnClickListener(Number);
        btn0.setOnClickListener(Number);

        btnP.setOnClickListener(Calculate);
        btnM.setOnClickListener(Calculate);
        btnX.setOnClickListener(Calculate);
        btnD.setOnClickListener(Calculate);

        equal.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                double n2 = Double.parseDouble((num1.getText().toString()));
                DecimalFormat nf = new DecimalFormat("0.00");
                if (s.equals("P")) {
                    ans.setText(nf.format(n1 + n2));
                } else if (s.equals("M")) {
                    ans.setText(nf.format(n1 - n2));
                } else if (s.equals("X")) {
                    ans.setText(nf.format(n1 * n2));
                } else if (s.equals("D")) {
                    ans.setText(nf.format(n1 / n2));
                }
                num1.setText("");
            }
        });

    }

    private Button.OnClickListener Number = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub

            String keyin = num1.getText().toString();
            switch (v.getId()) {
                case R.id.button0: {
                    num1.setText(keyin + "0");

                    break;
                }
                case R.id.button1: {
                    num1.setText(keyin + "1");

                    break;
                }
                case R.id.button2: {
                    num1.setText(keyin + "2");

                    break;
                }
                case R.id.button3: {
                    num1.setText(keyin + "3");

                    break;
                }
                case R.id.button4: {
                    num1.setText(keyin + "4");

                    break;
                }
                case R.id.button5: {
                    num1.setText(keyin + "5");

                    break;
                }
                case R.id.button6: {
                    num1.setText(keyin + "6");

                    break;
                }
                case R.id.button7: {
                    num1.setText(keyin + "7");

                    break;
                }
                case R.id.button8: {
                    num1.setText(keyin + "8");

                    break;
                }
                case R.id.button9: {
                    num1.setText(keyin + "9");

                    break;
                }
            }

        }
    };

    private Button.OnClickListener Calculate = new Button.OnClickListener() {

        @Override
        public void onClick(View v) {
            // TODO Auto-generated method stub

            try {
                n1 = Double.parseDouble(num1.getText().toString());

            } catch (Exception e) {
                // TODO: handle exception
            }

            num1.setText("");

            switch (v.getId()) {
                case R.id.buttonP: {
                    s = "P";
                    break;
                }
                case R.id.buttonM: {
                    s = "M";
                    break;
                }
                case R.id.buttonX: {
                    s = "X";
                    break;
                }
                case R.id.buttonD: {
                    s = "D";
                    break;
                }

            }

        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onClick(View v) {
        String keyin = num1.getText().toString();
        switch (v.getId()) {
            case R.id.button0: {
                num1.setText(keyin + "零");

                break;
            }
            case R.id.button1: {
                num1.setText(keyin + "一");

                break;
            }
        }
    }
}