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



		JSONObject apiDoc = apiDocumentation.toJson();


	}

}
