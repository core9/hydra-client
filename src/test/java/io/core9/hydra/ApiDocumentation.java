package io.core9.hydra;

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

}
