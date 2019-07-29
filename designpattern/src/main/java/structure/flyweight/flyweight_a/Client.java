package structure.flyweight.flyweight_a;

public class Client {
    public static void main(String[] args) {
        User tom = new User("tom");
        User jerry = new User("jerry");
        WebSiteFactory webSiteFactory = new WebSiteFactory();
        WebSite news = webSiteFactory.getWebSite("新闻");
        news.use(tom);
        news.use(jerry);

        WebSite blog = webSiteFactory.getWebSite("博客");
        blog.use(jerry);
        User cart = new User("jerry");
        User smith = new User("jerry");
        blog.use(cart);
        blog.use(smith);
        System.out.println("网站种类:"+webSiteFactory.getWbSiteCount());
    }
}
