package top.sidian123.crawler;

import java.io.*;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/**
 * @author sidian
 * @date 2019/5/29 22:13
 */
public class WebBookRefine {

    /**
     * 去掉小说章节前的名字
     * 如去掉“姐妹花的最强兵王 第1章 美女相约(1/2)”中的 “姐妹花的最强兵王”
     * @param origin 源文件名
     * @param dest 目的文件名
     */
    static public void refine(String origin,String dest,String prefix) throws IOException {
        filter(origin,dest,
                str ->
                        Pattern.matches(".*"+prefix+"\\s+第\\d+章.*",str)
                                ?str.replace(prefix,"").trim()+"\n"
                                :str+"\n"
        );
    }

    /**
     * 去掉一行
     * @param origin
     * @param dest
     * @param regex
     */
    static public void removeLine(String origin,String dest,String regex) throws IOException {
        filter(origin,dest,str -> Pattern.matches(regex,str)?"":str+"\n");
    }


    /**
     * 过滤处理文件
     * @param origin 源文件名
     * @param dest 目标文件名
     * @param handler 处理每一个行字符串的回调函数
     */
    static public void filter(String origin,String dest,ReadLineCallback handler) throws IOException {
        BufferedReader reader=new BufferedReader(new FileReader(origin, Charset.forName("utf-8")));
        BufferedWriter writer=new BufferedWriter(new FileWriter(dest,Charset.forName("utf-8")));

        String str=null;
        while((str=reader.readLine())!=null){
            str=handler.handle(str);
            writer.write(str);
        }
        reader.close();
        writer.close();
    }

    static public interface ReadLineCallback{
        /**
         * 处理每一行字符串的回调函数
         * @param str
         * @return
         */
        String handle(String str);
    }


}
