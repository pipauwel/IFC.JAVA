// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcLabel;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcRatioMeasure;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("eda81530-0687-4842-bde0-d6567c6ba98b")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcStructuralLoadCase.class, name = "IfcStructuralLoadCase"))
public class IfcStructuralLoadGroup extends com.buildingsmart.tech.ifc.IfcKernel.IfcGroup
{
	@Description("Selects a predefined type for the load group.  It can be differentiated between load groups, load cases, load combinations, or userdefined grouping levels.")
	@DataMember(Order = 0)
	@Required()
	@Guid("5663480e-3310-47cf-9895-b66f3b6bc6fc")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcLoadGroupTypeEnum predefinedType;

	@Description("Type of actions in the group. Normally needed if 'PredefinedType' specifies a LOAD_CASE.")
	@DataMember(Order = 1)
	@Required()
	@Guid("aef5596c-d11b-4db0-a46f-35343620887f")
	@JacksonXmlProperty(isAttribute=true, localName = "actionType")
	private IfcActionTypeEnum actionType;

	@Description("Source of actions in the group. Normally needed if 'PredefinedType' specifies a LOAD_CASE.")
	@DataMember(Order = 2)
	@Required()
	@Guid("448bc4ea-6678-4bdf-aa0a-b668235e13ff")
	@JacksonXmlProperty(isAttribute=true, localName = "actionSource")
	private IfcActionSourceTypeEnum actionSource;

	@Description("Load factor. If omitted, a factor is not yet known or not specified. A load factor of 1.0 shall be explicitly exported as Coefficient = 1.0.")
	@DataMember(Order = 3)
	@Guid("aa87d543-3486-4d44-8480-cb94601a2fc7")
	@JacksonXmlProperty(isAttribute=false, localName = "coefficient")
	private IfcRatioMeasure coefficient;

	@Description("Description of the purpose of this instance. Among else, possible values of the Purpose of load combinations are 'SLS', 'ULS', 'ALS' to indicate serviceability, ultimate, or accidental limit state.")
	@DataMember(Order = 4)
	@Guid("fd3c9364-c459-4be9-bd2f-25e1b39b4957")
	@JacksonXmlProperty(isAttribute=false, localName = "purpose")
	private IfcLabel purpose;

	@Description("Results which were computed using this load group.")
	@InverseProperty(InverseProp = "resultForLoadGroup", Range = "IfcStructuralResultGroup")
	@Guid("cc5325c9-4d29-44d1-b97c-63725962202d")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcStructuralResultGroup")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "sourceOfResultGroup")
	private Set<IfcStructuralResultGroup> sourceOfResultGroup;

	@Description("Analysis models in which this load group is used.")
	@InverseProperty(InverseProp = "loadedBy", Range = "IfcStructuralAnalysisModel")
	@Guid("4da738a4-3225-4f05-895a-6c91c1c53f79")
	/*@JacksonXmlProperty(isAttribute = false, localName = "IfcStructuralAnalysisModel")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "loadGroupFor")*/
	@JsonIgnore
	private Set<IfcStructuralAnalysisModel> loadGroupFor;


	public IfcStructuralLoadGroup()
	{
	}

	public IfcStructuralLoadGroup(String globalId, IfcLoadGroupTypeEnum predefinedType, IfcActionTypeEnum actionType, IfcActionSourceTypeEnum actionSource)
	{
		super(globalId);
		this.predefinedType = predefinedType;
		this.actionType = actionType;
		this.actionSource = actionSource;
	}

	public IfcLoadGroupTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcLoadGroupTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public IfcActionTypeEnum getActionType() {
		return this.actionType;
	}

	public void setActionType(IfcActionTypeEnum actionType) {
		this.actionType = actionType;
	}

	public IfcActionSourceTypeEnum getActionSource() {
		return this.actionSource;
	}

	public void setActionSource(IfcActionSourceTypeEnum actionSource) {
		this.actionSource = actionSource;
	}

	public IfcRatioMeasure getCoefficient() {
		return this.coefficient;
	}

	public void setCoefficient(IfcRatioMeasure coefficient) {
		this.coefficient = coefficient;
	}

	public IfcLabel getPurpose() {
		return this.purpose;
	}

	public void setPurpose(IfcLabel purpose) {
		this.purpose = purpose;
	}

	public Set<IfcStructuralResultGroup> getSourceOfResultGroup() {
		return this.sourceOfResultGroup;
	}

	public Set<IfcStructuralAnalysisModel> getLoadGroupFor() {
		return this.loadGroupFor;
	}


}

