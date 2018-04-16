package mg.studio.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Activity13 extends AppCompatActivity {

    /*
     * 1-Create a string array to populate the ListView: dummyData
     */

    private String[] dummyData = {"Dragona", "Dragon", "Long"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
         * 2-Create a layout to display each item in the list view: list_item.xml
         * 3-Create a layout 'main_activity.xml' that will hold the ListView and
         * connect it to the Java file using setContentView
         */

        setContentView(R.layout.activity_13);

        /*
         * 4-Create an ArrayAdapter 'mAdapter' to display the dummy data
         *      this: the current context
         *      R.layout.list_item: the layout for each single item in the list
         *      R.id.tv_item: The View that will hold the string value from the dummyData
         *      dummyData: the array that contains the dummy data
         */
        ArrayAdapter<String> mAdapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.tv_item, dummyData);


        /*
         * 5-Create an instance of the ListView (which is inside the main_activity.xml)
         * and set the adapter mAdapter to it by using setAdapter()
         */
        ListView listView = findViewById(R.id.list); //Connect the view list
        listView.setAdapter(mAdapter); //populate the ListView

        //Set the onClick listener to each item of the ListView
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Log.d("TAG", dummyData[i]);
            }
        });

    }
}
