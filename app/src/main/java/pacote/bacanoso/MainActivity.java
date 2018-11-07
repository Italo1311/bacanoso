package pacote.bacanoso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText mEditAlcool;
    private EditText mEditGasolina;
    private Button mBtnCalculate;
    private TextView mTextResult;
    private TextView mMainTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mMainTitle = findViewById(R.id.textViewMainTitle);
        mEditAlcool = findViewById(R.id.editAlcool);
        mEditGasolina = findViewById(R.id.editGasolina);
        mBtnCalculate = findViewById(R.id.btnCalc);
        //mTextResult = findViewById(R.id.textResult);

        mBtnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mMainTitle.setText(mEditAlcool.getText().toString());
            }
        });






    }


}