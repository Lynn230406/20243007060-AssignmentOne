package com.example.assignmentone;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onFacilitiesClick(View view) {
        Toast.makeText(this, "Facilities clicked", Toast.LENGTH_SHORT).show();
    }

    public void onEventsClick(View view) {
        Toast.makeText(this, "Events clicked", Toast.LENGTH_SHORT).show();
    }

    public void onClubsClick(View view) {
        Toast.makeText(this, "Clubs clicked", Toast.LENGTH_SHORT).show();
    }

    public void onSupportClick(View view) {
        Toast.makeText(this, "Support clicked", Toast.LENGTH_SHORT).show();
    }
}
