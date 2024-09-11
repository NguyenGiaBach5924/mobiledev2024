package vn.edu.usth.weather;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.util.Log;
public class WeatherActivity extends AppCompatActivity {
    private static final String TAG = "WeatherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather);
        Log.i(TAG, "onCreate: Activity is created");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: Activity is visible and about to start interacting with the user");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: Activity has come to the foreground and is interactive");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: Another activity is taking focus or activity is going into background");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: Activity is no longer visible to the user");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: Activity is being destroyed");
    }
}