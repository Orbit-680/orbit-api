package com.csc680.orbit.model.pojo;

public class RoutineSettings 
{
    private Long id;
    private int stretchDuration;
    private int countDown;
    private Boolean completionSounds;
    private Boolean vibrationAlerts;
    private Boolean continuousMode;

    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public int getStretchDuration() {return stretchDuration;}
        
    public void setStretchDuration(int stretchDuration) 
        {this.stretchDuration = stretchDuration;}
        
    public int getCountDown() {return countDown;}
    public void setCountDown(int countDown) {this.countDown = countDown;}
    public Boolean getCompletionSounds() {return completionSounds;}
    
    public void setCompletionSounds(Boolean completionSounds) 
        {this.completionSounds = completionSounds;}
    
    public Boolean getVibrationAlerts(){return vibrationAlerts;}
    
    public void setVibrationAlerts(Boolean vibrationAlerts) 
        {this.vibrationAlerts = vibrationAlerts;}
    
    public Boolean getContinuousMode() {return continuousMode;}
    
    public void setContinuousMode(Boolean continuousMode) 
        {this.continuousMode = continuousMode;}
	
    @Override
    public String toString() 
    {
    	return "RoutineSettings [id=" + id + ", stretchDuration=" + 
                stretchDuration + ", countDown=" + countDown + 
                ", completionSounds=" + completionSounds + ", "
                + "vibrationAlerts=" + vibrationAlerts + ", continuousMode=" 
                + continuousMode + "]";
    }
}