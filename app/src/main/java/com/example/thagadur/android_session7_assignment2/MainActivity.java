package com.example.thagadur.android_session7_assignment2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.ButtonBarLayout;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Getting the Button id
        button=(Button)findViewById(R.id.clickBtn);
                button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //creating Intent for ActionDial to open dialer application
                Intent i=new Intent(Intent.ACTION_DIAL);
                //Adding phone number for the intent to display on dialer app
                i.setData(Uri.parse("tel:9342188373"));
                startActivity(i);

            }
        });

    }
}
