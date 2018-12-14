package com.xx.idoctorall.util;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Date;

public class PdfUtil {

    public static void createPdf(String path) {
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream(path));
            document.open();
            document.add(new Paragraph("A Hello World PDF document."));
            //Set attributes here
            /*document.addAuthor("Lokesh Gupta");
            document.addCreationDate();
            document.addCreator("HowToDoInJava.com");
            document.addTitle("Set Attribute Example");
            document.addSubject("An example to show how attributes can be added to pdf files.");*/

            //Add Image
            Image image1 = Image.getInstance("pdf/2.jpg");
            //Fixed Positioning
            image1.setAbsolutePosition(100f, 550f);
            //Scale to new height and new width of image
            image1.scaleAbsolute(200, 200);
            //Add to document
            document.add(image1);

            /*String imageUrl = "http://www.eclipse.org/xtend/images/java8_logo.png";
            Image image2 = Image.getInstance(new URL(imageUrl));
            document.add(image2);*/

            document.close();
            writer.close();
        } catch (DocumentException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void createCase(String path) {
        Document document = new Document();
        try {
            PdfWriter writer = PdfWriter.getInstance(document,
                    new FileOutputStream(path));
            BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            document.open();

            Font font = new Font(bfChinese);
            Font title = new Font(bfChinese, 20, Font.BOLD);
            Font cellTitle = new Font(bfChinese, 11, Font.BOLD);
            Font cellContent = new Font(bfChinese, 11, Font.NORMAL);
            Paragraph docTitle = new Paragraph("病 例 信 息 表\n", title);
            docTitle.setAlignment(Element.ALIGN_CENTER);
            docTitle.setSpacingBefore(20);
            document.add(docTitle);


            int size = 35;
            int contentSize = 30;
            int widths[] = {12, 25, 21, 25, 25, 25, 25, 25};
            PdfPTable table = new PdfPTable(8);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10);
            table.setWidths(widths);

            PdfPCell cell = new PdfPCell(new Paragraph("姓名", cellTitle));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(1);
            cell.setFixedHeight(size);
            table.addCell(cell);

            cell = new PdfPCell(new Paragraph("向元浪", cellContent));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(1);
            cell.setFixedHeight(size);
            table.addCell(cell);

            cell = new PdfPCell(new Paragraph("性别", cellTitle));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(1);
            cell.setFixedHeight(size);
            table.addCell(cell);

            cell = new PdfPCell(new Paragraph("男", cellContent));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(1);
            cell.setFixedHeight(size);
            table.addCell(cell);


            cell = new PdfPCell(new Paragraph("出生年月", cellTitle));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(1);
            cell.setFixedHeight(size);
            table.addCell(cell);

            Date date = new Date();
            cell = new PdfPCell(new Paragraph(date.toString(), cellContent));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(1);
            cell.setFixedHeight(size);
            table.addCell(cell);


            /*String url ="pdf/2.jpg";
            java.net.URL imgurl = new java.net.URL(url);
            java.awt.Image awtImage = ImageIO.read(imgurl);*/

            cell = new PdfPCell(new Paragraph("相片", cellContent));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(2);
            cell.setRowspan(3);
            cell.setFixedHeight(size * 3);
            table.addCell(cell);


            cell = new PdfPCell(new Paragraph("住院", cellTitle));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(2);
            cell.setFixedHeight(size);
            table.addCell(cell);

            cell = new PdfPCell(new Paragraph("否", cellContent));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(4);
            cell.setFixedHeight(size);
            table.addCell(cell);

            cell = new PdfPCell(new Paragraph("恢复状况", cellTitle));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(2);
            cell.setFixedHeight(size);
            table.addCell(cell);

            cell = new PdfPCell(new Paragraph("痊愈", cellContent));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(4);
            cell.setFixedHeight(size);
            table.addCell(cell);


            cell = new PdfPCell(new Paragraph("病症状况", cellContent));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(2);
            cell.setFixedHeight(size * 5);
            table.addCell(cell);

            cell = new PdfPCell(new Paragraph("咳嗽、发烧", cellTitle));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(6);
            cell.setFixedHeight(size * 5);
            table.addCell(cell);

            cell = new PdfPCell(new Paragraph("检查结果", cellContent));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(2);
            cell.setFixedHeight(size * 5);
            table.addCell(cell);

            cell = new PdfPCell(new Paragraph("血液正常、体温正常", cellTitle));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(6);
            cell.setFixedHeight(size * 5);
            table.addCell(cell);

            cell = new PdfPCell(new Paragraph("诊断结果", cellContent));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(2);
            cell.setFixedHeight(size * 5);
            table.addCell(cell);

            cell = new PdfPCell(new Paragraph("感冒", cellTitle));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(6);
            cell.setFixedHeight(size * 5);
            table.addCell(cell);


            cell = new PdfPCell(new Paragraph("药方及疗程", cellContent));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(2);
            cell.setFixedHeight(size * 5);
            table.addCell(cell);

            cell = new PdfPCell(new Paragraph("感冒药服用一周", cellTitle));
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setVerticalAlignment(Element.ALIGN_MIDDLE);
            cell.setColspan(6);
            cell.setFixedHeight(size * 5);
            table.addCell(cell);

            document.add(table);

            document.close();
            writer.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        File file = new File("pdf/xyl.pdf");
        try {
            PDDocument doc = PDDocument.load(file);
            PDFRenderer renderer = new PDFRenderer(doc);
            int pageCount = doc.getNumberOfPages();
            for (int i = 0; i < pageCount; i++) {
                BufferedImage image = renderer.renderImageWithDPI(i, 296);
                // BufferedImage image = renderer.renderImage(i, 2.5f);
                ImageIO.write(image, "PNG", new File("pdf/image.png"));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}