package main.clients;

import java.util.HashMap;
import java.util.Map;

public class Example {
    public static void main(String[] args) {
    Mathematics m = Double::sum;
    Mathematics x = Double::sum;
        System.out.println(x.add(2, 5));
    }
}
interface Mathematics {
    double add(double a, double b);
}
class Calculator{
    static Map<Character, Calculable> map = new HashMap<>();
    static {
        map.put('+', arr -> arr[0] + arr[1]);
        map.put('-', arr -> arr[0] - arr[1]);
        map.put('*', arr -> arr[0] * arr[1]);
        map.put('r', arr -> Math.sqrt(arr[0]));
    }
    public static void main(String[] args) {
        System.out.println(calculate1('r', 9, 4));
    }
    public static double calculate(char op, double x, double y){
        if (op =='+') return x + y;
        if (op == '-') return x - y;
        if (op == '*') return x * y;
        else throw new UnsupportedOperationException("No value");
        }
    public static double calculate1(char op, double x, double y){
        return map.get(op).calc(x, y);
    }
}
interface Calculable {
    double calc(double ... arr);
}