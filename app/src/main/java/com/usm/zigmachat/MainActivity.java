package com.usm.zigmachat;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView lv1=findViewById(R.id.lv1);

        String names[]={"Hasmukh Gandhi","Sergio Marquina","Carryminati","Srikant Tiwari","Vladimir Putin","Himmat Singh","Andres de Fonollosa",
                "Akhandanand Tripathi","Elon Musk","Kim jong Un","Sandeep","Donald Trump"};

        int img_id[]={R.drawable.img,R.drawable.sergio_img,R.drawable.carry_img,R.drawable.sri_img,R.drawable.putin_img,R.drawable.himmat_img,R.drawable.andres_img,
                R.drawable.kalin_img,R.drawable.elon_img,R.drawable.kim_img,R.drawable.sunny_img,R.drawable.trump_img};

        String[] contry={"India","Spain", "India", "India","Russia", "India", "Spain",
                "India", "America","North Korea", "India", "America" };

        String[] number={"+91 9967845671","+34 9038773819","+91 9988354678","+91 8936782899", "+7 77884678",
                "+91 8977037128","+34 889345034","+91 7946378389","+1 88903036",
                "+850 902637821","+91 8839020104","+1 78455367"};

        String lst_msg[]={"Kem Cho??","Hello","To kese he app","Aa raha hu", "let's go","Nameste","are o Munna",
                "Shabash","hii",  "I have bomb","What's up","Nice"};

        String nik_names[]={"GujjuBhai","Profesor","Carry","Sri","Putin","Himmat","Berlin",
                "KalinBhaiya","Elon","Kim","Sunny","Trump"};

        c_adepter ad=new c_adepter(MainActivity.this,names,lst_msg,img_id);
        lv1.setAdapter(ad);
        Intent i1=new Intent(MainActivity.this,Display.class);
        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                i1.putExtra("img",img_id[i]);
                i1.putExtra("name",names[i]);
                i1.putExtra("no",number[i]);
                i1.putExtra("co",contry[i]);
                i1.putExtra("nik",nik_names[i]);
                startActivity(i1);
            }
        });
    }
}