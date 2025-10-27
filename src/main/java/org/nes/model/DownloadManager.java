package org.nes.model;

import org.nes.model.data.FileMetadata;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DownloadManager {

    private List<FileMetadata> fileMetadataList;

    public DownloadManager(){
        fileMetadataList = Collections.synchronizedList(new ArrayList<>());
    }

    public void addDownloadFile(String filePath){
        try {
            fileMetadataList.add(FileProcessor.readJSON(new File(filePath)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
