package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyApp";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(getApplicationContext(), "Toast onCreate", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"Получено исключение метод onCreate");
        Log.d(TAG,"Отладка метод onCreate");
        Log.w(TAG,"Предупреждения метод onCreate");
        Log.i(TAG,"Информация метод onCreate");
        Log.v(TAG,"Подробности метод oonCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(getApplicationContext(), "Toast onStart", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"Получено исключение метод onStart");
        Log.d(TAG,"Отладка метод onStart");
        Log.w(TAG,"Предупреждения метод onStart");
        Log.i(TAG,"Информация метод onStart");
        Log.v(TAG,"Подробности метод onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(getApplicationContext(), "Toast onResume", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"Получено исключение метод onResume");
        Log.d(TAG,"Отладка метод onResume");
        Log.w(TAG,"Предупреждения метод onResume");
        Log.i(TAG,"Информация метод onResume");
        Log.v(TAG,"Подробности метод onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(getApplicationContext(), "Toast onPause", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"Получено исключение метод onPause");
        Log.d(TAG,"Отладка метод onPause");
        Log.w(TAG,"Предупреждения метод onPause");
        Log.i(TAG,"Информация метод onPause");
        Log.v(TAG,"Подробности метод onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(getApplicationContext(), "Toast onStop", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"Получено исключение метод onStop");
        Log.d(TAG,"Отладка метод onStop");
        Log.w(TAG,"Предупреждения метод onStop");
        Log.i(TAG,"Информация метод onStop");
        Log.v(TAG,"Подробности метод onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(getApplicationContext(), "Toast onDestroy", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"Получено исключение метод onDestroy");
        Log.d(TAG,"Отладка метод onDestroy");
        Log.w(TAG,"Предупреждения метод onDestroy");
        Log.i(TAG,"Информация метод onDestroy");
        Log.v(TAG,"Подробности метод onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(getApplicationContext(), "Toast onRestart", Toast.LENGTH_SHORT).show();
        Log.e(TAG,"Получено исключение метод onRestart");
        Log.d(TAG,"Отладка метод onRestart");
        Log.w(TAG,"Предупреждения метод onRestart");
        Log.i(TAG,"Информация метод onRestart");
        Log.v(TAG,"Подробности метод onRestart");
    }
}




