package com.kimjio.shannonmodemtweaks.tweaks.nvitems.ims.kt

import android.os.Parcelable
import com.kimjio.shannonmodemtweaks.R
import com.kimjio.shannonmodemtweaks.tweaks.nvitems.NvItem
import com.kimjio.shannonmodemtweaks.tweaks.nvitems.NvItemTweak
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

@Parcelize
class KTVoLTESupport : NvItemTweak(), Parcelable {
    @IgnoredOnParcel
    override val name = "KT TTA-VoLTE support (SIM1)"

    @IgnoredOnParcel
    override val nameResId = R.string.sim_1_tta_volte_support

    @IgnoredOnParcel
    override val descriptionResId = R.string.kt_sim_1_tta_volte_support_desc

    override val nvItems: List<NvItem>
        get() =
            listOf(
                NvItem(id = "PSS.AIMS.Payload-AMRWB", value = "62"),
                NvItem(id = "PSS.AIMS.Payload-AMRWB", index = 1, value = "61"),
                NvItem(id = "PSS.AIMS.Payload-AMRNB", value = "65"),
                NvItem(id = "PSS.AIMS.Payload-AMRNB", index = 1, value = "64"),
                NvItem(id = "PSS.AIMS.Payload-DTMF", value = "66"),
                NvItem(id = "PSS.AIMS.Payload-DTMF.WB", value = "63"),
                NvItem(id = "PSS.AIMS.Audio.Media.RR", value = "20,03,00,00"),
            )
}
