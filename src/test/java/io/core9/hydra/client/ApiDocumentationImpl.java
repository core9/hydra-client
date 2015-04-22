package io.core9.hydra.client;

import java.util.ArrayList;
import java.util.List;

import net.minidev.json.JSONObject;



public class ApiDocumentationImpl implements ApiDocumentation {

	private JsonLdContext context = new JsonLdContextImpl("@context", "http://www.w3.org/ns/hydra/context.jsonld");
	private String id;
	private String type = "ApiDocumentation";

	private String title;
	private String description;

	private HydraEntryPoint entryPoint;

	private List<SupportedClass> supportedClasses = new ArrayList<>();

	private StatusCodes statusCodes = new StatusCodesImpl();

	public ApiDocumentationImpl() {

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
