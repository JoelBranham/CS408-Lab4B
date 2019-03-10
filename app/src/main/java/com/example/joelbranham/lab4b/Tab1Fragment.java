package com.example.joelbranham.lab4b;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab1Fragment extends Fragment implements View.OnClickListener{

    private View newView;

    public Tab1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        newView = inflater.inflate(R.layout.fragment_tab1, container, false);
        Button b = (Button) newView.findViewById(R.id.calculateButton);
        b.setOnClickListener(this);

        return newView;

    }

    public void onClick(View v){
        EditText billEditText = newView.findViewById(R.id.billEditText);
        EditText tipPercentageEditText = newView.findViewById(R.id.tipEditText);
        EditText numberPeopleEditText = newView.findViewById(R.id.numberOfPeopleEditText);

        if (billEditText.getText().length() > 0 && numberPeopleEditText.getText().length() > 0){

            double tipPercentage = 0.0;
            if (tipPercentageEditText.getText().length() > 0){
                tipPercentage = Double.valueOf(tipPercentageEditText.getText().toString());
            }
            else{
                tipPercentageEditText.setText("0");
            }
            double totalBill = Double.valueOf(billEditText.getText().toString());
            double numberPeople = Double.valueOf(numberPeopleEditText.getText().toString());
            double totalPerPerson = (totalBill + totalBill * tipPercentage / 100.0) / numberPeople;

            TextView resultTextView = newView.findViewById(R.id.calculatedResultTextView);
            resultTextView.setText(NumberFormat.getCurrencyInstance().format(Math.round(totalPerPerson * 100) / 100.00));
        }
    }

}
