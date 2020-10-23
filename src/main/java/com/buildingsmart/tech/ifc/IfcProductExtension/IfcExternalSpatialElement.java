// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.InverseProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Set;

@Guid("0b5b1546-4045-4588-b4c0-6baa80c9ff8b")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcExternalSpatialElement extends IfcExternalSpatialStructureElement implements IfcSpaceBoundarySelect
{
	@Description("Predefined generic types for an external spatial element that are specified in an enumeration. There might be property sets defined specifically for each predefined type.")
	@DataMember(Order = 0)
	@Guid("43d3450a-757d-494d-8906-a3ca0d969a3d")
	@JacksonXmlProperty(isAttribute=true, localName = "predefinedType")
	private IfcExternalSpatialElementTypeEnum predefinedType;

	@Description("Reference to a set of <em>IfcRelSpaceBoundary</em>'s that defines the physical or virtual delimitation of that external spacial element against physical or virtual boundaries.")
	@InverseProperty(InverseProp = "relatingSpace", Range = "IfcRelSpaceBoundary")
	@Guid("d69bec85-7aa3-4a03-86d5-091130682ec1")
	@JacksonXmlProperty(isAttribute = false, localName = "IfcRelSpaceBoundary")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "boundedBy")
	private Set<IfcRelSpaceBoundary> boundedBy;


	public IfcExternalSpatialElement()
	{
	}

	public IfcExternalSpatialElement(String globalId)
	{
		super(globalId);
	}

	public IfcExternalSpatialElementTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcExternalSpatialElementTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}

	public Set<IfcRelSpaceBoundary> getBoundedBy() {
		return this.boundedBy;
	}


}

