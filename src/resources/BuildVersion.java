package resources;

import java.io.Serializable;
import java.util.Date;

public class BuildVersion implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	Date buildDate;
	Double buildNumber;
	int issues;
	String notes;
	
	public BuildVersion(){
	}
	public BuildVersion(Double dBuildNumber, int iIssues, Date dBuildDate){
		this.setBuildNumber(dBuildNumber);
		this.setIssues(iIssues);
		this.setBuildDate(dBuildDate);
	}
	
	//setters------------------------------------------------------------------
	public void setBuildDate(Date dBuildDate){
		this.buildDate=dBuildDate;		
	}
	public void setBuildNumber(Double dBuildNumber){
		this.buildNumber=dBuildNumber;
	}
	public void setIssues(int iIssues){
		this.issues=iIssues;
	}
	public void setNotes(String sNotes){
		this.notes=sNotes;
	}
	
	
	//getters-----------------------------------------------------------------------
	public Date getBuildDate() {
		return this.buildDate;
	}
	public Double getBuildNumber() {
		return this.buildNumber;
	}
	public int getIssues() {
		return this.issues;
	}
	public String getNotes() {
		return this.notes;
	}
}
