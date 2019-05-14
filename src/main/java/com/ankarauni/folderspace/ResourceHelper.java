/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ankarauni.folderspace;

import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Resource helper class that utilizes lazy loading.
 * 
 * @author Gorkem
 */
public class ResourceHelper {
    
    private static final String ROOT_ICON_RESOURCE_PATH = "icons/";
    private static final String FILE_ICON_RESOURCE_PATH = "icons/file.png";
    private static final String FOLDER_ICON_RESOURCE_PATH = "icons/folder.png";
    
    private static Icon fileIcon, folderIcon;
    
    public static Icon getIcon(String extension) {
        switch(extension) {
            case "7z":
            case "bat":
            case "doc":
            case "exe":
            case "gif":
            case "jpg":
            case "pdf":
            case "png":
            case "rar":
            case "sh":
            case "txt":
            case "zip":
                fileIcon = createImageIcon(getResourcePath(extension));
                break;
            default:
                fileIcon = createImageIcon(FILE_ICON_RESOURCE_PATH);
                break;
        }
        
        return fileIcon;
    }
    
    public static Icon getFolderIcon() {
        if (folderIcon == null) {
            folderIcon = createImageIcon(FOLDER_ICON_RESOURCE_PATH);
        }
        
        return folderIcon;
    }
    
    private static String getResourcePath(String extension) {
        return ROOT_ICON_RESOURCE_PATH + extension + ".png";
    }
    
    private static Icon createImageIcon(String resourcePath) {
        return new ImageIcon(getResourceUrl(resourcePath));
    }
    
    private static URL getResourceUrl(String resourcePath) {
        return ClassLoader.getSystemResource(resourcePath);
    }
}
