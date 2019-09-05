// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("ffc10785-4b8a-40de-a1a6-87a49ef4ff7f")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMappedItem extends IfcRepresentationItem
{
	@JacksonXmlProperty(isAttribute=false, localName = "MappingSource")
	@Description("A representation map that is the source of the mapped item. It can be seen as a block (or cell or marco) definition.")
	@Required()
	@Guid("cd257a83-e226-4903-80bc-2796c5527e23")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationMap mappingSource;

	@JacksonXmlProperty(isAttribute=false, localName = "MappingTarget")
	@Description("A representation item that is the target onto which the mapping source is mapped. It is constraint to be a Cartesian transformation operator.")
	@Required()
	@Guid("4720b58a-30bb-4228-b4e7-431660ea2b25")
	private com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator mappingTarget;


	public IfcMappedItem()
	{
	}

	public IfcMappedItem(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationMap mappingSource, com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator mappingTarget)
	{
		this.mappingSource = mappingSource;
		this.mappingTarget = mappingTarget;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationMap getMappingSource() {
		return this.mappingSource;
	}

	public void setMappingSource(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcRepresentationMap mappingSource) {
		this.mappingSource = mappingSource;
	}

	public com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator getMappingTarget() {
		return this.mappingTarget;
	}

	public void setMappingTarget(com.buildingsmart.tech.ifc.IfcGeometryResource.IfcCartesianTransformationOperator mappingTarget) {
		this.mappingTarget = mappingTarget;
	}


}

