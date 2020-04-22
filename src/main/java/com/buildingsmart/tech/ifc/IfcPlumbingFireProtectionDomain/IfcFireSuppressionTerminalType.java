// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain;

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
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.*;
import com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType;
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcFireSuppressionTerminalTypeEnum;

@Guid("61aa9c11-fe11-4bd6-b0d1-5cec357310f0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcFireSuppressionTerminalType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@Description("<p>Identifies the predefined types of fire suppression terminal from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("4dcf5d7d-ae7c-4c89-b98c-071cebaed9a0")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcFireSuppressionTerminalTypeEnum predefinedType;


	public IfcFireSuppressionTerminalType()
	{
	}

	public IfcFireSuppressionTerminalType(String globalId, IfcFireSuppressionTerminalTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcFireSuppressionTerminalTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcFireSuppressionTerminalTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

