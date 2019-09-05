// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d5120875-1fc0-4135-8be9-51f5bd59fc0c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcResourceTime extends IfcSchedulingTime
{
	@JacksonXmlProperty(isAttribute=true, localName = "ScheduleWork")
	@Description("Indicates the total work (e.g. person-hours) allocated to the task on behalf of the resource.   Note: this is not necessarily the same as the task duration (IfcTaskTime.ScheduleDuration); it may vary according to the resource usage ratio and other resources assigned to the task.")
	@Guid("4b4bfb0c-4091-4fff-a712-fe4f2a6ab96e")
	private String scheduleWork;

	@JacksonXmlProperty(isAttribute=true, localName = "ScheduleUsage")
	@Description("Indicates the amount of the resource used concurrently. For example, 100% means 1 worker, 300% means 3 workers, 50% means half of 1 worker's time for scenarios where multitasking is feasible. If not provided, then the usage ratio is considered to be 100%.")
	@Guid("de98a5df-400e-4d81-917e-b5a94759d675")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure scheduleUsage;

	@JacksonXmlProperty(isAttribute=true, localName = "ScheduleStart")
	@Description("Indicates the time when the resource is scheduled to start working.")
	@Guid("d5861bd0-7d6c-40c8-9b69-1904295e0d92")
	private String scheduleStart;

	@JacksonXmlProperty(isAttribute=true, localName = "ScheduleFinish")
	@Description("Indicates the time when the resource is scheduled to finish working.")
	@Guid("45829cf5-93e2-4391-bff7-547516787758")
	private String scheduleFinish;

	@JacksonXmlProperty(isAttribute=true, localName = "ScheduleContour")
	@Description("Indicates how a resource should be leveled over time by adjusting the resource usage according to a specified curve.  Standard values include: 'Flat', 'BackLoaded', 'FrontLoaded', 'DoublePeak', 'EarlyPeak', 'LatePeak', 'Bell', and 'Turtle'.  Custom values may specify a custom name or formula.")
	@Guid("162cf71d-e04c-4489-84e3-5cdad4978cee")
	private String scheduleContour;

	@JacksonXmlProperty(isAttribute=true, localName = "LevelingDelay")
	@Description("Indicates a delay in the ScheduleStart caused by leveling.")
	@Guid("f46b3261-321d-4a92-bacc-06ccd902aafc")
	private String levelingDelay;

	@JacksonXmlProperty(isAttribute=true, localName = "IsOverAllocated")
	@Description("Indicates that the resource is scheduled in excess of its capacity.")
	@Guid("7af92579-02b6-4fca-a69f-4c670bb7aa78")
	private Boolean isOverAllocated;

	@JacksonXmlProperty(isAttribute=true, localName = "StatusTime")
	@Description("Indicates the date and time for which status values are applicable; particularly completion, actual, and remaining values.  If values are time-phased (the referencing IfcConstructionResource has associated time series values for attributes), then the status values may be determined from such time-phased data as of the StatusTime.")
	@Guid("cf3f1225-d2b5-4b1f-8ac3-4a2f01807ca7")
	private String statusTime;

	@JacksonXmlProperty(isAttribute=true, localName = "ActualWork")
	@Description("Indicates the actual work performed by the resource as of the StatusTime.")
	@Guid("b21864c5-499d-4d90-8593-9eeedfd3c29d")
	private String actualWork;

	@JacksonXmlProperty(isAttribute=true, localName = "ActualUsage")
	@Description("Indicates the actual amount of the resource used concurrently.")
	@Guid("6a504f50-8aac-406c-9874-26733470043c")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure actualUsage;

	@JacksonXmlProperty(isAttribute=true, localName = "ActualStart")
	@Description("Indicates the time when the resource actually started working.")
	@Guid("e137ba6a-c21b-4606-aa20-b9e7c30e0881")
	private String actualStart;

	@JacksonXmlProperty(isAttribute=true, localName = "ActualFinish")
	@Description("Indicates the time when the resource actually finished working.")
	@Guid("a5335e6f-18fd-4d92-ba1d-ea662f05df7a")
	private String actualFinish;

	@JacksonXmlProperty(isAttribute=true, localName = "RemainingWork")
	@Description("Indicates the work remaining to be completed by the resource.")
	@Guid("920d1d67-aec5-4c96-9b9d-d2a8c61bc3ea")
	private String remainingWork;

	@JacksonXmlProperty(isAttribute=true, localName = "RemainingUsage")
	@Guid("3f98d797-f920-4f52-9739-48be47b047e3")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure remainingUsage;

	@JacksonXmlProperty(isAttribute=true, localName = "Completion")
	@Description("Indicates the percent completion of this resource.  If the resource is assigned to a task, then indicates completion of the task on behalf of the resource; if the resource is partitioned into sub-allocations, then indicates overall completion of sub-allocations.")
	@Guid("2a9a0478-4070-40f3-b8c8-736ceb9d9c9d")
	private com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure completion;


	public IfcResourceTime()
	{
	}

	public String getScheduleWork() {
		return this.scheduleWork;
	}

	public void setScheduleWork(String scheduleWork) {
		this.scheduleWork = scheduleWork;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure getScheduleUsage() {
		return this.scheduleUsage;
	}

	public void setScheduleUsage(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure scheduleUsage) {
		this.scheduleUsage = scheduleUsage;
	}

	public String getScheduleStart() {
		return this.scheduleStart;
	}

	public void setScheduleStart(String scheduleStart) {
		this.scheduleStart = scheduleStart;
	}

	public String getScheduleFinish() {
		return this.scheduleFinish;
	}

	public void setScheduleFinish(String scheduleFinish) {
		this.scheduleFinish = scheduleFinish;
	}

	public String getScheduleContour() {
		return this.scheduleContour;
	}

	public void setScheduleContour(String scheduleContour) {
		this.scheduleContour = scheduleContour;
	}

	public String getLevelingDelay() {
		return this.levelingDelay;
	}

	public void setLevelingDelay(String levelingDelay) {
		this.levelingDelay = levelingDelay;
	}

	public Boolean getIsOverAllocated() {
		return this.isOverAllocated;
	}

	public void setIsOverAllocated(Boolean isOverAllocated) {
		this.isOverAllocated = isOverAllocated;
	}

	public String getStatusTime() {
		return this.statusTime;
	}

	public void setStatusTime(String statusTime) {
		this.statusTime = statusTime;
	}

	public String getActualWork() {
		return this.actualWork;
	}

	public void setActualWork(String actualWork) {
		this.actualWork = actualWork;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure getActualUsage() {
		return this.actualUsage;
	}

	public void setActualUsage(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure actualUsage) {
		this.actualUsage = actualUsage;
	}

	public String getActualStart() {
		return this.actualStart;
	}

	public void setActualStart(String actualStart) {
		this.actualStart = actualStart;
	}

	public String getActualFinish() {
		return this.actualFinish;
	}

	public void setActualFinish(String actualFinish) {
		this.actualFinish = actualFinish;
	}

	public String getRemainingWork() {
		return this.remainingWork;
	}

	public void setRemainingWork(String remainingWork) {
		this.remainingWork = remainingWork;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure getRemainingUsage() {
		return this.remainingUsage;
	}

	public void setRemainingUsage(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure remainingUsage) {
		this.remainingUsage = remainingUsage;
	}

	public com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure getCompletion() {
		return this.completion;
	}

	public void setCompletion(com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure completion) {
		this.completion = completion;
	}


}

