package io.core9.hydra;

import io.core9.hydra.client.ApiDocumentation;
import io.core9.hydra.client.ApiDocumentationImpl;
import io.core9.hydra.client.HydraEntryPoint;
import io.core9.hydra.client.HydraEntryPointImpl;
import io.core9.hydra.client.JsonLdContext;
import io.core9.hydra.client.JsonLdContextImpl;
import io.core9.hydra.client.SupportedClassImpl;
import net.minidev.json.JSONObject;

import org.junit.Test;

public class TestHydraBuilder {

	@SuppressWarnings("unused")
	@Test
	public void createEntrypoint() {


		ApiDocumentation apiDocumentation = new ApiDocumentationImpl();
		HydraEntryPoint entryPoint = new HydraEntryPointImpl();
		JsonLdContext context = new JsonLdContextImpl();



		entryPoint.addContext(context);
		entryPoint.addSupportedClass(new SupportedClassImpl());

		JSONObject entryPointJson = entryPoint.toJson();


		apiDocumentation.setEntryPoint(entryPoint);


		JSONObject apiDoc = apiDocumentation.toJson();


	}

}
