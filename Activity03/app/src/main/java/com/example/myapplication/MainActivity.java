package com.example.myapplication;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   Context context;




    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        context=getApplicationContext();
        setContentView(R.layout.activity_main);

        //Toast
        Toast myToast = new Toast(context);
        //myToast.makeText(context,"This is a Toast Message",Toast.LENGTH_LONG).show();
        //Dialog
        final AlertDialog.Builder DialogConf = new AlertDialog.Builder(this);
        DialogConf.setTitle("Regular Menus");
        DialogConf.setMessage("This is the Text of the Dialog");
        DialogConf.setIcon(R.mipmap.ic_launcher);
        final EditText TextInput = new EditText(context);
        DialogConf.setView(TextInput);
        DialogConf.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {

            }
        });
        DialogConf.setPositiveButton("Confirm", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String str = TextInput.getEditableText().toString();
                Toast.makeText(context,"You wrote this dialog: " + str,Toast.LENGTH_LONG).show();

            }
        });
        DialogConf.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {

            }
        });




        AlertDialog MyDialog= DialogConf.create();
        MyDialog.show();

        //Notification
        Notification.Builder notifBuilder=new Notification.Builder(this);
        notifBuilder.setSmallIcon(R.mipmap.ic_launcher);
        notifBuilder.setContentTitle("This is my shiny notification!");
        notifBuilder.setContentTitle("This is the detail of the notification");
        NotificationManager myNotification=(NotificationManager)getSystemService(Context.NOTIFICATION_SERVICE);
        myNotification.notify(1234,notifBuilder.build());





    }
}
