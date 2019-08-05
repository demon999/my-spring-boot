package com.example.myspringboot.minos;

import com.example.myspringboot.minos.feature.FeatureCollector;
import com.example.myspringboot.minos.feature.FeatureConfig;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Richard Xue
 * @version 1.0
 * @description
 * @date 2019-06-25 19:09
 */
@Service
public class OrderProcessor implements ApplicationContextAware {
    private ApplicationContext applicationContext;
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void process(Order order) {
        List<String> featureList = new ProductModel().getModelList().stream().flatMap(model -> model.getFeatureList().stream()).distinct().collect(Collectors.toList());
        FeatureCollector featureCollector = (FeatureCollector) applicationContext.getBean(new FeatureConfig().getClassName());
        featureCollector.collect(order, featureList);
    }

}
