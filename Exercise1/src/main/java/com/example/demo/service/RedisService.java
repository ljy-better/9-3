package com.example.demo.service;

public interface RedisService {
    /*
    存储
     */
    void set(String key,String value);
    /*
    获取
     */
    String get(String key);
    /*
    设置超时时间
     */
    boolean expire(String key,long expire);
    /*
    删除
     */
    void remove(String key);
    /*
    自增
     */
    Long increment(String key,long delta);
}
