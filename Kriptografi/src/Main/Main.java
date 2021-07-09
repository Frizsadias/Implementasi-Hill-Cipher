/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import main.File;
import main.Enkripsi;

public class Main {


  public static void main(String[] args) throws Exception {

    // { Proses Enkripsi }
    String inputedText = File.read("src/data/source.txt");
    String encryptedContent = Enkripsi.encrypt(inputedText);
    File.write("src/data/encrypted.txt", encryptedContent);

    // { Proses Dekripsi }
    String encryptedContentFromFile = File.read("src/data/encrypted.txt");
    String decryptedContent = Enkripsi.decrypt(encryptedContentFromFile);
    File.write("src/data/decrypted.txt", decryptedContent);

  }

}