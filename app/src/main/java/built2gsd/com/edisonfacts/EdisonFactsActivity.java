package built2gsd.com.edisonfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class EdisonFactsActivity extends AppCompatActivity {

    public static final String TAG = EdisonFactsActivity.class.getSimpleName();

    private FactList mFactList = new FactList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edison_facts);

        //Declare View variables
        final TextView factsLabel = (TextView) findViewById(R.id.factsOutput);
        Button showFactsButton = (Button) findViewById(R.id.getFactsButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fact = mFactList.getFacts();
                //Update the label with dynamic fact
                factsLabel.setText(fact);
            }


        };


        showFactsButton.setOnClickListener(listener);




        Toast.makeText(this, "You have opened Edison Facts App! Thanks!", Toast.LENGTH_LONG).show();
        Log.d(TAG, "Logging from the onCreate Method");
    }
}
