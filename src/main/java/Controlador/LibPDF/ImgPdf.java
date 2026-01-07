package Controlador.LibPDF;
import org.apache.pdfbox.pdmodel.PDDocument;
import Nucleo.Models.InfoPdf;
import org.apache.pdfbox.rendering.PDFRenderer;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import Nucleo.Models.FormtImg.PngFormats;
import Nucleo.Models.FormtImg.ExtencionesImg;

public class ImgPdf {


    public void imprimirImg(PDDocument crearDocumento, int numeroPaginas,int paginaFinal,String pathImgSave,String nombreImgs,String formatoImg) throws IOException {

        InfoPdf InformacionPdf = new InfoPdf();

        String as="";


        String ExtensionPdf =switch (formatoImg){
            case "PNG" -> ExtencionesImg.ExtePNG.getSimbolo();
            case "JPEG" -> ExtencionesImg.ExteJEPG.getSimbolo();
            case "BMP" -> ExtencionesImg.ExteBMP.getSimbolo();
            case "TIFF" -> ExtencionesImg.ExteTIFF.getSimbolo();

            default -> "no hay resultados";


        };





        if(!(nombreImgs.trim().isEmpty())){

        }else{
            nombreImgs=InformacionPdf.getNombrePdf();
        }

        PDFRenderer renderer = new PDFRenderer(crearDocumento);

        BufferedImage image;
        if(paginaFinal<=0){

            image= renderer.renderImage(0);
            //Writing the image to a file
            ImageIO.write(image, formatoImg, new File(pathImgSave+nombreImgs+1+ExtensionPdf));

        }else{
            for(int i=numeroPaginas;i<=paginaFinal;i++){
                image= renderer.renderImage(i);
                //Writing the image to a file
                ImageIO.write(image, formatoImg, new File(pathImgSave+nombreImgs+i+ExtensionPdf));
            }
        }
    }
}
