package model.GeoModel

import kotlinx.serialization.Serializable

@Serializable
data class AddressElement(
    val code: String,
    val longName: String,
    val shortName: String,
    val types: List<String>
)