package io.core9.hydra.client;

import java.util.ArrayList;
import java.util.List;

import net.minidev.json.JSONObject;

public class ApiDocumentationImpl implements ApiDocumentation {

	private JsonLdContext context = new JsonLdContextImpl();
	private HydraEntryPoint entryPoint;

	private String title;
	private String description;

	private String id;
	private String type = "ApiDocumentation";

	private List<SupportedClass> supportedClasses = new ArrayList<>();

	private StatusCodes statusCodes = new StatusCodesImpl();

	public ApiDocumentationImpl() {

		context.addTerm(new JsonLdTermImpl("hydra", "http://www.w3.org/ns/hydra/core#"));
		context.addTerm(new JsonLdTermImpl("supportedClass", "hydra:supportedClass"));
		context.addTerm(new JsonLdTermImpl("readonly", "hydra:readonly"));
		context.addTerm(new JsonLdTermImpl("writeonly", "hydra:writeonly"));
		context.addTerm(new JsonLdTermImpl("supportedClass", "hydra:supportedClass"));
		context.addTerm(new JsonLdTermImpl("supportedProperty", "hydra:supportedProperty"));
		context.addTerm(new JsonLdTermImpl("supportedOperation", "hydra:supportedOperation"));
		context.addTerm(new JsonLdTermImpl("method", "hydra:method"));
		context.addTerm(new JsonLdTermImpl("statusCodes", "hydra:statusCodes"));
		context.addTerm(new JsonLdTermImpl("code", "hydra:statusCode"));
		context.addTerm(new JsonLdTermImpl("rdf", "http://www.w3.org/1999/02/22-rdf-syntax-ns#"));
		context.addTerm(new JsonLdTermImpl("rdfs", "http://www.w3.org/2000/01/rdf-schema#"));
		context.addTerm(new JsonLdTermImpl("label", "rdfs:label"));
		context.addTerm(new JsonLdTermImpl("description", "rdfs:comment"));
		context.addTerm(new  JsonLdTermImpl("property", "hydra:property", "@id"));
		context.addTerm(new  JsonLdTermImpl("expects", "hydra:expects", "@id"));
		context.addTerm(new  JsonLdTermImpl("returns", "hydra:returns", "@id"));
		context.addTerm(new  JsonLdTermImpl("domain", "rdfs:domain", "@id"));
		context.addTerm(new  JsonLdTermImpl("range", "rdfs:range", "@id"));
		context.addTerm(new  JsonLdTermImpl("subClassOf", "rdfs:subClassOf", "@id"));


		/**
		 *
		 * @id: "http://www.w3.org/ns/hydra/core#Resource",
			@type: "hydra:Class",
			hydra:title: "Resource",
			hydra:description: null,
			supportedOperation: [ ],
			supportedProperty: [ ]
		 *
		 */

		SupportedClass resource = new SupportedClassImpl("http://www.w3.org/ns/hydra/core#Resource", "hydra:Class");
		//resource.addTerm(new JsonLdTermImpl(term, iri));
		supportedClasses.add(resource);

	}

	@Override
	public JSONObject toJson() {
		return null;
	}

	@Override
	public JsonLdContext getContext() {
		return context;
	}

	@Override
	public HydraEntryPoint getEntryPoint() {
		return entryPoint;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getDescription() {
		return description;
	}

	@Override
	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public List<SupportedClass> getSupportedClasses() {
		return supportedClasses;
	}

	@Override
	public void addSupportedClass(SupportedClass supportedClass) {
		this.supportedClasses.add(supportedClass);
	}

	@Override
	public StatusCodes getStatusCodes() {
		return statusCodes;
	}

	@Override
	public void addStatusCodes(StatusCodes statusCodes) {
		this.statusCodes.add(statusCodes);
	}

	@Override
	public String getId() {
		return id;
	}

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getType() {
		return type;
	}

}
