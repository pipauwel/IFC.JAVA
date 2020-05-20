// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometryResource;

import com.buildingsmart.tech.annotations.*;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@Guid("ba9fc3b6-e728-4ad6-be84-9a7975944d33")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcTrimmedCurve extends IfcBoundedCurve
{
	@Description("The curve to be trimmed. For curves with multiple representations any parameter values given as Trim1 or Trim2 refer to the master representation of the BasisCurve only.")
	@DataMember(Order = 0)
	@Required()
	@Guid("e2455642-0894-4cbf-ba52-1acb4f6c4715")
	@JacksonXmlProperty(isAttribute=false, localName = "basisCurve")
	private IfcCurve basisCurve;

	@Description("The first trimming point which may be specified as a Cartesian point, as a real parameter or both.")
	@DataMember(Order = 1)
	@Required()
	@Guid("58e41bff-104e-4220-bbdf-7b4a2098b9a3")
	@MinLength(1)
	@MaxLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "trim1")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "trim1")
	private Set<IfcTrimmingSelect> trim1;

	@Description("The second trimming point which may be specified as a Cartesian point, as a real parameter or both.")
	@DataMember(Order = 2)
	@Required()
	@Guid("86e14707-9230-456e-b901-560cadf72284")
	@MinLength(1)
	@MaxLength(2)
	@JacksonXmlProperty(isAttribute = false, localName = "trim2")
	@JacksonXmlElementWrapper(useWrapping = true, localName = "trim2")
	private Set<IfcTrimmingSelect> trim2;

	@Description("Flag to indicate whether the direction of the trimmed curve agrees with or is opposed to the direction of the basis curve.")
	@DataMember(Order = 3)
	@Required()
	@Guid("46ffc35f-be5c-4de9-8f14-2900fade3416")
	@JacksonXmlProperty(isAttribute=false, localName = "senseAgreement")
	private IfcBoolean senseAgreement;

	@Description("Where both parameter and point are present at either end of the curve this indicates the preferred form.")
	@DataMember(Order = 4)
	@Required()
	@Guid("fc7412a9-6e7e-4f16-bf76-cb309218dbbb")
	@JacksonXmlProperty(isAttribute=true, localName = "masterRepresentation")
	private IfcTrimmingPreference masterRepresentation;


	public IfcTrimmedCurve()
	{
	}

	public IfcTrimmedCurve(IfcCurve basisCurve, IfcTrimmingSelect[] trim1, IfcTrimmingSelect[] trim2, IfcBoolean senseAgreement, IfcTrimmingPreference masterRepresentation)
	{
		this.basisCurve = basisCurve;
		this.trim1 = new HashSet<>(Arrays.asList(trim1));
		this.trim2 = new HashSet<>(Arrays.asList(trim2));
		this.senseAgreement = senseAgreement;
		this.masterRepresentation = masterRepresentation;
	}

	public IfcCurve getBasisCurve() {
		return this.basisCurve;
	}

	public void setBasisCurve(IfcCurve basisCurve) {
		this.basisCurve = basisCurve;
	}

	public Set<IfcTrimmingSelect> getTrim1() {
		return this.trim1;
	}

	public Set<IfcTrimmingSelect> getTrim2() {
		return this.trim2;
	}

	public IfcBoolean getSenseAgreement() {
		return this.senseAgreement;
	}

	public void setSenseAgreement(IfcBoolean senseAgreement) {
		this.senseAgreement = senseAgreement;
	}

	public IfcTrimmingPreference getMasterRepresentation() {
		return this.masterRepresentation;
	}

	public void setMasterRepresentation(IfcTrimmingPreference masterRepresentation) {
		this.masterRepresentation = masterRepresentation;
	}


}

