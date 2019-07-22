package com.repast.conf;

import jdk.nashorn.internal.objects.annotations.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author li.wei
 * @date 2019-07-22
 */
@Configuration
@ConfigurationProperties
public class DataSourceProperties {
    private String tigerUrl;
    private String tigerUserName;
    private String tigerPassWord;

    public String getTigerUrl() {
        return tigerUrl;
    }

    public void setTigerUrl(String tigerUrl) {
        this.tigerUrl = tigerUrl;
    }

    public String getTigerUserName() {
        return tigerUserName;
    }

    public void setTigerUserName(String tigerUserName) {
        this.tigerUserName = tigerUserName;
    }

    public String getTigerPassWord() {
        return tigerPassWord;
    }

    public void setTigerPassWord(String tigerPassWord) {
        this.tigerPassWord = tigerPassWord;
    }
}
