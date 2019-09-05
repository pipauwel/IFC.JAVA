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

@Guid("e9d95f21-bd10-40ff-ada5-a024a15bf019")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralSurfaceReaction extends IfcStructuralReaction
{
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	@Description("Type of reaction according to its distribution of load values.")
	@Required()
	@Guid("af39cd66-ebd2-471d-9517-590a0858c616")
	private com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceActivityTypeEnum predefinedType;


	public IfcStructuralSurfaceReaction()
	{
	}

	public IfcStructuralSurfaceReaction(String globalId, com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad appliedLoad, com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum globalOrLocal, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceActivityTypeEnum predefinedType)
	{
		super(globalId, appliedLoad, globalOrLocal);
		this.predefinedType = predefinedType;
	}

	public com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceActivityTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcStructuralSurfaceActivityTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

