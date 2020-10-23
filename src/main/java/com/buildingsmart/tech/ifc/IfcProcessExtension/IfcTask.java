// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProcessExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcDateTimeResource.IfcTaskTime;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("1cd0905c-9f60-44f9-9f06-d4cefbc96a5b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTask extends com.buildingsmart.tech.ifc.IfcKernel.IfcProcess
{
	@Description("Current status of the task.      <blockquote class=\"note\">NOTE&nbsp; Particular values for status are not        specified, these should be determined and agreed by local        usage. Examples of possible status values include 'Not Yet        Started', 'Started', 'Completed'.</blockquote>")
	@DataMember(Order = 0)
	@Guid("24dad4d8-59a7-4a3c-9f09-a69c43924da4")
	@JacksonXmlProperty(isAttribute=true, localName = "status")
	private String status;

	@Description("The method of work used in carrying out a task.      <blockquote class=\"note\">NOTE&nbsp; This attribute should        not be used if the work method is specified for the        <em>IfcTaskType</em>   </blockquote>")
	@DataMember(Order = 1)
	@Guid("17ff6383-1e7f-4b76-9767-c81157032a92")
	@JacksonXmlProperty(isAttribute=true, localName = "workMethod")
	private String workMethod;

	@Description("Identifies whether a task is a milestone task (=TRUE) or not      (= FALSE).      <blockquote class=\"note\">NOTE&nbsp; In small project planning applications,        a milestone task may be understood to be a task having no        duration. As such, it represents a singular point in time.</blockquote>")
	@DataMember(Order = 2)
	@Required()
	@Guid("7b39e6b5-1058-483b-b41a-aa6262a8d52e")
	@JacksonXmlProperty(isAttribute=true, localName = "isMilestone")
	private Boolean isMilestone;

	@Description("A value that indicates the relative priority of the task (in      comparison to the priorities of other tasks).")
	@DataMember(Order = 3)
	@Guid("1bdb7742-02a5-4935-816c-f448d784924b")
	@JacksonXmlProperty(isAttribute=true, localName = "priority")
	private int priority;

	@Description("Time related information for the task.      <blockquote class=\"change-ifc2x4\">IFC4 CHANGE Attribute added</blockquote>")
	@DataMember(Order = 4)
	@Guid("c9eb8ec9-2781-4a95-bb1c-e76c1befbe06")
	@JacksonXmlProperty(isAttribute=false, localName = "taskTime")
	private IfcTaskTime taskTime;

	@Description("Identifies the predefined types of a task from which       the type required may be set.      <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute added</blockquote>")
	@DataMember(Order = 5)
	@Guid("02327d6b-da53-4a13-b62d-f958e4f6badf")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcTaskTypeEnum predefinedType;


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

	public IfcTaskTime getTaskTime() {
		return this.taskTime;
	}

	public void setTaskTime(IfcTaskTime taskTime) {
		this.taskTime = taskTime;
	}

	public IfcTaskTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcTaskTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

