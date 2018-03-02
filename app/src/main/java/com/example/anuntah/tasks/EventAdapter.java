 package com.example.anuntah.tasks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by anuntah on 14-02-2018.
 */

public class EventAdapter extends BaseAdapter {



    Context context;
    ArrayList<Event> eventArrayList;

    public EventAdapter(Context context,ArrayList<Event> eventArrayList) {

        this.context=context;
        this.eventArrayList=eventArrayList;


    }

    @Override
    public int getCount() {

        return eventArrayList.size();
    }

    @Override
    public Object getItem(int i)
    {
        return eventArrayList.get(i);
    }

    @Override
    public long getItemId(int i) {

        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View eventView = view;
        if(view==null)
        {
            LayoutInflater inflater=(LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            eventView =inflater.inflate(R.layout.list_item,viewGroup,false);

            ViewHolder holder=new ViewHolder();
            holder.title=eventView.findViewById(R.id.LText_title);
            holder.content=eventView.findViewById(R.id.LText_context);
            eventView.setTag(holder);
        }


        ViewHolder holder1 = (ViewHolder)eventView.getTag();
        Event event=eventArrayList.get(i);
        //event=(Event)getItem(i);
        holder1.title.setText(event.title);
        holder1.content.setText(event.content);



        return eventView;
    }



    class ViewHolder
    {
        TextView title;
        TextView content;

    }





}
