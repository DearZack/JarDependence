package io.github.dearzack.jardependence;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.Toast;

import com.blankj.utilcode.util.PhoneUtils;
import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image);
        Glide.with(this).load(R.mipmap.ic_launcher).into(imageView);
        Toast.makeText(this, "PhoneUtils.isPhone():" + PhoneUtils.isPhone(), Toast.LENGTH_SHORT).show();
    }
}
