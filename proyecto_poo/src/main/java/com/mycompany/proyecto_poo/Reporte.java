import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.*;

public class Reporte {
    public static void main(String[] args) {
        try {
            // Carga el archivo de Excel
            File archivo = new File("datos.xlsx");
            FileInputStream inputStream = new FileInputStream(archivo);
            
            // Crea una instancia de la clase Workbook para leer el archivo
            Workbook libro = WorkbookFactory.create(inputStream);
            
            // Obtiene la hoja del libro que quieres leer (en este caso, la primera)
            Sheet hoja = libro.getSheetAt(0);
            
            // Recorre las filas de la hoja
            for (Row fila : hoja) {
                // Recorre las celdas de cada fila
                for (Cell celda : fila) {
                    // Obtiene el valor de la celda y lo muestra en la consola
                    String valor = celda.getStringCellValue();
                    System.out.print(valor + "\t");
                }
                System.out.println();
            }
            
            // Cierra el archivo
            libro.close();
            inputStream.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
