// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationAppearanceResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("8495cfb3-40da-4a4e-8481-67e0000fb8d2")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFillAreaStyle extends IfcPresentationStyle implements IfcPresentationStyleSelect
{
	@Description("The set of fill area styles to use in presenting visible curve segments, annotation fill areas or surfaces.")
	@DataMember(Order = 0)
	@Required()
	@Guid("9ba1f4aa-4f50-46ae-89ec-64982a7b1746")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcFillStyleSelect")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "fillStyles")
	private Set<IfcFillStyleSelect> fillStyles;

	@Description("Indication whether the length measures provided for the presentation style are model based, or draughting based.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE&nbsp; New attribute.  </blockquote>")
	@DataMember(Order = 1)
	@Guid("b8e3fc01-58d7-4b36-9005-6d26c38ffaea")
	@JacksonXmlProperty(isAttribute=true, localName = "modelorDraughting")
	private IfcBoolean modelorDraughting;


	public IfcFillAreaStyle()
	{
	}

	public IfcFillAreaStyle(IfcFillStyleSelect[] fillStyles)
	{
		this.fillStyles = new HashSet<>(Arrays.asList(fillStyles));
	}

	public Set<IfcFillStyleSelect> getFillStyles() {
		return this.fillStyles;
	}

	public IfcBoolean getModelorDraughting() {
		return this.modelorDraughting;
	}

	public void setModelorDraughting(IfcBoolean modelorDraughting) {
		this.modelorDraughting = modelorDraughting;
	}


}

