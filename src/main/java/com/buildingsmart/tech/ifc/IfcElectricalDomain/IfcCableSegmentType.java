// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcElectricalDomain;

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
import com.buildingsmart.tech.ifc.IfcElectricalDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegmentType;
import com.buildingsmart.tech.ifc.IfcElectricalDomain.IfcCableSegmentTypeEnum;

@Guid("6ed8eee1-4ef5-4084-99db-457ee2e6431a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcCableSegmentType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowSegmentType
{
	@Description("<p>Identifies the predefined types of cable segment from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("5eb0680e-2b1f-4c6a-83ec-db45bf36cf4e")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcCableSegmentTypeEnum predefinedType;


	public IfcCableSegmentType()
	{
	}

	public IfcCableSegmentType(String globalId, IfcCableSegmentTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcCableSegmentTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcCableSegmentTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

