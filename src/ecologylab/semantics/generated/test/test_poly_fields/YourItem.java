package ecologylab.semantics.generated.test.test_poly_fields;

import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  YourItem.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/16/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class YourItem extends MyItem
{
	/** 
	 * the description of this item.
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataString description;

	public YourItem()
	{ }

	public YourItem(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataString	description()
	{
		MetadataString	result = this.description;
		if (result == null)
		{
			result = new MetadataString();
			this.description = result;
		}
		return result;
	}

	public String getDescription()
	{
		return this.description == null ? null : description().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getDescriptionMetadata()
	{
		return description;
	}

	public void setDescription(String description)
	{
		if (description != null)
			this.description().setValue(description);
	}

	public void setDescriptionMetadata(ecologylab.semantics.metadata.scalar.MetadataString description)
	{
		this.description = description;
	}
}
