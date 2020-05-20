// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ffc10785-4b8a-40de-a1a6-87a49ef4ff7f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMappedItem extends IfcRepresentationItem
{
	@Description("A representation map that is the source of the mapped item. It can be seen as a block (or cell or marco) definition.")
	@DataMember(Order = 0)
	@Required()
	@Guid("cd257a83-e226-4903-80bc-2796c5527e23")
	@JacksonXmlProperty(isAttribute=false, localName = "mappingSource")
	private IfcRepresentationMap mappingSource;

	@Description("A representation item that is the target onto which the mapping source is mapped. It is constraint to be a Cartesian transformation operator.")
	@DataMember(Order = 1)
	@Required()
	@Guid("4720b58a-30bb-4228-b4e7-431660ea2b25")
	@JacksonXmlProperty(isAttribute=false, localName = "mappingTarget")
	private IfcCartesianTransformationOperator mappingTarget;


	public IfcMappedItem()
	{
	}

	public IfcMappedItem(IfcRepresentationMap mappingSource, IfcCartesianTransformationOperator mappingTarget)
	{
		this.mappingSource = mappingSource;
		this.mappingTarget = mappingTarget;
	}

	public IfcRepresentationMap getMappingSource() {
		return this.mappingSource;
	}

	public void setMappingSource(IfcRepresentationMap mappingSource) {
		this.mappingSource = mappingSource;
	}

	public IfcCartesianTransformationOperator getMappingTarget() {
		return this.mappingTarget;
	}

	public void setMappingTarget(IfcCartesianTransformationOperator mappingTarget) {
		this.mappingTarget = mappingTarget;
	}


}

