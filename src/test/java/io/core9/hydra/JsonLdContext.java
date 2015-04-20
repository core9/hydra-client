package io.core9.hydra;

public interface JsonLdContext {


	String getKey();

	void setKey(String key);

	String getId();

	void setId(String id);

	String getType();

	void setType(String type);

	void addTerm(JsonLdTerm jsonLdTerm);


}
