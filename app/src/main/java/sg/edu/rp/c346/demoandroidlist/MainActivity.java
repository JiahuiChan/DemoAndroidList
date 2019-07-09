package sg.edu.rp.c346.demoandroidlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvAndroid;
    ArrayList<AndroidVersion> androidList;
    CustomAdapter ca;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvAndroid = findViewById(R.id.listViewAndroid);

        androidList = new ArrayList<AndroidVersion>();

        androidList.add(new AndroidVersion("Pie" , "9.0"));
        androidList.add(new AndroidVersion("Oreo" , "8.0-8.1"));
        androidList.add(new AndroidVersion("Nougat" , "7.0 - 7.1.2"));
        androidList.add(new AndroidVersion("Marshmallow" , "6.0 - 6.0.1"));
        androidList.add(new AndroidVersion("Lollipop" , "5.0-5.1.1"));
        androidList.add(new AndroidVersion("KitKat" , "4.4-4.4.4"));
        androidList.add(new AndroidVersion("Jelly Bean" , "4.1-4.3.1"));

        ca = new CustomAdapter(this, R.layout.row , androidList);

        lvAndroid.setAdapter(ca);
    }
}
