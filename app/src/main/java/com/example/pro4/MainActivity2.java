package com.example.pro4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageButton;
import android.app.Activity;
import android.view.View;


public class MainActivity2 extends AppCompatActivity {
    ImageButton imageButton1Act2;
    ImageButton imageButton2Act2;
    ImageButton imageButton3Act2;
    ImageButton imageButton4Act2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        imageButton1Act2 = (ImageButton)findViewById(R.id.imageButton1Act2);
        imageButton2Act2 = (ImageButton)findViewById(R.id.imageButton2Act2);
        imageButton3Act2 = (ImageButton)findViewById(R.id.imageButton3Act2);
        imageButton4Act2 = (ImageButton)findViewById(R.id.imageButton4Act2);

        imageButton1Act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(Intent.ACTION_VIEW, Uri.parse("http://newtreat.co.in"));
                startActivity(intent1);
            }
        });
        imageButton2Act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:8359838126"));
                startActivity(intent2);
            }
        });
        imageButton3Act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:12.935546111560111, 77.60614584602457"));
                startActivity(intent3);
            }
        });
        //https://www.google.com/maps/place/CHRIST+(Deemed+to+be+University)/@12.9347138,77.6063569,16.22z/data=!4m5!3m4!1s0x0:0x88518f37b39dabd0!8m2!3d12.9344168!4d77.6060171

        imageButton4Act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL,"ronald.wilson@science.christuniversity.in");
                email.putExtra(Intent.EXTRA_SUBJECT,"Greetings from my app");
                email.putExtra(Intent.EXTRA_TEXT,"Good Morning !, This is a test email sent through the APP");
                email.setType("message/rfc882");
                startActivity(email);
            }
        });
    }

}
/*
* Create an Application that has a minimum of two activities
one to display the login screen  (you can use the previous LAB Program)
- accept the username and password
- on successful login display the second activity
On second activity display 4 image buttons
- First Button for showing the company website "http://newtreat.co.in;
- Second button for making a direct phone call
- Third button to show the location - location must be CHRIST University - Central Campus
- Forth button to send an email with the below details
The subject of the email - "Greetings from 5BCA!!"
Send to: any two emails
email content: "Good Morning !, This is a test email sent through the APP"

Use appropriate font, style, theme, button, image button, radio button, checkbox (as needed)
Use proper Intent to complete the app
You can choose any layout which suits the need of the APP
Upload the Manifest code, Layout XML code and Java code, in Word/Docs/PDF
* format along with the Project ZIP file
* */