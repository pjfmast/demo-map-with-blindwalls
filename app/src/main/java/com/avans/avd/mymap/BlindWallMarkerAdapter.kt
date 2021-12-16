package com.avans.avd.mymap

import android.view.LayoutInflater
import android.view.View
import com.avans.avd.mymap.databinding.BlindwallMarkerInfoBinding
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.Marker

class BlindWallMarkerAdapter(private val mapsActivity: MapsActivity) : GoogleMap.InfoWindowAdapter {
    private lateinit var binding: BlindwallMarkerInfoBinding

    override fun getInfoWindow(marker: Marker): View {
        val blindWall = marker?.tag as? BlindWall

        binding = BlindwallMarkerInfoBinding.inflate(LayoutInflater.from(mapsActivity))

        binding.tvTitle.text = "${blindWall?.name} (${blindWall?.year})"

        return binding.root
    }

    override fun getInfoContents(p0: Marker): View {
        TODO("Not yet implemented")
    }

}
