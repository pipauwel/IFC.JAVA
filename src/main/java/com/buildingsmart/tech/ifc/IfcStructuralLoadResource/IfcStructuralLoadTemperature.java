// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

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
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoadStatic;

@Guid("a5520d12-ec69-4ee1-85ae-cce5fdfdec16")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadTemperature extends IfcStructuralLoadStatic
{
	@Description("Temperature change which affects the complete section of the structural member, or the uniform portion of a non-uniform temperature change.    <blockquote class=\"note\">NOTE&nbsp; A positive value describes an increase in temperature.  I.e. a positive constant temperature change causes elongation of a member, or compression in the member if there are respective restraints.</blockquote>")
	@Guid("8eed99bf-afb7-4901-987c-79c8f2db4a8f")
	@JacksonXmlProperty(isAttribute=true, localName = "DeltaTConstant")
	private double deltaTConstant;

	@Description("Non-uniform temperature change, specified as the difference of the temperature change at the outer fibre of the positive y direction minus the temperature change at the outer fibre of the negative y direction of the analysis member.    <blockquote class=\"note\">NOTE&nbsp; A positive non-uniform temperature change in y induces a negative curvature of the member about z, or a positive bending moment about z if there are respective restraints.  y and z are local member axes.</blockquote>")
	@Guid("88453b8b-b391-4621-9721-0560f4706228")
	@JacksonXmlProperty(isAttribute=true, localName = "DeltaTY")
	private double deltaTY;

	@Description("Non-uniform temperature change, specified as the difference of the temperature change at the outer fibre of the positive z direction minus the temperature change at the outer fibre of the negative z direction of the analysis member.    <blockquote class=\"note\">NOTE&nbsp; A positive non-uniform temperature change in z induces a positive curvature of the member about y, or a negative bending moment about y if there are respective restraints.  y and z are local member axes.</small></blockquote>")
	@Guid("80c8cbce-08ae-4f55-a98f-2ca70bbc7dd6")
	@JacksonXmlProperty(isAttribute=true, localName = "DeltaTZ")
	private double deltaTZ;


	public IfcStructuralLoadTemperature()
	{
	}

	public double getDeltaTConstant() {
		return this.deltaTConstant;
	}

	public void setDeltaTConstant(double deltaTConstant) {
		this.deltaTConstant = deltaTConstant;
	}

	public double getDeltaTY() {
		return this.deltaTY;
	}

	public void setDeltaTY(double deltaTY) {
		this.deltaTY = deltaTY;
	}

	public double getDeltaTZ() {
		return this.deltaTZ;
	}

	public void setDeltaTZ(double deltaTZ) {
		this.deltaTZ = deltaTZ;
	}


}

