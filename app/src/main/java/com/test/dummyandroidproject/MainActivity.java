package com.test.dummyandroidproject;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.test.dummyandroidlibary.Logger;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Logger.print();
  }
}
