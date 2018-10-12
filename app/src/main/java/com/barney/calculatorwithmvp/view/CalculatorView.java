package com.barney.calculatorwithmvp.view;


import com.barney.calculatorwithmvp.base.BaseView;

public interface CalculatorView extends BaseView {
    void onError(String msg);
    void onSuccess( String msg);
}
