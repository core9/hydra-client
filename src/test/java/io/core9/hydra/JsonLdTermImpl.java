package io.core9.hydra;

public class JsonLdTermImpl implements JsonLdTerm {


	private JsonLdContext context;

	public JsonLdTermImpl(String term, String iri) {

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
