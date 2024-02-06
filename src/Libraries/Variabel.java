/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Libraries;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

/**
 *
 * @author surya
 */
public class Variabel {
    private static final Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private static final int WIDTH = 800;
    private static final int HEIGHT = 400;
    public static int selectedDetails = 0;
    
    public class Position{
        public static int Center(String Username){
            switch (Username){
                case "screenX" -> {
                    return (screenSize.width - WIDTH) / 2;
                }
                case "screenY" -> {
                    return (screenSize.height - HEIGHT) / 2;
                }
                default ->{
                    return 0;
                }
            }
        }
        public static int Center(String Username, int size){
            switch (Username){
                case "screenX" -> {
                    return (screenSize.width - size) / 2;
                }
                case "screenY" -> {
                    return (screenSize.height - size) / 2;
                }
                default ->{
                    return 0;
                }
            }
        }
    }
    
    public static boolean UploadImages(File sourceFile, String[] ImagesName){
        try{
            Path sourcePath = sourceFile.toPath();
            String fileExtension = sourceFile.getName().substring(sourceFile.getName().lastIndexOf('.'));
            String CompileName = ImagesName[0] + "_" + ImagesName[1] + "_" + ImagesName[2] + fileExtension;
            Path uploadPath = Paths.get("src/CONTENT/img", CompileName);
            
            
            Files.copy(sourcePath, uploadPath, StandardCopyOption.REPLACE_EXISTING);
            
            return true;
        } catch (IOException e){
            return false;
        }
    }
}
