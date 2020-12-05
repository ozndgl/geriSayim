package ozn.gerisayim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new CountDownTimer(30000,1000){

            public void onTick(long millisUntilFinished) {
               // mTextField.setText("seconds remaining: " + millisUntilFinished / 1000);
                System.out.println("seconds remaining: " + millisUntilFinished / 1000);

            }

            public void onFinish() {
                //mTextField.setText("done!");
                System.out.println("done!");
            }
        }.start();
    }
    public void geriSayim(){

    }
}