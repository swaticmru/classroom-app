package com.swati.platform.classroomappui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

import com.swati.platform.classroomappui.R;
import com.swati.platform.classroomappui.ins;
import com.swati.platform.classroomappui.mad;
import com.swati.platform.classroomappui.nosql;
import com.swati.platform.classroomappui.pc;
import com.swati.platform.classroomappui.pp;
import com.swati.platform.classroomappui.sg;

public class Courses extends AppCompatActivity {
    CardView ins,ai,nosql,mad,cd,pp,pc,sg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_courses);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        ins=(CardView)findViewById(R.id.ins);
        ai=(CardView)findViewById(R.id.ai);
        nosql=(CardView)findViewById(R.id.nosql);
        mad=(CardView)findViewById(R.id.mad);
        cd=(CardView)findViewById(R.id.cd);
        pp=(CardView)findViewById(R.id.pp);
        pc=(CardView)findViewById(R.id.pc);
        sg=(CardView)findViewById(R.id.sg);

        ins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent(Courses.this, ins.class);
                startActivity(i1);

            }
        });
        ai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(Courses.this,ai.class);
                startActivity(i2);

            }
        });
        nosql.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent(Courses.this, nosql.class);
                startActivity(i3);

            }
        });
        mad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent(Courses.this, mad.class);
                startActivity(i4);

            }
        });
        cd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5=new Intent(Courses.this,compilerdesign.class);
                startActivity(i5);

            }
        });
        pp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6=new Intent(Courses.this,pp.class);
                startActivity(i6);

            }
        });
        pc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i7=new Intent(Courses.this, pc.class);
                startActivity(i7);

            }
        });
        sg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i8=new Intent(Courses.this, sg.class);
                startActivity(i8);

            }
        });




    }

    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }

}
