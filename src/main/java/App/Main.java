package App;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Iterator;
import javax.imageio.ImageIO;
import javax.print.Doc;

import org.apache.pdfbox.multipdf.Splitter;
import Controlador.LibPDF.NewPdf;
import org.apache.pdfbox.Loader;
import org.apache.pdfbox.io.RandomAccessReadBufferedFile;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import Controlador.LibPDF.ImgPdf;
import org.apache.pdfbox.pdmodel.PDPage;
import Controlador.LibPDF.OperacionPdf;

public class Main {
    public static void main(String[] args) throws IOException {
        OperacionPdf OpererPdf = new OperacionPdf();
        NewPdf PdfOp = new NewPdf("C:\\Users\\chino\\Desktop\\Diagrama.pdf");
        PDDocument Docume=PdfOp.NewPDDPdf();
        int numPaginas = Docume.getNumberOfPages();

        ImgPdf Num = new ImgPdf();

        Splitter splitter = new Splitter();

        //splitting the pages of a PDF document
        List<PDDocument> Pages = splitter.split(Docume);
        Iterator<PDDocument> iterator = Pages.listIterator();

        PDPage blankPage = new PDPage();
        blankPage= iterator.next().getPage(0);
        Num.imprimirNoPaginas(Docume,numPaginas);
        //Closing the document
        Docume.addPage(blankPage);
        Docume.addPage(blankPage);
        System.out.println("Este el numero de paginas que tengo"+Docume.getNumberOfPages());
        Docume=OpererPdf.RemoverPag(0,3,Docume);

        Docume.save("C:\\Users\\chino\\Desktop\\Diagrama2.pdf");
        Docume.close();

    }
}
