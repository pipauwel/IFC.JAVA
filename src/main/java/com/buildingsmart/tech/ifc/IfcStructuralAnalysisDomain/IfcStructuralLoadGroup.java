// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("eda81530-0687-4842-bde0-d6567c6ba98b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadGroup extends com.buildingsmart.tech.ifc.IfcKernel.IfcGroup
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Selects a predefined type for the load group.  It can be differentiated between load groups, load cases, load combinations, or userdefined grouping levels.")
	@Required()
	@Guid("5663480e-3310-47cf-9895-b66f3b6bc6fc")
	private com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcLoadGroupTypeEnum predefinedType;

	@JacksonXmlProperty(isAttribute=true, localName = "ActionType")
	@Description("Type of actions in the group. Normally needed if 'PredefinedType' specifies a LOAD_CASE.")
	@Required()
	@Guid("aef5596c-d11b-4db0-a46f-35343620887f")
	private com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcActionTypeEnum actionType;

	@JacksonXmlProperty(isAttribute=true, localName = "ActionSource")
	@Description("Source of actions in the group. Normally needed if 'PredefinedType' specifies a LOAD_CASE.")
	@Required()
	@Guid("448bc4ea-6678-4bdf-aa0a-b668235e13ff")
	private com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcActionSourceTypeEnum actionSource;

	@JacksonXmlProperty(isAttribute=true, localName = "Coefficient")
	@Description("Load factor. If omitted, a factor is not yet known or not specified. A load factor of 1.0 shall be explicitly exported as Coefficient = 1.0.")
	@Guid("aa87d543-3486-4d44-8480-cb94601a2fc7")
	private double coefficient;

	@JacksonXmlProperty(isAttribute=true, localName = "Purpose")
	@Description("Description of the purpose of this instance. Among else, possible values of the Purpose of load combinations are 'SLS', 'ULS', 'ALS' to indicate serviceability, ultimate, or accidental limit state.")
	@Guid("fd3c9364-c459-4be9-bd2f-25e1b39b4957")
	private String purpose;

	@Description("Results which were computed using this load group.")
	@MaxLength(1)
	@Guid("cc5325c9-4d29-44d1-b97c-63725962202d")
	private Set<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralResultGroup> sourceOfResultGroup = new HashSet<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralResultGroup>();

	@Description("Analysis models in which this load group is used.")
	@Guid("4da738a4-3225-4f05-895a-6c91c1c53f79")
	private Set<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralAnalysisModel> loadGroupFor = new HashSet<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralAnalysisModel>();


	public IfcStructuralLoadGroup()
	{
	}

	public IfcStructuralLoadGroup(String globalId, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcLoadGroupTypeEnum predefinedType, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcActionTypeEnum actionType, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcActionSourceTypeEnum actionSource)
	{
		super(globalId);
		this.predefinedType = predefinedType;
		this.actionType = actionType;
		this.actionSource = actionSource;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcLoadGroupTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcLoadGroupTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcActionTypeEnum getActionType() {
		return this.actionType;
	}

	public void setActionType(com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcActionTypeEnum actionType) {
		this.actionType = actionType;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcActionSourceTypeEnum getActionSource() {
		return this.actionSource;
	}

	public void setActionSource(com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcActionSourceTypeEnum actionSource) {
		this.actionSource = actionSource;
	}

	public double getCoefficient() {
		return this.coefficient;
	}

	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}

	public String getPurpose() {
		return this.purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public Set<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralResultGroup> getSourceOfResultGroup() {
		return this.sourceOfResultGroup;
	}

	public Set<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralAnalysisModel> getLoadGroupFor() {
		return this.loadGroupFor;
	}


}

