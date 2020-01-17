package cn.itcast.jedis;

import org.junit.jupiter.api.Test;
import redis.clients.jedis.Jedis;

import java.util.List;

public class JedisTest {

    public static void test1(){
        Jedis jedis=new Jedis("localhost",6379);
        jedis.set("username","zhangsan");
        jedis.close();
    }
    public static void test4(){
        Jedis jedis=new Jedis();
        jedis.lpush("mylist","陈祎","a","zhoubapi");
        jedis.rpush("mylist","曾涛","b","c");
        List<String> mylist = jedis.lrange("mylist", 0, -1);
        System.out.println(mylist);
        String element = jedis.lpop("mylist");
        System.out.println(element);
        String element2 = jedis.rpop("mylist");
        System.out.println(element2);
    }



    public static void main(String[] args) {
//        test1();
        test4();
    }
}
