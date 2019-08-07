package designpattern.策略模式;

import java.util.function.IntBinaryOperator;

/**
 * 策略枚举
 * */
public enum Strategy1 {
    ADD("+"){
        @Override
        public int exec(int a, int b) {
            return a+b;
        }
    },
    SUB("-"){
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    };

    private final String symbol;


    private Strategy1(String symbol){
        this.symbol = symbol;
    }

    public abstract int exec(int a, int b);
}

enum Strategy2 {
    ADD("+", (a, b) -> a+b),
    SUB("-", (a, b) -> a-b);

    private final String symbol;
    private final IntBinaryOperator op;

     Strategy2(String symbol, IntBinaryOperator op){
        this.symbol = symbol;
        this.op = op;
    }

    public int exec(int a, int b){
         return op.applyAsInt(a, b);
    }

}