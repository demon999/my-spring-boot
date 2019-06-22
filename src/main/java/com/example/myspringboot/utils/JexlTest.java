package com.example.myspringboot.utils;

import org.apache.commons.jexl2.Expression;
import org.apache.commons.jexl2.JexlContext;
import org.apache.commons.jexl2.JexlEngine;
import org.apache.commons.jexl2.MapContext;

import java.util.Date;

public class JexlTest {

    public static void main(String[] args) {
        JexlEngine jexlEngine = new JexlEngine();
        String expressionStr = "if (a1 > a2) {return a1 - a2;} else { return a2 - a1}";
        Expression expression = jexlEngine.createExpression(expressionStr);
        JexlContext jexlContext = new MapContext();
        jexlContext.set("a1", "12");
        jexlContext.set("a2", "10");
        jexlContext.set("curDate", new Date());
        expression.evaluate(jexlContext);
    }

}
