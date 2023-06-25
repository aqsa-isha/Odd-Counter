package com.example.practical3task3;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.w3c.dom.Text;
public class MainActivity extends AppCompatActivity {
    int value;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("Odd Counter (02, 14, 43)");
        Button increment_btn = findViewById(R.id.increment_btn), reset_btn = findViewById(R.id.reset_btn);
        TextView txt = findViewById(R.id.counter_view);
        increment_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(txt.getText().equals("..."))
                    value = 1;
                else
                    value += 2;
                txt.setText(String.valueOf(value));
            }
        });
        reset_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                txt.setText(String.valueOf("..."));
            }
        });
    }
}