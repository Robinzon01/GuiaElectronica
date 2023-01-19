
package guiaelectronico.model;

public class CabeceraJsonGuia {

    private String fecEmision;//1
    private String horEmision;//2
    private String tipDocGuia;//3
    private String serNumDocGuia;//4
    private String numDocDestinatario;//5
    private String tipDocDestinatario;//6
    private String rznSocialDestinatario;//7
    private String motTrasladoDatosEnvio;//8
    private String desMotivoTrasladoDatosEnvio;//9
    private boolean indTransbordoProgDatosEnvio;//10
    private Double psoBrutoTotalBienesDatosEnvio;//11
    private String uniMedidaPesoBrutoDatosEnvio;//12
    private Double numBultosDatosEnvio;//13
    private String modTrasladoDatosEnvio;//14
    private String fecInicioTrasladoDatosEnvio;//16
    private String numDocTransportista;//17
    private String tipDocTransportista;//18
    private String nomTransportista;//19
    private String numPlacaTransPrivado;//20
    private String numDocIdeConductorTransPrivado;//21
    private String tipDocIdeConductorTransPrivado;//22
    private String nomConductorTransPrivado;//23
    private String ubiLlegada;//24
    private String dirLlegada;//25
    private String ubiPartida;//26
    private String dirPartida;//27
    private String ublVersionId;//28
    private String customizationId;//29
    private String obsGuia;

    public CabeceraJsonGuia() {
    }

    public CabeceraJsonGuia(String fecEmision, String horEmision, String tipDocGuia, String serNumDocGuia, String numDocDestinatario, String tipDocDestinatario, String rznSocialDestinatario, String motTrasladoDatosEnvio, String desMotivoTrasladoDatosEnvio, boolean indTransbordoProgDatosEnvio, Double psoBrutoTotalBienesDatosEnvio, String uniMedidaPesoBrutoDatosEnvio, Double numBultosDatosEnvio, String modTrasladoDatosEnvio, String fecInicioTrasladoDatosEnvio, String numDocTransportista, String tipDocTransportista, String nomTransportista, String numPlacaTransPrivado, String numDocIdeConductorTransPrivado, String tipDocIdeConductorTransPrivado, String nomConductorTransPrivado, String ubiLlegada, String dirLlegada, String ubiPartida, String dirPartida, String ublVersionId, String customizationId, String obsGuia) {
        this.fecEmision = fecEmision;
        this.horEmision = horEmision;
        this.tipDocGuia = tipDocGuia;
        this.serNumDocGuia = serNumDocGuia;
        this.numDocDestinatario = numDocDestinatario;
        this.tipDocDestinatario = tipDocDestinatario;
        this.rznSocialDestinatario = rznSocialDestinatario;
        this.motTrasladoDatosEnvio = motTrasladoDatosEnvio;
        this.desMotivoTrasladoDatosEnvio = desMotivoTrasladoDatosEnvio;
        this.indTransbordoProgDatosEnvio = indTransbordoProgDatosEnvio;
        this.psoBrutoTotalBienesDatosEnvio = psoBrutoTotalBienesDatosEnvio;
        this.uniMedidaPesoBrutoDatosEnvio = uniMedidaPesoBrutoDatosEnvio;
        this.numBultosDatosEnvio = numBultosDatosEnvio;
        this.modTrasladoDatosEnvio = modTrasladoDatosEnvio;
        this.fecInicioTrasladoDatosEnvio = fecInicioTrasladoDatosEnvio;
        this.numDocTransportista = numDocTransportista;
        this.tipDocTransportista = tipDocTransportista;
        this.nomTransportista = nomTransportista;
        this.numPlacaTransPrivado = numPlacaTransPrivado;
        this.numDocIdeConductorTransPrivado = numDocIdeConductorTransPrivado;
        this.tipDocIdeConductorTransPrivado = tipDocIdeConductorTransPrivado;
        this.nomConductorTransPrivado = nomConductorTransPrivado;
        this.ubiLlegada = ubiLlegada;
        this.dirLlegada = dirLlegada;
        this.ubiPartida = ubiPartida;
        this.dirPartida = dirPartida;
        this.ublVersionId = ublVersionId;
        this.customizationId = customizationId;
        this.obsGuia = obsGuia;
    }
    
    

    public String getObsGuia() {
        return obsGuia;
    }

    public void setObsGuia(String obsGuia) {
        this.obsGuia = obsGuia;
    }

    public String getFecEmision() {
        return fecEmision;
    }

    public void setFecEmision(String fecEmision) {
        this.fecEmision = fecEmision;
    }

    public String getHorEmision() {
        return horEmision;
    }

    public void setHorEmision(String horEmision) {
        this.horEmision = horEmision;
    }

    public String getTipDocGuia() {
        return tipDocGuia;
    }

    public void setTipDocGuia(String tipDocGuia) {
        this.tipDocGuia = tipDocGuia;
    }

    public String getSerNumDocGuia() {
        return serNumDocGuia;
    }

    public void setSerNumDocGuia(String serNumDocGuia) {
        this.serNumDocGuia = serNumDocGuia;
    }

    public String getNumDocDestinatario() {
        return numDocDestinatario;
    }

    public void setNumDocDestinatario(String numDocDestinatario) {
        this.numDocDestinatario = numDocDestinatario;
    }

    public String getTipDocDestinatario() {
        return tipDocDestinatario;
    }

    public void setTipDocDestinatario(String tipDocDestinatario) {
        this.tipDocDestinatario = tipDocDestinatario;
    }

    public String getRznSocialDestinatario() {
        return rznSocialDestinatario;
    }

    public void setRznSocialDestinatario(String rznSocialDestinatario) {
        this.rznSocialDestinatario = rznSocialDestinatario;
    }

    public String getMotTrasladoDatosEnvio() {
        return motTrasladoDatosEnvio;
    }

    public void setMotTrasladoDatosEnvio(String motTrasladoDatosEnvio) {
        this.motTrasladoDatosEnvio = motTrasladoDatosEnvio;
    }

    public String getDesMotivoTrasladoDatosEnvio() {
        return desMotivoTrasladoDatosEnvio;
    }

    public void setDesMotivoTrasladoDatosEnvio(String desMotivoTrasladoDatosEnvio) {
        this.desMotivoTrasladoDatosEnvio = desMotivoTrasladoDatosEnvio;
    }

    public boolean isIndTransbordoProgDatosEnvio() {
        return indTransbordoProgDatosEnvio;
    }

    public void setIndTransbordoProgDatosEnvio(boolean indTransbordoProgDatosEnvio) {
        this.indTransbordoProgDatosEnvio = indTransbordoProgDatosEnvio;
    }

    public Double getPsoBrutoTotalBienesDatosEnvio() {
        return psoBrutoTotalBienesDatosEnvio;
    }

    public void setPsoBrutoTotalBienesDatosEnvio(Double psoBrutoTotalBienesDatosEnvio) {
        this.psoBrutoTotalBienesDatosEnvio = psoBrutoTotalBienesDatosEnvio;
    }

    public String getUniMedidaPesoBrutoDatosEnvio() {
        return uniMedidaPesoBrutoDatosEnvio;
    }

    public void setUniMedidaPesoBrutoDatosEnvio(String uniMedidaPesoBrutoDatosEnvio) {
        this.uniMedidaPesoBrutoDatosEnvio = uniMedidaPesoBrutoDatosEnvio;
    }

    public Double getNumBultosDatosEnvio() {
        return numBultosDatosEnvio;
    }

    public void setNumBultosDatosEnvio(Double numBultosDatosEnvio) {
        this.numBultosDatosEnvio = numBultosDatosEnvio;
    }

    public String getModTrasladoDatosEnvio() {
        return modTrasladoDatosEnvio;
    }

    public void setModTrasladoDatosEnvio(String modTrasladoDatosEnvio) {
        this.modTrasladoDatosEnvio = modTrasladoDatosEnvio;
    }

    public String getFecInicioTrasladoDatosEnvio() {
        return fecInicioTrasladoDatosEnvio;
    }

    public void setFecInicioTrasladoDatosEnvio(String fecInicioTrasladoDatosEnvio) {
        this.fecInicioTrasladoDatosEnvio = fecInicioTrasladoDatosEnvio;
    }

    public String getNumDocTransportista() {
        return numDocTransportista;
    }

    public void setNumDocTransportista(String numDocTransportista) {
        this.numDocTransportista = numDocTransportista;
    }

    public String getTipDocTransportista() {
        return tipDocTransportista;
    }

    public void setTipDocTransportista(String tipDocTransportista) {
        this.tipDocTransportista = tipDocTransportista;
    }

    public String getNomTransportista() {
        return nomTransportista;
    }

    public void setNomTransportista(String nomTransportista) {
        this.nomTransportista = nomTransportista;
    }

    public String getNumPlacaTransPrivado() {
        return numPlacaTransPrivado;
    }

    public void setNumPlacaTransPrivado(String numPlacaTransPrivado) {
        this.numPlacaTransPrivado = numPlacaTransPrivado;
    }

    public String getNumDocIdeConductorTransPrivado() {
        return numDocIdeConductorTransPrivado;
    }

    public void setNumDocIdeConductorTransPrivado(String numDocIdeConductorTransPrivado) {
        this.numDocIdeConductorTransPrivado = numDocIdeConductorTransPrivado;
    }

    public String getTipDocIdeConductorTransPrivado() {
        return tipDocIdeConductorTransPrivado;
    }

    public void setTipDocIdeConductorTransPrivado(String tipDocIdeConductorTransPrivado) {
        this.tipDocIdeConductorTransPrivado = tipDocIdeConductorTransPrivado;
    }

    public String getNomConductorTransPrivado() {
        return nomConductorTransPrivado;
    }

    public void setNomConductorTransPrivado(String nomConductorTransPrivado) {
        this.nomConductorTransPrivado = nomConductorTransPrivado;
    }

    public String getUbiLlegada() {
        return ubiLlegada;
    }

    public void setUbiLlegada(String ubiLlegada) {
        this.ubiLlegada = ubiLlegada;
    }

    public String getDirLlegada() {
        return dirLlegada;
    }

    public void setDirLlegada(String dirLlegada) {
        this.dirLlegada = dirLlegada;
    }

    public String getUbiPartida() {
        return ubiPartida;
    }

    public void setUbiPartida(String ubiPartida) {
        this.ubiPartida = ubiPartida;
    }

    public String getDirPartida() {
        return dirPartida;
    }

    public void setDirPartida(String dirPartida) {
        this.dirPartida = dirPartida;
    }

    public String getUblVersionId() {
        return ublVersionId;
    }

    public void setUblVersionId(String ublVersionId) {
        this.ublVersionId = ublVersionId;
    }

    public String getCustomizationId() {
        return customizationId;
    }

    public void setCustomizationId(String customizationId) {
        this.customizationId = customizationId;
    }

}
