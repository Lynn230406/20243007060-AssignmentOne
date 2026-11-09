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
        String[] subtitles = getResources().getStringArray(R.array.subtitles);
        String[] details = getResources().getStringArray(R.array.details);
        String[] images = getResources().getStringArray(R.array.images);

        String title = titles[topicIndex];
        String subtitle = subtitles[topicIndex];
        String content = details[topicIndex];
        String imageName = images[topicIndex];

        int imageResId = getResources().getIdentifier(imageName, "drawable", getPackageName());

        TextView titleView = findViewById(R.id.detail_title);
        TextView subtitleView = findViewById(R.id.detail_subtitle);
        TextView contentView = findViewById(R.id.detail_content);
        ImageView imageView = findViewById(R.id.detail_image);

        titleView.setText(title);
        subtitleView.setText(subtitle);
        contentView.setText(content);
        imageView.setImageResource(imageResId);
    }
}