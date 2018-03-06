package com.example.ana.todojose.SubClase;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ana.todojose.R;

import org.sufficientlysecure.htmltextview.HtmlTextView;

/**
 * Created by ANA on 19/02/2018.
 */

public class TodoViewHolder extends RecyclerView.ViewHolder {
    public HtmlTextView html;
    public ImageView borrar;
    public TodoViewHolder(View itemView) {
        super(itemView);
        html= itemView.findViewById(R.id.html_text);
        borrar = itemView.findViewById(R.id.delete);
    }
}
