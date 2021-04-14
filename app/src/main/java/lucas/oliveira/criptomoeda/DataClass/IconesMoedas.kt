package lucas.oliveira.criptomoeda.DataClass

import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


@Parcelize
data class IconesMoedas(
    @SerializedName("asset_id") val asset_id: String,
    @SerializedName("url") val icone: String?
)
