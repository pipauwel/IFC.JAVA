// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

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
import com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToGroup;
import com.buildingsmart.tech.ifc.IfcKernel.IfcObjectDefinition;
import com.buildingsmart.tech.ifc.IfcKernel.IfcGroup;

@Guid("0ae997a0-8ed2-4ce0-aaf7-1b4d33ce64bb")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssignsToGroupByFactor extends IfcRelAssignsToGroup
{
	@Description("Factor provided as a ratio measure that identifies the fraction or weighted factor that applies to the group assignment.")
	@Required()
	@Guid("86db296d-a43f-4cfa-a264-7820e7638718")
	@JacksonXmlProperty(isAttribute=true, localName = "Factor")
	private double factor;


	public IfcRelAssignsToGroupByFactor()
	{
	}

	public IfcRelAssignsToGroupByFactor(String globalId, IfcObjectDefinition[] relatedObjects, IfcGroup relatingGroup, double factor)
	{
		super(globalId, relatedObjects, relatingGroup);
		this.factor = factor;
	}

	public double getFactor() {
		return this.factor;
	}

	public void setFactor(double factor) {
		this.factor = factor;
	}


}

