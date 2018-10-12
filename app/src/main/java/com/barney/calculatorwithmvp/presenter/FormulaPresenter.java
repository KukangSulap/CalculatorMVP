package com.barney.calculatorwithmvp.presenter;

import android.support.design.widget.TextInputEditText;
import android.widget.EditText;

import com.barney.calculatorwithmvp.base.BasePresenter;
import com.barney.calculatorwithmvp.base.BaseView;
import com.barney.calculatorwithmvp.view.CalculatorView;

public class FormulaPresenter implements BasePresenter<CalculatorView> {

    private CalculatorView mainView;
    private double jumlah;


    public void tambah(TextInputEditText bil1, TextInputEditText bil2){
        String bila1 = bil1.getText().toString();
        String bila2 = bil2.getText().toString();
        if (!bil2.equals("")){
            jumlah = Double.parseDouble(bila1) + Double.parseDouble(bila2);
            mainView.onSuccess("Hasil: " + jumlah);
        } else {
            mainView.onError("Bilangan 2 Harus Diisi");
        }
    }

    public void minus(TextInputEditText bil1, TextInputEditText bil2){
        String bila1 = bil1.getText().toString();
        String bila2 = bil2.getText().toString();
        if (!bil2.equals("")){
            jumlah = Double.parseDouble(bila1) - Double.parseDouble(bila2);
            mainView.onSuccess("Hasil: " + jumlah);
        } else {
            mainView.onError("Bilangan 2 Harus Diisi");
        }
    }

    public void times(TextInputEditText bil1, TextInputEditText bil2){
        String bila1 = bil1.getText().toString();
        String bila2 = bil2.getText().toString();
        if (!bil2.equals("")){
            jumlah = Double.parseDouble(bila1) * Double.parseDouble(bila2);
            mainView.onSuccess("Hasil: " + jumlah);
        } else {
            mainView.onError("Bilangan 2 Harus Diisi");
        }
    }

    public void divided(TextInputEditText bil1, TextInputEditText bil2){
        String bila1 = bil1.getText().toString();
        String bila2 = bil2.getText().toString();
        if (!bil2.equals("")){
            jumlah = Double.parseDouble(bila1) / Double.parseDouble(bila2);
            mainView.onSuccess("Hasil: " + jumlah);
        } else {
            mainView.onError("Bilangan 2 Harus Diisi");
        }
    }

    @Override
    public void onAttach(CalculatorView v) {

    }

    @Override
    public void onDettach() {

    }
}
