// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("38e3c74b-486e-4323-980b-6375977d83ae")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelFillsElement extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelConnects
{
	@Description("Opening Element being filled by virtue of this relationship.")
	@DataMember(Order = 0)
	@Required()
	@Guid("1263cb61-a362-4a46-a3b4-e13467721d95")
	@JsonIgnore
	private IfcOpeningElement relatingOpeningElement;

	@Description("Reference to <strike>building</strike> element that occupies fully or partially the associated opening.  <blockquote class=\"change-ifc2x\">IFC2x CHANGE&nbsp; The data type has been changed from <em>IfcBuildingElement</em> to <em>IfcElement</em> with upward compatibility for file based exchange.</blockquote>")
	@DataMember(Order = 1)
	@Required()
	@Guid("d5593c58-a2e5-41a2-a38a-ffd919af2329")
	@JacksonXmlProperty(isAttribute=false, localName = "relatedBuildingElement")
	private IfcElement relatedBuildingElement;


	public IfcRelFillsElement()
	{
	}

	public IfcRelFillsElement(String globalId, IfcOpeningElement relatingOpeningElement, IfcElement relatedBuildingElement)
	{
		super(globalId);
		this.relatingOpeningElement = relatingOpeningElement;
		this.relatedBuildingElement = relatedBuildingElement;
	}

	public IfcOpeningElement getRelatingOpeningElement() {
		return this.relatingOpeningElement;
	}

	public void setRelatingOpeningElement(IfcOpeningElement relatingOpeningElement) {
		this.relatingOpeningElement = relatingOpeningElement;
	}

	public IfcElement getRelatedBuildingElement() {
		return this.relatedBuildingElement;
	}

	public void setRelatedBuildingElement(IfcElement relatedBuildingElement) {
		this.relatedBuildingElement = relatedBuildingElement;
	}


}

