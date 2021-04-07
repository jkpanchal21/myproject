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



import java.util.List;

public class ComplainReplyByAdminAdapter extends ArrayAdapter<ComplainReplyByAdminItem> {

    Context context;
    Integer resource;
    List<ComplainReplyByAdminItem> complainReplyByAdminItems;

    public ComplainReplyByAdminAdapter(Context context, Integer resource, List<ComplainReplyByAdminItem> complainReplyByAdminItems)
    {
        super(context,resource,complainReplyByAdminItems);
        this.context = context;
        this.resource = resource;
        this.complainReplyByAdminItems = complainReplyByAdminItems;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
        View itememView = layoutInflater.inflate(resource,null,true);

        TextView itemesName = itememView.findViewById(R.id.card_Complain_Reply_Byadmin_name);
        TextView itemesdesc = itememView.findViewById(R.id.card_complain_Reply_byadmin_desc);
        Button btitemviewmore = itememView.findViewById(R.id.card_complain_reply_byadmin_btn);


        itemesName.setText(complainReplyByAdminItems.get(position).getComplainRepiyByAdminName());
        itemesdesc.setText(complainReplyByAdminItems.get(position).getComplainRepiyByAdmindesc());


        btitemviewmore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(context);
                alertDialogBuilder.setMessage("select item is:"+complainReplyByAdminItems.get(position).getComplainRepiyByAdminName());
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

