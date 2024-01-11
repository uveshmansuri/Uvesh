package com.usm.zigmachat;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class c_adepter extends BaseAdapter {
    Context con;
    String names[];
    String msg[];
    int img_id[];
    LayoutInflater lf;
    c_adepter(Context c,String [] name,String [] msg,int[] imgs){
        this.con=c;
        this.names=name;
        this.img_id=imgs;
        this.msg=msg;
        lf=LayoutInflater.from(con);
    }
    @Override
    public int getCount() {
        return img_id.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=lf.inflate(R.layout.c_layout,null);
        ImageView ig=(ImageView) view.findViewById(R.id.img_person);
        TextView tv_name=(TextView) view.findViewById(R.id.tv_name);
        TextView tv_msg=(TextView) view.findViewById(R.id.tv_msg);
        ig.setImageResource(img_id[i]);
        tv_name.setText(names[i]);
        tv_msg.setText(msg[i]);
        return view;
    }
}
