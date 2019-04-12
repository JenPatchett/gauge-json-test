import com.thoughtworks.gauge.Step;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;

import java.io.IOException;

import static constants.Env.APP_ENDPOINT;

public class GetUsers {

    HttpClient httpClient = HttpClientBuilder.create().build();

    private static final String URL = System.getenv(APP_ENDPOINT);

    @Step("Get all users")
    public void getAllUsers() {
        String url = URL + "/users/";

    }

    @Step("Returns response with status of <expectedStatus>")
    public void assertStatusCode(int expectedStatus) throws IOException {

        HttpGet getStatus = new HttpGet(URL + "/users");
        HttpResponse httpResponse = httpClient.execute(getStatus);
        int actualStatus = httpResponse.getStatusLine().getStatusCode();

        Assert.assertEquals(expectedStatus, actualStatus);
    }



}
