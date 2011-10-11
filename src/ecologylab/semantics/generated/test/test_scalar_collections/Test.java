package ecologylab.semantics.generated.test.test_scalar_collections;

import java.util.List;

import ecologylab.net.ParsedURL;
import ecologylab.semantics.metadata.Metadata;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataFloat;
import ecologylab.semantics.metadata.scalar.MetadataInteger;
import ecologylab.semantics.metadata.scalar.MetadataParsedURL;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  Test.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/16/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Test extends Metadata
{
	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataParsedURL aScalar;

	/** 
	 */ 
	@simpl_collection	@mm_name("coll1")
	private List<MetadataParsedURL> coll1;

	/** 
	 */ 
	@simpl_collection	@mm_name("coll2")
	private List<MetadataString> coll2;

	/** 
	 */ 
	@simpl_collection	@mm_name("coll3")
	private List<MetadataInteger> coll3;

	/** 
	 */ 
	@simpl_collection	@mm_name("coll4")
	private List<MetadataInteger> coll4;

	/** 
	 */ 
	@simpl_collection("thing")	@mm_name("coll5")
	private List<MetadataInteger> coll5;

	/** 
	 */ 
	@simpl_collection	@mm_name("coll6")
	private List<MetadataFloat> coll6;

	public Test()
	{ }

	public Test(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public MetadataParsedURL	aScalar()
	{
		MetadataParsedURL	result = this.aScalar;
		if (result == null)
		{
			result = new MetadataParsedURL();
			this.aScalar = result;
		}
		return result;
	}

	public ParsedURL getAScalar()
	{
		return this.aScalar == null ? null : aScalar().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataParsedURL getAScalarMetadata()
	{
		return aScalar;
	}

	public void setAScalar(ParsedURL aScalar)
	{
		if (aScalar != null)
			this.aScalar().setValue(aScalar);
	}

	public void setAScalarMetadata(ecologylab.semantics.metadata.scalar.MetadataParsedURL aScalar)
	{
		this.aScalar = aScalar;
	}

	public List<MetadataParsedURL> getColl1()
	{
		return coll1;
	}

	public void setColl1(List<MetadataParsedURL> coll1)
	{
		this.coll1 = coll1;
	}

	public List<MetadataString> getColl2()
	{
		return coll2;
	}

	public void setColl2(List<MetadataString> coll2)
	{
		this.coll2 = coll2;
	}

	public List<MetadataInteger> getColl3()
	{
		return coll3;
	}

	public void setColl3(List<MetadataInteger> coll3)
	{
		this.coll3 = coll3;
	}

	public List<MetadataInteger> getColl4()
	{
		return coll4;
	}

	public void setColl4(List<MetadataInteger> coll4)
	{
		this.coll4 = coll4;
	}

	public List<MetadataInteger> getColl5()
	{
		return coll5;
	}

	public void setColl5(List<MetadataInteger> coll5)
	{
		this.coll5 = coll5;
	}

	public List<MetadataFloat> getColl6()
	{
		return coll6;
	}

	public void setColl6(List<MetadataFloat> coll6)
	{
		this.coll6 = coll6;
	}
}
