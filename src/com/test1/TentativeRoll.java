package com.test1;

public class TentativeRoll {
	private Integer tentativeRollIndicator;
	private String targetProjectName;
	private String targetProjectType;
	private String targetProjectOwner;
	private String techContact;
	private String targetProjectPO;
	private long deploymentIndicator;
	private String targetProjectBA;
	private String creationDate;
	private String modifiedDate;
	private String entityState;

	public TentativeRoll() {

	}

	public TentativeRoll(Integer tentativeRollIndicator, String targetProjectName, String targetProjectType,
			String targetProjectOwner, String techContact, String targetProjectPO, long deploymentIndicator,
			String targetProjectBA, String creationDate, String modifiedDate, String entityState) {
		super();
		this.tentativeRollIndicator = tentativeRollIndicator;
		this.targetProjectName = targetProjectName;
		this.targetProjectType = targetProjectType;
		this.targetProjectOwner = targetProjectOwner;
		this.techContact = techContact;
		this.targetProjectPO = targetProjectPO;
		this.deploymentIndicator = deploymentIndicator;
		this.targetProjectBA = targetProjectBA;
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

	public String getTargetProjectName() {
		return targetProjectName;
	}

	public void setTargetProjectName(String targetProjectName) {
		this.targetProjectName = targetProjectName;
	}

	public String getTargetProjectType() {
		return targetProjectType;
	}

	public void setTargetProjectType(String targetProjectType) {
		this.targetProjectType = targetProjectType;
	}

	public String getTargetProjectOwner() {
		return targetProjectOwner;
	}

	public void setTargetProjectOwner(String targetProjectOwner) {
		this.targetProjectOwner = targetProjectOwner;
	}

	public String getTechContact() {
		return techContact;
	}

	public void setTechContact(String techContact) {
		this.techContact = techContact;
	}

	public String getTargetProjectPO() {
		return targetProjectPO;
	}

	public void setTargetProjectPO(String targetProjectPO) {
		this.targetProjectPO = targetProjectPO;
	}

	public long getDeploymentIndicator() {
		return deploymentIndicator;
	}

	public void setDeploymentIndicator(long deploymentIndicator) {
		this.deploymentIndicator = deploymentIndicator;
	}

	public String getTargetProjectBA() {
		return targetProjectBA;
	}

	public void setTargetProjectBA(String targetProjectBA) {
		this.targetProjectBA = targetProjectBA;
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
