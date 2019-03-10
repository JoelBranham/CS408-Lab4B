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
public class Tab2Fragment extends Fragment implements View.OnClickListener {

    View v;

    public Tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        v = inflater.inflate(R.layout.fragment_tab2, container, false);
        Button b = (Button) v.findViewById(R.id.calculateButton);
        b.setOnClickListener(this);

        return v;

    }

    public void onClick(View v){
        String miles = ((EditText) v.findViewById(R.id.milesEditText)).getText().toString();
        String kilometers = ((EditText) v.findViewById(R.id.kilometersEditText)).getText().toString();

        if (miles.isEmpty()){
            if (!kilometers.isEmpty()){
                Double m = Double.valueOf(kilometers) / 1.609344;
                ((EditText) v.findViewById(R.id.milesEditText)).setText(Double.toString(m));
            }
        }
        else{
            Double km = Double.valueOf(miles) * 1.609344;
            ((EditText) v.findViewById(R.id.kilometersEditText)).setText(Double.toString(km));
        }
    }

}
