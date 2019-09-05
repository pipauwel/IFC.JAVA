// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("061ba193-076d-4292-a0ce-c96d7aba692e")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcSpatialStructureElement extends IfcSpatialElement
{
	@JacksonXmlProperty(isAttribute=true, localName = "CompositionType")
	@Description("Denotes, whether the predefined spatial structure element represents itself, or an aggregate (complex) or a part (part). The interpretation is given separately for each subtype of spatial structure element. If no <em>CompositionType</em> is asserted, the dafault value 'ELEMENT' applies.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; Attribute made optional.</blockquote>")
	@Guid("726de67f-b56e-4031-b779-84330e1d0483")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcElementCompositionEnum compositionType;


	public IfcSpatialStructureElement()
	{
	}

	public IfcSpatialStructureElement(String globalId)
	{
		super(globalId);
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcElementCompositionEnum getCompositionType() {
		return this.compositionType;
	}

	public void setCompositionType(com.buildingsmart.tech.ifc.IfcProductExtension.IfcElementCompositionEnum compositionType) {
		this.compositionType = compositionType;
	}


}

