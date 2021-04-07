package com.example.emengencyservice.Adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import com.example.emengencyservice.R;
import com.example.emengencyservice.pojo.ComplainReplyByAdminItem;
import com.example.emengencyservice.pojo.EventReplyByAdminitem;

import java.util.List;

public class EventReplyByAdminAdapter extends ArrayAdapter<EventReplyByAdminitem> {

    Context context;
    Integer resource;
    List<EventReplyByAdminitem> eventReplyByAdminitems;

    public EventReplyByAdminAdapter(Context context, Integer resource, List<EventReplyByAdminitem> eventReplyByAdminitems) {
        super(context, resource, eventReplyByAdminitems);
        this.context = context;
        this.resource = resource;
        this.eventReplyByAdminitems = eventReplyByAdminitems;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itememView = layoutInflater.inflate(resource, null, true);

        TextView itemesName = itememView.findViewById(R.id.card_event_reply_by_admin_name);
        TextView itemesdesc = itememView.findViewById(R.id.card_event_reply_by_admin_desc);
        TextView itemesstatus = itememView.findViewById(R.id.card_event_reply_by_admin_status);

        Button btitemviewmore = itememView.findViewById(R.id.card_event_reply_by_admin_btn);


        itemesName.setText(eventReplyByAdminitems.get(position).getEventReplyByAdminName());
        itemesdesc.setText(eventReplyByAdminitems.get(position).getEventReplyByAdmindesc());
        itemesstatus.setText(eventReplyByAdminitems.get(position).getEventReplyByAdminstatus());

        btitemviewmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setMessage("select item is:" + eventReplyByAdminitems.get(position).getEventReplyByAdminName());
                alertDialogBuilder.setPositiveButton("Ok",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Toast.makeText(context, "You clicked yes button", Toast.LENGTH_LONG).show();
                            }
                        });

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();
            }

        });

        return itememView;


    }
}