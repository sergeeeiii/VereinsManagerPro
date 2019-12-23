package space.cloud4b.verein.model.verein.status;

public class StatusElement {

    private int statusElementId;
    private int statusElementKey;
    private String statusElementTextLang;
    private String statusElementTextKurz;
    private String statusElementSymbol;


    public StatusElement(int statusId, String statusElementTextLang, String statusElementTextKurz, String statusElementSymbol) {

        this.statusElementKey = statusId;
        this.statusElementTextLang = statusElementTextLang;
        this.statusElementTextKurz = statusElementTextKurz;
        this.statusElementSymbol = statusElementSymbol;
    }

    public int getStatusElementKey(){
        return statusElementKey;
    }
    public String toString() {
        if(!statusElementSymbol.isEmpty()) {
            return  statusElementTextLang + " (" +statusElementSymbol + ")";
        } else {
            return this.statusElementTextLang;
        }

    }
}
