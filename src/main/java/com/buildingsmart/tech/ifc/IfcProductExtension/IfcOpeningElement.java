// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import java.util.Set;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("20f5b3eb-0852-4587-a1e1-bb91ca98bc61")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "Class")
@JsonSubTypes(@JsonSubTypes.Type(value = IfcOpeningStandardCase.class, name = "IfcOpeningStandardCase"))
public class IfcOpeningElement extends IfcFeatureElementSubtraction
{
	@Description("Predefined generic type for an opening that is specified in an enumeration. There may be a property set given specificly for the predefined types.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The attribute has been added at the end of the entity definition.</blockquote>")
	@DataMember(Order = 0)
	@Guid("6367f4bf-61d9-41b7-8019-be8f7f63fc6b")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcOpeningElementTypeEnum predefinedType;

	@Description("Reference to the Filling Relationship that is used to assign Elements as Fillings for this Opening Element. The Opening Element can be filled with zero-to-many Elements.")
	@Guid("16a97fe9-fc69-447a-8c26-9004dcc23f09")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelFillsElement")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "HasFillings")
	private Set<IfcRelFillsElement> hasFillings;


	public IfcOpeningElement()
	{
	}

	public IfcOpeningElement(String globalId)
	{
		super(globalId);
	}

	public IfcOpeningElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcOpeningElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public Set<IfcRelFillsElement> getHasFillings() {
		return this.hasFillings;
	}


}

