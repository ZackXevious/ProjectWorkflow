package resources;

import java.io.Serializable;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Date;

public class WorkProject implements Serializable{
	
	//Variables
	private ArrayList<BuildVersion> buildVersions;
	private String name;
	private String description;
	private Date finishDate;
	private Date startDate;
	
	//Constructors
	public WorkProject(){
		this.setName("default");
		this.setDescription("This is a default project");
		this.setFinish(Date.from(Instant.now()));
		this.setStartDate(Date.from(Instant.now()));
		this.setBuildVersions(new ArrayList<BuildVersion>());
	}
	public WorkProject(String sName, String sDescription, Date dStart){
		this.setName("default");
		this.setDescription("This is a default project");
		this.setFinish(Date.from(Instant.now()));
		this.setStartDate(Date.from(Instant.now()));
		this.setBuildVersions(new ArrayList<BuildVersion>());
	}
	public WorkProject(String sName, String sDescription, 
			Date dStart, Date dFinish, 
			ArrayList<BuildVersion> prevBuilds){
		this.setName(sName);
		this.setDescription(sDescription);
		this.setFinish(dFinish);
		this.setStartDate(dStart);
		this.setBuildVersions(prevBuilds);
	}
	//Class-Specific functions-----------------------------------------------------
	public void addBuildVersion(BuildVersion bV){
		this.buildVersions.add(bV);
		
	}
	public void removeBuildVersion(){
		
	}
	public ArrayList<BuildVersion> getBuilds(){
		ArrayList<BuildVersion> results = new ArrayList<BuildVersion>();
		return results;
	}
	
	//Setters-----------------------------------------------------------------------
	public void setBuildVersions(ArrayList<BuildVersion> aBuildVersions){
		 this.buildVersions=aBuildVersions;
	 }
	public void setName(String sName){
		this.name=sName;
	}
	public void setDescription(String sDescription){
		this.description=sDescription;
	}
	public void setFinish(Date dFinishDate){
		this.finishDate=dFinishDate;
	}
	public void setStartDate(Date dStartDate){
		this.startDate=dStartDate;
	}
	
	//Getters-------------------------------------------------------------------------
	public ArrayList<BuildVersion> getBuildVersions(){
		return this.buildVersions;
	}
	public String getName(){
		return this.name;
	}
	public String getDescription(){
		return this.description;
	}
	public Date getFinish(){
		return this.finishDate;
	}
	public Date getStart(){
		return this.startDate;
	}
}
