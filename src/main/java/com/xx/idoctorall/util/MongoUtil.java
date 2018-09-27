package com.xx.idoctorall.util;

import com.mongodb.*;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.util.JSON;

public class MongoUtil {

    //1. 引入依赖
   /* <dependency>
        <groupId>org.mongodb</groupId>
        <artifactId>mongo-java-driver</artifactId>
        <version>3.5.0</version>
    </dependency>*/
    public static void main(String[] args) {
        //使用MongoClient连接到数据库,安全模式需要设置账号密码
        MongoClient mongo = new MongoClient("192.168.10.27", 27017);
        //获取数据库
        MongoDatabase database = mongo.getDatabase("test");
        //显示所有数据库
        MongoIterable<String> dbs = mongo.listDatabaseNames();
        for (String db : dbs) {
            System.out.println(db);
        }

       /* //获取集合
        MongoCollection<Document> coll = database.getCollection("test");
        //显示所有集合
        MongoIterable<String> collections = database.listCollectionNames();
        for (String c : collections) {
            System.out.println(c);
        }

        DB db = mongo.getDB("test");
        DBCollection table = db.getCollection("test2");

        // 保存
        BasicDBObject document = new BasicDBObject();
        document.put("name", "mkyong");
        document.put("age", 30);
        document.put("createdDate", new Date());
        table.insert(document);

        //更新
        BasicDBObject query = new BasicDBObject();
        query.put("name", "mkyong");

        BasicDBObject newDocument = new BasicDBObject();
        newDocument.put("name", "mkyong-updated");

        BasicDBObject updateObj = new BasicDBObject();
        updateObj.put("$set", newDocument);

        table.update(query, updateObj);

        //查询
       BasicDBObject searchQuery = new BasicDBObject();
        searchQuery.put("name", "mkyong-updated");

        DBCursor cursor = table.find(searchQuery);

        while (cursor.hasNext()) {
            System.out.println(cursor.next());
        }

        //删除
        BasicDBObject deleteQuery = new BasicDBObject();
        deleteQuery.put("name", "mkyong");

        table.remove(deleteQuery);*/


        // 构造一个Json字符串
        String json = " {'school_code':'111111','school_name':'汉东政法大学','teacher_idcard':'0000001','teacher_name':'高育良' }";
        MongoCollection<DBObject> collection = database.getCollection("kakfa", DBObject.class);
        DBObject bson = (DBObject) JSON.parse(json);
        collection.insertOne(bson);


    }



}
