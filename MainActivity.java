package course.labs.q2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    Button b1,btn_inc,btn_dec;
    EditText e1;
    View v1;
    int i1=0, i2=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button2);
        btn_inc = findViewById(R.id.button_inc);
        btn_dec = findViewById(R.id.button_dec);
        e1 = findViewById(R.id.t1);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                e1.setText("0");

                Toast.makeText(getApplicationContext(),"Value has been reset", Toast.LENGTH_SHORT).show();
            }
        });

        btn_inc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View c)
            {
                i1=Integer.parseInt(e1.getText().toString());
                i1++;
                e1.setText(Integer.toString(i1));

                Toast.makeText(getApplicationContext(), "Value Incremented", Toast.LENGTH_SHORT).show();

            }

        });
    }
    public void inshow(View a)
    {
        i2=Integer.parseInt(e1.getText().toString());
        i2--;
        e1.setText(Integer.toString(i2));
        Toast.makeText(getApplicationContext(), "WOOOW", Toast.LENGTH_SHORT).show();
    }
}








