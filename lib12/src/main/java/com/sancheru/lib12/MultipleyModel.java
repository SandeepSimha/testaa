package com.sancheru.lib12;

import static com.sancheru.additionlib.AdditionModel.addition;
import static com.sancheru.additionlib.AdditionModel.subtraction;
import static com.sancheru.twolib.SubtractModel.division;
import static com.sancheru.twolib.SubtractModel.multiplication;

public class MultipleyModel implements LibInterface {

    @Override
    public int add(int a, int b) {
        return addition(10, 10);
    }

    @Override
    public int sub(int a, int b) {
        return subtraction(10, 10);
    }

    @Override
    public int multiply(int a, int b) {
        return multiplication(10, 10);
    }

    @Override
    public int divide(int a, int b) {
        return division(10, 10);
    }
}
