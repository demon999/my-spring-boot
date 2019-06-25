package com.example.myspringboot.utils;

import com.googlecode.aviator.AviatorEvaluator;
import com.googlecode.aviator.runtime.function.AbstractFunction;
import com.googlecode.aviator.runtime.function.FunctionUtils;
import com.googlecode.aviator.runtime.type.AviatorDouble;
import com.googlecode.aviator.runtime.type.AviatorObject;

import java.util.Map;

public class AviatorTest {

    public static void main(String[] args) {
        Double result = (Double) AviatorEvaluator.execute("1+2+3.1");
        System.out.println(result);

        System.out.println((Boolean) AviatorEvaluator.execute("1 + 3 >= 4"));

//        Map<String, Object> params = new HashMap<>();
//        params.put("a1", 1);
//        params.put("a2", 2);
//        String expressionStr = "if (a1 > a2) { return a1 - a2;} else { return a2 - a1;}";
//
//        Expression expression = AviatorEvaluator.compile(expressionStr);
//
//        AviatorEvaluator.addFunction(new AddFunction());
//
//        String execute = (String) expression.execute(params);
//        System.out.println(execute);
    }

    static class AddFunction extends AbstractFunction {

        @Override
        public AviatorObject call(Map<String, Object> env, AviatorObject arg1, AviatorObject arg2) {
            Number left = FunctionUtils.getNumberValue(arg1, env);
            Number right = FunctionUtils.getNumberValue(arg2, env);
            return new AviatorDouble(left.doubleValue() + right.doubleValue());
        }

        @Override
        public String getName() {
            return "add";
        }
    }


}
