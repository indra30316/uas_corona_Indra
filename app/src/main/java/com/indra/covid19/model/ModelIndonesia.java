package com.indra.covid19.model;

import com.google.gson.annotations.SerializedName;

public class ModelIndonesia {
    @SerializedName("positif")
    private String positifIdn;
    @SerializedName("sembuh")
    private String sembuhIdn;
    @SerializedName("meninggal")
    private String meninggalIdn;

    public ModelIndonesia(String positifIdn, String sembuhIdn, String meninggalIdn) {
        this.positifIdn = positifIdn;
        this.sembuhIdn = sembuhIdn;
        this.meninggalIdn = meninggalIdn;
    }

    public String getPositifIdn() {
        return positifIdn;
    }

    public void setPositifIdn(String positifIdn) {
        this.positifIdn = positifIdn;
    }

    public String getSembuhIdn() {
        return sembuhIdn;
    }

    public void setSembuhIdn(String sembuhIdn) {
        this.sembuhIdn = sembuhIdn;
    }

    public String getMeninggalIdn() {
        return meninggalIdn;
    }

    public void setMeninggalIdn(String meninggalIdn) {
        this.meninggalIdn = meninggalIdn;
    }
}
