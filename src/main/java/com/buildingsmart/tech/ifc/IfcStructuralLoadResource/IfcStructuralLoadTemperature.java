// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralLoadResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcThermodynamicTemperatureMeasure;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("a5520d12-ec69-4ee1-85ae-cce5fdfdec16")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadTemperature extends IfcStructuralLoadStatic
{
	@Description("Temperature change which affects the complete section of the structural member, or the uniform portion of a non-uniform temperature change.    <blockquote class=\"note\">NOTE&nbsp; A positive value describes an increase in temperature.  I.e. a positive constant temperature change causes elongation of a member, or compression in the member if there are respective restraints.</blockquote>")
	@DataMember(Order = 0)
	@Guid("8eed99bf-afb7-4901-987c-79c8f2db4a8f")
	@JacksonXmlProperty(isAttribute=false, localName = "deltaTConstant")
	private IfcThermodynamicTemperatureMeasure deltaTConstant;

	@Description("Non-uniform temperature change, specified as the difference of the temperature change at the outer fibre of the positive y direction minus the temperature change at the outer fibre of the negative y direction of the analysis member.    <blockquote class=\"note\">NOTE&nbsp; A positive non-uniform temperature change in y induces a negative curvature of the member about z, or a positive bending moment about z if there are respective restraints.  y and z are local member axes.</blockquote>")
	@DataMember(Order = 1)
	@Guid("88453b8b-b391-4621-9721-0560f4706228")
	@JacksonXmlProperty(isAttribute=false, localName = "deltaTY")
	private IfcThermodynamicTemperatureMeasure deltaTY;

	@Description("Non-uniform temperature change, specified as the difference of the temperature change at the outer fibre of the positive z direction minus the temperature change at the outer fibre of the negative z direction of the analysis member.    <blockquote class=\"note\">NOTE&nbsp; A positive non-uniform temperature change in z induces a positive curvature of the member about y, or a negative bending moment about y if there are respective restraints.  y and z are local member axes.</small></blockquote>")
	@DataMember(Order = 2)
	@Guid("80c8cbce-08ae-4f55-a98f-2ca70bbc7dd6")
	@JacksonXmlProperty(isAttribute=false, localName = "deltaTZ")
	private IfcThermodynamicTemperatureMeasure deltaTZ;


	public IfcStructuralLoadTemperature()
	{
	}

	public IfcThermodynamicTemperatureMeasure getDeltaTConstant() {
		return this.deltaTConstant;
	}

	public void setDeltaTConstant(IfcThermodynamicTemperatureMeasure deltaTConstant) {
		this.deltaTConstant = deltaTConstant;
	}

	public IfcThermodynamicTemperatureMeasure getDeltaTY() {
		return this.deltaTY;
	}

	public void setDeltaTY(IfcThermodynamicTemperatureMeasure deltaTY) {
		this.deltaTY = deltaTY;
	}

	public IfcThermodynamicTemperatureMeasure getDeltaTZ() {
		return this.deltaTZ;
	}

	public void setDeltaTZ(IfcThermodynamicTemperatureMeasure deltaTZ) {
		this.deltaTZ = deltaTZ;
	}


}

