package ecologylab.semantics.generated.test.test_other_tags;

import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  MyItem.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/16/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MyItem extends Item
{
	/** 
	 * the ID of this item.
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataInteger id;

	public MyItem()
	{ }

	public MyItem(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataInteger	id()
	{
		MetadataInteger	result = this.id;
		if (result == null)
		{
			result = new MetadataInteger();
			this.id = result;
		}
		return result;
	}

	public Integer getId()
	{
		return this.id == null ? 0 : id().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getIdMetadata()
	{
		return id;
	}

	public void setId(Integer id)
	{
		if (id != 0)
			this.id().setValue(id);
	}

	public void setIdMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger id)
	{
		this.id = id;
	}
}
