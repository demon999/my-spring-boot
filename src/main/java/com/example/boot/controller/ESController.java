package com.example.boot.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
//import org.apache.http.Header;
//import org.apache.http.HttpHost;
//import org.apache.http.RequestLine;
//import org.apache.http.client.config.RequestConfig;
//import org.apache.http.util.EntityUtils;
//import org.elasticsearch.action.bulk.BulkRequest;
//import org.elasticsearch.action.index.IndexRequest;
//import org.elasticsearch.action.search.SearchRequest;
//import org.elasticsearch.action.search.SearchResponse;
//import org.elasticsearch.client.*;
//import org.elasticsearch.index.query.QueryBuilders;
//import org.elasticsearch.index.query.RangeQueryBuilder;
//import org.elasticsearch.search.builder.SearchSourceBuilder;
//import org.elasticsearch.search.sort.ScoreSortBuilder;
//import org.elasticsearch.search.sort.SortOrder;
import org.joda.time.DateTime;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.*;

//@RestController
@RequestMapping("/es")
public class ESController {

//
//    @GetMapping(value = "/low/get")
//    public JSONObject query() {
////        RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200, "http")).build();
////        restClient.performRequest()
//
//        RestClientBuilder builder = RestClient.builder(new HttpHost("localhost", 9200, "http"));
//        builder.setMaxRetryTimeoutMillis(10000);
//        builder.setNodeSelector(NodeSelector.SKIP_DEDICATED_MASTERS);
//        builder.setFailureListener(new RestClient.FailureListener() {
//            @Override
//            public void onFailure(Node node) {
//            }
//        });
//        builder.setRequestConfigCallback(new RestClientBuilder.RequestConfigCallback() {
//            @Override
//            public RequestConfig.Builder customizeRequestConfig(RequestConfig.Builder requestConfigBuilder) {
//                return requestConfigBuilder.setSocketTimeout(10000);
//            }
//        });
////        builder.setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
////            @Override
////            public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
////                return httpClientBuilder.setProxy(new HttpHost("proxy", 9000, "http"));
////            }
////        });
//        RestClient restClient = builder.build();
//
//        Request request = new Request("GET","/megacorp/employee/_search");
//        try {
////            request.setJsonEntity("{\"json\":\"text\"}");
//
//
//            Response response = restClient.performRequest(request);
//            RequestLine requestLine = response.getRequestLine();
//            HttpHost host = response.getHost();
//            int statusCode = response.getStatusLine().getStatusCode();
//            Header[] headers = response.getHeaders();
//            String responseBody = EntityUtils.toString(response.getEntity());
//
////            response.getEntity().getContent();
//
//            System.out.println(responseBody);
//            return JSON.parseObject(responseBody);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try {
//            restClient.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return new JSONObject();
//    }
//
//
//
//    @GetMapping(value = "/high/index")
//    public JSONObject query2() {
////        RestClient restClient = RestClient.builder(new HttpHost("localhost", 9200, "http")).build();
////        restClient.performRequest()
//
//        RestClientBuilder builder = RestClient.builder(new HttpHost("localhost", 9200, "http"));
//        builder.setMaxRetryTimeoutMillis(10000);
//        builder.setNodeSelector(NodeSelector.SKIP_DEDICATED_MASTERS);
//        builder.setFailureListener(new RestClient.FailureListener() {
//            @Override
//            public void onFailure(Node node) {
//            }
//        });
//        builder.setRequestConfigCallback(new RestClientBuilder.RequestConfigCallback() {
//            @Override
//            public RequestConfig.Builder customizeRequestConfig(RequestConfig.Builder requestConfigBuilder) {
//                return requestConfigBuilder.setSocketTimeout(10000);
//            }
//        });
////        builder.setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
////            @Override
////            public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
////                return httpClientBuilder.setProxy(new HttpHost("proxy", 9000, "http"));
////            }
////        });
////        RestClient restClient = builder.build();
//
//        RestHighLevelClient restHighLevelClient = new RestHighLevelClient(builder);
//
//        BulkRequest bulkRequest = new BulkRequest();
//
//        Random random = new Random(100000);
//        for (int i = 0; i < 10; i++) {
//            JSONObject jsonObject = new JSONObject();
//            String id = UUID.randomUUID().toString().replaceAll("-", "");
//            jsonObject.put("name", "name-" + id);
//            jsonObject.put("random", random.nextLong());
//            jsonObject.put("createTime", new Date());
//            IndexRequest indexRequest = new IndexRequest("users", "contacts", id).source(jsonObject);
//            bulkRequest.add(indexRequest);
//        }
//
//        try {
//            restHighLevelClient.bulk(bulkRequest);
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                restHighLevelClient.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//
//        return new JSONObject();
//    }
//
//    @GetMapping(value = "/high/search")
//    public JSONObject query3() {
//        RestClientBuilder builder = RestClient.builder(new HttpHost("localhost", 9200, "http"));
//        builder.setMaxRetryTimeoutMillis(10000);
//        builder.setNodeSelector(NodeSelector.SKIP_DEDICATED_MASTERS);
//        builder.setFailureListener(new RestClient.FailureListener() {
//            @Override
//            public void onFailure(Node node) {
//            }
//        });
//        builder.setRequestConfigCallback(new RestClientBuilder.RequestConfigCallback() {
//            @Override
//            public RequestConfig.Builder customizeRequestConfig(RequestConfig.Builder requestConfigBuilder) {
//                return requestConfigBuilder.setSocketTimeout(10000);
//            }
//        });
////        builder.setHttpClientConfigCallback(new RestClientBuilder.HttpClientConfigCallback() {
////            @Override
////            public HttpAsyncClientBuilder customizeHttpClient(HttpAsyncClientBuilder httpClientBuilder) {
////                return httpClientBuilder.setProxy(new HttpHost("proxy", 9000,"http"));
////            }
////        });
////        RestClient restClient = builder.build();
//
//        RestHighLevelClient restHighLevelClient = new RestHighLevelClient(builder);
//
//        SearchRequest searchRequest = new SearchRequest("users").types("contacts");
//        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
////        searchSourceBuilder.query(QueryBuilders.matchAllQuery());
//        searchSourceBuilder.postFilter(QueryBuilders.matchPhraseQuery("name", "name-539f25d595484f09a2acd455cf93c708"));
//        searchSourceBuilder.from(0);
//        searchSourceBuilder.size(1000);
//        searchSourceBuilder.sort(new ScoreSortBuilder().order(SortOrder.DESC));
//
//
//        RangeQueryBuilder rangeQueryBuilder = new RangeQueryBuilder("createTime");
//        rangeQueryBuilder.lte(new Date());
//        rangeQueryBuilder.gte(new DateTime(2018, 11,17, 16,0).toDate());
//        searchSourceBuilder.query(rangeQueryBuilder);
//        searchRequest.source(searchSourceBuilder);
//
//        try {
//            SearchResponse searchResponse = restHighLevelClient.search(searchRequest);
//            JSONObject result = new JSONObject();
//            result.put("result", searchResponse.toString());
//            return result;
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            try {
//                restHighLevelClient.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//        return new JSONObject();
//    }

    @GetMapping("/ana/sss")
    public JSONObject ana() {
        return new JSONObject();
    }

    public static void main(String[] args) {
        Map<String, String[]> aa = new HashMap<>();
        aa.put("1-", new String[]{"1", "2", "3", "5"});
        aa.put("2-", new String[]{"1", "2", "4", "6"});
        aa.put("3-", new String[]{ "3", "5", "8"});
        aa.put("4-", new String[]{"1", "7", "5"});
        aa.put("5-", new String[]{"1", "6", "7", "9"});
        aa.put("6-", new String[]{"1", "2", "9"});

        Map<String, Integer> bb = new HashMap<>();
        aa.forEach((k, v) -> {
            Arrays.stream(v).forEach(vv -> {
                if (bb.containsKey(vv)) {
                    bb.put(vv, bb.get(vv) + 1);
                } else {
                    bb.put(vv, 1);
                }
            });
        });
        System.out.println(JSON.toJSONString(bb));

    }

}
