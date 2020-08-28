package mx.tec.example2_itesm_ad2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ChildActivity extends AppCompatActivity {

    Button myButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);

        myButton = findViewById(R.id.backBtn);
        myButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(ChildActivity.this, MainActivity.class);
                startActivity(myIntent);

            }
        });
    }
}