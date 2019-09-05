// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import java.util.HashSet;
import java.util.Set;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("5cc95018-83bd-4c3b-ba54-1475cf5cbdb7")
@JsonIgnoreProperties(ignoreUnknown=true)
public abstract class IfcControl extends IfcObject
{
	@JacksonXmlProperty(isAttribute=true, localName = "Identification")
	@Description("An identifying designation given to a control      It is the identifier at the occurrence level.       <blockquote class=\"change-ifc2x4\">IFC4 CHANGE  Attribute unified by promoting from various subtypes of <em>IfcControl</em>.   </blockquote>")
	@Guid("5e07c327-7005-44be-babc-5f04a40d37cd")
	private String identification;

	@Description("Reference to the relationship that associates the control to the object(s) being controlled.")
	@Guid("ace46949-187f-4f1b-b666-1deba88f9136")
	private Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToControl> controls = new HashSet<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToControl>();


	public IfcControl()
	{
	}

	public IfcControl(String globalId)
	{
		super(globalId);
	}

	public String getIdentification() {
		return this.identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public Set<com.buildingsmart.tech.ifc.IfcKernel.IfcRelAssignsToControl> getControls() {
		return this.controls;
	}


}

