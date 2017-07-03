package company.csf2017.com.chenjian;

import android.content.Intent;
import android.os.Message;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class State extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_state);
        Button btn1= (Button) findViewById(R.id.returnBtn);
        Button btn2= (Button) findViewById(R.id.mesBtn);
        btn1.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(State.this,Index_one.class);
                startActivity(intent);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(State.this,MesLiuyan.class);
                startActivity(intent);
            }
        });

    }
}
