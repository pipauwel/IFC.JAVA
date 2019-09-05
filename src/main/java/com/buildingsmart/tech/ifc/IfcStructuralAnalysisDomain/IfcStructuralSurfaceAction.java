// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0f341f47-3c39-4147-931a-6c01a7e6d767")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralSurfaceAction extends IfcStructuralAction
{
	@JacksonXmlProperty(isAttribute=true, localName = "ProjectedOrTrue")
	@Description("Defines whether load values are given per true lengths of the surface on which they act, or per lengths of the projection of the surface in load direction.  The latter is only applicable to loads which act in global coordinate directions.")
	@Guid("2cd91061-4164-40c9-9628-113db3c9b6a0")
	private com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcProjectedOrTrueLengthEnum projectedOrTrue;

	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Type of action according to its distribution of load values.")
	@Required()
	@Guid("be3cd5a8-4ac3-41e2-ba09-caf52cea75aa")
	private com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceActivityTypeEnum predefinedType;


	public IfcStructuralSurfaceAction()
	{
	}

	public IfcStructuralSurfaceAction(String globalId, com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad appliedLoad, com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum globalOrLocal, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceActivityTypeEnum predefinedType)
	{
		super(globalId, appliedLoad, globalOrLocal);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcProjectedOrTrueLengthEnum getProjectedOrTrue() {
		return this.projectedOrTrue;
	}

	public void setProjectedOrTrue(com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcProjectedOrTrueLengthEnum projectedOrTrue) {
		this.projectedOrTrue = projectedOrTrue;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceActivityTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceActivityTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

