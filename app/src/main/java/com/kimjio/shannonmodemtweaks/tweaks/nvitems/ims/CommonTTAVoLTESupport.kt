package com.kimjio.shannonmodemtweaks.tweaks.nvitems.ims

import android.os.Parcelable
import com.kimjio.shannonmodemtweaks.R
import com.kimjio.shannonmodemtweaks.tweaks.nvitems.NvItem
import com.kimjio.shannonmodemtweaks.tweaks.nvitems.NvItemTweak
import kotlinx.parcelize.IgnoredOnParcel
import kotlinx.parcelize.Parcelize

@Parcelize
class CommonTTAVoLTESupport : NvItemTweak(), Parcelable {
    @IgnoredOnParcel
    override val name = "Common TTA-VoLTE Support"

    @IgnoredOnParcel
    override val nameResId = R.string.common_tta_volte_support

    @IgnoredOnParcel
    override val descriptionResId = R.string.common_tta_volte_support_desc

    override val nvItems: List<NvItem>
        get() =
            listOf(
                NvItem(id = "UL3.Cap.Phych.supp_of_fdpch", value = "01,00,00,00"),
                NvItem(id = "UL3.Cap.Phych.supp_of_Efdpch", value = "01,00,00,00"),
                NvItem(id = "UL3.Cap.Phych.supp_ul_dtx", value = "00"),
                NvItem(id = "UL3.Cap.Phych.slotFormat4", value = "00,00,00,00"),
                NvItem(id = "UL3.Cap.Multi.supp_IRAT PS HO to E-UTRA", value = "01"),
                NvItem(id = "UL3.Cap.MultiCellSupport_DC_HSDPA", value = "01"),
                NvItem(id = "UL3.Etc.FastDormancyT323Rel8Support", value = "01,00,00,00"),

                NvItem(id = "UECAPA_INTRA_FREQ_SI_ACQ_FOR_HO", value = "01"),
                NvItem(id = "UECAPA_INTER_FREQ_SI_ACQ_FOR_HO", value = "01"),
                NvItem(id = "UECAPA_UTRAN_SI_ACQ_FOR_HO", value = "01"),
                NvItem(id = "UECAPA_PDCP_ROHC_PROFILES", index = 3, value = "00"),

                NvItem(id = "UECAPA_REL10_FOURLAYER_TM3TM4", value = "01"),
                NvItem(id = "UECAPA_REL10_ORIG_FOURLAYER_TM3TM4", value = "01"),
                NvItem(id = "UECAPA_REL10_CA_INDEX", value = "01,00,00,00"),
                NvItem(id = "UECAPA_REL10_MIMO_CAPA_DL", value = "01"),
                NvItem(id = "UECAPA_REL10_MIMO_CAPA_UL", value = "02"),
                NvItem(id = "UECAPA_REL10_MODIFIED_MPR_BEHAVIOR", value = "00,00,00,C0"),
                NvItem(id = "UECAPA_REL10_FGI103", value = "01"),

                NvItem(id = "UECAPA_REL12_EXTENDED_MAX_MEASID_SUPPORT", value = "01"),

                NvItem(id = "UECAPA_REL14_DIFF_FALLBACKCOMB", value = "01"),

                NvItem(id = "NR.CONFIG.MODE", value = "01"),
                NvItem(id = "NR.ENDC.MODE", value = "11"),
                NvItem(id = "DS.NR.CONFIG.MODE", value = "01"),
                NvItem(id = "DS.NR.ENDC.MODE", value = "11"),

                NvItem(id = "NASU.NR.CONFIG.MODE", value = "01"),
                NvItem(id = "DS.NASU.NR.CONFIG.MODE", value = "01"),

                NvItem(id = "!NRCAPA.Switch.DssFeature", value = "01"),
                NvItem(id = "!NRCAPA.Gen.DynamicPowerSharing", value = "01"),

                NvItem(id = "PSS.AIMS.DYNAMIC_OPERATORSPEC_FLAG", value = "01"),
                NvItem(id = "PSS.AIMS.ENABLE.RPORT-InVia-Header", value = "01"),
                NvItem(id = "PSS.AIMS.ACCESSTYPE.SUPPORT", value = "00"),

                NvItem(id = "PSS.AIMS.Payload-EVS", value = "6E"),
                NvItem(id = "PSS.AIMS.Audio.Media.RS", value = "00,00,00,00"),
                NvItem(id = "PSS.AIMS.Audio.Media.RR", value = "20,03,00,00"),

                NvItem(id = "DS.PSS.AIMS.Payload-EVS", value = "6E"),
                NvItem(id = "DS.PSS.AIMS.Audio.Media.RS", value = "00,00,00,00"),
                NvItem(id = "DS.PSS.AIMS.Audio.Media.RR", value = "20,03,00,00"),

                NvItem(id = "DS.PSS.AIMS.ENABLE.RPORT-InVia-Header", value = "01"),
                NvItem(id = "DS.PSS.AIMS.DYNAMIC_OPERATORSPEC_FLAG", value = "01"),
                NvItem(id = "DS.PSS.AIMS.ACCESSTYPE.SUPPORT", value = "00"),

                NvItem(id = "!NRSM.MsSupportLocalAddrTFTRequest", value = "01"),

                NvItem(id = "!SAEL3.PCO_IPV4_MTU_MAX_SIZE", value = "DC,05"),
                NvItem(id = "!SAEL3.IMS_PCO_IPV4_MTU_MAX_SIZE", value = "DC,05"),
                NvItem(id = "!SAEL3.EXTPCO_REQUEST", value = "01"),
                NvItem(id = "!SAEL3.ENABLE_GUARD_T_FOR_WAIT_ATTACHAPN", value = "01"),
                NvItem(id = "!SAEL3.DISABLE_IPV4_MTU_IN_PCO", value = "01"),
                NvItem(id = "!SAEL3.Dual_IP_PDP", value = "01"),
                NvItem(id = "!SAEL3.PDN_SM_PDU_DN_REQ_CONTAINER", value = "00"),
                NvItem(id = "!SAEL3_DS.PCO_IPV4_MTU_MAX_SIZE", value = "DC,05"),
                NvItem(id = "!SAEL3_DS.IMS_PCO_IPV4_MTU_MAX_SIZE", value = "DC,05"),
                NvItem(id = "!SAEL3_DS.EXTPCO_REQUEST", value = "01"),
                NvItem(id = "!SAEL3_DS.ENABLE_GUARD_T_FOR_WAIT_ATTACHAPN", value = "01"),
                NvItem(id = "!SAEL3_DS.DISABLE_IPV4_MTU_IN_PCO", value = "01"),

                NvItem(id = "HCOMMON.MM.LCS_VA_capability", value = "01"),

                NvItem(id = "NASL3.MM.umts_fdd", value = "01"),
                NvItem(id = "NASL3.MM.GeranFeaturePack1", value = "01"),
                NvItem(id = "NASL3.MM.gea_algorithms", index = 1, value = "00"),
                NvItem(id = "NASL3.SM.NW Initiated Secondary PDP Activation Support", value = "01"),
                NvItem(id = "ds_NASL3.MM.umts_fdd", value = "01"),
                NvItem(id = "ds_NASL3.MM.GeranFeaturePack1", value = "01"),
                NvItem(id = "ds_NASL3.MM.gea_algorithms", index = 1, value = "00"),
            )
}
