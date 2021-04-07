package com.example.emengencyservice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.emengencyservice.Adapter.CustomEvitemadapter;
import com.example.emengencyservice.Adapter.Customemitemadapter;
import com.example.emengencyservice.pojo.Emergencyitem;
import com.example.emengencyservice.pojo.Eventitem;

import java.util.ArrayList;
import java.util.List;


public class Event extends AppCompatActivity {
    ListView lvEvent;
    List<Eventitem> eventitems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        lvEvent = findViewById(R.id.lv_em_sr);
        Eventitem eventitem1 = new Eventitem("1", "Bday party", "jay panchal party in socity garden");
        Eventitem eventitem2 = new Eventitem("2", "Mairrage", "x weds y in socity comman plot date 20 march");
        Eventitem eventitem3 = new Eventitem("3", "get to gether", "failmay and friend meet up socity culb house.");
        Eventitem eventitem4 = new Eventitem("4", "Ring cremeny", "a and y ring cremeny at soscity hole at 12 pm and date 30 april");
        Eventitem eventitem5 = new Eventitem("5", "funral", "At socity funral house at 1PM date:30 may");


        eventitems.add(eventitem1);
        eventitems.add(eventitem2);
        eventitems.add(eventitem3);
        eventitems.add(eventitem4);
        eventitems.add(eventitem5);

        CustomEvitemadapter customEvitemadapter = new CustomEvitemadapter(Event.this, R.layout.eventcardview, eventitems);
        lvEvent.setAdapter(customEvitemadapter);

        lvEvent.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selecteditem = parent.getItemAtPosition(position).toString();
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Event.this);
                alertDialogBuilder.setMessage("selected item is:"+selecteditem);
                alertDialogBuilder.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Toast.makeText(Event.this,"You clicked yes button",Toast.LENGTH_LONG).show();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

    }
}