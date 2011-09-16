package ecologylab.semantics.generated.test.test_poly_fields;

import java.util.List;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;

/**
*  Base.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/16/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Base extends Metadata
{
	/** 
	 * the first item of this collection.
	 */ 
	@simpl_composite	@mm_name("first_item")
	private Item firstItem;

	/** 
	 * the collection of items.
	 */ 
	@simpl_collection("item")	@mm_name("items")
	private List<Item> items;

	public Base()
	{ }

	public Base(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public Item getFirstItem()
	{
		return firstItem;
	}

	public void setFirstItem(Item firstItem)
	{
		this.firstItem = firstItem;
	}

	public List<Item> getItems()
	{
		return items;
	}

	public void setItems(List<Item> items)
	{
		this.items = items;
	}
}
