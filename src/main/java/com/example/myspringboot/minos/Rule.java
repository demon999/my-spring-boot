package com.example.myspringboot.minos;

import lombok.Data;

/**
 * @author Richard Xue
 * @version 1.0
 * @description
 * @date 2019-06-25 17:53
 */
@Data
public class Rule {
    private String no;
    private String name;
    private String feature;
    /** 规则表达式 */
    private String formula;
    private String desc;
    private String decisionCode;
    /** 准入、新户、老户、提额、降额 */
    private int category;
    private int type;
    /** 0失效 1提取不执行 3提取&执行  */
    private int status;
}
