package lucas.oliveira.criptomoeda.DataClass

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Moedas(
    @SerializedName("asset_id") val asset_id: String,
    @SerializedName("name") val nome: String,
    @SerializedName("price_usd") val preco: Double?,
    @SerializedName("volume_1hrs_usd") val volumeHora: Double,
    @SerializedName("volume_1day_usd") val volumeDia: Double,
    @SerializedName("volume_1mth_usd") val volumeMes: Double
): Parcelable
