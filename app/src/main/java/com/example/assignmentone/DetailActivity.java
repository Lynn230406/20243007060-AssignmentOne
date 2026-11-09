package com.example.assignmentone;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        int topicIndex = getIntent().getIntExtra("TOPIC_INDEX", 0);

        String[] titles = getResources().getStringArray(R.array.titles);
        String[] details = getResources().getStringArray(R.array.details);
        String[] images = getResources().getStringArray(R.array.images);

        String title = titles[topicIndex];
        String content = details[topicIndex];
        String imageName = images[topicIndex];

        int imageResId = getResources().getIdentifier(imageName, "drawable", getPackageName());

        TextView titleView = findViewById(R.id.detail_title);
        TextView contentView = findViewById(R.id.detail_content);
        ImageView imageView = findViewById(R.id.detail_image);

        titleView.setText(title);
        contentView.setText(content);
        imageView.setImageResource(imageResId);
    }
}
