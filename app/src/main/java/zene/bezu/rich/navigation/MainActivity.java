package zene.bezu.rich.navigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnshowfirst,btnshowsecond;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnshowfirst=(Button) findViewById(R.id.btnshowfirst);
        btnshowsecond=(Button)findViewById(R.id.btnshowsesond);
    }
}
