package vn.edu.ntu.quynhanh.caoquynhanh_59130033_simplewidget;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText name, dob, fvr;
    RadioGroup radioGroup;
    RadioButton radioButton;
    Button confirm;
    CheckBox movie, music, coffee, home, cook;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = (EditText) findViewById(R.id.yourname);
        dob = (EditText) findViewById(R.id.yourdob);
        fvr = (EditText) findViewById(R.id.yourfvr);

        movie = (CheckBox) findViewById(R.id.watchmovie);
        music = (CheckBox) findViewById(R.id.listenmusic);
        coffee = (CheckBox) findViewById(R.id.gocafe);
        home = (CheckBox) findViewById(R.id.athome);
        cook = (CheckBox) findViewById(R.id.inkitchen);

        confirm = (Button) findViewById(R.id.btnconfirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str ="";
                if(movie.isChecked())
                {
                    str += movie.getText()+"; ";
                }
                if(music.isChecked())
                {
                    str += music.getText()+"; ";
                }
                if(coffee.isChecked())
                {
                    str += coffee.getText()+"; ";
                }
                if(home.isChecked())
                {
                    str += home.getText()+"; ";
                }
                if(cook.isChecked())
                {
                    str += cook.getText();

                }
                str += "; "+fvr.getText();
                radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
                int id = radioGroup.getCheckedRadioButtonId();
                radioButton = findViewById(id);

                Toast.makeText(getApplicationContext(),"Tên: "+name.getText()+'\n'
                        +"Ngày sinh: "+dob.getText()+','+'\n'
                        +"Giới tính: "+radioButton.getText()+','+'\n'
                        +"Sở thích: "+ str+","
                        +fvr.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
