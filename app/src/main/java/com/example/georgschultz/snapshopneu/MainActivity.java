package com.example.georgschultz.snapshopneu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Student tom = new Student();
        StudentRepo db = new StudentRepo(this);

        db.insert(tom);

        System.out.println("bliblu "+db.getStudentList());

    }

}
