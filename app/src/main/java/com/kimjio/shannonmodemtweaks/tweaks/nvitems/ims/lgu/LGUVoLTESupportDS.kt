package com.kimjio.shannonmodemtweaks.tweaks.nvitems.ims.lgu

import android.os.Parcelable
import com.kimjio.shannonmodemtweaks.R
import com.kimjio.shannonmodemtweaks.tweaks.nvitems.NvItem
import com.kimjio.shannonmodemtweaks.tweaks.nvitems.NvItemTweak
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

@Parcelize
class LGUVoLTESupportDS : NvItemTweak(), Parcelable {
    @IgnoredOnParcel
    override val name = "LGU TTA-VoLTE support (SIM2)"

    @IgnoredOnParcel
    override val nameResId = R.string.sim_2_tta_volte_support

    @IgnoredOnParcel
    override val descriptionResId = R.string.lgu_sim_2_tta_volte_support_desc

    override val nvItems: List<NvItem>
        get() =
            listOf(
                NvItem(id = "DS.PSS.AIMS.Payload-AMRWB", value = "64"),
                NvItem(id = "DS.PSS.AIMS.Payload-AMRWB", index = 1, value = "FF"),
                NvItem(id = "DS.PSS.AIMS.Payload-AMRNB", index = 1, value = "FF"),
                NvItem(id = "DS.PSS.AIMS.Payload-DTMF", value = "65"),
                NvItem(id = "DS.PSS.AIMS.Payload-DTMF.WB", value = "6B"),
                NvItem(id = "DS.PSS.AIMS.Audio.Media.RR", value = "9C,04,00,00"),
            )
}
