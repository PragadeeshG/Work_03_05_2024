package com.test1;

public class TentativeRollControlsDates {
	private Integer tentativeRollIndicator;
	private String azureStoryCreationDate;
	private Integer WorkItemNumber;
	private String azureStoryCompletionDate;
	private String sitStartDate;
	private String sitCompletionDate;
	private String uatStartDate;
	private String uatCompletionDate;
	private String stagingStartDate;
	private String stagingCompletionDate;
	private String tentativeRollDate;
	private String uvtDate;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public TentativeRollControlsDates() {

	}

	public TentativeRollControlsDates(Integer tentativeRollIndicator, String azureStoryCreationDate,
			Integer workItemNumber, String azureStoryCompletionDate, String sitStartDate, String sitCompletionDate,
			String uatStartDate, String uatCompletionDate, String stagingStartDate, String stagingCompletionDate,
			String tentativeRollDate, String uvtDate, String creationDate, String modifiedDate, String entityState) {
		super();
		this.tentativeRollIndicator = tentativeRollIndicator;
		this.azureStoryCreationDate = azureStoryCreationDate;
		WorkItemNumber = workItemNumber;
		this.azureStoryCompletionDate = azureStoryCompletionDate;
		this.sitStartDate = sitStartDate;
		this.sitCompletionDate = sitCompletionDate;
		this.uatStartDate = uatStartDate;
		this.uatCompletionDate = uatCompletionDate;
		this.stagingStartDate = stagingStartDate;
		this.stagingCompletionDate = stagingCompletionDate;
		this.tentativeRollDate = tentativeRollDate;
		this.uvtDate = uvtDate;
		this.creationDate = creationDate;
		this.modifiedDate = modifiedDate;
		this.entityState = entityState;
	}

	public Integer getTentativeRollIndicator() {
		return tentativeRollIndicator;
	}

	public void setTentativeRollIndicator(Integer tentativeRollIndicator) {
		this.tentativeRollIndicator = tentativeRollIndicator;
	}

	public String getAzureStoryCreationDate() {
		return azureStoryCreationDate;
	}

	public void setAzureStoryCreationDate(String azureStoryCreationDate) {
		this.azureStoryCreationDate = azureStoryCreationDate;
	}

	public Integer getWorkItemNumber() {
		return WorkItemNumber;
	}

	public void setWorkItemNumber(Integer workItemNumber) {
		WorkItemNumber = workItemNumber;
	}

	public String getAzureStoryCompletionDate() {
		return azureStoryCompletionDate;
	}

	public void setAzureStoryCompletionDate(String azureStoryCompletionDate) {
		this.azureStoryCompletionDate = azureStoryCompletionDate;
	}

	public String getSitStartDate() {
		return sitStartDate;
	}

	public void setSitStartDate(String sitStartDate) {
		this.sitStartDate = sitStartDate;
	}

	public String getSitCompletionDate() {
		return sitCompletionDate;
	}

	public void setSitCompletionDate(String sitCompletionDate) {
		this.sitCompletionDate = sitCompletionDate;
	}

	public String getUatStartDate() {
		return uatStartDate;
	}

	public void setUatStartDate(String uatStartDate) {
		this.uatStartDate = uatStartDate;
	}

	public String getUatCompletionDate() {
		return uatCompletionDate;
	}

	public void setUatCompletionDate(String uatCompletionDate) {
		this.uatCompletionDate = uatCompletionDate;
	}

	public String getStagingStartDate() {
		return stagingStartDate;
	}

	public void setStagingStartDate(String stagingStartDate) {
		this.stagingStartDate = stagingStartDate;
	}

	public String getStagingCompletionDate() {
		return stagingCompletionDate;
	}

	public void setStagingCompletionDate(String stagingCompletionDate) {
		this.stagingCompletionDate = stagingCompletionDate;
	}

	public String getTentativeRollDate() {
		return tentativeRollDate;
	}

	public void setTentativeRollDate(String tentativeRollDate) {
		this.tentativeRollDate = tentativeRollDate;
	}

	public String getUvtDate() {
		return uvtDate;
	}

	public void setUvtDate(String uvtDate) {
		this.uvtDate = uvtDate;
	}

	public String getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}

	public String getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getEntityState() {
		return entityState;
	}

	public void setEntityState(String entityState) {
		this.entityState = entityState;
	}

}
