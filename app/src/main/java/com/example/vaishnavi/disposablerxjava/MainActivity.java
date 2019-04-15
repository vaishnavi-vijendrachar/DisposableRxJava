package com.example.vaishnavi.disposablerxjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Observable;

import io.reactivex.disposables.CompositeDisposable;

public class MainActivity extends AppCompatActivity {

    Button btn;
    TextView textView;
    CompositeDisposable disposable  = new CompositeDisposable();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.btn);
        textView = findViewById(R.id.textView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                doSomeWork();
            }
        });
    }

    private void doSomeWork() {
        disposable.add(sampleObservable())
    }

    static Observable<String> sampleObservable(){
        return Observable.defer()
}
}
