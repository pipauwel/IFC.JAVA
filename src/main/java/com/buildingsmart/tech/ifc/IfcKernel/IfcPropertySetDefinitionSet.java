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
import com.buildingsmart.tech.ifc.IfcKernel.IfcPropertySetDefinition;

@Guid("d5a72992-5672-4281-bb31-ce25d74519d4")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcPropertySetDefinitionSet implements IfcPropertySetDefinitionSelect {
	public IfcPropertySetDefinition value;

	public IfcPropertySetDefinitionSet() {
	}

	public IfcPropertySetDefinitionSet(IfcPropertySetDefinition value) {
		this();
		this.value = value;
	}

	public IfcPropertySetDefinition getValue() {
		return this.value;
	}

	public void setValue(IfcPropertySetDefinition value) {
		this.value = value;
	}
}

