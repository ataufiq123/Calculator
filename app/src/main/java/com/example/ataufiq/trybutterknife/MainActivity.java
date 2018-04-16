package com.example.ataufiq.trybutterknife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainContract.View {


    @BindView(R.id.et_angka1) EditText mAngka1;
    @BindView(R.id.et_angka2) EditText mAngka2;

    @BindView(R.id.tv_hasil) TextView mHasil;


    MainPresenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        presenter= new MainPresenter(this,mAngka1,mAngka2);
    }

    @OnClick(R.id.btn_minus)
    public void minus(View view) {
        presenter.hitung("minus");
    }

    @OnClick(R.id.btn_plus)
    public void plus(View view) {
        presenter.hitung("plus");
    }

    @OnClick(R.id.btn_divide)
    public void divide(View view) {
        presenter.hitung("divide");
    }

    @OnClick(R.id.btn_multiple)
    public void multiple(View view) {
        presenter.hitung("multiple");
    }

    @Override
    public void setToastIsiForm() {
        Toast.makeText(this, "Isi Dulu Formnya", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setText(Double hasil) {
        mHasil.setText(""+hasil);
    }

}
