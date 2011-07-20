package ecologylab.semantics.generated.test.test_inline_mmd;

import ecologylab.serialization.ElementState.xml_other_tags;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.Hint;
import ecologylab.serialization.simpl_inherit;
import ecologylab.net.ParsedURL;
import ecologylab.semantics.generated.test.test_inline_mmd.MmdInlineNestedItemInMmdInlineItemInCollInTestBase;
import java.util.List;
import ecologylab.serialization.ElementState.xml_tag;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.Metadata;

/**
*  MmdInlineItemInCollInTestBase.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 07/19/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class MmdInlineItemInCollInTestBase extends Metadata
{
	/** 
	 */ 
	@simpl_composite @mm_name("nested_item")	private MmdInlineNestedItemInMmdInlineItemInCollInTestBase nestedItem;

	/** 
	 */ 
	@simpl_scalar	private MetadataParsedURL link;

	public MmdInlineItemInCollInTestBase()
	{ }

	public MmdInlineItemInCollInTestBase(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MmdInlineNestedItemInMmdInlineItemInCollInTestBase getNestedItem()
	{
		return nestedItem;
	}

	public void setNestedItem(MmdInlineNestedItemInMmdInlineItemInCollInTestBase nestedItem)
	{
		this.nestedItem = nestedItem;
	}

	public MetadataParsedURL	link()
	{
		MetadataParsedURL	result = this.link;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.link = result;
		}
		return result;
	}

	public ParsedURL getLink()
	{
		return this.link().getValue();
	}

	public MetadataParsedURL getLinkMetadata()
	{
		return link;
	}

	public void setLink(ParsedURL link)
	{
		this.link().setValue(link);
	}

	public void setLinkMetadata(MetadataParsedURL link)
	{
		this.link = link;
	}
}
