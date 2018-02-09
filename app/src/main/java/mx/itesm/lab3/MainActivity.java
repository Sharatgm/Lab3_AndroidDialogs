package mx.itesm.lab3;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText username = findViewById(R.id.text_username);
        final EditText password = findViewById(R.id.text_pass);
        Button login = findViewById(R.id.btn_login);
        context = getApplicationContext();


        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                if(username.getText().toString().equals("Sharatgm") && password.getText().toString().equals("123456")){
                    Intent intent = new Intent(MainActivity.this, Activity2.class);
                    intent.putExtra("username", username.getText().toString());
                    startActivity(intent);
                } else {
                    Toast MyToast = new Toast(context);
                    MyToast.makeText(context, "Wrong password! Try it again", Toast.LENGTH_LONG).show();
                }

            }

        });

    }
}
