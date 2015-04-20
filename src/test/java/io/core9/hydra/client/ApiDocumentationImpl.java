package io.core9.hydra.client;

import net.minidev.json.JSONObject;

public class ApiDocumentationImpl implements ApiDocumentation {

	private JsonLdContext context;
	private HydraEntryPoint entryPoint;

	private String title;
	private String description;

	private String id;
	private String type;

	private SupportedClasses supportedClass = new SupportedClassesImpl();

	private StatusCodes statusCodes = new StatusCodesImpl();

	public ApiDocumentationImpl() {

		context = new JsonLdContextImpl();
		context.addTerm(new JsonLdTermImpl("hydra", "http://www.w3.org/ns/hydra/core#"));

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
	public void setEntryPoint(HydraEntryPoint entryPoint) {
		this.entryPoint = entryPoint;
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
	public SupportedClasses getSupportedClasses() {
		return supportedClass;
	}

	@Override
	public void addSupportedClass(SupportedClasses supportedClass) {
		this.supportedClass.add(supportedClass);
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

	@Override
	public void setType(String type) {
		this.type = type;
	}
}
