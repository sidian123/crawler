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
        BufferedReader reader=new BufferedReader(new FileReader(origin, Charset.forName("utf-8")));
        BufferedWriter writer=new BufferedWriter(new FileWriter(dest,Charset.forName("utf-8")));

        String str=null;
        while((str=reader.readLine())!=null){
            if(Pattern.matches(".*"+prefix+"\\s+第\\d+章.*",str)){//是章节标题
                str=str.replace(prefix,"").trim();
                writer.write(str+"\n");
            }else{
                writer.write(str+"\n");
            }
        }
        reader.close();
        writer.close();
    }

}
