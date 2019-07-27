package com.example.mint;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {

    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.date);
        SimpleDateFormat sdf = new SimpleDateFormat("dd.mm.yyyy  'Time:' HH:mm:ss ");
        String currentDateandTime = sdf.format(new Date());
        textView.setText(currentDateandTime);

        gridLayout=(GridLayout)findViewById(R.id.mainGrid);

        setSingleEvent(gridLayout);

    }

    //  onClickListener for each element
    private void setSingleEvent(GridLayout gridLayout) {
        for(int i = 0; i<gridLayout.getChildCount();i++){
            CardView cardView=(CardView)gridLayout.getChildAt(i);
            final int finalI= i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MainActivity.this,"Clicked at index "+ finalI,
                            Toast.LENGTH_SHORT).show();
                }
            });
        }
    }


}
