// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

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
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcPositiveInteger;

@Guid("0590099d-fe4d-40ba-ae80-71803e5902d0")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLineIndex implements IfcSegmentIndexSelect {
	public IfcPositiveInteger value;

	public IfcLineIndex() {
	}

	public IfcLineIndex(IfcPositiveInteger value) {
		this();
		this.value = value;
	}

	public IfcPositiveInteger getValue() {
		return this.value;
	}

	public void setValue(IfcPositiveInteger value) {
		this.value = value;
	}
}

