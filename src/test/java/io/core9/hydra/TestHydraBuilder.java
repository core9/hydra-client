package io.core9.hydra;

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
