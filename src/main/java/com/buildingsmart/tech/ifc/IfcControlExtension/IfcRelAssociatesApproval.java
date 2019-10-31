// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcControlExtension;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcApprovalResource.*;
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates;
import com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect;
import com.buildingsmart.tech.ifc.IfcApprovalResource.IfcApproval;

@Guid("00707e05-63f5-4795-9e7a-2219254df92d")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssociatesApproval extends com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssociates
{
	@Description("Reference to approval that is being applied using this relationship.")
	@Required()
	@Guid("aa4a0a9b-1b67-4b7f-9fae-73e5c2b4d0cb")
	@JacksonXmlProperty(isAttribute=false, localName = "RelatingApproval")
	private IfcApproval relatingApproval;


	public IfcRelAssociatesApproval()
	{
	}

	public IfcRelAssociatesApproval(String globalId, IfcDefinitionSelect[] relatedObjects, IfcApproval relatingApproval)
	{
		super(globalId, relatedObjects);
		this.relatingApproval = relatingApproval;
	}

	public IfcApproval getRelatingApproval() {
		return this.relatingApproval;
	}

	public void setRelatingApproval(IfcApproval relatingApproval) {
		this.relatingApproval = relatingApproval;
	}


}

