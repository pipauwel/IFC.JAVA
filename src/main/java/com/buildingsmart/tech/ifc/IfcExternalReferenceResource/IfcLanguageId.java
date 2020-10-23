// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcExternalReferenceResource;

import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcIdentifier;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("e7bc798b-f213-4320-9b4c-1bab121f3533")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcLanguageId extends IfcIdentifier {

	public IfcLanguageId() {
		super();
	}

	public IfcLanguageId(String value) {
		super(value);
	}
}

