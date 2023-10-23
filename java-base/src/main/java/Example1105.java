import org.apache.hc.client5.http.impl.classic.CloseableHttpClient;
import org.apache.hc.client5.http.impl.classic.HttpClients;
import org.apache.hc.core5.http.ClassicHttpRequest;
import org.apache.hc.core5.http.HttpEntity;
import org.apache.hc.core5.http.io.entity.EntityUtils;
import org.apache.hc.core5.http.io.support.ClassicRequestBuilder;

import java.io.IOException;

/**
 * Apache HttpComponents Client 用法、实例
 */
public class Example1105 {

    public static void main(String[] args) throws IOException {
        CloseableHttpClient client = HttpClients.createDefault();
        ClassicHttpRequest request = ClassicRequestBuilder.get("https://httpbin.org/get")
                .build();
        client.execute(request, response -> {
            System.out.println(response.getCode() + " " + response.getReasonPhrase());
            final HttpEntity entity1 = response.getEntity();
            // do something useful with the response body
            // and ensure it is fully consumed
            EntityUtils.consume(entity1);
            return null;
        });
    }
}
