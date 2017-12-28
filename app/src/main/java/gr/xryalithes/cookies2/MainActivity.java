package gr.xryalithes.cookies2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
        /**
         * Called when the cookie should be eaten.
         */


    public void eatCookie(View view) {
        displayCookieAfterImage(view);
        displayStatusText();


    }
//DISPLAY THE TEXT IN THE BUTTON AFTER EATING THE COOKIE
    public void displayStatusText() {
        TextView text = (TextView) findViewById(R.id.status_text_view);
        text.setText(R.string.afterCookieText);

    }
//SETTING THE IMAGE WICH SHOWS THE EATEN COOKIE!!
    public void displayCookieAfterImage(View v) {

        ImageView cookieImage = (ImageView) findViewById(R.id.android_cookie_image_view);
        cookieImage.setImageResource(R.drawable.after_cookie);
    }



}


















