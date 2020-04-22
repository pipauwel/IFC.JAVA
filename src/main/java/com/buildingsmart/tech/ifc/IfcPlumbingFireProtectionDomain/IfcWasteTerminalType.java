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
import com.buildingsmart.tech.ifc.IfcPlumbingFireProtectionDomain.IfcWasteTerminalTypeEnum;

@Guid("a41c4b68-c443-4fc5-a984-4eae4fc24095")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcWasteTerminalType extends com.buildingsmart.tech.ifc.IfcSharedBldgServiceElements.IfcFlowTerminalType
{
	@Description("<p>Identifies the predefined types of waste terminal from which the type required may be set.</p>")
	@DataMember(Order = 0)
	@Required()
	@Guid("05691f1a-3bf0-4b94-ae78-7597ca8e8eaa")
	@JacksonXmlProperty(isAttribute=true, localName = "PredefinedType")
	private IfcWasteTerminalTypeEnum predefinedType;


	public IfcWasteTerminalType()
	{
	}

	public IfcWasteTerminalType(String globalId, IfcWasteTerminalTypeEnum predefinedType)
	{
		super(globalId);
		this.predefinedType = predefinedType;
	}

	public IfcWasteTerminalTypeEnum getPredefinedType() {
		return this.predefinedType;
	}

	public void setPredefinedType(IfcWasteTerminalTypeEnum predefinedType) {
		this.predefinedType = predefinedType;
	}


}

