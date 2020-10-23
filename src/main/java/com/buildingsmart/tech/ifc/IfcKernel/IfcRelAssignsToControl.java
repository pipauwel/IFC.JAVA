// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("142af641-3046-4e25-8652-dbf0d05c61da")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssignsToControl extends IfcRelAssigns
{
	@Description("Reference to the <em>IfcControl</em> that applies a control upon objects.")
	@DataMember(Order = 0)
	@Required()
	@Guid("e7033623-d7b9-406d-8aae-46c7501560e6")
	@JacksonXmlProperty(isAttribute=false, localName = "relatingControl")
	private IfcControl relatingControl;


	public IfcRelAssignsToControl()
	{
	}

	public IfcRelAssignsToControl(String globalId, IfcObjectDefinition[] relatedObjects, IfcControl relatingControl)
	{
		super(globalId, relatedObjects);
		this.relatingControl = relatingControl;
	}

	public IfcControl getRelatingControl() {
		return this.relatingControl;
	}

	public void setRelatingControl(IfcControl relatingControl) {
		this.relatingControl = relatingControl;
	}


}

