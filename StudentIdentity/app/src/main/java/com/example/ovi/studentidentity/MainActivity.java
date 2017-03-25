package com.example.ovi.studentidentity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    Button btnSave,btnView;
    EditText nameEt,idEt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView() {
        btnSave = (Button) findViewById(R.id.btn_save);
        btnView = (Button) findViewById(R.id.btn_view);
        nameEt = (EditText) findViewById(R.id.name_id);
        idEt = (EditText) findViewById(R.id.st_id);

    }
    public void save(View v){
        String name=nameEt.getText().toString();
        int id=Integer.parseInt(idEt.getText().toString());
        Student st=new Student(name,id);
    }
    public void view(View v){

    }
}
