package com.common.utils;

import com.google.gson.GsonBuilder;
import com.google.gson.JsonSyntaxException;

import java.lang.reflect.Type;

/**
 * @author li.wei
 * @date 2019-07-22
 */
public class JsonUtil {

    public static String getJson(Object object) {
        String result = (new GsonBuilder()).setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create().toJson(object);
        return result;
    }

    public static  <T> T fromJson(String json, Class<T> classOfT) throws JsonSyntaxException {
        return new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create().fromJson(json,classOfT);
    }

    public static  <T> T fromJson(String json, Type fooType) throws JsonSyntaxException {
        return new GsonBuilder().setPrettyPrinting().setDateFormat("yyyy-MM-dd HH:mm:ss").create().fromJson(json,fooType);
    }

}
