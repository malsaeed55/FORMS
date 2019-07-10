package bh.edu.ahlia.form;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText t1,t2,t3,t4;

    RadioGroup rg1,rg2;

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        t1 = findViewById( R.id.editText );
        t2 = findViewById( R.id.editText2 );
        t3 = findViewById( R.id.editText3 );
        t4 = findViewById( R.id.lastName );
        rg1 = findViewById( R.id.radioGroup1 );
        rg2 = findViewById( R.id.radioGroup2 );
        b1 = findViewById( R.id.submitBut );

    }

    public void clearButton(View view) {

        rg1.clearCheck();
        rg2.clearCheck();
        t1.setText("");
        t2.setText("");
        t3.setText( "" );
        t4.setText( "" );
        t1.requestFocus();
        Toast.makeText(getApplicationContext(),"Clear", Toast.LENGTH_SHORT).show();

    }

    public void submitButton(View view) {

        String t11 = t1.getText().toString();
        String t22 = t2.getText().toString();
        String t33 = t3.getText().toString();
        String t44 = t4.getText().toString();

        if ((TextUtils.isEmpty( t11 )) || (TextUtils.isEmpty( t22 )) || (TextUtils.isEmpty( t33 )) || (TextUtils.isEmpty( t44 )) || (rg1.getCheckedRadioButtonId() == -1) || (rg2.getCheckedRadioButtonId() == -1)){
            Toast.makeText( getApplicationContext(), "All Not Valid", Toast.LENGTH_SHORT ).show();

        } else {

            rg1.clearCheck();
            rg2.clearCheck();
            t1.setText("");
            t2.setText("");
            t3.setText( "" );
            t4.setText( "" );
            t1.requestFocus();
            Toast.makeText( getApplicationContext(), "All information are Valid", Toast.LENGTH_SHORT ).show();

        }



    }
}
