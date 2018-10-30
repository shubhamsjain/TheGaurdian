package com.lenovo.thegaurdian.Activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.lenovo.thegaurdian.R;

import static com.lenovo.thegaurdian.R.id.img_dpndnt_ic;

public class AddDependentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_dependent);
        ImageView addDependent=(ImageView)findViewById(img_dpndnt_ic);
        addDependent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /**   code to upload and select image comes here  */
            }
        });
    }
}
