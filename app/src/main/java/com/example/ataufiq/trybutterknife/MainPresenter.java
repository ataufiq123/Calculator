package com.example.ataufiq.trybutterknife;

import android.widget.EditText;

public class MainPresenter implements MainContract.Presenter {

    MainContract.View view;
    EditText mAngka1,mAngka2;
    Double angka1,angka2;
    Double hasil;

    public MainPresenter(MainContract.View view, EditText a,EditText b) {
        this.view = view;
        mAngka1=a;
        mAngka2= b;
    }


    @Override
    public void hitung(String operator) {
        if (validateForm()){
            getAngka();
            switch(operator){
                case "plus" :
                    hasil = angka1 +angka2;
                    break;
                case "minus" :
                    hasil = angka1 - angka2;
                    break;
                case "multiple" :
                    hasil = angka1 * angka2;
                    break;
                case "divide" :
                    hasil = angka1 / angka2;
                    break;
                default:
                    break;
            }
            view.setText(hasil);
        }

    }

    @Override
    public boolean validateForm() {
        boolean validateForm;
        if (mAngka1.getText().toString().isEmpty()|| mAngka2.getText().toString().isEmpty()){
            validateForm=false;
            view.setToastIsiForm();
        }else {
            validateForm=true;
        }
        return validateForm;
    }

    @Override
    public void getAngka() {
        angka1= Double.valueOf(mAngka1.getText().toString());
        angka2= Double.valueOf(mAngka2.getText().toString());
    }


}
