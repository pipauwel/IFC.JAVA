// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("5307e7a4-2270-4ad7-9e3c-ba76198cc09e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelVoidsElement extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelDecomposes
{
	@JsonIgnore
	@Description("Reference to element in which a void is created by associated feature subtraction element.  <blockquote class=\"change-ifc2x\">IFC2x CHANGE&nbsp; The data type has been changed from <em>IfcBuildingElement</em> to <em>IfcElement</em> with upward compatibility for file based exchange.</blockquote>")
	@Required()
	@Guid("6088c92a-4578-4341-b20d-3690feb149af")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatingBuildingElement;

	@JacksonXmlProperty(isAttribute=false, localName = "RelatedOpeningElement")
	@Description("Reference to the feature subtraction element which defines a void in the associated element.  <blockquote class=\"change-ifc2x\">IFC2x CHANGE&nbsp; The data type has been changed from <em>IfcOpeningElement</em> to <em>IfcFeatureElementSubtraction</em> with upward compatibility for file based exchange.</blockquote>")
	@Required()
	@Guid("edbe00f6-c081-41e2-a32e-32ab51af7a0a")
	private com.buildingsmart.tech.ifc.IfcProductExtension.IfcFeatureElementSubtraction relatedOpeningElement;


	public IfcRelVoidsElement()
	{
	}

	public IfcRelVoidsElement(String globalId, com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatingBuildingElement, com.buildingsmart.tech.ifc.IfcProductExtension.IfcFeatureElementSubtraction relatedOpeningElement)
	{
		super(globalId);
		this.relatingBuildingElement = relatingBuildingElement;
		this.relatedOpeningElement = relatedOpeningElement;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement getRelatingBuildingElement() {
		return this.relatingBuildingElement;
	}

	public void setRelatingBuildingElement(com.buildingsmart.tech.ifc.IfcProductExtension.IfcElement relatingBuildingElement) {
		this.relatingBuildingElement = relatingBuildingElement;
	}

	public com.buildingsmart.tech.ifc.IfcProductExtension.IfcFeatureElementSubtraction getRelatedOpeningElement() {
		return this.relatedOpeningElement;
	}

	public void setRelatedOpeningElement(com.buildingsmart.tech.ifc.IfcProductExtension.IfcFeatureElementSubtraction relatedOpeningElement) {
		this.relatedOpeningElement = relatedOpeningElement;
	}


}

