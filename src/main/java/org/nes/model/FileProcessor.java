package org.nes.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.nes.model.data.FileMetadata;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileProcessor {


    public static FileMetadata readJSON(File file) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        String jsonString = Files.readString(Paths.get(file.toURI()));
        FileMetadata metadata = gson.fromJson(jsonString, FileMetadata.class);
        return metadata;
    }

    public static void writeFileMetaDataJson(FileMetadata fileMetadata, String filePath) throws IOException {
        boolean finished = false;
        Gson gson = new GsonBuilder().setPrettyPrinting()
                .excludeFieldsWithoutExposeAnnotation()
                .create();
        gson.toJson(fileMetadata, new FileWriter(filePath));
    }
}
