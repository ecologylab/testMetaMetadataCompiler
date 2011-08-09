package ecologylab.semantics.generated.test.test_inline_mmd;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.generated.test.test_inline_mmd.NewNestedItem;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import java.util.List;
import ecologylab.semantics.generated.test.test_inline_mmd.Item;
import ecologylab.serialization.simpl_inherit;
import ecologylab.serialization.ElementState.xml_tag;

/**
*  Coll2.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/08/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Coll2 extends Item
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataInteger id;

	/** 
	 */ 
	@simpl_composite @mm_name("new_nested_item")	private NewNestedItem newNestedItem;

	public Coll2()
	{ }

	public Coll2(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataInteger	id()
	{
		ecologylab.semantics.metadata.scalar.MetadataInteger	result = this.id;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataInteger();
			this.id = result;
		}
		return result;
	}

	public java.lang.Integer getId()
	{
		return this.id == null ? 0 : id().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataInteger getIdMetadata()
	{
		return id;
	}

	public void setId(java.lang.Integer id)
	{
		if (id != 0)
			this.id().setValue(id);
	}

	public void setIdMetadata(ecologylab.semantics.metadata.scalar.MetadataInteger id)
	{
		this.id = id;
	}

	public NewNestedItem getNewNestedItem()
	{
		return newNestedItem;
	}

	public void setNewNestedItem(NewNestedItem newNestedItem)
	{
		this.newNestedItem = newNestedItem;
	}
}