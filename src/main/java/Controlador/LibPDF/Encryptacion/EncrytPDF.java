package Controlador.LibPDF.Encryptacion;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.encryption.AccessPermission;
import org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy;

import java.io.IOException;
import java.util.List;

public class EncrytPDF {

    public void EncrytarPDFs(PDDocument document, String passMaster, String passUser, String rootSave, int lengthEncripKey, List<Boolean> listaBoolean,int tipoPermisos) throws IOException {


        //Creating access permission object
        AccessPermission ap = new AccessPermission();

        //Creating StandardProtectionPolicy object
        StandardProtectionPolicy spp = new StandardProtectionPolicy(passMaster, passUser, ap);

        switch (tipoPermisos){
            case 0:
                ap.setCanPrint( listaBoolean.get(0));
                ap.setCanAssembleDocument(listaBoolean.get(1));
                ap.setCanExtractContent(listaBoolean.get(2));
                ap.setCanModify(listaBoolean.get(3));
                ap.setCanFillInForm(listaBoolean.get(4));
                ap.setCanExtractForAccessibility(listaBoolean.get(5));
                ap.setCanModifyAnnotations(listaBoolean.get(6));
                ap.setCanPrintFaithful(listaBoolean.get(7));
                break;
            case 1:
                ap.setReadOnly();
                break;
            default:

                break;

        }


        ap.setReadOnly();
        //Setting the length of the encryption key
        spp.setEncryptionKeyLength(lengthEncripKey);

        //Setting the access permissions
        spp.setPermissions(ap);

        //Protecting the document
        document.protect(spp);

        System.out.println("Document encrypted");


        //Saving the document
        document.save(rootSave);

        //Closing the document


    }



}
