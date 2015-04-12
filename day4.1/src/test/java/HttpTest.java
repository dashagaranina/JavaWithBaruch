import config.WebAppInitializer;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Test;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;

import java.io.IOException;

@ContextConfiguration(classes = {
        WebAppInitializer.class
})
//@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class HttpTest {
    CloseableHttpClient httpClient = HttpClients.createDefault();


    @Test
    public void test() throws IOException {
        HttpPost post = new HttpPost("http://localhost:8080/string");
        post.setEntity(new StringEntity("something"));
        CloseableHttpResponse response = httpClient.execute(post);
        HttpEntity entity = response.getEntity();
        System.out.println(entity);
    }
}