package com.example.quranapp_uas.model.SurahModel;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ChaptersItem{

	@SerializedName("pages")
	private List<Integer> pages;

	@SerializedName("name_complex")
	private String nameComplex;

	@SerializedName("translated_name")
	private TranslatedName translatedName;

	@SerializedName("bismillah_pre")
	private boolean bismillahPre;

	@SerializedName("revelation_order")
	private int revelationOrder;

	@SerializedName("verses_count")
	private int versesCount;

	@SerializedName("id")
	private int id;

	@SerializedName("name_simple")
	private String nameSimple;

	@SerializedName("name_arabic")
	private String nameArabic;

	@SerializedName("revelation_place")
	private String revelationPlace;

	public List<Integer> getPages(){
		return pages;
	}

	public String getNameComplex(){
		return nameComplex;
	}

	public TranslatedName getTranslatedName(){
		return translatedName;
	}

	public boolean isBismillahPre(){
		return bismillahPre;
	}

	public int getRevelationOrder(){
		return revelationOrder;
	}

	public int getVersesCount(){
		return versesCount;
	}

	public int getId(){
		return id;
	}

	public String getNameSimple(){
		return nameSimple;
	}

	public String getNameArabic(){
		return nameArabic;
	}

	public String getRevelationPlace(){
		return revelationPlace;
	}

	@Override
 	public String toString(){
		return 
			"ChaptersItem{" + 
			"pages = '" + pages + '\'' + 
			",name_complex = '" + nameComplex + '\'' + 
			",translated_name = '" + translatedName + '\'' + 
			",bismillah_pre = '" + bismillahPre + '\'' + 
			",revelation_order = '" + revelationOrder + '\'' + 
			",verses_count = '" + versesCount + '\'' + 
			",id = '" + id + '\'' + 
			",name_simple = '" + nameSimple + '\'' + 
			",name_arabic = '" + nameArabic + '\'' + 
			",revelation_place = '" + revelationPlace + '\'' + 
			"}";
		}
}