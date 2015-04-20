package io.core9.hydra.client;

import net.minidev.json.JSONObject;

public interface HydraEntryPoint {

	void addSupportedClass(SupportedClass supportedClass);

	void addContext(JsonLdContext hydraContext);

	JSONObject toJson();

}
