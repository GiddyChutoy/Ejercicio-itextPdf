/**
 * 
 */
package com.negocio;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.datos.Datos;
import com.datos.Persona;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.AreaBreak;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.AreaBreakType;

/**
 * @author 201907
 *
 */
public class Servicio {
	Datos d = new Datos();
	
	
	public void crearPDF(HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/pdf");
		PdfDocument pdfDoc = new PdfDocument(new PdfWriter(response.getOutputStream()));
        Document doc = new Document(pdfDoc);
        List<Persona> personas = d.anadirPersonas();
        for (Persona p : personas) {
        	doc.add(new Paragraph("El sr/sra " + p.getNombre() + " vive en " + p.getCiudad()));
			doc.add(new AreaBreak(AreaBreakType.NEXT_PAGE));
		}
        doc.close();
	}
}
