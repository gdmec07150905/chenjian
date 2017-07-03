package company.csf2017.com.chenjian;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class Index_one extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_index_one);
        Button btn4= (Button) findViewById(R.id.btn4);
        Button mesBtn= (Button) findViewById(R.id.mesBtn);
        btn4.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Index_one.this,State.class);
                startActivity(intent);
            }
        });

        mesBtn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Index_one.this,MesLiuyan.class);
                startActivity(intent);
            }
        });
    }
}
