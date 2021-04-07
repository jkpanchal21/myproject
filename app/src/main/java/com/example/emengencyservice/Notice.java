package com.example.emengencyservice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.emengencyservice.Adapter.CustomEvitemadapter;
import com.example.emengencyservice.Adapter.CustomNoticeitemadapter;
import com.example.emengencyservice.pojo.Eventitem;
import com.example.emengencyservice.pojo.Noticeitem;

import java.util.ArrayList;
import java.util.List;

public class Notice extends AppCompatActivity {
    ListView lvNotice;
    Button btitemviewmore;
    List<Noticeitem> noticeitems = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notice);

        lvNotice = findViewById(R.id.lv_notice);
        btitemviewmore = findViewById(R.id.bt_item_viewMore);

        Noticeitem noticeitem1 = new Noticeitem("1", "Culd house", "culd house is under construction so plz dont go till 30 april");
        Noticeitem noticeitem2 = new Noticeitem("1", "Garden", "Garden under mentaince so plz don't go till 31March. ");
        Noticeitem noticeitem3 = new Noticeitem("1", "socity main hall", "Socity main hall is A.C are not in working condtion so plz under stand till 5 April.");
        Noticeitem noticeitem4 = new Noticeitem("1", "Covid update", "Covid cases are incres very fast. socity decide to no one preson exit night 8 pm.");
        Noticeitem noticeitem5 = new Noticeitem("1", "Navratri ", "culd house is unser construction so plz dont go till 30 april");
        Noticeitem noticeitem6 = new Noticeitem("1", "Covid gudlines", "ect Gudlines");

        noticeitems.add(noticeitem1);
        noticeitems.add(noticeitem2);
        noticeitems.add(noticeitem3);
        noticeitems.add(noticeitem4);
        noticeitems.add(noticeitem5);
        noticeitems.add(noticeitem6);

        CustomNoticeitemadapter customNoticeitemadapter = new CustomNoticeitemadapter(Notice.this,
                R.layout.noticecard, noticeitems);

        lvNotice.setAdapter(customNoticeitemadapter);

        lvNotice.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
              /*  String selecteditem = parent.getItemAtPosition(position).toString();
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Notice.this);
                alertDialogBuilder.setMessage("selected item is:"+selecteditem);
                alertDialogBuilder.setPositiveButton("OK",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Toast.makeText(Notice.this,"You clicked yes button",Toast.LENGTH_LONG).show();
                            }
                        });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();*/

            }
        });


    }


}