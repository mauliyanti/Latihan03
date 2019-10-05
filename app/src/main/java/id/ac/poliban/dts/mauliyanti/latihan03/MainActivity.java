package id.ac.poliban.dts.mauliyanti.latihan03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //kenalkan view ke object di source code kita
        EditText etUserName = findViewById(R.id.etUsername);
        EditText etPassword = findViewById(R.id.etPassword);
        Button btClear = findViewById(R.id.btClear);
        Button btLogin = findViewById(R.id.btLogin);

        btClear.setOnClickListener(view ->  {
            //mengosongkan Edit Text
            etUserName.setText("");
            etPassword.setText("");
            //meletakkan kursor di etUserName
            etUserName.requestFocus();
        });

        btLogin.setOnClickListener(view -> {
            //menggosongkan EditText
            etUserName.setText("");
            etPassword.setText("");
            etUserName.requestFocus();
            Toast.makeText(this, "you have loged!", Toast.LENGTH_SHORT).show();
        });


    }
}
