package Nucleo.Models.FormtImg;

public enum ExtencionesImg {

    ExtePNG(".png"),
    ExteTIFF(".tiff"),
    ExteBMP(".bmp"),
    ExteJEPG(".jpg");

    private final String extecion;

    private ExtencionesImg(String simbolo) {
        this.extecion = simbolo;
    }
    public String getSimbolo() {
        return extecion;
    }

}
