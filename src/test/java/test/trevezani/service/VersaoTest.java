package test.trevezani.service;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.IOException;

import javax.ws.rs.core.MediaType;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.junit.Assert;
import org.junit.experimental.categories.Category;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import test.trevezani.IntegrationTest;

@Category(IntegrationTest.class)
class VersaoTest {
	private final static String BASE = "http://localhost:8080/maven-test-docker/api/";
	
	@BeforeEach
	void setUp(TestInfo testInfo) throws Exception {
		System.out.println("*** " + testInfo.getDisplayName() + " ***");
	}
	
	@AfterEach
	void setDown() {
		System.out.println("");
	}
	
	@Test
	@DisplayName("Buscar Versão")
	void test() {
		String uri = BASE.concat("versao");

		System.out.println("[request] " + uri);
		
		String response = null;
		
		try (CloseableHttpClient httpClient = HttpClients.createDefault()) {
			HttpGet httpGet = new HttpGet(uri);
			httpGet.setHeader("accept", MediaType.APPLICATION_JSON);
			
			try (CloseableHttpResponse httpResponse = httpClient.execute(httpGet)) {
				response = EntityUtils.toString(httpResponse.getEntity());
			}
		} catch (IOException e) {
			fail(e.getMessage(), e);
		}
		
		Assert.assertNotNull(response);
		Assert.assertTrue(!response.isEmpty());

		System.out.println("[response] " + response);
		
		Assert.assertEquals(response, "v1.00", response);
	}
}
