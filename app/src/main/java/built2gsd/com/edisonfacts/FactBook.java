package built2gsd.com.edisonfacts;

import android.util.Log;

import java.util.Random;

/**
 * Created by Ken on 6/9/2015.
 */
public class FactBook {
    //Member variable (properties about the object)
    public String[] mFacts = {
            "Edison presented a paper on his pyromagnetic motor and generator at the August 1887 meeting of the American Association for the Advancement of Science.",
            "In 1880 Edison patented a magnetic separator after experiments he conducted with chemists Alfred Haid and Otto Moses (among others).",
            "Edison and his cement company innovated the cement industry and was for a while, one the largest producers in the country.",
            "Edison spent a decade trying to make a battery for electric cars for Ford.",
            "Lewis Latimer worked for Edison as an engineer and as an expert in patent litigation.",
            "December 18, 1913: Orville Wright visited Edison at his West Orange Labs",
            "Edison was 22 years old when he filed his first patent for the Electrographic Vote Recorder.",
            "Edison invented the entire electric utility system.",
            "Edison invented a fluoroscope that he left to public domain and did not patent.",
            "He received patents in 1885 on the transmission of wireless signals, between moving train and a station and between ship and shore."
    };

    //Method (abilities: things the object can do)
    public String getFact(){

        //The button was clicked, so fact label gets updated with new fact
        String fact= "";

        // Random fact selection
        Random randomGenerator = new Random(); // New Random number generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);

        fact = mFacts[randomNumber];
        return fact;
    }
}
