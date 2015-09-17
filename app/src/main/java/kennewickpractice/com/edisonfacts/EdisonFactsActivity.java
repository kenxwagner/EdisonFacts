package kennewickpractice.com.edisonfacts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class EdisonFactsActivity extends AppCompatActivity {

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
                String[] facts = {
                        "Edison launched the Naval Research Laboratory.",
                        "Edison patented a 'wireless' signal in 1885, it was later sold to Guglielmo Marconi.",
                        "Edison invented the first practical incandescent lamp in 1879.",
                        "He and his staff analyzed 6,000 organic fibers and determined Japanese bamboo was ideal for mass production.",
                        "Money from Western Union for telegraph inventions was spent to establish a factory in Menlo Park, N.J.",
                        "He wrote and published the Grand Trunk Herald in 1862, which was sent to 400 railroad employees.",
                        "Edison built his first science lab in the his basement, when he was 10.",
                        "Edison, age 14, saved Jimmie MacKenzie, age 3, from a runaway boxcar. MacKenzie's dad taught Edison to operate a telegraph.",
                        "Edison's first patent, a vote recorder, was never used after the patent was issued.",
                        "Edison worked with Henry Ford to create an electric car.",
                        "His first two kids had the nicknames Dot and Dash."

                };
                // The button was selected, so update fact label
                String fact = "";
                //Random fact
                Random randomGenerator = new Random(); //Construct Random Number Generator
                int randomNumber = randomGenerator.nextInt(facts.length);
                //fact = randomNumber + "";

                fact = facts[randomNumber];

                //Update the label with dynamic fact
                factsLabel.setText(fact);

            }
        };

        showFactsButton.setOnClickListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_edison_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
