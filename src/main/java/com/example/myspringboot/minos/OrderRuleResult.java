package com.example.myspringboot.minos;

import lombok.Data;

/**
 *
 * @author Richard Xue
 * @version 1.0
 *
 * @date 2019-06-25 18:18
 */
@Data
public class OrderRuleResult {
    private String productNo;
    private String orderNo;
    private String ruleNo;
    private String feature;
    private String featureValue;
    private String formula;
    private String decisionCode;
    private int random;
}
