package calcualtor.corsair.com.hellocalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        e1 = (EditText) findViewById(R.id.e1);
        e2 = (EditText) findViewById(R.id.e2);
        e3 = (EditText) findViewById(R.id.e3);
        Button add = (Button) findViewById(R.id.add);
        Button sub = (Button) findViewById(R.id.sub);

        add.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                result(0);
            }
        });
        sub.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view) {
                result(1);
            }
        });

    }

    public boolean checkInput(String a, String b)
    {
        if (a.length()>=1 && b.length()>=1)
            return true;
        else
            return false;
    }
    public void result(int a)
    {
        if (checkInput(e1.getText().toString(), e2.getText().toString())==true)
        {
            Double z=0.0;
            Double zz=0.0;
            Double ans;
            try {
                z = Double.parseDouble(e1.getText().toString());
                zz = Double.parseDouble(e2.getText().toString());
                if (a==0)
                    ans = z+zz;
                else
                    ans = z-zz;
                e3.setText(ans.toString());
            }
            catch (Exception E)
            {
                Toast.makeText(getApplicationContext(),"please provide valid Operands",Toast.LENGTH_LONG).show();
            }
        }
    }
}
