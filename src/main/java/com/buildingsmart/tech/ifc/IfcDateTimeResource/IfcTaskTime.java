// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcDateTimeResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveRatioMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("4eee487b-9f5a-4135-9327-1e972cc6124f")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcTaskTimeRecurring.class, name = "IfcTaskTimeRecurring"))
public class IfcTaskTime extends IfcSchedulingTime
{
	@Description("Enables to specify the type of duration values for <em>ScheduleDuration</em>, <em>ActualDuration</em> and <em>RemainingTime</em>. The duration type is either work time or elapsed time.")
	@DataMember(Order = 0)
	@Guid("397b58b9-0e87-4f6e-aa6e-b91fae6c6a4e")
	@JacksonXmlProperty(isAttribute=true, localName = "durationType")
	private IfcTaskDurationEnum durationType;

	@Description("The amount of time which is scheduled for completion of a task. The value might be measured or somehow calculated, which is defined by  <em>ScheduleDataOrigin</em>. The value is either given as elapsed time or work time, which is defined by <em>DurationType</em>.    <blockquote class=\"note\">NOTE&nbsp; Scheduled Duration may be calculated as the time from scheduled start date to scheduled finish date.</blockquote>")
	@DataMember(Order = 1)
	@Guid("17765db4-2af2-4877-9a1c-1a1aa17d61c0")
	@JacksonXmlProperty(isAttribute=false, localName = "scheduleDuration")
	private IfcDuration scheduleDuration;

	@Description("The date on which a task is scheduled to be started. The value might be measured or somehow calculated, which is defined by  <em>ScheduleDataOrigin</em>.  <blockquote class=\"note\">NOTE&nbsp;  The scheduled start date must be greater than or equal to the earliest start date.</blockquote>")
	@DataMember(Order = 2)
	@Guid("d5661729-f85b-4be7-8632-15aa2e10ab22")
	@JacksonXmlProperty(isAttribute=false, localName = "scheduleStart")
	private IfcDateTime scheduleStart;

	@Description("The date on which a task is scheduled to be finished. The value might be measured or somehow calculated, which is defined by <em>ScheduleDataOrigin</em>.  <blockquote class=\"note\">NOTE&nbsp;  The scheduled finish date must be greater than or equal to the earliest finish date.</blockquote>")
	@DataMember(Order = 3)
	@Guid("285c04fa-d7c3-4263-a1cf-02c2ee0040a0")
	@JacksonXmlProperty(isAttribute=false, localName = "scheduleFinish")
	private IfcDateTime scheduleFinish;

	@Description("The earliest date on which a task can be started. It is a calculated value.")
	@DataMember(Order = 4)
	@Guid("70dfb411-90a1-4a66-a1d7-9320fd245548")
	@JacksonXmlProperty(isAttribute=false, localName = "earlyStart")
	private IfcDateTime earlyStart;

	@Description("The earliest date on which a task can be finished. It is a calculated value.")
	@DataMember(Order = 5)
	@Guid("29d02d47-1a92-4c99-a3b6-45fc125dcad7")
	@JacksonXmlProperty(isAttribute=false, localName = "earlyFinish")
	private IfcDateTime earlyFinish;

	@Description("The latest date on which a task can be started. It is a calculated value.")
	@DataMember(Order = 6)
	@Guid("98829ecd-dbb3-496b-9330-910738614175")
	@JacksonXmlProperty(isAttribute=false, localName = "lateStart")
	private IfcDateTime lateStart;

	@Description("The latest date on which a task can be finished. It is a calculated value.")
	@DataMember(Order = 7)
	@Guid("f0a8d060-3dc8-4626-89de-282d46fa2a9b")
	@JacksonXmlProperty(isAttribute=false, localName = "lateFinish")
	private IfcDateTime lateFinish;

	@Description("The amount of time during which the start or finish of a task may be varied without any effect on the overall programme of work. It is a calculated elapsed time value.")
	@DataMember(Order = 8)
	@Guid("eecac739-ba4e-4309-a645-38b4740fa4de")
	@JacksonXmlProperty(isAttribute=false, localName = "freeFloat")
	private IfcDuration freeFloat;

	@Description("The difference between the duration available to carry out a task and the scheduled duration of the task. It is a calculated elapsed time value.  <blockquote class=\"note\">NOTE&nbsp;  Total Float time may be calculated as being the difference between the scheduled duration of a task and the available duration from earliest start to latest finish. Float time may be either positive, zero or negative. Where it is zero or negative, the task becomes critical.</blockquote>")
	@DataMember(Order = 9)
	@Guid("9bf4c43a-4c27-4d6b-b101-6ba64ce6f120")
	@JacksonXmlProperty(isAttribute=false, localName = "totalFloat")
	private IfcDuration totalFloat;

	@Description("A flag which identifies whether a scheduled task is a critical item within the programme.  <blockquote class=\"note\">NOTE&nbsp;  A task becomes critical when the float time becomes zero or negative.</blockquote>")
	@DataMember(Order = 10)
	@Guid("8aa0889f-6698-437a-b5da-35b0c4813464")
	@JacksonXmlProperty(isAttribute=false, localName = "isCritical")
	private IfcBoolean isCritical;

	@Description("The date or time at which the status of the tasks within the schedule is analyzed.")
	@DataMember(Order = 11)
	@Guid("88662ea5-953b-499b-b149-73854134e848")
	@JacksonXmlProperty(isAttribute=false, localName = "statusTime")
	private IfcDateTime statusTime;

	@Description("The actual duration of the task. It is a measured value. The value is either given as elapsed time or work time, which is defined by <em>DurationType</em>.")
	@DataMember(Order = 12)
	@Guid("1646c30c-9b12-48d2-9c66-ef85c4f2a043")
	@JacksonXmlProperty(isAttribute=false, localName = "actualDuration")
	private IfcDuration actualDuration;

	@Description("The date on which a task is actually started. It is a measured value.  <blockquote class=\"note\">NOTE&nbsp;  The scheduled start date must be greater than or equal to the earliest start date. No constraint is applied to the actual start date with respect to the scheduled start date since a task may be started earlier than had originally been scheduled if circumstances allow.</blockquote>")
	@DataMember(Order = 13)
	@Guid("5e97a697-7082-4bdb-8990-ea90fdf6f15a")
	@JacksonXmlProperty(isAttribute=false, localName = "actualStart")
	private IfcDateTime actualStart;

	@Description("The date on which a task is actually finished.")
	@DataMember(Order = 14)
	@Guid("79cfac6b-f665-401b-be2c-918d52b11c49")
	@JacksonXmlProperty(isAttribute=false, localName = "actualFinish")
	private IfcDateTime actualFinish;

	@Description("The amount of time remaining to complete a task. It is a predicted value. The value is either given as elapsed time or work time, which is defined by <em>DurationType</em>.  <blockquote class=\"note\">NOTE&nbsp; The time remaining in which to complete a task may be determined both for tasks which have not yet started and those which have. Remaining time for a task not yet started has the same value as the scheduled duration. For a task already started, remaining time is calculated as the difference between the scheduled finish and the point of analysis.</blockquote>")
	@DataMember(Order = 15)
	@Guid("971ed03f-d8a5-4734-bac5-e8314d432e59")
	@JacksonXmlProperty(isAttribute=false, localName = "remainingTime")
	private IfcDuration remainingTime;

	@Description("The extent of completion expressed as a ratio or percentage. It is a measured value.")
	@DataMember(Order = 16)
	@Guid("84fca29b-286d-4a6b-a358-c543c94ff5f0")
	@JacksonXmlProperty(isAttribute=false, localName = "completion")
	private IfcPositiveRatioMeasure completion;


	public IfcTaskTime()
	{
	}

	public IfcTaskDurationEnum getDurationType() {
		return this.durationType;
	}

	public void setDurationType(IfcTaskDurationEnum durationType) {
		this.durationType = durationType;
	}

	public IfcDuration getScheduleDuration() {
		return this.scheduleDuration;
	}

	public void setScheduleDuration(IfcDuration scheduleDuration) {
		this.scheduleDuration = scheduleDuration;
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

	public IfcDateTime getEarlyStart() {
		return this.earlyStart;
	}

	public void setEarlyStart(IfcDateTime earlyStart) {
		this.earlyStart = earlyStart;
	}

	public IfcDateTime getEarlyFinish() {
		return this.earlyFinish;
	}

	public void setEarlyFinish(IfcDateTime earlyFinish) {
		this.earlyFinish = earlyFinish;
	}

	public IfcDateTime getLateStart() {
		return this.lateStart;
	}

	public void setLateStart(IfcDateTime lateStart) {
		this.lateStart = lateStart;
	}

	public IfcDateTime getLateFinish() {
		return this.lateFinish;
	}

	public void setLateFinish(IfcDateTime lateFinish) {
		this.lateFinish = lateFinish;
	}

	public IfcDuration getFreeFloat() {
		return this.freeFloat;
	}

	public void setFreeFloat(IfcDuration freeFloat) {
		this.freeFloat = freeFloat;
	}

	public IfcDuration getTotalFloat() {
		return this.totalFloat;
	}

	public void setTotalFloat(IfcDuration totalFloat) {
		this.totalFloat = totalFloat;
	}

	public IfcBoolean getIsCritical() {
		return this.isCritical;
	}

	public void setIsCritical(IfcBoolean isCritical) {
		this.isCritical = isCritical;
	}

	public IfcDateTime getStatusTime() {
		return this.statusTime;
	}

	public void setStatusTime(IfcDateTime statusTime) {
		this.statusTime = statusTime;
	}

	public IfcDuration getActualDuration() {
		return this.actualDuration;
	}

	public void setActualDuration(IfcDuration actualDuration) {
		this.actualDuration = actualDuration;
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

	public IfcDuration getRemainingTime() {
		return this.remainingTime;
	}

	public void setRemainingTime(IfcDuration remainingTime) {
		this.remainingTime = remainingTime;
	}

	public IfcPositiveRatioMeasure getCompletion() {
		return this.completion;
	}

	public void setCompletion(IfcPositiveRatioMeasure completion) {
		this.completion = completion;
	}


}

