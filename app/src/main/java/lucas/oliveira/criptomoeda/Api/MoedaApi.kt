package lucas.oliveira.criptomoeda.Api

import lucas.oliveira.criptomoeda.DataClass.IconesMoedas
import lucas.oliveira.criptomoeda.DataClass.Moedas
import retrofit2.Call
import retrofit2.http.GET

interface MoedaApi {
    companion object{
        const val API_KEY = "1F8A5E86-F1C9-41C7-B8BB-9DB1B81FDE7C"
        const val ROTA_MOEDAS = "v1/assets/?apikey="
        const val ROTA_ICONE_MOEDAS = "v1/assets/icons/48/?apikey="
    }
    @GET(ROTA_MOEDAS + API_KEY)
    fun pegaTodasMoedas(): Call<Moedas>

    @GET(ROTA_ICONE_MOEDAS + API_KEY)
    fun pegaIconesMoedas(): Call<IconesMoedas>
}