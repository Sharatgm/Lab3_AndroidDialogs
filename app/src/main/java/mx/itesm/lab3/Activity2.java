package mx.itesm.lab3;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView textMessage = findViewById(R.id.welcome);

        Intent targetIntent = getIntent();
        String username, password;
        username = targetIntent.getStringExtra("username")  ;
        textMessage.append(username);

        AlertDialog.Builder myAlert = new AlertDialog.Builder(this);
        myAlert.setMessage("Esta es una alerta del Lab3");
        myAlert.setTitle("Saludo");
        myAlert.setPositiveButton("Enterado", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which){
                dialog.cancel();
            }
        });

        AlertDialog dialog = myAlert.create();
        dialog.show();
    }
}
