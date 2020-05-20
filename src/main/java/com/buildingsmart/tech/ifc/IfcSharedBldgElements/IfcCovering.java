// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcSharedBldgElements;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("71cd9964-d26e-4857-81b8-de24c4651a85")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCovering extends com.buildingsmart.tech.ifc.IfcProductExtension.IfcBuildingElement
{
	@Description("Predefined types to define the particular type of the covering. There may be property set definitions available for each predefined type.  <blockquote class=\"note\">NOTE&nbsp; The <em>PredefinedType</em> shall only be used, if no <em>IfcCoveringType</em> is assigned, providing its own <em>IfcCoveringType.PredefinedType</em>.</blockquote>")
	@DataMember(Order = 0)
	@Guid("1c0df8fd-2a8e-4b75-a68e-22fa8c279270")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcCoveringTypeEnum predefinedType;

	@Description("Reference to the objectified relationship that handles the relationship of the covering to the covered space.")
	@InverseProperty(InverseProp = "relatedCoverings", Range = "IfcRelCoversSpaces")
	@Guid("84a19b72-c5f8-40f0-8380-e4989bb7d407")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelCoversSpaces")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "coversSpaces")
	private Set<IfcRelCoversSpaces> coversSpaces;

	@Description("Reference to the objectified relationship that handles the relationship of the covering to the covered element.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Renamed into <em>CoversElements</em> for consistency.  </blockquote>")
	@InverseProperty(InverseProp = "relatedCoverings", Range = "IfcRelCoversBldgElements")
	@Guid("1e41a6ca-9e36-4047-a656-34a282811332")
	@MaxLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelCoversBldgElements")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "coversElements")
	private Set<IfcRelCoversBldgElements> coversElements;


	public IfcCovering()
	{
	}

	public IfcCovering(String globalId)
	{
		super(globalId);
	}

	public IfcCoveringTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCoveringTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public Set<IfcRelCoversSpaces> getCoversSpaces() {
		return this.coversSpaces;
	}

	public Set<IfcRelCoversBldgElements> getCoversElements() {
		return this.coversElements;
	}


}

