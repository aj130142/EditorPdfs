package Nucleo.Models;

public class InfoPdf {
    private String nombrePdf;
    private String SubjectPdf;
    private String CreatorPdf;
    private String fechaCreacionPdf;
    private String fechaModificacionPdf;
    private String palabrasClavePdf;
    private int NumeroPaginasPdf;


    public String getNombrePdf(){
        return nombrePdf;
    }
    public void setNombrePdf(String Nombre){
        this.nombrePdf=Nombre;
    }

    public String getSubjectPdf(){
        return SubjectPdf;
    }
    public void setSubjectPdf(String Subject){
        this.SubjectPdf = Subject;
    }

    public String getCreatorPdf(){
        return CreatorPdf;
    }
    public void setCreatorPdf(String Creador){
        this.CreatorPdf=Creador;
    }

    public String getFechaCreacionPdf(){
        return fechaCreacionPdf;
    }
    public void setFechaCreacionPdf(String fechaCreacion){
        this.fechaCreacionPdf= fechaCreacion;
    }

    public String getFechaModificacionPdf(){
        return fechaModificacionPdf;
    }
    public void setFechaModificacionPdf(String fechaModificacion){
        this.fechaModificacionPdf=fechaModificacion;
    }

    public  String getPalabrasClave(){
        return palabrasClavePdf;
    }
    public void setPalabrasClave(String palabrasClave){
        this.palabrasClavePdf= palabrasClave;
    }

    public int getNumeroPaginasPdf(){
        return NumeroPaginasPdf;
    }
    public void setNumeroPaginasPdf(String numeroPaginasPdf){
            this.NumeroPaginasPdf=Integer.parseInt(numeroPaginasPdf);
    }




}
