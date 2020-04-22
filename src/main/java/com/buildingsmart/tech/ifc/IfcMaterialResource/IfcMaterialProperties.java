// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcMaterialResource;

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
import com.buildingsmart.tech.ifc.IfcMaterialResource.*;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcExtendedProperties;
import com.buildingsmart.tech.ifc.IfcPropertyResource.IfcProperty;
import com.buildingsmart.tech.ifc.IfcMaterialResource.IfcMaterialDefinition;

@Guid("707d56d2-d0f4-419a-a790-679333c0e23e")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcMaterialProperties extends com.buildingsmart.tech.ifc.IfcPropertyResource.IfcExtendedProperties
{
	@Description("Reference to the material definition to which the set of properties is assigned.  <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  The datatype has been changed to supertype <em>IfcMaterialDefinition</em>.</blockquote>")
	@DataMember(Order = 0)
	@Required()
	@Guid("1f04c044-1625-4c62-8830-244f32e33e14")
	@JsonIgnore
	private IfcMaterialDefinition material;


	public IfcMaterialProperties()
	{
	}

	public IfcMaterialProperties(IfcProperty[] properties, IfcMaterialDefinition material)
	{
		super(properties);
		this.material = material;
	}

	public IfcMaterialDefinition getMaterial() {
		return this.material;
	}

	public void setMaterial(IfcMaterialDefinition material) {
		this.material = material;
	}


}

