package com.barney.calculatorwithmvp.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.barney.calculatorwithmvp.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.bil1)
    EditText bil1;
    @BindView(R.id.bil2)
    EditText bil2;
    @BindView(R.id.tambah)
    Button tambah;
    @BindView(R.id.kurang)
    Button kurang;
    @BindView(R.id.kali)
    Button kali;
    @BindView(R.id.bagi)
    Button bagi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.tambah, R.id.kurang, R.id.kali, R.id.bagi})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.tambah:
                break;
            case R.id.kurang:
                break;
            case R.id.kali:
                break;
            case R.id.bagi:
                break;
        }
    }
}
