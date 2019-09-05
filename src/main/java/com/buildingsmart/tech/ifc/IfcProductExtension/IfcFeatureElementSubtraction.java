// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("c881faa0-78d9-40af-a83e-a4924a575869")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcFeatureElementSubtraction extends IfcFeatureElement
{
	@Description("Reference to the Voids Relationship that uses this Opening Element to create a void within an Element. The Opening Element can only be used to create a single void within a single Element.")
	@Guid("094eb37f-0822-4b0d-9fcc-e87be21592b4")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelVoidsElement voidsElements;


	public IfcFeatureElementSubtraction()
	{
	}

	public IfcFeatureElementSubtraction(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelVoidsElement getVoidsElements() {
		return this.voidsElements;
	}

	public void setVoidsElements(com.buildingsmart.tech.ifc.IfcProductExtension.IfcRelVoidsElement voidsElements) {
		this.voidsElements = voidsElements;
	}


}

