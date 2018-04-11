package com.csc680.orbit.model.dto;

import java.util.ArrayList;
import java.util.List;

public class SaveConductResultsDTO {
	private List<ConductResult> saveConductResults;
	
	public class ConductResult {
		private int conductId;
		private boolean saveSuccess;
		
		public ConductResult(int conductId, boolean saveSuccess)
		{
			this.conductId = conductId;
			this.saveSuccess = saveSuccess;
		}

		public int getConductId() {
			return conductId;
		}

		public void setConductId(int conductId) {
			this.conductId = conductId;
		}

		public boolean isSaveSuccess() {
			return saveSuccess;
		}

		public void setSaveSuccess(boolean saveSuccess) {
			this.saveSuccess = saveSuccess;
		}
	}
	
	public SaveConductResultsDTO()
	{
		this.saveConductResults = new ArrayList<ConductResult>();
	}
	
	public void addResult(int conductId, boolean saveSuccess)
	{
		this.saveConductResults.add(new ConductResult(conductId, saveSuccess));
	}

	public List<ConductResult> getSaveConductResults() {
		return saveConductResults;
	}

	public void setSaveConductResults(List<ConductResult> saveConductResults) {
		this.saveConductResults = saveConductResults;
	}
	
    
}
