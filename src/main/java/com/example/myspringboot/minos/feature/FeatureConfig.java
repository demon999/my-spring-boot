package com.example.myspringboot.minos.feature;

import lombok.Data;

import java.util.List;

/**
 * @author Richard Xue
 * @version 1.0
 * @description
 * @date 2019-06-25 18:35
 */
@Data
public class FeatureConfig {
    private List<Feature> featureList;
    private String className;
    private FeatureCollector featureCollector;
}
