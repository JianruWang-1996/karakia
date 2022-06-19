package com.example.karakiaapp.ui.home

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import android.view.*
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.karakiaapp.R
import com.example.karakiaapp.ui.karakia.KarakiaData
import com.example.karakiaapp.ui.karakia.KarakiaAdapter
import com.example.karakiaapp.ui.karakia.StaticValue
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : Fragment() {
    private val exampleList = generateList(5)
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }
    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)

        home_start.apply {
            layoutManager = LinearLayoutManager(activity)
            adapter = KarakiaAdapter(exampleList)
        }
    }

    private fun generateList(size: Int): ArrayList<KarakiaData> {
        val karakiStringList = ArrayList<KarakiaData>()
        karakiStringList.add(
            KarakiaData(
                1,
                "Opening\nOne",
                "Karakia \nTimatanga",
                R.drawable.opening1,
                        "\nTōia mai ngā tauira\n" +
                        "Tōia mai ngā kaimahi\n" +
                        "Tōia mai ngā tāngata\n" +
                        " nō ngā hau e whā\n" +
                        "Tōia mai i runga i te aroha me te\n" +
                        "rangimārie\n" +
                        "\nKia mau, kia ita\n" +
                        "Haumi e, hui e\n" +
                        "Taiki e!\n",
                        "\nDraw forward our learners\n" +
                        "Draw forward our staff\n" +
                        "Draw forward the many\n " +
                        "people from the\n" +
                        "four corners of the world\n" +
                        "Draw them forward under the mantle of\n" +
                        "love and peace\n" +
                        "\nLet us remain steadfast to these words!",
                R.raw.brunomars,

            )
        )
        karakiStringList.add(
            KarakiaData(
                2,
                "Opening\nTwo",
                "Karakia \nTimatanga",
                R.drawable.opening2,
                        "\nWhakataka te hau ki te uru,\n" +
                        "Whakataka te hau ki te tonga.\n" +
                        "\nKia makinakina ki uta,\n" +
                        "Kia mataratara ki tai.\n" +
                        "\nE hi ake ana te atakura\n" +
                        "he tio, he huka, he hauhunga.\n" +
                        "\nHaumi e! Hui e! Taiki e!",
                        "\nThe wind swings to the west\n" +
                        "then turns into a southerly.\n" +
                        "\nmaking it prickly cold inland,\n" +
                        "and piercingly cold on the coast.\n" +
                        "\nMay the dawn rise red-tipped\n" +
                        "on ice, on snow, on frost.\n" +
                        "\nJoin! Gather! Intertwine!",
                R.raw.brunomars

            )
        )
        karakiStringList.add(
            KarakiaData(
                3,
                "Blessing\nfor food",
                "Karakia ki \nte kai",
                R.drawable.blessing,
                        "\n\nE te Atua\n" +
                        "Whakapainga ēnei kai\n" +
                        "Hei oranga mō ō mātou tinana\n" +
                        "Whāngaia hoki ō mātou\n" +
                        "wairua ki te taro\n" +
                        "o te ora\n" +
                        "\nKo Ihu Karaiti tō mātou Ariki\n" +
                        "Ake, ake, ake\n" +
                        "Amine",
                        "\n\nLord God\n" +
                        "Bless this food\n" +
                        "For the goodness of our bodies\n" +
                        "Feeding our spiritual needs\n" +
                        "also with " +
                        "the bread of life\n" +
                        "\nJesus Christ, our Lord\n" +
                        "For ever and ever\n" +
                        "Amen\n",
                R.raw.brunomars
            )
        )
        karakiStringList.add(
            KarakiaData(
                4,
                "Closing\nOne",
                "Karakia \n" +
                        "Whakamutunga",
                R.drawable.closing1,
                        "\n\nKia tau ki ā tātou katoa\n" +
                        "Te atawhai o tō tātou Ariki\n" +
                        "ā Ihu Karaiti\n" +
                        "\nMe te aroha o te Atua\n" +
                        "Me te whiwhinga tahitanga\n" +
                        "Ki te Wairua Tapu\n" +
                        "\nĀke, ake, ake \n" +
                        "Āmine ",
                        "\n\nMay the grace of the Lord\n" +
                        " Jesus Christ\n" +
                        "\nAnd the love of God and the fellowship\n" +
                        "of the Holy Spirit Be with you all\n" +
                        "\nforever and ever,\n" +
                        "Amen",
                R.raw.brunomars
            )
        )
        karakiStringList.add(
            KarakiaData(
                5,
                "Closing\nTwo",
                "Karakia \nWhakamutunga",
                R.drawable.closing2,
                        "\n\n\nHe hōnore, he korōria\n" +
                        "Maungārongo ki te whenua.\n" +
                        "Whakaaro pai e\n" +
                        "Kingā tangata katoa\n\n" +
                        "Ake, ake, ake.\n" +
                        "Āmine\n",
                        "\n\n\nHonour, glory and\n" +
                        "peace to the land.\n" +
                        "May good thoughts come\n" +
                        "to all men\n\n" +
                        "for ever and ever.\n" +
                        "Amen.",
                R.raw.brunomars
            )
        )
        return karakiStringList
    }

    override fun onDestroyView() {
        super.onDestroyView()
    }
}