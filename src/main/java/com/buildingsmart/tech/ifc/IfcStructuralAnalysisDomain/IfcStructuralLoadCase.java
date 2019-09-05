// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain;

import java.util.ArrayList;
import java.util.List;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.MaxLength;
import com.buildingsmart.tech.annotations.MinLength;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("871e330e-8ed0-4616-a02e-30f47359e854")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcStructuralLoadCase extends IfcStructuralLoadGroup
{
	@JacksonXmlProperty(isAttribute=true, localName = "SelfWeightCoefficients")
	@Description("The self weight coefficients specify ratios at which loads due to weight of members shall be included in the load case.  These loads are not explicitly modeled as instances of <em>IfcStructuralAction</em>.  Instead they shall be calculated according to geometry, section, and material of each member.    <p>The three components of the self weight vector correspond with the x,y,z directions of the so-called global coordinates, i.e. the directions of the shared <em>ObjectPlacement</em> of all items in an <em>IfcStructuralAnalysisModel</em>.  For example, if the object placement defines a z axis which is upright like the <em>IfcProject</em>'s world coordinate system, then the self weight coefficients would typically be [0.,0.,-1.] in a load case of dead loads with self weight.</p>    <p>The overall coefficient in the inherited attribute <em>Coefficient</em> shall not be applied to <em>SelfWeightCoefficients</em> of the same instance of <em>IfcStructuralLoadCase</em>.  It only applies to actions and load groups which are grouped below the load case, not to the load case's computed self weight.")
	@MinLength(3)
	@MaxLength(3)
	@Guid("4ba882d2-5521-43ac-909e-201ef5a200ad")
	private List<Double> selfWeightCoefficients = new ArrayList<Double>();


	public IfcStructuralLoadCase()
	{
	}

	public IfcStructuralLoadCase(String globalId, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcLoadGroupTypeEnum predefinedType, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcActionTypeEnum actionType, com.buildingsmart.tech.ifc.IfcStructuralAnalysisDomain.IfcActionSourceTypeEnum actionSource)
	{
		super(globalId, predefinedType, actionType, actionSource);
	}

	public List<Double> getSelfWeightCoefficients() {
		return this.selfWeightCoefficients;
	}


}

