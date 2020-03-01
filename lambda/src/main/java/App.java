package main.java;

import java.util.function.Consumer;
import java.util.function.Function;

public class App {
    public static void main(String[] args) {

        //普通定义
        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer i) {
                return i * i;
            }
        };
        System.out.println(function.apply(6));

        //Lambda表达式调用
        Function<Integer, Integer> lambdaFunction = i -> i * i;
        System.out.println(lambdaFunction.apply(7));


        //自定义接口
        returnSquare rS = new returnSquare() {
            @Override
            public Integer square(int i) {
                return i * i;
            }
        };
        System.out.println(rS.square(8));

        //Lambda表达式调用
        returnSquare rSLambda = (i) -> {
            return i * i;
        };
        System.out.println(rSLambda.square(9));

        //普通方式
        Consumer<String> con = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("*" + s + "*");
            }
        };
        con.accept("888");

        //Lambda方式
        Consumer<String> lambdaCon = s -> System.out.println("*" + s + "*");
        lambdaCon.accept("999");

        //自定义方式调用
        addAndPrint aP = new addAndPrint() {
            @Override
            public void add(String s) {
                System.out.println("*" + s + "*");
            }
        };
        aP.add("777");

        //Lambda调用
        addAndPrint aPLambda = (s) -> {
            System.out.println("*" + s + "*");
        };
        aPLambda.add("666");
    }

}
