package com.xx.idoctorall.util;

import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.util.JSON;
import org.bson.Document;

/**
 * MongoDB基本操作工具类
 */
public class MongoDBUtil {

   public static void save(String json){
       //使用MongoClient连接到数据库,安全模式需要设置账号密码
       MongoClient mongo = new MongoClient("192.168.10.27", 27017);
       //获取数据库
       MongoDatabase database = mongo.getDatabase("test");
       MongoCollection<DBObject> collection = database.getCollection("kakfa", DBObject.class);
       DBObject bson = (DBObject) JSON.parse(json);
       collection.insertOne(bson);
   }

    //使用MongoClient连接到数据库,安全模式需要设置账号密码
   public static MongoClient getClient(String host,int port){
       return new MongoClient(host,port);
   }

    //获取数据库
   public static MongoDatabase getDB(MongoClient mongoClient,String dbname){
       return mongoClient.getDatabase(dbname);
   }

    //获取集合
    public static MongoCollection<DBObject> getCollection(MongoDatabase db, String collection){
       return db.getCollection(collection,DBObject.class);
    }



    public static void main(String[] args) {
        String json = " {'school_code':'111111','school_name':'汉东政法大学','teacher_idcard':'0000001','teacher_name':'高育良' }";
        save(json);
    }
}
