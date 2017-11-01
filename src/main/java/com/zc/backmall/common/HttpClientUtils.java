package com.zc.backmall.common;

import org.apache.http.*;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * httpClientUtils工具类
 * Created by Administrator on 2017/4/25.
 */
public class HttpClientUtils {

    /**
     * 发送GET请求
     * @param url
     * @return
     */
    public static Map<String,Object> doGet(String url){
        Map<String,Object> result=new HashMap<>();
        result.put("status",500);
        CloseableHttpClient client= HttpClients.createDefault();
        HttpGet get=new HttpGet(url);
        try {
            HttpResponse response = client.execute(get);
            StatusLine statusLine = response.getStatusLine();
            int code = statusLine.getStatusCode();
            String content = EntityUtils.toString(response.getEntity());
            result.put("status",code);
            result.put("content",content);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }


    /**
     * 发送POST请求
     * @param url
     * @param map
     * @return
     */
    public static Map<String, Object> doPost(String url, Map<String, String> map){
        Map<String,Object> result=new HashMap();

        CloseableHttpClient httpclient = HttpClients.createDefault();
        List<NameValuePair> formparams = new ArrayList<>();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            //给参数赋值
            formparams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
        }
        UrlEncodedFormEntity entity = new UrlEncodedFormEntity(formparams, Consts.UTF_8);
        HttpPost httppost = new HttpPost(url);
        httppost.setEntity(entity);
        CloseableHttpResponse response = null;
        try {
            response = httpclient.execute(httppost);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HttpEntity responseEntity = response.getEntity();
        int statusCode = response.getStatusLine().getStatusCode();
        result.put("status",statusCode);
        try {
            String content = EntityUtils.toString(responseEntity);
            result.put("content",content);
        } catch (ParseException | IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
