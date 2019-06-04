package top.sidian123.crawler;

import java.io.IOException;

/**
 * @author sidian
 * @date 2019/5/29 16:49
 */
public class WebBookHelper {
    public static void 斗破苍穹() throws IOException, InterruptedException {
        WebBookCrawler crawler=new WebBookCrawler("https://www.biqukan.com/3_3037/1349252.html",
                "#wrapper > div.book.reader > div.content > h1",
                "#content",
                "#wrapper > div.book.reader > div.content > div.page_chapter > ul > li:nth-child(3) > a",
                "斗破苍穹.txt");
        crawler.crawl(0);
    }

    public static void 姐妹花的最强兵王() throws IOException, InterruptedException {
        WebBookCrawler crawler=new WebBookCrawler("https://www.81xzw.com/book/148528/0.html",
                "body > div.novel > h1",
                "#content",
                "body > div.novel > div:nth-child(5) > a:nth-child(3)",
                "姐妹花的最强兵王.txt");
        crawler.crawl(0);
    }

    public static void 厉害了我的原始人() throws IOException, InterruptedException {
        WebBookCrawler crawler=new WebBookCrawler(
                "https://www.11kt.cn/read/21134/31685023.html",
                "#amain > dl > dd:nth-child(2) > h1",
                "#contents",
                "#amain > dl > dd:nth-child(3) > h3 > a:nth-child(3)",
                "厉害了我的原始人.txt"
        );
        crawler.crawl(0);
    }
    public static void 红楼梦() throws IOException, InterruptedException {
        WebBookCrawler crawler=new WebBookCrawler(
                "http://www.purepen.com/hlm/003.htm",
                "body > p:nth-child(2) > font > b",
                "body > center > table > tbody > tr > td > pre > font",
                "body > p:nth-child(4) > a:nth-child(3)",
                "红楼梦.txt"
        );
        crawler.setAppend(true);
        crawler.crawl(0);
    }
    public static void 围城() throws IOException, InterruptedException {
        WebBookCrawler crawler=new WebBookCrawler(
                "http://www.eywedu.net/weicheng/000.htm",
                "body > table:nth-child(12) > tbody > tr > td.tt2 > center > font > b",
                "body > table:nth-child(12) > tbody > tr > td.tt2",
                "body > table:nth-child(12) > tbody > tr > td:nth-child(3) > strong > a:nth-child(1)",
                "围城.txt"
        );
        crawler.crawl(0);
    }
    public static void 逆徒别乱来() throws IOException, InterruptedException {
        WebBookCrawler crawler=new WebBookCrawler(
                "https://www.luocs.cn/36/36214/13783154.html",
                "#mains > div.book_content_text > h1",
                "#book_text",
                "#mains > div.book_content_text > div.book_content_text_next > a:nth-child(5)",
                "逆徒别乱来.txt"
        );
        crawler.crawl(0);
    }

    public static void 道士不好惹() throws IOException, InterruptedException {
        WebBookCrawler crawler=new WebBookCrawler(
                "https://www.77xs.co/book_91594/32190601.html",
                "#box_con > div.bookname > h1",
                "#content",
                "#box_con > div.bottem > a:nth-child(4)",
                "道士不好惹.txt"
        );
        crawler.crawl(0);
    }
}
