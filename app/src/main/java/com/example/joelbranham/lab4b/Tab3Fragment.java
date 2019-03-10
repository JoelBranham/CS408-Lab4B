package com.example.joelbranham.lab4b;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class Tab3Fragment extends Fragment implements View.OnClickListener {


    View v;

    public Tab3Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_tab3, container, false);
        Button b = (Button)v.findViewById(R.id.calculateButton);
        b.setOnClickListener(this);

        return v;

    }

//    @Override
//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_tab3, container, false);
//    }

    public void onClick(View v){
        String fahrenheit = ((EditText) v.findViewById(R.id.fahrenheitEditText)).getText().toString();
        String celsius = ((EditText) v.findViewById(R.id.celsiusEditText)).getText().toString();

        if (fahrenheit.isEmpty()){
            if (!celsius.isEmpty()){
                double c = Double.valueOf(celsius);
                double f = ((c * 9 / 5) + 32);
                ((EditText) v.findViewById(R.id.fahrenheitEditText)).setText(Double.toString(f));
            }
        }
        else{
            double f = Double.valueOf(fahrenheit);
            double c = ((f - 32) * 5 / 9);
            ((EditText) v.findViewById(R.id.celsiusEditText)).setText(Double.toString(c));
        }

    }

}