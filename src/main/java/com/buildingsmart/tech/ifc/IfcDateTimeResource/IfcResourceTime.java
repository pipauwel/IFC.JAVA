// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("d5120875-1fc0-4135-8be9-51f5bd59fc0c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcResourceTime extends IfcSchedulingTime
{
	@Description("Indicates the total work (e.g. person-hours) allocated to the task on behalf of the resource.   Note: this is not necessarily the same as the task duration (IfcTaskTime.ScheduleDuration); it may vary according to the resource usage ratio and other resources assigned to the task.")
	@DataMember(Order = 0)
	@Guid("4b4bfb0c-4091-4fff-a712-fe4f2a6ab96e")
	@JacksonXmlProperty(isAttribute=false, localName = "scheduleWork")
	private IfcDuration scheduleWork;

	@Description("Indicates the amount of the resource used concurrently. For example, 100% means 1 worker, 300% means 3 workers, 50% means half of 1 worker's time for scenarios where multitasking is feasible. If not provided, then the usage ratio is considered to be 100%.")
	@DataMember(Order = 1)
	@Guid("de98a5df-400e-4d81-917e-b5a94759d675")
	@JacksonXmlProperty(isAttribute=false, localName = "scheduleUsage")
	private IfcPositiveRatioMeasure scheduleUsage;

	@Description("Indicates the time when the resource is scheduled to start working.")
	@DataMember(Order = 2)
	@Guid("d5861bd0-7d6c-40c8-9b69-1904295e0d92")
	@JacksonXmlProperty(isAttribute=false, localName = "scheduleStart")
	private IfcDateTime scheduleStart;

	@Description("Indicates the time when the resource is scheduled to finish working.")
	@DataMember(Order = 3)
	@Guid("45829cf5-93e2-4391-bff7-547516787758")
	@JacksonXmlProperty(isAttribute=false, localName = "scheduleFinish")
	private IfcDateTime scheduleFinish;

	@Description("Indicates how a resource should be leveled over time by adjusting the resource usage according to a specified curve.  Standard values include: 'Flat', 'BackLoaded', 'FrontLoaded', 'DoublePeak', 'EarlyPeak', 'LatePeak', 'Bell', and 'Turtle'.  Custom values may specify a custom name or formula.")
	@DataMember(Order = 4)
	@Guid("162cf71d-e04c-4489-84e3-5cdad4978cee")
	@JacksonXmlProperty(isAttribute=false, localName = "scheduleContour")
	private IfcLabel scheduleContour;

	@Description("Indicates a delay in the ScheduleStart caused by leveling.")
	@DataMember(Order = 5)
	@Guid("f46b3261-321d-4a92-bacc-06ccd902aafc")
	@JacksonXmlProperty(isAttribute=false, localName = "levelingDelay")
	private IfcDuration levelingDelay;

	@Description("Indicates that the resource is scheduled in excess of its capacity.")
	@DataMember(Order = 6)
	@Guid("7af92579-02b6-4fca-a69f-4c670bb7aa78")
	@JacksonXmlProperty(isAttribute=false, localName = "isOverAllocated")
	private IfcBoolean isOverAllocated;

	@Description("Indicates the date and time for which status values are applicable; particularly completion, actual, and remaining values.  If values are time-phased (the referencing IfcConstructionResource has associated time series values for attributes), then the status values may be determined from such time-phased data as of the StatusTime.")
	@DataMember(Order = 7)
	@Guid("cf3f1225-d2b5-4b1f-8ac3-4a2f01807ca7")
	@JacksonXmlProperty(isAttribute=false, localName = "statusTime")
	private IfcDateTime statusTime;

	@Description("Indicates the actual work performed by the resource as of the StatusTime.")
	@DataMember(Order = 8)
	@Guid("b21864c5-499d-4d90-8593-9eeedfd3c29d")
	@JacksonXmlProperty(isAttribute=false, localName = "actualWork")
	private IfcDuration actualWork;

	@Description("Indicates the actual amount of the resource used concurrently.")
	@DataMember(Order = 9)
	@Guid("6a504f50-8aac-406c-9874-26733470043c")
	@JacksonXmlProperty(isAttribute=false, localName = "actualUsage")
	private IfcPositiveRatioMeasure actualUsage;

	@Description("Indicates the time when the resource actually started working.")
	@DataMember(Order = 10)
	@Guid("e137ba6a-c21b-4606-aa20-b9e7c30e0881")
	@JacksonXmlProperty(isAttribute=false, localName = "actualStart")
	private IfcDateTime actualStart;

	@Description("Indicates the time when the resource actually finished working.")
	@DataMember(Order = 11)
	@Guid("a5335e6f-18fd-4d92-ba1d-ea662f05df7a")
	@JacksonXmlProperty(isAttribute=false, localName = "actualFinish")
	private IfcDateTime actualFinish;

	@Description("Indicates the work remaining to be completed by the resource.")
	@DataMember(Order = 12)
	@Guid("920d1d67-aec5-4c96-9b9d-d2a8c61bc3ea")
	@JacksonXmlProperty(isAttribute=false, localName = "remainingWork")
	private IfcDuration remainingWork;

	@DataMember(Order = 13)
	@Guid("3f98d797-f920-4f52-9739-48be47b047e3")
	@JacksonXmlProperty(isAttribute=false, localName = "remainingUsage")
	private IfcPositiveRatioMeasure remainingUsage;

	@Description("Indicates the percent completion of this resource.  If the resource is assigned to a task, then indicates completion of the task on behalf of the resource; if the resource is partitioned into sub-allocations, then indicates overall completion of sub-allocations.")
	@DataMember(Order = 14)
	@Guid("2a9a0478-4070-40f3-b8c8-736ceb9d9c9d")
	@JacksonXmlProperty(isAttribute=false, localName = "completion")
	private IfcPositiveRatioMeasure completion;


	public IfcResourceTime()
	{
	}

	public IfcDuration getScheduleWork() {
		return this.scheduleWork;
	}

	public void setScheduleWork(IfcDuration scheduleWork) {
		this.scheduleWork = scheduleWork;
	}

	public IfcPositiveRatioMeasure getScheduleUsage() {
		return this.scheduleUsage;
	}

	public void setScheduleUsage(IfcPositiveRatioMeasure scheduleUsage) {
		this.scheduleUsage = scheduleUsage;
	}

	public IfcDateTime getScheduleStart() {
		return this.scheduleStart;
	}

	public void setScheduleStart(IfcDateTime scheduleStart) {
		this.scheduleStart = scheduleStart;
	}

	public IfcDateTime getScheduleFinish() {
		return this.scheduleFinish;
	}

	public void setScheduleFinish(IfcDateTime scheduleFinish) {
		this.scheduleFinish = scheduleFinish;
	}

	public IfcLabel getScheduleContour() {
		return this.scheduleContour;
	}

	public void setScheduleContour(IfcLabel scheduleContour) {
		this.scheduleContour = scheduleContour;
	}

	public IfcDuration getLevelingDelay() {
		return this.levelingDelay;
	}

	public void setLevelingDelay(IfcDuration levelingDelay) {
		this.levelingDelay = levelingDelay;
	}

	public IfcBoolean getIsOverAllocated() {
		return this.isOverAllocated;
	}

	public void setIsOverAllocated(IfcBoolean isOverAllocated) {
		this.isOverAllocated = isOverAllocated;
	}

	public IfcDateTime getStatusTime() {
		return this.statusTime;
	}

	public void setStatusTime(IfcDateTime statusTime) {
		this.statusTime = statusTime;
	}

	public IfcDuration getActualWork() {
		return this.actualWork;
	}

	public void setActualWork(IfcDuration actualWork) {
		this.actualWork = actualWork;
	}

	public IfcPositiveRatioMeasure getActualUsage() {
		return this.actualUsage;
	}

	public void setActualUsage(IfcPositiveRatioMeasure actualUsage) {
		this.actualUsage = actualUsage;
	}

	public IfcDateTime getActualStart() {
		return this.actualStart;
	}

	public void setActualStart(IfcDateTime actualStart) {
		this.actualStart = actualStart;
	}

	public IfcDateTime getActualFinish() {
		return this.actualFinish;
	}

	public void setActualFinish(IfcDateTime actualFinish) {
		this.actualFinish = actualFinish;
	}

	public IfcDuration getRemainingWork() {
		return this.remainingWork;
	}

	public void setRemainingWork(IfcDuration remainingWork) {
		this.remainingWork = remainingWork;
	}

	public IfcPositiveRatioMeasure getRemainingUsage() {
		return this.remainingUsage;
	}

	public void setRemainingUsage(IfcPositiveRatioMeasure remainingUsage) {
		this.remainingUsage = remainingUsage;
	}

	public IfcPositiveRatioMeasure getCompletion() {
		return this.completion;
	}

	public void setCompletion(IfcPositiveRatioMeasure completion) {
		this.completion = completion;
	}


}

