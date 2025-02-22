package syc.learn.xss;
// 使用OWASP Java HTML Sanitizer清理HTML
import org.jsoup.safety.Safelist;
import org.owasp.html.HtmlPolicyBuilder;
import org.owasp.html.PolicyFactory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
/**
 * @author syc
 * @date 2024/8/20
 */
public class XssApp {

    public static void main(String[] args) {
        String unsafeHtml = "<script>alert('xss');哈哈哈哈哈</script>灌灌灌灌";
        PolicyFactory policy = new HtmlPolicyBuilder()
                .allowElements()
                .toFactory();
        String safeHtml = policy.sanitize(unsafeHtml);
        System.out.println(safeHtml);  // 输出: <p>Some safe content</p>


        Safelist safelist = Safelist.basic();
        String cleanedDoc = Jsoup.clean(unsafeHtml, safelist);
        System.out.println(cleanedDoc);  // 输出: This is some text.

    }
}
