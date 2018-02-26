import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.export.JRPdfExporter;

public class compil_jrxml {
    public static void main(String[] args) {
        System.out.println("Enter your username: ");
        Scanner scanner = new Scanner(System.in);
        String report = scanner.nextLine();
        System.out.println("Procesando jasper reports" + report);

        try {
            if (report.length()>0) {
                String reportName = report + ".jrxml";
                String reportName_jasper = report + ".jasper";
                // compiles jrxml
                JasperCompileManager.compileReportToFile(reportName, reportName_jasper);
            }

        } catch (Exception e) {
            throw new RuntimeException("It's not possible to generate the jasper report.", e);
        }

    }
}
