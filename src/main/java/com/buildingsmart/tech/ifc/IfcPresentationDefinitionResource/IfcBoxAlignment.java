// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcPresentationDefinitionResource;

import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("0b2a355f-5bc6-4926-8828-c5be74ed5763")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcBoxAlignment {
	public String value;

	public IfcBoxAlignment() {
	}

	public IfcBoxAlignment(String value) {
		this();
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}
}

