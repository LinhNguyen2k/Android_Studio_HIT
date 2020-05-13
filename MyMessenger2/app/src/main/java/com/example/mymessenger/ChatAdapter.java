package com.example.mymessenger;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class ChatAdapter extends BaseAdapter {

    Context context;
    int layout;
    List<Chat> list;

    public ChatAdapter(Context context, int layout, List<Chat> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }


    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(layout, null);

        CircleImageView image = convertView.findViewById(R.id.image_avt);
        TextView name = convertView.findViewById(R.id.name);
        TextView message = convertView.findViewById(R.id.message_line);

        image.setImageResource(list.get(position).imagePath);
        name.setText(list.get(position).name);
        message.setText(list.get(position).message);

        return convertView;
    }
}
