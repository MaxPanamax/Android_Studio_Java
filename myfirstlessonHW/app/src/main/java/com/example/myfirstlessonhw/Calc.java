package com.example.myfirstlessonhw;

public class Calc {
    private int number1;
    private int number2;
    private String sign;

    public Calc(int number1, int number2, String sign) {
        this.number1 = number1;
        this.number2 = number2;
        this.sign = sign;
    }

    public int getResult() {
        int result = 0;
        switch (sign) {
            case "+":
                result = this.number1 + this.number2;
                break;
            case "-": {
                result = this.number1 - this.number2;
                break;
            }
            case "/": {
                result = this.number1 / this.number2;
                break;
            }
            default:
                result = this.number1 * this.number2;
                break;
        }
        return result;
    }
}
