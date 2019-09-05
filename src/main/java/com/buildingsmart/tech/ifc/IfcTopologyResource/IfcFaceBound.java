// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("57c11bcb-98a6-432c-af6d-cb98d7020755")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFaceBound extends IfcTopologicalRepresentationItem
{
	@JacksonXmlProperty(isAttribute=false, localName = "Bound")
	@Description("The loop which will be used as a face boundary.")
	@Required()
	@Guid("851ba2e0-700c-4bb5-b663-1806386b9710")
	private com.buildingsmart.tech.ifc.IfcTopologyResource.IfcLoop bound;

	@JacksonXmlProperty(isAttribute=true, localName = "Orientation")
	@Description("This indicated whether (TRUE) or not (FALSE) the loop has the same sense when used to bound the face as when first defined. If sense is FALSE the senses of all its component oriented edges are implicitly reversed when used in the face.")
	@Required()
	@Guid("8014ce9a-263c-4cf4-84b2-42ab6328c830")
	private Boolean orientation;


	public IfcFaceBound()
	{
	}

	public IfcFaceBound(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcLoop bound, Boolean orientation)
	{
		this.bound = bound;
		this.orientation = orientation;
	}

	public com.buildingsmart.tech.ifc.IfcTopologyResource.IfcLoop getBound() {
		return this.bound;
	}

	public void setBound(com.buildingsmart.tech.ifc.IfcTopologyResource.IfcLoop bound) {
		this.bound = bound;
	}

	public Boolean getOrientation() {
		return this.orientation;
	}

	public void setOrientation(Boolean orientation) {
		this.orientation = orientation;
	}


}

