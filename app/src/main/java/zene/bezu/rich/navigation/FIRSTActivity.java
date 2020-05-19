package zene.bezu.rich.navigation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class FIRSTActivity extends AppCompatActivity {
    TextView lblfirstpage;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        lblfirstpage=(TextView) findViewById(R.id.lblfirstpage);


    }
}
