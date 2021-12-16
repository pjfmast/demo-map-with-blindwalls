package com.avans.avd.mymap

import com.google.android.gms.maps.model.LatLng
import com.google.gson.annotations.SerializedName

// generated with

fun BlindWallsResponse.toBlindWall(): BlindWall = BlindWall(
	id = id,
	year = year.toInt(),
	name = title.en,
	description = description.en,
	latLng = LatLng(latitude,longitude)
)

data class BlindWallsResponse(

	@field:SerializedName("date")
	val date: Int,

	@field:SerializedName("numberOnMap")
	val numberOnMap: Int,

	@field:SerializedName("images")
	val images: List<ImagesItem>,

	@field:SerializedName("address")
	val address: String,

	@field:SerializedName("year")
	val year: String,

	@field:SerializedName("author")
	val author: String,

	@field:SerializedName("latitude")
	val latitude: Double,

	@field:SerializedName("videoAuthor")
	val videoAuthor: String,

	@field:SerializedName("rating")
	val rating: Double,

	@field:SerializedName("description")
	val description: Description,

	@field:SerializedName("dateModified")
	val dateModified: Int,

	@field:SerializedName("published")
	val published: Int,

	@field:SerializedName("authorID")
	val authorID: Int,

	@field:SerializedName("title")
	val title: Title,

	@field:SerializedName("url")
	val url: Url,

	@field:SerializedName("videoUrl")
	val videoUrl: String,

	@field:SerializedName("material")
	val material: Material,

	@field:SerializedName("photographer")
	val photographer: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("category")
	val category: Category,

	@field:SerializedName("longitude")
	val longitude: Double
)

data class ImagesItem(

	@field:SerializedName("file")
	val file: String,

	@field:SerializedName("type")
	val type: String,

	@field:SerializedName("url")
	val url: String
)

data class Material(

	@field:SerializedName("en")
	val en: String,

	@field:SerializedName("nl")
	val nl: String
)

data class Description(

	@field:SerializedName("en")
	val en: String,

	@field:SerializedName("nl")
	val nl: String
)

data class Category(

	@field:SerializedName("en")
	val en: String,

	@field:SerializedName("id")
	val id: Int,

	@field:SerializedName("nl")
	val nl: String
)

data class Url(

	@field:SerializedName("en")
	val en: String,

	@field:SerializedName("nl")
	val nl: String
)

data class Title(

	@field:SerializedName("en")
	val en: String,

	@field:SerializedName("nl")
	val nl: String
)
