package com.example.imageselect;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {

    private ImageView selectedImage;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        selectedImage= findViewById(R.id.imageView1);
    }

    public void onImageClick(View view) {

        selectedImage = (ImageView) view;
        Toast.makeText(this, "" + selectedImage.getContentDescription() + " selected", Toast.LENGTH_SHORT).show();
    }

    public void onShowImageClick(View view) {
        if (selectedImage != null) {
            Toast.makeText(this, "Image " + selectedImage.getContentDescription() + " is selected", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "No image selected", Toast.LENGTH_SHORT).show();
        }
    }
}
