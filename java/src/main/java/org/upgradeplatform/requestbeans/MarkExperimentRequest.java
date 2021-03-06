package org.upgradeplatform.requestbeans;


public class MarkExperimentRequest {

	
	private String userId;
	private String experimentPoint;
	private String partitionId;
	
	public MarkExperimentRequest() {}

	public MarkExperimentRequest(String userId, String experimentPoint, String partitionId) {
		super();
		this.userId = userId;
		this.experimentPoint = experimentPoint;
		this.partitionId = partitionId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getExperimentPoint() {
		return experimentPoint;
	}

	public void setExperimentPoint(String experimentPoint) {
		this.experimentPoint = experimentPoint;
	}

	public String getPartitionId() {
		return partitionId;
	}

	public void setPartitionId(String partitionId) {
		this.partitionId = partitionId;
	}

}
