// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcGroup;
import com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcAnalysisTheoryTypeEnum;

@Guid("744fe291-2e62-4a6f-b0a4-1ead956bee5c")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralResultGroup extends com.buildingsmart.tech.ifc.IfcKernel.IfcGroup
{
	@Description("Specifies the analysis theory used to obtain the respective results.")
	@DataMember(Order = 0)
	@Required()
	@Guid("50f3f700-985f-42c4-a053-708cf2af2e25")
	@JacksonXmlProperty(isAttribute=true, localName = "TheoryType")
	private IfcAnalysisTheoryTypeEnum theoryType;

	@Description("Reference to an instance of IfcStructuralLoadGroup for which this instance represents the result.")
	@DataMember(Order = 1)
	@Guid("0912b5b6-1758-417c-8a7c-5bf6ef79f48f")
	@JacksonXmlProperty(isAttribute=false, localName = "ResultForLoadGroup")
	private IfcStructuralLoadGroup resultForLoadGroup;

	@Description("This value allows to easily recognize whether a linear analysis has been applied (allowing the superposition of analysis results).")
	@DataMember(Order = 2)
	@Required()
	@Guid("c52b2d50-09a4-46e4-8f2d-0b3034de6be1")
	@JacksonXmlProperty(isAttribute=true, localName = "IsLinear")
	private Boolean isLinear;

	@Description("Reference to an instance of IfcStructuralAnalysisModel for which this instance captures a result.")
	@InverseProperty(InverseProp = "HasResults", Range = "IfcStructuralAnalysisModel")
	@Guid("611d0a6e-2ce8-4adc-8e0f-7b92afe5309e")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcStructuralAnalysisModel")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "ResultGroupFor")
	private Set<IfcStructuralAnalysisModel> resultGroupFor;


	public IfcStructuralResultGroup()
	{
	}

	public IfcStructuralResultGroup(String globalId, IfcAnalysisTheoryTypeEnum theoryType, Boolean isLinear)
	{
		super(globalId);
		this.theoryType = theoryType;
		this.isLinear = isLinear;
	}

	public IfcAnalysisTheoryTypeEnum getTheoryType() {
		return this.theoryType;
	}

	public void setTheoryType(IfcAnalysisTheoryTypeEnum theoryType) {
		this.theoryType = theoryType;
	}

	public IfcStructuralLoadGroup getResultForLoadGroup() {
		return this.resultForLoadGroup;
	}

	public void setResultForLoadGroup(IfcStructuralLoadGroup resultForLoadGroup) {
		this.resultForLoadGroup = resultForLoadGroup;
	}

	public Boolean getIsLinear() {
		return this.isLinear;
	}

	public void setIsLinear(Boolean isLinear) {
		this.isLinear = isLinear;
	}

	public Set<IfcStructuralAnalysisModel> getResultGroupFor() {
		return this.resultGroupFor;
	}


}

