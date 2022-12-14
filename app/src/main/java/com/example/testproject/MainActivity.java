package com.example.testproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;
//import com.jjoe64.graphview.GraphView;
//import com.jjoe64.graphview.series.DataPoint;
//import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;
    private GraphView graphView1,graphView2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        graphView1 = findViewById(R.id.idGraphView1);
        graphView2 = findViewById(R.id.idGraphView);

        // on below line we are adding data to our graph view.
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                // on below line we are adding
//                // each point on our x and y axis.
                new DataPoint(0, 1),
                new DataPoint(1, 3),
                new DataPoint(2, 4),
//                new DataPoint(3, 9),
//                new DataPoint(4, 6),

        });




        graphView1.setTitleColor(R.color.purple_200);
        graphView1.setTitleTextSize(5);
        graphView1.addSeries(series);

        graphView2.setTitleColor(R.color.purple_200);
        graphView2.setTitleTextSize(5);
        graphView2.addSeries(series);
    }
}