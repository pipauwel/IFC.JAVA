// This file was automatically generated from IFCDOC at https://technical.buildingsmart.org/.
// Very slight modifications were made to made content align with ifcXML reference examples.
// Use this class library to create IFC-compliant (web) applications with XML and JSON data.
// Author: Pieter Pauwels, Eindhoven University of Technology

package com.buildingsmart.tech.ifc.IfcKernel;

import com.buildingsmart.tech.annotations.Description;
import com.buildingsmart.tech.annotations.Guid;
import com.buildingsmart.tech.annotations.Required;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Guid("023ad93b-f1e9-4695-9464-50b0caeabeba")
@JsonIgnoreProperties(ignoreUnknown=true)
public class IfcRelAssociatesLibrary extends IfcRelAssociates
{
	@Description("Reference to a library, from which the definition of the property set is taken.")
	@Required()
	@Guid("4cafd610-1742-487c-a6bf-cf5786b0fc9c")
	private com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLibrarySelect relatingLibrary;


	public IfcRelAssociatesLibrary()
	{
	}

	public IfcRelAssociatesLibrary(String globalId, com.buildingsmart.tech.ifc.IfcKernel.IfcDefinitionSelect[] relatedObjects, com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLibrarySelect relatingLibrary)
	{
		super(globalId, relatedObjects);
		this.relatingLibrary = relatingLibrary;
	}

	public com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLibrarySelect getRelatingLibrary() {
		return this.relatingLibrary;
	}

	public void setRelatingLibrary(com.buildingsmart.tech.ifc.IfcExternalReferenceResource.IfcLibrarySelect relatingLibrary) {
		this.relatingLibrary = relatingLibrary;
	}


}

