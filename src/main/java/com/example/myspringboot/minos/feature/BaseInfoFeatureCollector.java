package com.example.myspringboot.minos.feature;

import com.example.myspringboot.minos.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author Richard Xue
 * @version 1.0
 * @description
 * @date 2019-06-25 18:37
 */
@Service
public class BaseInfoFeatureCollector implements FeatureCollector {
    private List<String> allFeatureList = new ArrayList<String>(1){{add("age");}};

    @Override
    public Map<String, Object> collect(Order order, List<String> chosenFeatures) {
        chosenFeatures.retainAll(allFeatureList);
        return null;
    }
}
