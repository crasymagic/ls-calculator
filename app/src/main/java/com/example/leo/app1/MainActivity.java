package com.example.leo.app1;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends Activity {
    EditText ed_1;
    EditText ed_2;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button simple_ops = new Button(this);
        simple_ops.text























       ed_1 = (EditText) findViewById(R.id.list_item_forecast_editview);
       ed_2 = (EditText) findViewById(R.id.list_item_forecast_editview_2);
       tv = (TextView) findViewById(R.id.list_item_forecast_textview);
        Button b = (Button) findViewById(R.id.button_1);

        b.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                try
                {
                    tv.setText(null);
                    String text_extracted = ed_1.getText().toString();
                    int int_result = Integer.parseInt(text_extracted);
                    String text_extracted_2 = ed_2.getText().toString();
                    int int_result_2 = Integer.parseInt(text_extracted_2);

                    tv.append(  text_extracted + "+" + text_extracted_2 + " = " + Integer.toString(Operations.addition(int_result, int_result_2)) + "\n" +
                                text_extracted + "-" + text_extracted_2 + " = " + Integer.toString(Operations.less(int_result, int_result_2)) + "\n" +
                                text_extracted + "*" + text_extracted_2 + " = " + Integer.toString(Operations.multiplication(int_result, int_result_2)) + "\n" +
                                text_extracted + "/" + text_extracted_2 + " = " + Integer.toString(Operations.division(int_result, int_result_2)) + "\n" +
                                text_extracted + "^" + text_extracted_2 + " = " + Integer.toString(Operations.power_of_y(int_result, int_result_2)) + "\n" +
                                text_extracted + "%" + text_extracted_2 + " = " + Integer.toString(Operations.modulo(int_result, int_result_2)));
                }
                catch(Exception e)
                {
                    AlertDialog alertDialog = new AlertDialog.Builder(MainActivity.this).create();
                    alertDialog.setTitle("Alert");
                    alertDialog.setMessage("Enter an integer");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "OK",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();

                }
            }
        });

    }
}
