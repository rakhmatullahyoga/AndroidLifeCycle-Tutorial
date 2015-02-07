package com.vogella.android.intent.explicit;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by Rakhmatullah Yoga S on 2/8/2015.
 */
public class ResultActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Bundle extras = getIntent().getExtras();
        String inputString = extras.getString("rakhmatullahyoga");
        TextView view = (TextView) findViewById(R.id.returnValue);
        view.setText(inputString);
    }

    @Override
    public void finish() {
        // TODO 1 create new Intent
        Intent intent = new Intent();

        // TODO 2 read the data of the EditText field
        // with the id returnValue
        EditText editText = (EditText) findViewById(R.id.returnValue);

        // TODO 3 put the text from EditText
        // as String extra into the intent
        // use editText.getText().toString();
        String string = editText.getText().toString();

        // TODO 4 use setResult(RESULT_OK, intent);
        // to return the Intent to the application
        intent.putExtra("rakhmatullahyoga", string);
        setResult(RESULT_OK, intent);

        super.finish();
    }
}
