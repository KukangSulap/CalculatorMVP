package com.barney.calculatorwithmvp.base;

public interface BasePresenter<T extends BaseView> {
    void onAttach(T v);
    void onDettach();
}
