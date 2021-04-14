package lucas.oliveira.criptomoeda.Api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MoedaRespostaApi {
    companion object{
        const val URL_BASE = "http://rest-sandbox.coinapi.io/"
    }
    private fun MoedasProvider(): Retrofit = Retrofit.Builder()
        .baseUrl(URL_BASE)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun RetrofitApi(): MoedaApi = MoedasProvider().create(MoedaApi::class.java)
}