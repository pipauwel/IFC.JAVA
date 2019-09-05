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

@Guid("744fe291-2e62-4a6f-b0a4-1ead956bee5c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralResultGroup extends com.buildingsmart.tech.ifc.IfcKernel.IfcGroup
{
	@JacksonXmlProperty(isAttribute=true, localName = "TheoryType")
	@Description("Specifies the analysis theory used to obtain the respective results.")
	@Required()
	@Guid("50f3f700-985f-42c4-a053-708cf2af2e25")
	private com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcAnalysisTheoryTypeEnum theoryType;

	@JacksonXmlProperty(isAttribute=false, localName = "ResultForLoadGroup")
	@Description("Reference to an instance of IfcStructuralLoadGroup for which this instance represents the result.")
	@Guid("0912b5b6-1758-417c-8a7c-5bf6ef79f48f")
	private com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralLoadGroup resultForLoadGroup;

	@JacksonXmlProperty(isAttribute=true, localName = "IsLinear")
	@Description("This value allows to easily recognize whether a linear analysis has been applied (allowing the superposition of analysis results).")
	@Required()
	@Guid("c52b2d50-09a4-46e4-8f2d-0b3034de6be1")
	private Boolean isLinear;

	@Description("Reference to an instance of IfcStructuralAnalysisModel for which this instance captures a result.")
	@MaxLength(1)
	@Guid("611d0a6e-2ce8-4adc-8e0f-7b92afe5309e")
	private Set<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralAnalysisModel> resultGroupFor = new HashSet<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralAnalysisModel>();


	public IfcStructuralResultGroup()
	{
	}

	public IfcStructuralResultGroup(String globalId, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcAnalysisTheoryTypeEnum theoryType, Boolean isLinear)
	{
		super(globalId);
		this.theoryType = theoryType;
		this.isLinear = isLinear;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcAnalysisTheoryTypeEnum getTheoryType() {
		return this.theoryType;
	}

	public void setTheoryType(com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcAnalysisTheoryTypeEnum theoryType) {
		this.theoryType = theoryType;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralLoadGroup getResultForLoadGroup() {
		return this.resultForLoadGroup;
	}

	public void setResultForLoadGroup(com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralLoadGroup resultForLoadGroup) {
		this.resultForLoadGroup = resultForLoadGroup;
	}

	public Boolean getIsLinear() {
		return this.isLinear;
	}

	public void setIsLinear(Boolean isLinear) {
		this.isLinear = isLinear;
	}

	public Set<com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralAnalysisModel> getResultGroupFor() {
		return this.resultGroupFor;
	}


}

