package com.example.pankajkatiyar.hideshowimage;

import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnHideShow = (Button)findViewById(R.id.btnHideShow);
        final ImageView imgView = (ImageView)findViewById(R.id.imgView);
        btnHideShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String temp = btnHideShow.getText().toString();
                //Log.d("Variable",": Value is: "+temp);
                //Log.d("Function: "," Value is: "+btnHideShow.getText());
                if (btnHideShow.getText().equals("Hide")){
                    Toast.makeText(MainActivity.this, "Hiding Image", Toast.LENGTH_SHORT).show();
                    imgView.setVisibility(View.INVISIBLE);
                    btnHideShow.setText("Show");
                }else{
                    Toast.makeText(MainActivity.this, "Showing Image", Toast.LENGTH_SHORT).show();
                    imgView.setVisibility(View.VISIBLE);
                    btnHideShow.setText("Hide");
                }
            }
        });

        imgView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "You Clicked On Image", Toast.LENGTH_SHORT).show();
            }
        });

    }

}
