package com.example.kamir.lab3;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DatabaseHandler db = new DatabaseHandler(this);

        //CONTACTS TABLE
        Log.d("Insert:", "Inserting..");
        db.addContact(new Contacts("Ravi", "200009991"));
        db.addContact(new Contacts("Srinivas", "433322334"));
        db.addContact(new Contacts("Tommy", "3333999911"));
        db.addContact(new Contacts("Karthik", "6665554444"));

        //CAREERS TABLE
        Log.d("Insert:", "Inserting..");
        db.addCareers(new Careers("architecture"));
        db.addCareers(new Careers("medicine"));
        db.addCareers(new Careers("teacher"));
        db.addCareers(new Careers("watchman"));
        db.addCareers(new Careers("mother"));


        //Reading all Contacts
        Log.d("Reading:", "Reading all contacts..");
        List<Contacts> contacts = db.getAllContacts();

        for (Contacts cn : contacts) {
            String log = "Id: " + cn.getID() + ",FName:" + cn.getFname() + ",LName:" + cn.getLname();
            // Writing Contacts to log
            Log.d("Name:", log);
        }

        //Reading all Courses
        Log.d("Reading:", "Reading all courses..");
        List<Careers> careers = db.getAllCareers();

        for (Careers cs : careers){
            String log = "CID: "+cs.getCID()+",CName:"+cs.getCName();
            // Writing Contacts to log
            Log.d("Name:", log);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so longcccccccccccccccccc
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
