package built2gsd.com.edisonfacts;

import java.util.Random;

/**
 * Created by ken.wagner on 8/12/2017.
 */
public class FactList {

    // Member variables (properties of the object)
    public String[] mFacts = {
            "Edison launched the Naval Research Laboratory. ",
            "Edison invented the first practical incandescent lamp in 1879. ",
            "He and his staff analyzed 6000 organic fibers and determined Japanese bamboo was ideal for mass production. ",
            "Money from Western Union for telegraph inventions was spent to establish a factory in Menlo Park N.J. ",
            "When he was 12 he wrote and published the Grand Trunk Herald in 1862 which was sent to 400 railroad employees. ",
            "Edison built his first science lab in the his basement when he was 10. ",
            "Edison age 15 saved Jimmie MacKenzie age 3 from a runaway boxcar. MacKenzie's dad taught Edison to operate a telegraph. ",
            "Edison worked with Henry Ford to create an electric car.  ",
            "His first two kids had the nicknames Dot and Dash.",
            "Edison presented a paper on his pyromagnetic motor and generator at the August 1887 meeting of the American Association for the Advancement of Science.",
            "In 1880 Edison patented a magnetic separator after experiments he conducted with chemists Alfred Haid and Otto Moses (among others).",
            "Edison and his cement company innovated the cement industry and was for a while one the largest producers in the country.",
            "Edison spent a decade trying to make a battery for electric cars for Ford.",
            "Lewis Latimer worked for Edison as an engineer and as an expert in patent litigation.",
            "December 18 1913: Orville Wright visited Edison at his West Orange Labs",
            "Edison was 22 years old when he filed his first patent for the Electrographic Vote Recorder. It was never used.",
			"Edison encouraged Henry Ford to pursue car building.",
            "Edison invented the entire electric utility system.",
			"Edison read the Hume's "History of England." Sear's "History of the World," Gibbons's "Rome," "The Penny Encyclopedia," and several works on electricity and science during the age of 9 through 12.", 
            "Edison invented a fluoroscope that he left to public domain and did not patent.",
            "He had a patent in 1885 on the transmission of wireless signals which were sold to Guglielmo Marconi (the radio pioneer).",
            "Edison invented an improvement to the telephone transmitter that was used for almost 100 years.",
            "Edison founded the American motion picture industry in the mid 1890s, but had little involvement in the business that sprang from his camera inventions."
			


    };

    // Method (what the object can do)
    public String getFacts() {



        String fact = "";

        //Random fact
        Random randomGenerator = new Random(); //Construct Random Number Generator
        int randomNumber = randomGenerator.nextInt(mFacts.length);
        //fact = randomNumber + "";

        fact = mFacts[randomNumber];

        return fact;



    }
}
