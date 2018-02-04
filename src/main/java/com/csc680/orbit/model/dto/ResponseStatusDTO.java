package com.csc680.orbit.model.dto;

import com.csc680.orbit.utils.Constants;

public class ResponseStatusDTO {
	private Boolean success;
	private String status;
	
	public ResponseStatusDTO(Boolean success){
		if(success){
			this.success = true;
			this.status = Constants.SUCCESS_STATUS;
		}else{
			this.success = false;
			this.status = Constants.FAIL_STATUS;
		}
	}
	public Boolean getSuccess() {
		return success;
	}
	public void setSuccess(Boolean success) {
		this.success = success;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
