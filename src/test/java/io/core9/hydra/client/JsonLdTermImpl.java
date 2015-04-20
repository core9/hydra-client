package io.core9.hydra.client;

public class JsonLdTermImpl implements JsonLdTerm {


	private JsonLdContext context;

	public JsonLdTermImpl(String term, String iri) {

	}
	public JsonLdTermImpl(String term, String id, String type) {
		// TODO Auto-generated constructor stub
	}
	@Override
	public JsonLdContext getContext() {
		return context;
	}
	@Override
	public void setContext(JsonLdContext context) {
		this.context = context;
	}





}
