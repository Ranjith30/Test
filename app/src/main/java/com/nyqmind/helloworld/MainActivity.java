package com.nyqmind.helloworld;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    EditText username,password;
/*dfkdsnfs
    fsdkfkdsf;ksdmfdsf
    sd;fmsd;lfmdsf
    sdfsdmflsdnfkjsdf
            sdjjfsdlfdsnfsdf
    sdlfnnsdljfnsd;fksdf;ksdf
    sdfjsdnflkksdfs'dfkoirejjwerjwel'*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn= (Button) findViewById(R.id.button);

        // hi

        username= (EditText) findViewById(R.id.editText);
        password= (EditText) findViewById(R.id.editText2);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Welcome "+username.getText().toString()+
                        " your password is"+password.getText().toString(),Toast.LENGTH_LONG).show();

            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
