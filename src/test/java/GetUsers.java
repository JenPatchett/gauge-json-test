import com.fasterxml.jackson.databind.JsonNode;
import com.thoughtworks.gauge.Gauge;
import com.thoughtworks.gauge.Step;
import com.thoughtworks.gauge.datastore.DataStore;
import com.thoughtworks.gauge.datastore.DataStoreFactory;
import io.grpc.netty.shaded.io.netty.handler.codec.http.HttpMethod;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.junit.Assert;

import static constants.Env.APP_ENDPOINT;
import static org.junit.Assert.*;

public class GetUsers {

    private DataStore dataStore = DataStoreFactory.getScenarioDataStore();
    protected HttpRequest httpRequest

    public void simpleGetRequest(DataStore dataStore) {
        if (!httpRequest.equals(HttpMethod.GET)) {
            throw new RuntimeException("Method does not match requested GET");
        }
        bodylessRequest(dataStore, null);
    }

    @Step("Get all users")
    public void getAllUsers() {
        String url = System.getenv(APP_ENDPOINT) + "/users/";
        createRangoRequest(url).simpleGetRequest(dataStore);
    }

    @Step("Get user by Id")
    public void getUserById() {

    }

    @Step("Get user by firstName")
    public void getUserByFirstName() {

    }

    @Step("Returns response with status of <statusCode>")
    public void assertResponseCode(int statusCode) {
        String url = "http://localhost:3000/" + "users";
        Integer httpResponseCode = (Integer) dataStore.get("httpResponseCode");

        assertEquals(statusCode, httpResponseCode);

    }



}
