// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("301f5c35-1bd3-43f4-8839-f47887d4d763")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcSubedge extends IfcEdge
{
	@Description("The Edge, or Subedge, which contains the Subedge.")
	@DataMember(Order = 0)
	@Required()
	@Guid("4c3df6a8-223d-4e59-9a81-4540065605bc")
	@JacksonXmlProperty(isAttribute=false, localName = "parentEdge")
	private IfcEdge parentEdge;


	public IfcSubedge()
	{
	}

	public IfcSubedge(IfcVertex edgeStart, IfcVertex edgeEnd, IfcEdge parentEdge)
	{
		super(edgeStart, edgeEnd);
		this.parentEdge = parentEdge;
	}

	public IfcEdge getParentEdge() {
		return this.parentEdge;
	}

	public void setParentEdge(IfcEdge parentEdge) {
		this.parentEdge = parentEdge;
	}


}

