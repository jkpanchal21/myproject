package com.example.emengencyservice.Adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import com.example.emengencyservice.R;
import com.example.emengencyservice.pojo.Emergencyitem;
import com.example.emengencyservice.pojo.Eventitem;

import java.util.List;

public class CustomEvitemadapter extends ArrayAdapter<Eventitem> {

    Context context;
    Integer resource;
    List<Eventitem> eventitemList;

    public CustomEvitemadapter(Context context, Integer resource, List<Eventitem> eventitemList)
    {
        super(context,resource,eventitemList);
        this.context = context;
        this.resource = resource;
        this.eventitemList = eventitemList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itememView = layoutInflater.inflate(resource,null,true);

        TextView itemesName = itememView.findViewById(R.id.card_event_title);
        TextView itemesdesc = itememView.findViewById(R.id.card_event_desc);
        Button btitemviewmore = itememView.findViewById(R.id.card_event_btn);


        itemesName.setText(eventitemList.get(position).getEvName());
        itemesdesc.setText(eventitemList.get(position).getEvdesc());


        btitemviewmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setMessage("select item is:"+eventitemList.get(position).getEvName());
                alertDialogBuilder.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Toast.makeText(context,"You clicked yes button", Toast.LENGTH_LONG).show();
                            }
                        });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

        });

        return itememView;

    }
}

