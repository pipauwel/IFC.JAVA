// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcClassificationSelect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("4bd9bd82-20ff-4504-bb85-feccfdfe7377")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssociatesClassification extends IfcRelAssociates
{
	@Description("Classification applied to the objects.")
	@DataMember(Order = 0)
	@Required()
	@Guid("ce934d5a-d2ac-453a-a81a-d7b328c37048")
	@JacksonXmlProperty(isAttribute=true, localName = "relatingClassification")
	private IfcClassificationSelect relatingClassification;


	public IfcRelAssociatesClassification()
	{
	}

	public IfcRelAssociatesClassification(String globalId, IfcDefinitionSelect[] relatedObjects, IfcClassificationSelect relatingClassification)
	{
		super(globalId, relatedObjects);
		this.relatingClassification = relatingClassification;
	}

	public IfcClassificationSelect getRelatingClassification() {
		return this.relatingClassification;
	}

	public void setRelatingClassification(IfcClassificationSelect relatingClassification) {
		this.relatingClassification = relatingClassification;
	}


}

