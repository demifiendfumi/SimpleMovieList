package sg.edu.rp.c346.simplemovielist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMovie;
    //Step 1b for ListView: Declare ListView variable

    //Step 2 for ListView: Declare ArrayList & ArrayAdaptor variables
    ArrayList<String> alMovieList;
    ArrayAdapter<String> aaMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Step 1c for ListView: Bind the ListView UI element to the ListView variable
        lvMovie = (ListView)findViewById(R.id. ListViewMovie);
        //Step 3 for ListView: Creating instance of ArrayList
        alMovieList = new ArrayList<String>();
        //Step 4 for ListView: Creating instance of ArrayAdapter, binding it to ArrayList
        aaMovie = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, alMovieList);
        //Step 5 For ListView: Bind the ArrayAdapter to ListView variable
        lvMovie.setAdapter(aaMovie);

        //Step 6 for listView: Populate the listView with data
        alMovieList.add("War for the Planet of the Apes. A 2017 sequel of the Planet of the Apes science fiction franchise by French author Pierre Boulle's");
        alMovieList.add("King Kong. Movie about a giant ape, created by American filmmaker Merian C. Cooper that first appear in 1930s.");
    }
}
