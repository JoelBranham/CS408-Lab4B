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

    private View newView;

    public Tab2Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        newView = inflater.inflate(R.layout.fragment_tab2, container, false);
        Button b = (Button) newView.findViewById(R.id.calculateButton);
        b.setOnClickListener(this);

        return newView;

    }

    public void onClick(View v){
        String miles = ((EditText) newView.findViewById(R.id.milesEditText)).getText().toString();
        String kilometers = ((EditText) newView.findViewById(R.id.kilometersEditText)).getText().toString();

        if (miles.isEmpty()){
            if (!kilometers.isEmpty()){
                Double m = Double.valueOf(kilometers) / 1.609344;
                ((EditText) newView.findViewById(R.id.milesEditText)).setText(Double.toString(m));
            }
        }
        else{
            Double km = Double.valueOf(miles) * 1.609344;
            ((EditText) newView.findViewById(R.id.kilometersEditText)).setText(Double.toString(km));
        }
    }

}
