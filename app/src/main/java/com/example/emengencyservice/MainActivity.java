package com.example.emengencyservice;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.emengencyservice.Adapter.Customemitemadapter;
import com.example.emengencyservice.pojo.Emergencyitem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView lvEmSr;
    List<Emergencyitem> emergencyitems = new ArrayList<>();
    ImageView ivEmrServiceBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivEmrServiceBack = findViewById(R.id.iv_emr_service_back);
        lvEmSr = findViewById(R.id.lv_em_sr);

        ivEmrServiceBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                startActivity(intent);
            }
        });

        Emergencyitem emergencyitem1 = new Emergencyitem("1","Police","100");
        Emergencyitem emergencyitem2 = new Emergencyitem("2","palmber","8140336517");
        Emergencyitem emergencyitem3 = new Emergencyitem("3","ambulens","101");
        Emergencyitem emergencyitem4 = new Emergencyitem("4","Womenhelp","1200");
        Emergencyitem emergencyitem5 = new Emergencyitem("5","Police","100");

        emergencyitems.add(emergencyitem1);
        emergencyitems.add(emergencyitem2);
        emergencyitems.add(emergencyitem3);
        emergencyitems.add(emergencyitem4);
        emergencyitems.add(emergencyitem5);

        Customemitemadapter customemitemadapter = new Customemitemadapter(MainActivity.this,R.layout.emergencyservicecardview,emergencyitems);

        lvEmSr.setAdapter(customemitemadapter);

        lvEmSr.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selecteditem = parent.getItemAtPosition(position).toString();
                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
                alertDialogBuilder.setMessage("selected item is:"+selecteditem);
                        alertDialogBuilder.setPositiveButton("OK",
                                new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface arg0, int arg1) {
                                        Toast.makeText(MainActivity.this,"selectd item",Toast.LENGTH_LONG).show();
                                    }
                                });
                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }
        });
    }
}