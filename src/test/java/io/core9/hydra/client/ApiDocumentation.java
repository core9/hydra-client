package io.core9.hydra.client;

import java.util.List;

import net.minidev.json.JSONObject;

public interface ApiDocumentation {



	JSONObject toJson();

	JsonLdContext getContext();

	HydraEntryPoint getEntryPoint();

	String getTitle();

	void setTitle(String title);

	String getDescription();

	void setDescription(String description);



	StatusCodes getStatusCodes();

	void addStatusCodes(StatusCodes statusCodes);

	String getId();

	void setId(String id);

	String getType();

	List<SupportedClass> getSupportedClasses();

	void addSupportedClass(SupportedClass supportedClass);


}
