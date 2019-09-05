// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1cd0905c-9f60-44f9-9f06-d4cefbc96a5b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTask extends com.buildingsmart.tech.ifc.IfcKernel.IfcProcess
{
	@JacksonXmlProperty(isAttribute=true, localName = "Status")
	@Description("Current status of the task.      <blockquote class=\"note\">NOTE&nbsp; Particular values for status are not        specified, these should be determined and agreed by local        usage. Examples of possible status values include 'Not Yet        Started', 'Started', 'Completed'.</blockquote>")
	@Guid("24dad4d8-59a7-4a3c-9f09-a69c43924da4")
	private String status;

	@JacksonXmlProperty(isAttribute=true, localName = "WorkMethod")
	@Description("The method of work used in carrying out a task.      <blockquote class=\"note\">NOTE&nbsp; This attribute should        not be used if the work method is specified for the        <em>IfcTaskType</em>   </blockquote>")
	@Guid("17ff6383-1e7f-4b76-9767-c81157032a92")
	private String workMethod;

	@JacksonXmlProperty(isAttribute=true, localName = "IsMilestone")
	@Description("Identifies whether a task is a milestone task (=TRUE) or not      (= FALSE).      <blockquote class=\"note\">NOTE&nbsp; In small project planning applications,        a milestone task may be understood to be a task having no        duration. As such, it represents a singular point in time.</blockquote>")
	@Required()
	@Guid("7b39e6b5-1058-483b-b41a-aa6262a8d52e")
	private Boolean isMilestone;

	@JacksonXmlProperty(isAttribute=true, localName = "Priority")
	@Description("A value that indicates the relative priority of the task (in      comparison to the priorities of other tasks).")
	@Guid("1bdb7742-02a5-4935-816c-f448d784924b")
	private int priority;

	@JacksonXmlProperty(isAttribute=false, localName = "TaskTime")
	@Description("Time related information for the task.      <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Attribute added</blockquote>")
	@Guid("c9eb8ec9-2781-4a95-bb1c-e76c1befbe06")
	private com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTaskTime taskTime;

	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Identifies the predefined types of a task from which       the type required may be set.      <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added</blockquote>")
	@Guid("02327d6b-da53-4a13-b62d-f958e4f6badf")
	private com.buildingsmart.tech.ifc.IfcProcessExtension.IfcTaskTypeEnum predefinedType;


	public IfcTask()
	{
	}

	public IfcTask(String globalId, Boolean isMilestone)
	{
		super(globalId);
		this.isMilestone = isMilestone;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getWorkMethod() {
		return this.workMethod;
	}

	public void setWorkMethod(String workMethod) {
		this.workMethod = workMethod;
	}

	public Boolean getIsMilestone() {
		return this.isMilestone;
	}

	public void setIsMilestone(Boolean isMilestone) {
		this.isMilestone = isMilestone;
	}

	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

	public com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTaskTime getTaskTime() {
		return this.taskTime;
	}

	public void setTaskTime(com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTaskTime taskTime) {
		this.taskTime = taskTime;
	}

	public com.buildingsmart.tech.ifc.IfcProcessExtension.IfcTaskTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcProcessExtension.IfcTaskTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

