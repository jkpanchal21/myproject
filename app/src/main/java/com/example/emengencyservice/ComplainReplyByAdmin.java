package com.example.emengencyservice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.emengencyservice.Adapter.ComplainReplyByAdminAdapter;
import com.example.emengencyservice.Adapter.CustomEvitemadapter;
import com.example.emengencyservice.pojo.ComplainReplyByAdminItem;
import com.example.emengencyservice.pojo.Eventitem;

import java.util.ArrayList;
import java.util.List;

public class ComplainReplyByAdmin extends AppCompatActivity {
    ListView lvComplainReplyByAdmin;
    List<ComplainReplyByAdminItem> complainReplyByAdminItems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain_reply_by_admin);
        lvComplainReplyByAdmin = findViewById(R.id.lv_Complain_Reply_By_Admin);

        ComplainReplyByAdminItem complainReplyByAdminItem1 = new ComplainReplyByAdminItem("1","that complain","that desc");
        ComplainReplyByAdminItem complainReplyByAdminItem2 = new ComplainReplyByAdminItem("2","that complain","that desc");
        ComplainReplyByAdminItem complainReplyByAdminItem3 = new ComplainReplyByAdminItem("3","that complain","that desc");
        ComplainReplyByAdminItem complainReplyByAdminItem4 = new ComplainReplyByAdminItem("4","that complain","that desc");
        ComplainReplyByAdminItem complainReplyByAdminItem5 = new ComplainReplyByAdminItem("5","that complain","that desc");
        ComplainReplyByAdminItem complainReplyByAdminItem6 = new ComplainReplyByAdminItem("6","that complain","that desc");
        ComplainReplyByAdminItem complainReplyByAdminItem7 = new ComplainReplyByAdminItem("7","that complain","that desc");
        ComplainReplyByAdminItem complainReplyByAdminItem8 = new ComplainReplyByAdminItem("8","that complain","that desc");
        ComplainReplyByAdminItem complainReplyByAdminItem9 = new ComplainReplyByAdminItem("9","that complain","that desc");
        ComplainReplyByAdminItem complainReplyByAdminItem10 = new ComplainReplyByAdminItem("10","that complain","that desc");
        ComplainReplyByAdminItem complainReplyByAdminItem11 = new ComplainReplyByAdminItem("11","that complain","that desc");
        ComplainReplyByAdminItem complainReplyByAdminItem12 = new ComplainReplyByAdminItem("12","that complain","that desc");
        ComplainReplyByAdminItem complainReplyByAdminItem13 = new ComplainReplyByAdminItem("13","that complain","that desc");
        ComplainReplyByAdminItem complainReplyByAdminItem14 = new ComplainReplyByAdminItem("14","that complain","that desc");

        complainReplyByAdminItems.add(complainReplyByAdminItem1);
        complainReplyByAdminItems.add(complainReplyByAdminItem2);
        complainReplyByAdminItems.add(complainReplyByAdminItem3);
        complainReplyByAdminItems.add(complainReplyByAdminItem4);
        complainReplyByAdminItems.add(complainReplyByAdminItem5);
        complainReplyByAdminItems.add(complainReplyByAdminItem6);
        complainReplyByAdminItems.add(complainReplyByAdminItem7);
        complainReplyByAdminItems.add(complainReplyByAdminItem8);
        complainReplyByAdminItems.add(complainReplyByAdminItem9);
        complainReplyByAdminItems.add(complainReplyByAdminItem10);
        complainReplyByAdminItems.add(complainReplyByAdminItem11);
        complainReplyByAdminItems.add(complainReplyByAdminItem12);
        complainReplyByAdminItems.add(complainReplyByAdminItem13);
        complainReplyByAdminItems.add(complainReplyByAdminItem14);

        ComplainReplyByAdminAdapter complainReplyByAdminAdapter = new ComplainReplyByAdminAdapter(ComplainReplyByAdmin.this,R.layout.complainreplybyadmincard,complainReplyByAdminItems);
        lvComplainReplyByAdmin.setAdapter(complainReplyByAdminAdapter);

        lvComplainReplyByAdmin.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selecteditem = parent.getItemAtPosition(position).toString();
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(ComplainReplyByAdmin.this);
                alertDialogBuilder.setMessage("selected item is:"+selecteditem);
                alertDialogBuilder.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Toast.makeText(ComplainReplyByAdmin.this,"You clicked yes button",Toast.LENGTH_LONG).show();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });

    }
}