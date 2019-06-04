package top.sidian123;

import top.sidian123.crawler.WebBookHelper;
import top.sidian123.crawler.WebBookRefine;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException, InterruptedException {
        //WebBookHelper.姐妹花的最强兵王();
        //WebBookRefine.refine("姐妹花的最强兵王.txt","test.txt","姐妹花的最强兵王");
        WebBookRefine.removeLine("道士不好惹.txt","道士不好惹2.txt","^一秒记住.+精彩小说无弹窗免费阅读！$");
    }
}
