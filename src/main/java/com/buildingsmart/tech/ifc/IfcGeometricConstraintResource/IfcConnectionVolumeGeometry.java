// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcGeometricConstraintResource;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("0b7a3b78-5844-48d7-8cfa-af35fa085e67")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcConnectionVolumeGeometry extends IfcConnectionGeometry
{
	@Description("Volume at which related object overlaps with the relating element, given in the LCS of the relating element.")
	@DataMember(Order = 0)
	@Required()
	@Guid("15482933-e8d6-4fdc-8aa5-0c86ed3683c2")
	@JacksonXmlProperty(isAttribute=true, localName = "volumeOnRelatingElement")
	private IfcSolidOrShell volumeOnRelatingElement;

	@Description("Volume at which related object overlaps with the relating element, given in the LCS of the related element.")
	@DataMember(Order = 1)
	@Guid("1c4e6b3f-9598-409d-8501-73b5069bbf15")
	@JacksonXmlProperty(isAttribute=true, localName = "volumeOnRelatedElement")
	private IfcSolidOrShell volumeOnRelatedElement;


	public IfcConnectionVolumeGeometry()
	{
	}

	public IfcConnectionVolumeGeometry(IfcSolidOrShell volumeOnRelatingElement)
	{
		this.volumeOnRelatingElement = volumeOnRelatingElement;
	}

	public IfcSolidOrShell getVolumeOnRelatingElement() {
		return this.volumeOnRelatingElement;
	}

	public void setVolumeOnRelatingElement(IfcSolidOrShell volumeOnRelatingElement) {
		this.volumeOnRelatingElement = volumeOnRelatingElement;
	}

	public IfcSolidOrShell getVolumeOnRelatedElement() {
		return this.volumeOnRelatedElement;
	}

	public void setVolumeOnRelatedElement(IfcSolidOrShell volumeOnRelatedElement) {
		this.volumeOnRelatedElement = volumeOnRelatedElement;
	}


}

