// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProfileResource;

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
import com.buildingsmart.tech.ifc.IfcProfileResource.*;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcExtendedProperties;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty;
import com.buildingsmart.tech.ifc.IfcProfileResource.IfcProfileDef;

@Guid("ef3b6c2b-9c21-4445-83a4-2fa1d264bc10")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcProfileProperties extends com.buildingsmart.tech.ifc.IfcPropertyResource.IfcExtendedProperties
{
	@Description("Profile definition which is qualified by these properties.")
	@DataMember(Order = 0)
	@Required()
	@Guid("4b5b5752-c860-48e3-a79f-0f0c9379c2c9")
	@JsonIgnore
	private IfcProfileDef profileDefinition;


	public IfcProfileProperties()
	{
	}

	public IfcProfileProperties(IfcProperty[] properties, IfcProfileDef profileDefinition)
	{
		super(properties);
		this.profileDefinition = profileDefinition;
	}

	public IfcProfileDef getProfileDefinition() {
		return this.profileDefinition;
	}

	public void setProfileDefinition(IfcProfileDef profileDefinition) {
		this.profileDefinition = profileDefinition;
	}


}

