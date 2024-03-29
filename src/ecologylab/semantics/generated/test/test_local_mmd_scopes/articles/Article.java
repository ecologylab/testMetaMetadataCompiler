package ecologylab.semantics.generated.test.test_local_mmd_scopes.articles;

import java.util.List;

import ecologylab.semantics.metadata.builtins.Document;
import ecologylab.semantics.metadata.mm_name;
import ecologylab.semantics.metadata.scalar.MetadataString;
import ecologylab.semantics.metametadata.MetaMetadataCompositeField;
import ecologylab.serialization.annotations.simpl_collection;
import ecologylab.serialization.annotations.simpl_composite;
import ecologylab.serialization.annotations.simpl_inherit;
import ecologylab.serialization.annotations.simpl_scalar;

/**
*  Article.java
*  s.im.pl serialization
*
*  Generated by JavaTranslator on 09/16/11.
*  Copyright 2011 Interface Ecology Lab. 
*/

/** 
 */ 
@simpl_inherit
public class Article extends Document
{
	/** 
	 */ 
	@simpl_collection("author")	@mm_name("authors")
	private List<Author> authors;

	/** 
	 * Metadata related to where an article is published.
	 */ 
	@simpl_composite	@mm_name("source")
	private Source source;

	/** 
	 * for debug.
	 */ 
	@simpl_collection("test_article")	@mm_name("test_articles")
	private List<TestArticle> testArticles;

	/** 
	 */ 
	@simpl_scalar	
	private ecologylab.semantics.metadata.scalar.MetadataString pages;

	public Article()
	{ }

	public Article(MetaMetadataCompositeField mmd) {
		super(mmd);
	}


	public List<Author> getAuthors()
	{
		return authors;
	}

	public void setAuthors(List<Author> authors)
	{
		this.authors = authors;
	}

	public Source getSource()
	{
		return source;
	}

	public void setSource(Source source)
	{
		this.source = source;
	}

	public List<TestArticle> getTestArticles()
	{
		return testArticles;
	}

	public void setTestArticles(List<TestArticle> testArticles)
	{
		this.testArticles = testArticles;
	}

	public MetadataString	pages()
	{
		MetadataString	result = this.pages;
		if (result == null)
		{
			result = new MetadataString();
			this.pages = result;
		}
		return result;
	}

	public String getPages()
	{
		return this.pages == null ? null : pages().getValue();
	}

	public ecologylab.semantics.metadata.scalar.MetadataString getPagesMetadata()
	{
		return pages;
	}

	public void setPages(String pages)
	{
		if (pages != null)
			this.pages().setValue(pages);
	}

	public void setPagesMetadata(ecologylab.semantics.metadata.scalar.MetadataString pages)
	{
		this.pages = pages;
	}
}
