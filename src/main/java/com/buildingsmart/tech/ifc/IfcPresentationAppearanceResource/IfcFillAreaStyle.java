// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MinLength;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("8495cfb3-40da-4a4e-8481-67e0000fb8d2")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFillAreaStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect
{
	@Description("The set of fill area styles to use in presenting visible curve segments, annotation fill areas or surfaces.")
	@Required()
	@MinLength(1)
	@Guid("9ba1f4aa-4f50-46ae-89ec-64982a7b1746")
	private Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcFillStyleSelect> fillStyles = new HashSet<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcFillStyleSelect>();

	@JacksonXmlProperty(isAttribute=true, localName = "ModelorDraughting")
	@Description("Indication whether the length measures provided for the presentation style are model based, or draughting based.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute.  </blockquote>")
	@Guid("b8e3fc01-58d7-4b36-9005-6d26c38ffaea")
	private Boolean modelorDraughting;


	public IfcFillAreaStyle()
	{
	}

	public IfcFillAreaStyle(com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcFillStyleSelect[] fillStyles)
	{
		this.fillStyles = new HashSet<>(Arrays.asList(fillStyles));
	}

	public Set<com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource.IfcFillStyleSelect> getFillStyles() {
		return this.fillStyles;
	}

	public Boolean getModelorDraughting() {
		return this.modelorDraughting;
	}

	public void setModelorDraughting(Boolean modelorDraughting) {
		this.modelorDraughting = modelorDraughting;
	}


}

