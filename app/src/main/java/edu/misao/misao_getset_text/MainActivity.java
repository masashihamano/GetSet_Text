package edu.misao.misao_getset_text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etName,etEmail,etNum,etPass;
    Button btnShow;
    TextView tvResName,tvResEmail,tvResNum,tvResPass;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        etName = findViewById( R.id.etName );
        etEmail = findViewById( R.id.etEmail );
        etNum = findViewById( R.id.etNum );
        etPass = findViewById( R.id.etPass );
        btnShow = findViewById( R.id.btnShow );
        tvResName = findViewById( R.id.tvResName );
        tvResEmail = findViewById( R.id.tvResEmail );
        tvResNum = findViewById( R.id.tvResNum );
        tvResPass = findViewById( R.id.tvResPass );


        btnShow.setOnClickListener(this);


    }


    @Override
    public void onClick(View view) {
        tvResName.setText(etName.getText() );
        tvResEmail.setText( etEmail.getText());
        tvResPass.setText( etPass.getText() );
        tvResNum.setText( etNum.getText() );
    }
}
