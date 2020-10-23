// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("948541ee-3298-408e-a404-6fd5b84b81e9")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcStructuralLinearAction.class, name = "IfcStructuralLinearAction"))
public class IfcStructuralCurveAction extends IfcStructuralAction
{
	@Description("Defines whether load values are given per true length of the curve on which they act, or per length of the projection of the curve in load direction.  The latter is only applicable to loads which act in global coordinate directions.")
	@DataMember(Order = 0)
	@Guid("de505213-6b85-43ed-83d1-cdf5251aec7b")
	@JacksonXmlProperty(isAttribute=true, localName = "projectedOrTrue")
	private IfcProjectedOrTrueLengthEnum projectedOrTrue;

	@Description("Type of action according to its distribution of load values.")
	@DataMember(Order = 1)
	@Required()
	@Guid("a0301c23-b88b-4a3c-bb49-e303eb4a0b69")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcStructuralCurveActivityTypeEnum predefinedType;


	public IfcStructuralCurveAction()
	{
	}

	public IfcStructuralCurveAction(String globalId, IfcStructuralLoad appliedLoad, IfcGlobalOrLocalEnum globalOrLocal, IfcStructuralCurveActivityTypeEnum predefinedType)
	{
		super(globalId, appliedLoad, globalOrLocal);
		this.predefinedType = predefinedType;
	}

	public IfcProjectedOrTrueLengthEnum getProjectedOrTrue() {
		return this.projectedOrTrue;
	}

	public void setProjectedOrTrue(IfcProjectedOrTrueLengthEnum projectedOrTrue) {
		this.projectedOrTrue = projectedOrTrue;
	}

	public IfcStructuralCurveActivityTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcStructuralCurveActivityTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

