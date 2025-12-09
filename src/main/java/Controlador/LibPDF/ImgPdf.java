package Controlador.LibPDF;
import org.apache.pdfbox.pdmodel.PDDocument;
import Nucleo.Models.InfoPdf;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImgPdf {

    InfoPdf infoPdf = new InfoPdf();



    private PDDocument Crear;

    public void imprimirNoPaginas(PDDocument crearDocumento, int numeroPaginas) throws IOException {

        PDFRenderer renderer = new PDFRenderer(crearDocumento);

        //Rendering an image from the PDF document
        BufferedImage image;
        for(int i=0;i<numeroPaginas;i++){
            image= renderer.renderImage(i);
            //Writing the image to a file
            ImageIO.write(image, "JPEG", new File("C:/Users/chino/Desktop/myimage"+i+".jpg"));
        }




    }


}
