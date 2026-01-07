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

    public static ExtencionesImg desdeSimbolo(String s) {
        for (ExtencionesImg op : values()) {
            if (op.extecion.equals(s)) {
                return op;
            }
        }
        throw new IllegalArgumentException("Extension inválida: " + s);
    }
}
