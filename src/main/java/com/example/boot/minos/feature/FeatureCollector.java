package com.example.boot.minos.feature;

import com.example.boot.minos.Order;

import java.util.List;
import java.util.Map;

/**
 * @author Richard Xue
 * @version 1.0
 * @description
 * @date 2019-06-25 18:25
 */
public interface FeatureCollector {
    /**
     * collect
     * @param order
     * @param chosenFeatures
     * @return
     */
    Map<String, Object> collect(Order order, List<String> chosenFeatures);
}
