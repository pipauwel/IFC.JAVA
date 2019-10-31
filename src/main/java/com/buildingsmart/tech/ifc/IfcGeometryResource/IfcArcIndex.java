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

@Guid("71ff2a67-6250-4d5e-9756-9ffa2c51aec5")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcArcIndex implements IfcSegmentIndexSelect {
	public IfcPositiveInteger value;

	public IfcArcIndex() {
	}

	public IfcArcIndex(IfcPositiveInteger value) {
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

