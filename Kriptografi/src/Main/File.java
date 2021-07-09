/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
  public static void main(String[] args) {
    System.out.println("Hello from Encryptor");
  }

  public static String read(String fileDir) throws Exception {
    StringBuilder content = new StringBuilder();
      try (FileReader fr = new FileReader(fileDir)) {
          int i;
          while( (i=fr.read()) != -1 ) {
              content.append((char) i);
          } }   

    return content.toString().trim();
  }

  public static void write(String fileDir, String content) {
    try {    
        try (FileWriter fw = new FileWriter(fileDir)) {
            fw.write(content);
        }    
    } catch(IOException e){
      System.out.println(e);
      System.out.println("Success...");    
    }    

  }

  public static String isHere() {
    return "This is FileReader";
  }

}