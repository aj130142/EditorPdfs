package App;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.apache.pdfbox.Loader;
import org.apache.pdfbox.io.RandomAccessReadBufferedFile;
import org.apache.pdfbox.pdmodel.PDDocument;
import Controlador.LibPDF.ImgPdf;
import Controlador.LibPDF.OperacionesPDF.OperacionPdf;
import Controlador.LibPDF.Encryptacion.EncrytPDF;

public class Main {
    public static void main(String[] args)  {

        OperacionPdf mergerPdfMulti = new OperacionPdf();
        EncrytPDF encryptar = new EncrytPDF();
        ImgPdf imagenes = new ImgPdf();

        String mergeOut="C:\\Users\\chino\\Desktop\\pdfTest\\test.pdf";
        String splitOut="C:\\Users\\chino\\Desktop\\pdfTest\\splitPdf.pdf";
        String passNever="C:\\Users\\chino\\Desktop\\pdfTest\\SinPass.pdf";
        String pdf1="C:\\Users\\chino\\Desktop\\pdfTest\\Diagrama.pdf";
        String pdf2="C:\\Users\\chino\\Desktop\\ZONA ECOLOGIA 1ER SEMESTRE 2025.pdf";
        String pdf3="C:\\Users\\chino\\Desktop\\pdfTest\\MergeFinal.pdf";



        List<String> listaDoc= new ArrayList<>();
        listaDoc.add(pdf1);
        listaDoc.add(pdf2);
        listaDoc.add(pdf3);
        try(PDDocument document = Loader.loadPDF(new File(splitOut),"hola")){
            List<Boolean> listaBoolean= new ArrayList<>();
            listaBoolean.add(false);
            listaBoolean.add(true);
            listaBoolean.add(true);
            listaBoolean.add(true);
            listaBoolean.add(true);
            listaBoolean.add(true);
            listaBoolean.add(false);
            listaBoolean.add(true);


            String nombre="Usuario";
            System.out.println("hola "+nombre);
            //encryptar.EncrytarPDFs(document,"hola","1234",splitOut,128,listaBoolean,0);
            encryptar.descryp(document,passNever);


        } catch (Exception e) {
            System.out.println("Errror");
            throw new RuntimeException(e);
        }

    }
}
