package com.example.saraserpico.surveyapp;

        import android.content.Intent;
        import android.os.Bundle;
        import android.support.design.widget.FloatingActionButton;
        import android.support.design.widget.Snackbar;
        import android.support.v7.app.AppCompatActivity;
        import android.support.v7.widget.Toolbar;
        import android.view.View;
        import android.widget.AdapterView;
        import android.widget.ArrayAdapter;
        import android.widget.Button;
        import android.widget.ListView;
        import android.widget.Spinner;
        import android.widget.TextView;

        import java.util.ArrayList;

public class ChooseSurvey extends LoginActivity {

    private ArrayAdapter<String> listviewAdapter;
    private ArrayAdapter<String> spinnerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_survey);

        Intent i=getIntent();

        TextView logged = (TextView) findViewById(R.id.user);



        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        ListView lv=(ListView) findViewById(R.id.listasedi);
        listviewAdapter=new ArrayAdapter<String>(this, R.layout.row);
        lv.setAdapter(listviewAdapter);

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String name = spinner.getSelectedItem().toString();

        Button button1 = (Button)findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent = new Intent(
                        getApplicationContext(),
                        SurveyActivity.class
                );
                startActivity(intent);
            }
        });
    }

}
