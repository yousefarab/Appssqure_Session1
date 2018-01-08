package com.arab.appssqure_session1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import static android.text.InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD;

public class MainActivity extends AppCompatActivity {
    EditText Name, Pass;
    ImageView ImgProfile, eye;
    Button Login;
    int ISOPEN = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {


        Name = findViewById(R.id.user_name);
        Pass = findViewById(R.id.passward);
        ImgProfile = findViewById(R.id.image);
        eye = findViewById(R.id.eye);
        Login = findViewById(R.id.login);
        ////////////////////////////////
        Login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validation(Name);
                validation(Pass);
            }
        });
         eye.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
         if (ISOPEN == 0) {
             Pass.setInputType(TYPE_TEXT_VARIATION_VISIBLE_PASSWORD);
                    //show opion
                  ISOPEN = 1;
               } else {
           Pass.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);

                    //show pass
                 ISOPEN = 0;


         }
            Pass.setSelection(Pass.length());

            }
 });

               }

                public void validation(EditText name) {
                 if (name.getText().equals(" ")) {
                    name.setError("please enter your" + name.getHint());
                  }
                 }
}
