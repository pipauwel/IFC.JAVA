// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcTopologyResource;

import com.buildingsmart.tech.annotations.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Guid("1642dee1-9c3d-416b-86a9-db23ccf926ae")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcEdgeLoop extends IfcLoop
{
	@Description("A list of oriented edge entities which are concatenated together to form this path.")
	@DataMember(Order = 0)
	@Required()
	@Guid("c9c4cf69-72a6-4bc9-862b-5518de6b066a")
	@MinLength(1)
	@JacksonXmlProperty(isAttribute = false, localName = "IfcOrientedEdge")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "edgeList")
	private List<IfcOrientedEdge> edgeList;


	public IfcEdgeLoop()
	{
	}

	public IfcEdgeLoop(IfcOrientedEdge[] edgeList)
	{
		this.edgeList = new ArrayList<>(Arrays.asList(edgeList));
	}

	public List<IfcOrientedEdge> getEdgeList() {
		return this.edgeList;
	}

	@JsonIgnore
	public int getNe() {
		//Ne:=SIZEOF(EdgeList)
		return edgeList.size();
	}


}

