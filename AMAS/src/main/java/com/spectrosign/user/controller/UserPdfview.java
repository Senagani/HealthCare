package com.spectrosign.user.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.spectrosign.user.model.User;

public class UserPdfview extends AbstractPdfView{

	@Override
	protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer,
			HttpServletRequest request, HttpServletResponse response) throws Exception {
		@SuppressWarnings("unchecked")
		List<User> alluser=(List<User>) model.get("user");
		PdfPTable table=new PdfPTable(8);
	table.addCell("id");
	table.addCell("firstname");
	table.addCell("lastname");
	table.addCell("asset");
	table.addCell("blocks");
	table.addCell("flats");
	table.addCell("email");
	for (User user : alluser) {
		table.addCell(""+user.getId());
		table.addCell(user.getFirstname());
		table.addCell(user.getLastname());
		table.addCell(user.getAsset());
		table.addCell(""+user.getBlocks());
		table.addCell(""+user.getFlats());
		table.addCell(user.getEmail());
		
	}
	document.add(table);
	
	}

}
