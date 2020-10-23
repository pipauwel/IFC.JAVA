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

@Guid("0f341f47-3c39-4147-931a-6c01a7e6d767")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcStructuralPlanarAction.class, name = "IfcStructuralPlanarAction"))
public class IfcStructuralSurfaceAction extends IfcStructuralAction
{
	@Description("Defines whether load values are given per true lengths of the surface on which they act, or per lengths of the projection of the surface in load direction.  The latter is only applicable to loads which act in global coordinate directions.")
	@DataMember(Order = 0)
	@Guid("2cd91061-4164-40c9-9628-113db3c9b6a0")
	@JacksonXmlProperty(isAttribute=true, localName = "projectedOrTrue")
	private IfcProjectedOrTrueLengthEnum projectedOrTrue;

	@Description("Type of action according to its distribution of load values.")
	@DataMember(Order = 1)
	@Required()
	@Guid("be3cd5a8-4ac3-41e2-ba09-caf52cea75aa")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcStructuralSurfaceActivityTypeEnum predefinedType;


	public IfcStructuralSurfaceAction()
	{
	}

	public IfcStructuralSurfaceAction(String globalId, IfcStructuralLoad appliedLoad, IfcGlobalOrLocalEnum globalOrLocal, IfcStructuralSurfaceActivityTypeEnum predefinedType)
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

	public IfcStructuralSurfaceActivityTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcStructuralSurfaceActivityTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

