// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.ifc.IfcMeasureResource.IfcBoolean;
import com.buildingsmart.tech.ifc.IfcRepresentationResource.IfcGlobalOrLocalEnum;
import com.buildingsmart.tech.ifc.IfcStructuralLoadResource.IfcStructuralLoad;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("773e5eda-f463-41ec-a0f4-14681750a780")
@JsonIgnoreProperties(ignoreUnknown=true)
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonSubTypes({@JsonSubTypes.Type(value = IfcStructuralCurveAction.class, name = "IfcStructuralCurveAction"), @JsonSubTypes.Type(value = IfcStructuralPointAction.class, name = "IfcStructuralPointAction"), @JsonSubTypes.Type(value = IfcStructuralSurfaceAction.class, name = "IfcStructuralSurfaceAction")})
public abstract class IfcStructuralAction extends IfcStructuralActivity
{
	@Description("Indicates if this action may cause a stability problem. If it is 'FALSE', no further investigations regarding stability problems are necessary.")
	@DataMember(Order = 0)
	@Guid("7e7162c0-17e9-4165-9c29-294aefb1216b")
	@JacksonXmlProperty(isAttribute=false, localName = "destabilizingLoad")
	private IfcBoolean destabilizingLoad;


	public IfcStructuralAction()
	{
	}

	public IfcStructuralAction(String globalId, IfcStructuralLoad appliedLoad, IfcGlobalOrLocalEnum globalOrLocal)
	{
		super(globalId, appliedLoad, globalOrLocal);
	}

	public IfcBoolean getDestabilizingLoad() {
		return this.destabilizingLoad;
	}

	public void setDestabilizingLoad(IfcBoolean destabilizingLoad) {
		this.destabilizingLoad = destabilizingLoad;
	}


}

