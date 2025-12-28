package Controlador.LibPDF;
import org.apache.pdfbox.pdmodel.PDDocument;
import Nucleo.Models.InfoPdf;
import org.apache.pdfbox.rendering.PDFRenderer;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImgPdf {


    public void imprimirImg(PDDocument crearDocumento, int numeroPaginas,int paginaFinal,String pathImgSave,String nombreImgs,String formatoImg) throws IOException {

        InfoPdf InformacionPdf = new InfoPdf();
        
        if(!(nombreImgs.trim().isEmpty())){

        }else{
            nombreImgs=InformacionPdf.getNombrePdf();
        }

        PDFRenderer renderer = new PDFRenderer(crearDocumento);

        BufferedImage image;
        if(paginaFinal<=0){

            image= renderer.renderImage(0);
            //Writing the image to a file
            ImageIO.write(image, formatoImg, new File(pathImgSave+nombreImgs+1+".jpg"));

        }else{
            for(int i=numeroPaginas;i<paginaFinal;i++){
                image= renderer.renderImage(i);
                //Writing the image to a file
                ImageIO.write(image, formatoImg, new File(pathImgSave+nombreImgs+i+".jpg"));
            }
        }
    }
}
