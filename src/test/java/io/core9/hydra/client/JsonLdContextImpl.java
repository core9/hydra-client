package io.core9.hydra.client;

import java.util.Map;

public class JsonLdContextImpl implements JsonLdContext {

	private Map<String, JsonLdTerm> context;
	private String iri;

	public JsonLdContextImpl(JsonLdTerm term) {
		this.context.put(term.getName(), term);
	}



	public JsonLdContextImpl(String string, String string2) {
		// TODO Auto-generated constructor stub
	}



	@Override
	public void addTerm(JsonLdTerm jsonLdTerm) {
		// TODO Auto-generated method stub

	}



	@Override
	public String getKey() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setKey(String key) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setId(String id) {
		// TODO Auto-generated method stub

	}

	@Override
	public String getType() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setType(String type) {
		// TODO Auto-generated method stub

	}

}
