// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.DataMember;
import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLibrarySelect;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

@Guid("023ad93b-f1e9-4695-9464-50b0caeabeba")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssociatesLibrary extends IfcRelAssociates
{
	@Description("Reference to a library, from which the definition of the property set is taken.")
	@DataMember(Order = 0)
	@Required()
	@Guid("4cafd610-1742-487c-a6bf-cf5786b0fc9c")
	@JacksonXmlProperty(isAttribute=true, localName = "relatingLibrary")
	private IfcLibrarySelect relatingLibrary;


	public IfcRelAssociatesLibrary()
	{
	}

	public IfcRelAssociatesLibrary(String globalId, IfcDefinitionSelect[] relatedObjects, IfcLibrarySelect relatingLibrary)
	{
		super(globalId, relatedObjects);
		this.relatingLibrary = relatingLibrary;
	}

	public IfcLibrarySelect getRelatingLibrary() {
		return this.relatingLibrary;
	}

	public void setRelatingLibrary(IfcLibrarySelect relatingLibrary) {
		this.relatingLibrary = relatingLibrary;
	}


}

