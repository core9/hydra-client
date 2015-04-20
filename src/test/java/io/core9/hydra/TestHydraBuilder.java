package io.core9.hydra;

import io.core9.hydra.client.ApiDocumentation;
import io.core9.hydra.client.ApiDocumentationImpl;
import net.minidev.json.JSONObject;

import org.junit.Test;

public class TestHydraBuilder {

	@SuppressWarnings("unused")
	@Test
	public void createEntrypoint() {


		ApiDocumentation apiDocumentation = new ApiDocumentationImpl();

		apiDocumentation.setTitle("Subscription Api");
		apiDocumentation.setDescription("Api to manage subscriptions");

		apiDocumentation.setId("http://localhost/test/vocab");


		JSONObject apiDoc = apiDocumentation.toJson();


	}

}
