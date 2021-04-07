package com.example.emengencyservice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.emengencyservice.Adapter.EventReplyByAdminAdapter;
import com.example.emengencyservice.pojo.EventReplyByAdminitem;
import com.example.emengencyservice.pojo.Eventitem;

import java.util.ArrayList;
import java.util.List;

public class EventReplyByAdmin extends AppCompatActivity {
    ListView lvEventReplyByadmin;
    List<EventReplyByAdminitem> eventReplyByAdminitems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_reply_by_admin);
        lvEventReplyByadmin = findViewById(R.id.lv_event_reply_byadmin);

        EventReplyByAdminitem eventReplyByAdminitem1 = new EventReplyByAdminitem("1","same as","Yes","asdfghjkl");
        EventReplyByAdminitem eventReplyByAdminitem2 = new EventReplyByAdminitem("2","same as","Yes","asdfghjkl");
        EventReplyByAdminitem eventReplyByAdminitem3 = new EventReplyByAdminitem("3","same as","Yes","asdfghjkl");
        EventReplyByAdminitem eventReplyByAdminitem4 = new EventReplyByAdminitem("4","same as","Yes","asdfghjkl");
        EventReplyByAdminitem eventReplyByAdminitem5 = new EventReplyByAdminitem("5","same as","Yes","asdfghjkl");
        EventReplyByAdminitem eventReplyByAdminitem6 = new EventReplyByAdminitem("6","same as","Yes","asdfghjkl");
        EventReplyByAdminitem eventReplyByAdminitem7 = new EventReplyByAdminitem("7","same as","Yes","asdfghjkl");

        eventReplyByAdminitems.add(eventReplyByAdminitem1);
        eventReplyByAdminitems.add(eventReplyByAdminitem2);
        eventReplyByAdminitems.add(eventReplyByAdminitem3);
        eventReplyByAdminitems.add(eventReplyByAdminitem4);
        eventReplyByAdminitems.add(eventReplyByAdminitem5);
        eventReplyByAdminitems.add(eventReplyByAdminitem6);
        eventReplyByAdminitems.add(eventReplyByAdminitem7);

        EventReplyByAdminAdapter eventReplyByAdminAdapter = new EventReplyByAdminAdapter(EventReplyByAdmin.this,R.layout.event_reply_by_admin_card_view,eventReplyByAdminitems);
        lvEventReplyByadmin.setAdapter(eventReplyByAdminAdapter);

        lvEventReplyByadmin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selecteditem = parent.getItemAtPosition(position).toString();
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(EventReplyByAdmin.this);
                alertDialogBuilder.setMessage("selected item is:"+selecteditem);
                alertDialogBuilder.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Toast.makeText(EventReplyByAdmin.this,"You clicked yes button",Toast.LENGTH_LONG).show();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });


    }
}