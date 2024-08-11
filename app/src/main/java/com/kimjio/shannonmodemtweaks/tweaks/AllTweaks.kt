package com.kimjio.shannonmodemtweaks.tweaks

import com.kimjio.shannonmodemtweaks.tweaks.nvitems.ims.CommonTTAVoLTESupport
import com.kimjio.shannonmodemtweaks.tweaks.nvitems.ims.CommonTTAVoLTESupportDS
import com.kimjio.shannonmodemtweaks.tweaks.nvitems.ims.kt.KTVoLTESupport
import com.kimjio.shannonmodemtweaks.tweaks.nvitems.ims.kt.KTVoLTESupportDS
import com.kimjio.shannonmodemtweaks.tweaks.nvitems.ims.lgu.LGUVoLTESupport
import com.kimjio.shannonmodemtweaks.tweaks.nvitems.ims.lgu.LGUVoLTESupportDS
import com.kimjio.shannonmodemtweaks.tweaks.nvitems.ims.skt.SKTVoLTESupport
import com.kimjio.shannonmodemtweaks.tweaks.nvitems.ims.skt.SKTVoLTESupportDS

val AllTweaks: Map<String, List<Tweak>> =
    mapOf(
        Pair(
            "IMS",
            listOf(
                CommonTTAVoLTESupport(),
                CommonTTAVoLTESupportDS(),
            )
                .sortedBy { it.name },
        ),
        Pair(
            "SKT",
            listOf(
                SKTVoLTESupport(),
                SKTVoLTESupportDS(),
            )
                .sortedBy { it.name },
        ),
        Pair(
            "KT",
            listOf(
                KTVoLTESupport(),
                KTVoLTESupportDS(),
            )
                .sortedBy { it.name },
        ),
        Pair(
            "LGU",
            listOf(
                LGUVoLTESupport(),
                LGUVoLTESupportDS(),
            )
                .sortedBy { it.name },
        ),
    )
