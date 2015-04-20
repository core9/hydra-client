package io.core9.hydra.client;

import net.minidev.json.JSONObject;

public interface ApiDocumentation {



	JSONObject toJson();

	JsonLdContext getContext();

	HydraEntryPoint getEntryPoint();

	void setEntryPoint(HydraEntryPoint entryPoint);

	String getTitle();

	void setTitle(String title);

	String getDescription();

	void setDescription(String description);

	SupportedClasses getSupportedClasses();

	void addSupportedClass(SupportedClasses supportedClass);

	StatusCodes getStatusCodes();

	void addStatusCodes(StatusCodes statusCodes);

	String getId();

	void setId(String id);

	String getType();

	void setType(String type);

}
