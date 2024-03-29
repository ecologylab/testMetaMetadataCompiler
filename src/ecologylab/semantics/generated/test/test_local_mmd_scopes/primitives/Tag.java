package ecologylab.semantics.generated.test.test_local_mmd_scopes.primitives;

import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  Tag.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 08/08/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Tag extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataParsedURL link;

	/** 
	 */ 
	@simpl_scalar	private ecologylab.semantics.metadata.scalar.MetadataString tagName;

	public Tag()
	{ }

	public Tag(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public ecologylab.semantics.metadata.scalar.MetadataParsedURL	link()
	{
		ecologylab.semantics.metadata.scalar.MetadataParsedURL	result = this.link;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataParsedURL();
			this.link = result;
		}
		return result;
	}

	public ecologylab.net.ParsedURL getLink()
	{
		return this.link == null ? null : link().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getLinkMetadata()
	{
		return link;
	}

	public void setLink(ecologylab.net.ParsedURL link)
	{
		if (link != null)
			this.link().setValue(link);
	}

	public void setLinkMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL link)
	{
		this.link = link;
	}

	public ecologylab.semantics.metadata.scalar.MetadataString	tagName()
	{
		ecologylab.semantics.metadata.scalar.MetadataString	result = this.tagName;
		if (result == null)
		{
			result = new ecologylab.semantics.metadata.scalar.MetadataString();
			this.tagName = result;
		}
		return result;
	}

	public java.lang.String getTagName()
	{
		return this.tagName == null ? null : tagName().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getTagNameMetadata()
	{
		return tagName;
	}

	public void setTagName(java.lang.String tagName)
	{
		if (tagName != null)
			this.tagName().setValue(tagName);
	}

	public void setTagNameMetadata(ecologylab.semantics.metadata.scalar.MetadataString tagName)
	{
		this.tagName = tagName;
	}
}
