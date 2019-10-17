package com.example.fragadata;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {
EditText et1,et2;
Button bu1;
FrameLayout frameLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.e1);
        et2=findViewById(R.id.e2);
        bu1=findViewById(R.id.b1);
        frameLayout=findViewById(R.id.fram1);
        bu1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1=et1.getText().toString();
                String s2=et2.getText().toString();
                Bundle bundle=new Bundle();
                bundle.putString("key1",s1);
                bundle.putString("key2",s2);
                DataFragment dataFragment=new DataFragment();
                FragmentManager fragmentManager=getSupportFragmentManager();
                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                fragmentTransaction.add(R.id.fram1,dataFragment);
                dataFragment.setArguments(bundle);
                fragmentTransaction.commit();
            }
        });
    }
}
