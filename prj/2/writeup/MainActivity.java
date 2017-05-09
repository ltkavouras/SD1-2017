package com.example.louis.colorcomparision;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;
import static com.example.louis.colorcomparision.R.id.sFirst;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = (Spinner) findViewById(sFirst);
        // Create an ArrayAdapeter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.first,
                android.R.layout.simple_spinner_item);
        //Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Apply the Adapter to the spinner
        spinner.setAdapter(adapter);

        Spinner sspinner = (Spinner) findViewById(R.id.ss);
        // Create an ArrayAdapeter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> sAdapter = ArrayAdapter.createFromResource(this, R.array.second,
                android.R.layout.simple_spinner_item);
        //Specify the layout to use when the list of choices appears
        sAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        //Apply the Adapter to the spinner
        sspinner.setAdapter(sAdapter);


        Button bCompare = (Button)findViewById(R.id.bCompare);
        bCompare.setOnClickListener(new View.OnClickListener(){

            //initiation of variables
            Spinner spinner;
            String text;
            Spinner sSpinner;
            String sText;

            public void onClick(View v) {
                //Get First Spinner Text
                spinner = (Spinner)findViewById(sFirst);
                text = spinner.getSelectedItem().toString();

                //Get Second Spinner Text
                sSpinner = (Spinner)findViewById(R.id.ss);
                sText = sSpinner.getSelectedItem().toString();

                // Declaration of Matrix
                int [][]mc = {
                        //R O Y G B I V B W B G
                        {0,0,0,0,1,1,0,1,1,1,1},//R
                        {0,0,0,0,1,1,0,0,1,1,1},//O
                        {0,0,0,1,1,1,1,0,1,1,1},//Y
                        {0,0,1,0,1,1,0,1,1,1,1},//G
                        {1,1,1,1,0,0,0,1,1,1,1},//B
                        {1,1,1,1,0,0,1,1,1,1,1},//I
                        {0,0,1,0,0,1,0,1,1,1,1},//V
                        {1,0,0,1,1,1,1,0,1,1,0},//Brown
                        {1,1,1,1,1,1,1,1,0,1,1},//White
                        {1,1,1,1,1,1,1,1,1,0,1},//Black
                        {1,1,1,1,1,1,0,1,1,1,0} //Gray
                };

                // Create Scanner for initial color
                int irow = 0;
                int icol = 0;

                // Assignment of values based on user input for the first spinner
                if (text.equals("Red")) {
                    irow = 0;
                }else if (text.equals("Orange")) {
                    irow = 1;
                }else if (text.equals("Yellow")) {
                    irow = 2;
                }else if (text.equals("Green")){
                    irow = 3;
                }else if (text.equals("Blue")) {
                    irow = 4;
                }else if (text.equals("Indigo")) {
                    irow = 5;
                }else if (text.equals("Violet")) {
                    irow = 6;
                }else if (text.equals("Brown")) {
                    irow = 7;
                }else if (text.equals("White")) {
                    irow = 8;
                }else if (text.equals("Black")) {
                    irow = 9;
                }else if (text.equals("Gray")) {
                    irow = 10;
                }
                // Assignment of values based on user input for the  second spinner
                if (sText.equals("Red")) {
                    icol = 0;
                }else if (sText.equals("Orange")) {
                    icol = 1;
                }else if (sText.equals("Yellow")) {
                    icol = 2;
                }else if (sText.equals("Green")){
                    icol = 3;
                }else if (sText.equals("Blue")) {
                    icol = 4;
                }else if (sText.equals("Indigo")) {
                    icol = 5;
                }else if (sText.equals("Violet")) {
                    icol = 6;
                }else if (sText.equals("Brown")){
                    icol = 7;
                }else if (sText.equals("White")) {
                    icol = 8;
                }else if (sText.equals("Black")) {
                    icol = 9;
                }else if (sText.equals("Gray")) {
                    icol = 10;
                }

                if (mc [irow] [icol] == 1) {
                    Toast success = Toast.makeText(getApplicationContext(), "Congratulations it matches!"
                            , Toast.LENGTH_LONG);
                    success.show();
                } else {
                    Toast fail = Toast.makeText(getApplicationContext(), "Sorry that combination does not match,"+
                            " Try another.", Toast.LENGTH_LONG);
                    fail.show();
                }

            }
        });
    }
}
