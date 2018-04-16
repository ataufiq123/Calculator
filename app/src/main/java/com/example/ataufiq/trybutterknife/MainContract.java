package com.example.ataufiq.trybutterknife;

public interface MainContract {

    interface View{
        void setToastIsiForm();
        void setText(Double hasil);
    }
    interface Presenter{

        boolean validateForm();
        void hitung(String operator);
        void getAngka();
    }
}
