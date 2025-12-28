package App;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
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
import Controlador.LibPDF.OperacionPdf;

public class Main {
    public static void main(String[] args) throws IOException {

        OperacionPdf mergerPdfMulti = new OperacionPdf();


        String mergeOut="C:\\Users\\chino\\Desktop\\MergeOutMult.pdf";
        String splitOut="C:\\Users\\chino\\Desktop\\splitPdf.pdf";
        String pdf1="C:\\Users\\chino\\Desktop\\Diagrama.pdf";
        String pdf2="C:\\Users\\chino\\Desktop\\ZONA ECOLOGIA 1ER SEMESTRE 2025.pdf";
        String pdf3="C:\\Users\\chino\\Desktop\\MergeFinal.pdf";

        List<String> listaDoc= new ArrayList<>();
        listaDoc.add(pdf1);
        listaDoc.add(pdf2);
        listaDoc.add(pdf3);
        PDDocument document = Loader.loadPDF(
                new
                        RandomAccessReadBufferedFile(mergeOut));

        //Instantiating Splitter class
        Splitter splitter = new Splitter();
        splitter.setEndPage(3);
        //splitting the pages of a PDF document
        List<PDDocument> Pages = splitter.split(document);
        PDPage my_page = new PDPage();
        //Creating an iterator
        Iterator<PDDocument> iterator = Pages.listIterator();

        PDDocument pd = new PDDocument();

        int max=3;
        for(int i=0;i<max;i++) {
            my_page=iterator.next().getPage(0);
            pd.addPage(my_page);
        }
        pd.save(splitOut);

        System.out.println("Multiple PDFs created");
        document.close();




    }
}
