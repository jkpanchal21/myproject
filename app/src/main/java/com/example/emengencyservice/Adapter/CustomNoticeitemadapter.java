package com.example.emengencyservice.Adapter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;

import com.example.emengencyservice.MainActivity;
import com.example.emengencyservice.Notice;
import com.example.emengencyservice.R;
import com.example.emengencyservice.noticeinfo;
import com.example.emengencyservice.pojo.Eventitem;
import com.example.emengencyservice.pojo.Noticeitem;

import java.util.List;

public class CustomNoticeitemadapter extends ArrayAdapter<Noticeitem> {

    Context context;
    Integer resource;
    List<Noticeitem> noticeitems;
    public CustomNoticeitemadapter(Context context, Integer resource, List<Noticeitem> noticeitems)
    {
        super(context,resource,noticeitems);
        this.context = context;
        this.resource = resource;
        this.noticeitems = noticeitems;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itemNoticeView = layoutInflater.inflate(resource,null,true);

        TextView itemNoticename = itemNoticeView.findViewById(R.id.card_notice_title);
        TextView itemNoticedesc = itemNoticeView.findViewById(R.id.card_notice_desc);
       Button btitemviewmore = itemNoticeView.findViewById(R.id.card_notice_btn);
        ListView listView =  itemNoticeView.findViewById(R.id.lv_notice);
        itemNoticename.setText(noticeitems.get(position).getNoName());
        itemNoticedesc.setText(noticeitems.get(position).getNodesc());


     btitemviewmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setMessage("select item is:"+noticeitems.get(position).getNoName());
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

        return itemNoticeView;

    }
}
