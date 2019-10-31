// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcProductExtension;

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
import com.buildingsmart.tech.ifc.IfcProductExtension.IfcSystem;

@Guid("297645fa-0024-45cd-8573-d15fd241897a")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcZone extends IfcSystem
{
	@Description("Long name for a zone, used for informal purposes. It should be used, if available, in conjunction with the inherited <em>Name</em> attribute.  <blockquote class=\"note\">NOTE&nbsp; In many scenarios the <em>Name</em> attribute refers to the short name or number of a zone, and the <em>LongName</em> refers to the full name.    </blockquote>  </br>    <blockquote class=\"change-ifc2x4\">IFC4 CHANGE The attribute has been added at the end of the entity definition.</blockquote>")
	@Guid("58291dd6-3dbe-48bb-bb0d-0856aa595dd6")
	@JacksonXmlProperty(isAttribute=true, localName = "LongName")
	private String longName;


	public IfcZone()
	{
	}

	public IfcZone(String globalId)
	{
		super(globalId);
	}

	public String getLongName() {
		return this.longName;
	}

	public void setLongName(String longName) {
		this.longName = longName;
	}


}

