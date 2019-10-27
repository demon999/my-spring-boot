package com.example.boot.minos;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * @author Richard Xue
 * @version 1.0
 * @description
 * @date 2019-06-25 17:52
 */
@Data
public class Model {
    private String no;
    private String name;
    private Map<String, Rule> ruleMap;
    /** feature come from Rule, for this model ruleMap.size == featureList.size */
    private List<String> featureList;
}
